package it.codeka.sunmirfid;

import android.os.RemoteException;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.rfid.ReaderCall;
import com.sunmi.rfid.RFIDManager;
import com.sunmi.rfid.constant.CMD;
import com.sunmi.rfid.constant.ParamCts;
import com.sunmi.rfid.entity.DataParameter;

public class RFIDReaderCall extends ReaderCall {

   private enum EventType{INFO,TAG}
   private static final String TAG = "SunmiRFID";
   private SunmiRFIDPlugin plugin;
   private SunmiRFID impl;

   RFIDReaderCall(SunmiRFIDPlugin plugin){
      this.plugin = plugin;
      this.impl = plugin.impl;
   }

   private static String cmdToString(byte cmd){
      switch (cmd) {
         case CMD.REAL_TIME_INVENTORY:
            return "REAL_TIME_INVENTORY";
         case CMD.INVENTORY:
            return "INVENTORY";
         case CMD.CUSTOMIZED_SESSION_TARGET_INVENTORY:
            return "CUSTOMIZED_SESSION_TARGET_INVENTORY";
         case CMD.ISO18000_6B_INVENTORY:
            return "ISO18000_6B_INVENTORY";
         case CMD.GET_INVENTORY_BUFFER_TAG_COUNT:
            return "INVENTORY_BUFFER_TAG_COUNT";
         case CMD.SET_TEMPORARY_OUTPUT_POWER:
            return "SET_TEMPORARY_OUTPUT_POWER";
         case CMD.GET_FIRMWARE_VERSION:
            return "GET_FIRMWARE_VERSION";
         default:
            return "???";
      }
   }

   @Override
   public void onSuccess(byte cmd, DataParameter params) throws RemoteException {
      JSObject ris = new JSObject();
      String stateStr = "???";
      String paramcts = "";
      switch (cmd) {
         // OPERAZIONI
         case CMD.REAL_TIME_INVENTORY:
         case CMD.ISO18000_6B_INVENTORY:
            this.impl.inRun = false; // continue scan

            Log.w(TAG, "[onsuccess] " + cmdToString(cmd));
            break;
         case CMD.INVENTORY:
         case CMD.CUSTOMIZED_SESSION_TARGET_INVENTORY:
            Log.w(TAG, "[onsuccess] " + cmdToString(cmd));
            break;
         case CMD.SET_OUTPUT_POWER:
            Log.w(TAG, "set out power success");
            break;
         // INFO
         case CMD.GET_READER_CHARGING_NUM_TIMES:
            paramcts = ParamCts.BROADCAST_BATTER_CHARGING_NUM_TIMES;
            Log.w(TAG, "[success] " + paramcts);
            ris.put(paramcts, params.getByteArray(paramcts)[0]);
            this.impl.notifyInfo(ris, "CHARGING_NUM_TIMES");
            break;
         case CMD.GET_OUTPUT_POWER:
            paramcts = ParamCts.ARY_OUTPUT_POWER;
            Log.w(TAG, "[success] " + paramcts);
            ris.put(paramcts, params.getByteArray(paramcts)[0]);
            this.impl.notifyInfo(ris, "OUTPUT_POWER");
            break;
         case CMD.GET_FIRMWARE_VERSION:
            Log.w(TAG, "[success] " + "firmware version");
            ris.put(ParamCts.FIRMWARE_MAIN_VERSION, params.getByte(ParamCts.FIRMWARE_MAIN_VERSION));
            ris.put(ParamCts.FIRMWARE_MIN_VERSION, params.getByte(ParamCts.FIRMWARE_MIN_VERSION));
            this.impl.notifyInfo(ris, "FIRMWARE_VERSION");
            break;
         case CMD.GET_READER_TEMPERATURE:
            Log.w(TAG, "[success] " + "GET_READER_TEMPERATURE");
            ris.put(ParamCts.TEMPERATURE, params.getByte(ParamCts.TEMPERATURE));
            this.impl.notifyInfo(ris, "READER_TEMPERATURE");
            break;
         case CMD.SET_TEMPORARY_OUTPUT_POWER:
            Log.w(TAG, "[success] " + cmdToString(cmd));
            break;

         default:
            Log.w(TAG, "[warn] onSuccess: " + cmdToString(cmd));
      }
   }

   @Override
   public void onTag(byte cmd, byte state, DataParameter tag) throws RemoteException {

      String epc = tag.getString(ParamCts.TAG_EPC);

      switch (cmd) {
         case CMD.REAL_TIME_INVENTORY:
         case CMD.CUSTOMIZED_SESSION_TARGET_INVENTORY:
         case CMD.GET_INVENTORY_BUFFER:
//            if(!inRun) return;
//            ris = onReadTag(tag, stateStr, cmd);
//            notifyEvent(ris, EVENT_READ_TAG);
            Log.w(TAG, "[onTag] 1 ");
            Log.i(TAG, epc);
            this.impl.onReadTag(cmd, state, tag);
            break;

         case CMD.INVENTORY:
//            ris = onReadTag(tag, stateStr, cmd);
//            notifyEvent(ris, EVENT_READ_TAG);
            Log.w(TAG, "[onTag] 2 ");
            Log.i(TAG, epc);
            break;

         default:
            Log.w(TAG, "[onTag] ??? - " + String.valueOf(cmd));
      }
   }

   @Override
   public void onFailed(byte cmd, byte errorCode, String msg) throws RemoteException {
      Log.e(TAG, "onFailed");
      switch (cmd) {
         case CMD.REAL_TIME_INVENTORY:
            Log.e(TAG, "REAL_TIME_INVENTORY");
            break;
         case CMD.CUSTOMIZED_SESSION_TARGET_INVENTORY:
            Log.e(TAG, "CUSTOMIZED_SESSION_TARGET_INVENTORY");
            break;
         case CMD.INVENTORY:
            Log.e(TAG, "INVENTORY");
            break;
      }
      Log.e(TAG, cmd + ":" + msg);
   }
}
