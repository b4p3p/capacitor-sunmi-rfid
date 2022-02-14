package it.codeka.sunmirfid;

import android.os.RemoteException;
import android.util.Log;
import android.view.KeyEvent;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;
import com.sunmi.rfid.RFIDHelper;
import com.sunmi.rfid.RFIDManager;

@CapacitorPlugin(name = "SunmiRFID")
public class SunmiRFIDPlugin extends Plugin {
   public static SunmiRFIDPlugin instance;
   private String TAG = "SunmiRFID";
   private RFIDHelper helper;
   private RFIDReaderCall readerCall;
   private SunmiBroadcastReceiver appReceiver;
   SunmiRFID impl = new SunmiRFID(this);

   @Override
   public void load() {
      Log.i(TAG, "load");
      SunmiRFIDPlugin.instance = this;
      RFIDManager.getInstance().setPrintLog(true);
      RFIDManager.getInstance().connect(getActivity());
   }

   // region CONNETCT/DISCONNECT

   @PluginMethod
   public void connect(PluginCall call) {
      this.helper = RFIDManager.getInstance().getHelper();

      this.readerCall = new RFIDReaderCall(this);
      this.helper.registerReaderCall(this.readerCall);

      this.appReceiver = new SunmiBroadcastReceiver(this, getContext());

      JSObject ret = new JSObject();
      ret.put("data", "connected");
      ret.put("status", "ok");
      call.resolve(ret);
   }

   @PluginMethod
   public void disconnect(PluginCall call) {
      RFIDManager.getInstance().disconnect();
      JSObject ret = new JSObject();
      ret.put("data", "disconnect");
      ret.put("status", "ok");
      call.resolve(ret);
   }

   // endregion CONNETCT/DISCONNECT

   // region START/STOP

   @PluginMethod
   public void start(PluginCall call) {
      this.impl.inScan = true;
      JSObject ret = new JSObject();
      ret.put("data", "started");
      ret.put("status", "ok");
      call.resolve(ret);
   }

   @PluginMethod
   public void stop(PluginCall call) {
      this.impl.inScan = false;
      JSObject ret = new JSObject();
      ret.put("data", "started");
      ret.put("status", "ok");
      call.resolve(ret);
   }

   // endregion START/STOP

   @PluginMethod
   public void getScanModel(PluginCall call) {
      JSObject ret = new JSObject();
      try {
         Integer scanModel = this.helper.getScanModel();
         ret.put("status", "ok");
         ret.put("data", scanModel);
      } catch (RemoteException e) {
         e.printStackTrace();
         ret.put("status", "ko");
         ret.put("data", e.getMessage());
      }
      call.resolve(ret);
   }

   @PluginMethod
   public void setTemporaryOutputPower(PluginCall call) {
      JSObject ret = new JSObject();
      try{
         int power = call.getData().getInt("power");
         if(power > 0){
            if(power > 33) power = 33;
            if(power < 25) power = 25;
            this.helper.setTemporaryOutputPower((byte)power);
            ret.put("status", "ok");
            ret.put("data", String.valueOf(power));
         }else{
            ret.put("status", "ko");
            ret.put("data", "power is undefined");
         }
      }catch (Exception e){
         ret.put("status", "ko");
         ret.put("data", e.getMessage());
      }
      call.resolve(ret);
   }

   @PluginMethod(returnType = PluginMethod.RETURN_CALLBACK)
   public void getInfo(PluginCall call) {

      this.helper.unregisterReaderCall();
      this.readerCall = new RFIDReaderCall(this);
      this.helper.registerReaderCall(this.readerCall);

      call.setKeepAlive(true);
      if(this.impl.callInfo != null){
         this.impl.callInfo.release(getBridge());
      }
      this.impl.callInfo = call;

      this.helper.getOutputPower();
      this.helper.getReaderSN();
      this.helper.getFirmwareVersion();
      this.helper.getReaderVersion();
      this.helper.getReaderTemperature();
      this.helper.getBatteryVoltage();
      this.helper.getBatteryRemainingPercent();
      this.helper.getBatteryChargeNumTimes();
      this.helper.getBatteryChargeState();

   }

   @PluginMethod(returnType = PluginMethod.RETURN_CALLBACK)
   public void getBatteryRemainingPercent(PluginCall call) {
      this.helper.unregisterReaderCall();
      this.readerCall = new RFIDReaderCall(this);
      this.helper.registerReaderCall(this.readerCall);
      call.setKeepAlive(true);
      if(this.impl.callInfo != null){
         this.impl.callInfo.release(getBridge());
      }
      this.impl.callInfo = call;
      this.helper.getBatteryRemainingPercent();
   }

   @PluginMethod(returnType = PluginMethod.RETURN_CALLBACK)
   public void onReadTag(PluginCall call) {
      call.setKeepAlive(true);
      if(this.impl.callOnReadTag != null){
         this.impl.callOnReadTag.release(getBridge());
      }
      this.impl.callOnReadTag = call;
   }



   public void dispatchKeyEvent(KeyEvent event) {
      int action = event.getAction();
      int keycode = event.getKeyCode();

      if(!this.impl.inScan) return;

      if(action == KeyEvent.ACTION_DOWN && keycode == 288 && !this.impl.inRun){
         Log.i(TAG, "START INVENTORY");
         this.impl.inRun = true;

         // this.helper.inventory((byte)255); - no buono
         // this.helper.realTimeInventory((byte)3);   - good!
         // this.helper.realTimeInventory((byte)2); - good
         this.helper.realTimeInventory((byte)1);
         // this.helper.realTimeInventory((byte)200); - bad

      }
      if(action == KeyEvent.ACTION_UP && keycode == 288){
         Log.i(TAG, "STOP INVENTORY");
         // this.helper.getAndResetInventoryBuffer();
         this.impl.inRun = false;
      }
   }
}
