package it.codeka.sunmirfid;

import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.rfid.constant.CMD;
import com.sunmi.rfid.constant.ParamCts;
import com.sunmi.rfid.entity.DataParameter;

public class SunmiRFID {

   private String TAG = "SunmiRFID";
   public PluginCall callInfo = null;
   public PluginCall callOnReadTag = null;
   SunmiRFIDPlugin plugin;
   Boolean inRun = false;
   Boolean inScan = false;

   public SunmiRFID(SunmiRFIDPlugin plugin){
      this.plugin = plugin;
   }

   public String echo(String value) {
      Log.i(TAG, value);
      return "Ciao mondo 2";
   }

   void notifyInfo(JSObject ris, String key){
      JSObject risData = new JSObject();
      risData.put("value", ris);
      risData.put("key", key);

      if(this.callInfo != null){
         this.callInfo.setKeepAlive(true);
         this.callInfo.resolve(risData);
      }else{
         Log.e(TAG, "callInfo is null");
      }

   }

   public void onReadTag(byte cmd, byte state, DataParameter tag) {

      String stateStr = "???";
      switch (state){
         case ParamCts.FOUND_TAG:
            stateStr = "FOUND_TAG";
            break;
         case ParamCts.UPDATE_TAG:
            stateStr = "UPDATE_TAG";
            break;
      }

      String epc = tag.getString(ParamCts.TAG_EPC);
      epc = epc.replace(" ", "").toUpperCase();
      // PC
      String pc = tag.getString(ParamCts.TAG_PC);
      pc = pc.replace(" ", "").toUpperCase();
      // RSSI
      int rssi = (Integer.parseInt(tag.getString(ParamCts.TAG_RSSI, "129")) - 129);
      JSObject ris = new JSObject();
      ris.put("epc", epc);
      ris.put("pc", pc);
      ris.put("crc", tag.getString(ParamCts.TAG_CRC));
      ris.put("rssi", Integer.toString(rssi));
      ris.put("freq", tag.get(ParamCts.TAG_FREQ));
      ris.put("time", Long.toString(tag.getLong(ParamCts.TAG_TIME)));
      ris.put("start_time", Long.toString(tag.getLong(ParamCts.START_TIME)));
      ris.put("end_time", Long.toString(tag.getLong(ParamCts.END_TIME)));

      Log.w(TAG, stateStr + ": " + epc);

      if(cmd == CMD.GET_INVENTORY_BUFFER){
         ris.put("ant_id", tag.getByte(ParamCts.ANT_ID, (byte) 0));
      }else{
//         ris.put("ant_id", tag.getInt(ParamCts.ANT_ID, (byte) 0));
      }

      if(epc.equals("")){
         return;
      }

      JSObject risData = new JSObject();
      risData.put("value", ris);
      risData.put("key", "on_tag");

      this.callOnReadTag.resolve(risData);
   }
}
