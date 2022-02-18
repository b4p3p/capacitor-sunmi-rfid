/*     */ package com.sunmi.rfid.constant;
/*     */ 
/*     */ import android.text.TextUtils;
/*     */ import android.util.Log;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public final class ParamCts
/*     */ {
/*     */   public static final String BROADCAST_RFID_CLOSE = "com.sunmi.rfid.rfid_close";
/*     */   public static final String BROADCAST_RFID_OPEN = "com.sunmi.rfid.rfid_open";
/*     */   public static final String BROADCAST_UN_FOUND_READER = "com.sunmi.rfid.unFoundReader";
/*     */   public static final String BROADCAST_ON_LOST_CONNECT = "com.sunmi.rfid.onLostConnect";
/*     */   public static final String BROADCAST_ON_CONNECT = "com.sunmi.rfid.onConnect";
/*     */   public static final String BROADCAST_ON_DISCONNECT = "com.sunmi.rfid.onDisconnect";
/*     */   public static final String BROADCAST_READER_BOOT = "com.sunmi.rfid.readerBoot";
/*     */   public static final String BROADCAST_SN = "com.sunmi.rfid.sn";
/*     */   public static final String BROADCAST_FIRMWARE_VERSION = "com.sunmi.rfid.firmwareVersion";
/*     */   public static final String BROADCAST_BATTERY_VOLTAGE = "com.sunmi.rfid.batteryVoltage";
/*     */   public static final String BROADCAST_BATTERY_REMAINING_PERCENTAGE = "com.sunmi.rfid.batteryRemainingPercentage";
/*     */   public static final String BROADCAST_BATTER_LOW_ELEC = "com.sunmi.rfid.batteryLowElec";
/*     */   public static final String BROADCAST_BATTER_CHARGING = "com.sunmi.rfid.batteryCharging";
/*     */   public static final String BROADCAST_BATTER_CHARGING_NUM_TIMES = "com.sunmi.rfid.batteryChargingNumTimes";
/*     */   public static final byte SUCCESS = 16;
/*     */   public static final byte FAIL = 17;
/*     */   public static final byte FOUND_TAG = 1;
/*     */   public static final byte UPDATE_TAG = 2;
/*     */   public static final byte UN_CHECK_READER = 3;
/*     */   public static final String ANT_ID = "ant_id";
/*     */   public static final String COUNT = "tag_count";
/*     */   public static final String READ_RATE = "read_rate";
/*     */   public static final String DATA_COUNT = "data_count";
/*     */   public static final String START_TIME = "start_time";
/*     */   public static final String END_TIME = "end_time";
/*     */   public static final String TAG_UID = "tag_uid";
/*     */   public static final String TAG_PC = "tag_pc";
/*     */   public static final String TAG_EPC = "tag_epc";
/*     */   public static final String TAG_CRC = "tag_crc";
/*     */   public static final String TAG_RSSI = "tag_rssi";
/*     */   public static final String TAG_READ_COUNT = "tag_read_count";
/*     */   public static final String TAG_FREQ = "tag_freq";
/*     */   public static final String TAG_TIME = "tag_time";
/*     */   public static final String TAG_DATA = "tag_data";
/*     */   public static final String TAG_DATA_LEN = "tag_data_len";
/*     */   public static final String TAG_ANT_1 = "tag_ant_1";
/*     */   public static final String TAG_ANT_2 = "tag_ant_2";
/*     */   public static final String TAG_ANT_3 = "tag_ant_3";
/*     */   public static final String TAG_ANT_4 = "tag_ant_4";
/*     */   public static final String COMMAND_DURATION = "command_duration";
/*     */   public static final String TAG_ACCESS_EPC_MATCH = "access_epc_match";
/*     */   public static final String TAG_MONZA_STATUS = "monza_status";
/*     */   public static final String TAG_STATUS = "tag_status";
/*     */   public static final String WORK_ANTENNA = "work_antenna";
/*     */   public static final String ARY_OUTPUT_POWER = "ary_output_power";
/*     */   public static final String FREQUENCY_REGION = "frequency_region";
/*     */   public static final String FREQUENCY_START = "frequency_start";
/*     */   public static final String FREQUENCY_END = "frequency_end";
/*     */   public static final String USER_DEFINE_FREQUENCY_INTERVAL = "user_define_frequency_interval";
/*     */   public static final String USER_DEFINE_CHANNEL_QUANTITY = "user_define_channel_quantity";
/*     */   public static final String USER_DEFINE_START_FREQUENCY = "user_define_start_frequency";
/*     */   public static final String PLUS_MINUS = "plus_minus";
/*     */   public static final String TEMPERATURE = "temperature";
/*     */   public static final String GP_IO_1_VALUE = "gp_io_1_value";
/*     */   public static final String GP_IO_2_VALUE = "gp_io_2_value";
/*     */   public static final String ANT_CONNECTION_DETECTOR = "ant_connection_detector";
/*     */   public static final String READER_IDENTIFIER = "reader_identifier";
/*     */   public static final String RF_LINK_PROFILE = "rf_link_profile";
/*     */   public static final String RF_PORT_RETURN_LOSS = "rf_port_return_loss";
/*     */   public static final String MASK_ID = "mask_id";
/*     */   public static final String MASK_COUNT = "mask_count";
/*     */   public static final String MASK_TARGET = "mask_target";
/*     */   public static final String MASK_ACTION = "mask_action";
/*     */   public static final String MASK_MEMBANK = "mask_membank";
/*     */   public static final String MASK_START_ADD = "mask_start_add";
/*     */   public static final String MASK_LEN = "mask_len";
/*     */   public static final String MASK_VALUE = "mask_value";
/*     */   public static final String BEEP_MODE = "sp_beep_mode";
/*     */   public static final String SCAN_TYPE = "scan_type";
/*     */   public static final String SN = "sn";
/*     */   public static final String FIRMWARE_MAIN_VERSION = "firmware_main_version";
/*     */   public static final String FIRMWARE_MIN_VERSION = "firmware_min_version";
/*     */   public static final String BATTERY_VOLTAGE = "battery_voltage";
/*     */   public static final String BATTERY_REMAINING_PERCENT = "battery_remaining_percent";
/*     */   public static final String BATTERY_CHARGING = "battery_charging";
/*     */   public static final String BATTERY_CHARGING_NUM_TIMES = "battery_charging_num_times";
/*     */   
/*     */   public static double getParamsToRf(int params) {
/* 109 */     switch (params) {
/*     */       case 0:
/* 111 */         return 865.0D;
/*     */       case 1:
/* 113 */         return 865.5D;
/*     */       case 2:
/* 115 */         return 866.0D;
/*     */       case 3:
/* 117 */         return 866.5D;
/*     */       case 4:
/* 119 */         return 867.0D;
/*     */       case 5:
/* 121 */         return 867.5D;
/*     */       case 6:
/* 123 */         return 868.0D;
/*     */       case 7:
/* 125 */         return 902.0D;
/*     */       case 8:
/* 127 */         return 902.5D;
/*     */       case 9:
/* 129 */         return 903.0D;
/*     */       case 10:
/* 131 */         return 903.5D;
/*     */       case 11:
/* 133 */         return 904.0D;
/*     */       case 12:
/* 135 */         return 904.5D;
/*     */       case 13:
/* 137 */         return 905.0D;
/*     */       case 14:
/* 139 */         return 905.5D;
/*     */       case 15:
/* 141 */         return 906.0D;
/*     */       case 16:
/* 143 */         return 906.5D;
/*     */       case 17:
/* 145 */         return 907.0D;
/*     */       case 18:
/* 147 */         return 907.5D;
/*     */       case 19:
/* 149 */         return 908.0D;
/*     */       case 20:
/* 151 */         return 908.5D;
/*     */       case 21:
/* 153 */         return 909.0D;
/*     */       case 22:
/* 155 */         return 909.5D;
/*     */       case 23:
/* 157 */         return 910.0D;
/*     */       case 24:
/* 159 */         return 910.5D;
/*     */       case 25:
/* 161 */         return 911.0D;
/*     */       case 26:
/* 163 */         return 911.5D;
/*     */       case 27:
/* 165 */         return 912.0D;
/*     */       case 28:
/* 167 */         return 912.5D;
/*     */       case 29:
/* 169 */         return 913.0D;
/*     */       case 30:
/* 171 */         return 913.5D;
/*     */       case 31:
/* 173 */         return 914.0D;
/*     */       case 32:
/* 175 */         return 914.5D;
/*     */       case 33:
/* 177 */         return 915.0D;
/*     */       case 34:
/* 179 */         return 915.5D;
/*     */       case 35:
/* 181 */         return 916.0D;
/*     */       case 36:
/* 183 */         return 916.5D;
/*     */       case 37:
/* 185 */         return 917.0D;
/*     */       case 38:
/* 187 */         return 917.5D;
/*     */       case 39:
/* 189 */         return 918.0D;
/*     */       case 40:
/* 191 */         return 918.5D;
/*     */       case 41:
/* 193 */         return 919.0D;
/*     */       case 42:
/* 195 */         return 919.5D;
/*     */       case 43:
/* 197 */         return 920.0D;
/*     */       case 44:
/* 199 */         return 920.5D;
/*     */       case 45:
/* 201 */         return 921.0D;
/*     */       case 46:
/* 203 */         return 921.5D;
/*     */       case 47:
/* 205 */         return 922.0D;
/*     */       case 48:
/* 207 */         return 922.5D;
/*     */       case 49:
/* 209 */         return 923.0D;
/*     */       case 50:
/* 211 */         return 923.5D;
/*     */       case 51:
/* 213 */         return 924.0D;
/*     */       case 52:
/* 215 */         return 924.5D;
/*     */       case 53:
/* 217 */         return 925.0D;
/*     */       case 54:
/* 219 */         return 925.5D;
/*     */       case 55:
/* 221 */         return 926.0D;
/*     */       case 56:
/* 223 */         return 926.5D;
/*     */       case 57:
/* 225 */         return 927.0D;
/*     */       case 58:
/* 227 */         return 927.5D;
/*     */       case 59:
/* 229 */         return 928.0D;
/*     */     } 
/* 231 */     return -1.0D;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int getRfToParams(int rf) {
/* 239 */     switch (rf) {
/*     */       case 8650:
/* 241 */         return 0;
/*     */       case 8655:
/* 243 */         return 1;
/*     */       case 8660:
/* 245 */         return 2;
/*     */       case 8665:
/* 247 */         return 3;
/*     */       case 8670:
/* 249 */         return 4;
/*     */       case 8675:
/* 251 */         return 5;
/*     */       case 8680:
/* 253 */         return 6;
/*     */       case 9020:
/* 255 */         return 7;
/*     */       case 9025:
/* 257 */         return 8;
/*     */       case 9030:
/* 259 */         return 9;
/*     */       case 9035:
/* 261 */         return 10;
/*     */       case 9040:
/* 263 */         return 11;
/*     */       case 9045:
/* 265 */         return 12;
/*     */       case 9050:
/* 267 */         return 13;
/*     */       case 9055:
/* 269 */         return 14;
/*     */       case 9060:
/* 271 */         return 15;
/*     */       case 9065:
/* 273 */         return 16;
/*     */       case 9070:
/* 275 */         return 17;
/*     */       case 9075:
/* 277 */         return 18;
/*     */       case 9080:
/* 279 */         return 19;
/*     */       case 9085:
/* 281 */         return 20;
/*     */       case 9090:
/* 283 */         return 21;
/*     */       case 9095:
/* 285 */         return 22;
/*     */       case 9100:
/* 287 */         return 23;
/*     */       case 9105:
/* 289 */         return 24;
/*     */       case 9110:
/* 291 */         return 25;
/*     */       case 9115:
/* 293 */         return 26;
/*     */       case 9120:
/* 295 */         return 27;
/*     */       case 9125:
/* 297 */         return 28;
/*     */       case 9130:
/* 299 */         return 29;
/*     */       case 9135:
/* 301 */         return 30;
/*     */       case 9140:
/* 303 */         return 31;
/*     */       case 9145:
/* 305 */         return 32;
/*     */       case 9150:
/* 307 */         return 33;
/*     */       case 9155:
/* 309 */         return 34;
/*     */       case 9160:
/* 311 */         return 35;
/*     */       case 9165:
/* 313 */         return 36;
/*     */       case 9170:
/* 315 */         return 37;
/*     */       case 9175:
/* 317 */         return 38;
/*     */       case 9180:
/* 319 */         return 39;
/*     */       case 9185:
/* 321 */         return 40;
/*     */       case 9190:
/* 323 */         return 41;
/*     */       case 9195:
/* 325 */         return 42;
/*     */       case 9200:
/* 327 */         return 43;
/*     */       case 9205:
/* 329 */         return 44;
/*     */       case 9210:
/* 331 */         return 45;
/*     */       case 9215:
/* 333 */         return 46;
/*     */       case 9220:
/* 335 */         return 47;
/*     */       case 9225:
/* 337 */         return 48;
/*     */       case 9230:
/* 339 */         return 49;
/*     */       case 9235:
/* 341 */         return 50;
/*     */       case 9240:
/* 343 */         return 51;
/*     */       case 9245:
/* 345 */         return 52;
/*     */       case 9250:
/* 347 */         return 53;
/*     */       case 9255:
/* 349 */         return 54;
/*     */       case 9260:
/* 351 */         return 55;
/*     */       case 9265:
/* 353 */         return 56;
/*     */       case 9270:
/* 355 */         return 57;
/*     */       case 9275:
/* 357 */         return 58;
/*     */       case 9280:
/* 359 */         return 59;
/*     */     } 
/* 361 */     return -1;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static int[] getRFFrequencyBand(String sn) {
/* 372 */     Log.d("darren-ParamsCts", "SN:" + sn);
/* 373 */     if (!TextUtils.isEmpty(sn)) {
/* 374 */       if (sn.startsWith("NU01")) {
/* 375 */         return new int[] { 1, 920, 925, 3 };
/*     */       }
/* 377 */       if (sn.startsWith("NU02")) {
/* 378 */         return new int[] { 1, 902, 928, 1 };
/*     */       }
/* 380 */       if (sn.startsWith("NU03")) {
/* 381 */         return new int[] { 1, 865, 868, 2 };
/*     */       }
/* 383 */       return new int[] { -1, -1, -1, -1 };
/*     */     } 
/* 385 */     return new int[] { 0, 0, 0, 0 };
/*     */   }
/*     */   
/*     */   public static int[] getRFFrequencyBand(int scanModel, String sn) {
/* 389 */     if (scanModel == 101)
/* 390 */       return getRFFrequencyBand(sn); 
/* 391 */     if (scanModel == 102) {
/* 392 */       return new int[] { 1, 865, 926, 4 };
/*     */     }
/* 394 */     return new int[] { 0, 0, 0, 0 };
/*     */   }
/*     */ }


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/constant/ParamCts.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */