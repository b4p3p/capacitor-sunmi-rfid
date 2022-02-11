package it.codeka.sunmirfid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;

import com.getcapacitor.JSObject;
import com.getcapacitor.PluginCall;
import com.sunmi.rfid.constant.ParamCts;

public class SunmiBroadcastReceiver extends BroadcastReceiver {

   private String TAG = "SunmiRFID";
   SunmiRFIDPlugin plugin;
   SunmiRFID impl;
   public Context ctx;

   public SunmiBroadcastReceiver(SunmiRFIDPlugin plugin, Context ctx){
      this.ctx = ctx;
      this.plugin = plugin;
      this.impl = plugin.impl;

      IntentFilter filter = new IntentFilter();
      filter.addAction(ParamCts.BROADCAST_RFID_OPEN);
      filter.addAction(ParamCts.BROADCAST_RFID_CLOSE);
      filter.addAction(ParamCts.BROADCAST_UN_FOUND_READER);
      filter.addAction(ParamCts.BROADCAST_BATTER_LOW_ELEC);
      filter.addAction(ParamCts.BROADCAST_ON_LOST_CONNECT);
      filter.addAction(ParamCts.BROADCAST_READER_BOOT);
      filter.addAction(ParamCts.BROADCAST_ON_CONNECT);
      filter.addAction(ParamCts.BROADCAST_ON_LOST_CONNECT);
      filter.addAction(ParamCts.BROADCAST_ON_DISCONNECT);
      filter.addAction(ParamCts.BROADCAST_SN);

      // BETTERIA
      filter.addAction(ParamCts.BATTERY_CHARGING);
      filter.addAction(ParamCts.BATTERY_CHARGING_NUM_TIMES);
      filter.addAction(ParamCts.BATTERY_REMAINING_PERCENT);
      filter.addAction(ParamCts.BATTERY_VOLTAGE);
      filter.addAction(ParamCts.BROADCAST_BATTERY_VOLTAGE);
      filter.addAction(ParamCts.BROADCAST_BATTER_CHARGING_NUM_TIMES);
      filter.addAction(ParamCts.BROADCAST_BATTERY_REMAINING_PERCENTAGE);
      filter.addAction(ParamCts.BROADCAST_BATTER_CHARGING);
      filter.addAction(ParamCts.BROADCAST_BATTER_LOW_ELEC);

      ctx.getApplicationContext().registerReceiver(this, filter);
   }

   @Override
   public void onReceive(Context context, Intent intent) {

      Log.w(TAG, "[onReceive]");

      if (intent == null || intent.getAction() == null) return;

      String action = intent.getAction();
      JSObject ris = new JSObject();
      Log.w(TAG, "action: " + action);
      String valueStr = "";
      Integer valueInt = -1;
      Byte valueByte = -1;

      switch (action) {
         case ParamCts.BROADCAST_ON_LOST_CONNECT:
            Log.w(TAG, "BROADCAST_ON_LOST_CONNECT");
//                  Toast.makeText(Tag6bInventoryActivity.this, R.string.rfid_please_check_device_connect, Toast.LENGTH_SHORT).show();
            break;
         case ParamCts.BROADCAST_BATTER_LOW_ELEC:
            Log.w(TAG, "BROADCAST_BATTER_LOW_ELEC");
//                  Toast.makeText(Tag6bInventoryActivity.this, R.string.rfid_low_power_hint, Toast.LENGTH_SHORT).show();
            break;
         case ParamCts.BROADCAST_SN:
            valueStr = intent.getStringExtra(ParamCts.SN);
            Log.w(TAG, "[success] BROADCAST_SN");
            ris.put(ParamCts.SN, valueStr);
            this.impl.notifyInfo(ris, "BROADCAST_SN");
            break;
         case ParamCts.BROADCAST_BATTERY_VOLTAGE:
            valueInt = intent.getIntExtra(ParamCts.BATTERY_VOLTAGE, -1);
            Log.w(TAG, "[success] BATTERY_VOLTAGE");
            ris.put(ParamCts.BATTERY_VOLTAGE, valueInt);
            this.impl.notifyInfo(ris, "BATTERY_VOLTAGE");
            break;
         case ParamCts.BROADCAST_BATTERY_REMAINING_PERCENTAGE:
            valueInt = intent.getIntExtra(ParamCts.BATTERY_REMAINING_PERCENT, -1);
            Log.w(TAG, "[success] BATTERY_REMAINING_PERCENT");
            ris.put(ParamCts.BATTERY_REMAINING_PERCENT, valueInt);
            this.impl.notifyInfo(ris, "BATTERY_REMAINING_PERCENTAGE");
            break;
         case ParamCts.BROADCAST_BATTER_CHARGING:
            valueByte = intent.getByteExtra(ParamCts.BATTERY_CHARGING, (byte)-1);
            Log.w(TAG, "[success] BROADCAST_BATTER_CHARGING");
            ris.put(ParamCts.BATTERY_CHARGING, valueByte);
            this.impl.notifyInfo(ris, "BATTER_CHARGING");
            break;

         default:
            Log.w(TAG, "action non trovato: " + action);
            break;
      }
   }

}
