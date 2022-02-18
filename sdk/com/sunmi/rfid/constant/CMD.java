package com.sunmi.rfid.constant;

public class CMD {
  public static final byte RESET = 112;
  
  public static final byte SET_UART_BAUDRATE = 113;
  
  public static final byte GET_FIRMWARE_VERSION = 114;
  
  public static final byte SET_READER_ADDRESS = 115;
  
  public static final byte SET_WORK_ANTENNA = 116;
  
  public static final byte GET_WORK_ANTENNA = 117;
  
  public static final byte SET_OUTPUT_POWER = 118;
  
  public static final byte GET_OUTPUT_POWER = 119;
  
  public static final byte SET_FREQUENCY_REGION = 120;
  
  public static final byte GET_FREQUENCY_REGION = 121;
  
  public static final byte SET_BEEPER_MODE = 122;
  
  public static final byte GET_READER_TEMPERATURE = 123;
  
  public static final byte READ_GPIO_VALUE = 96;
  
  public static final byte WRITE_GPIO_VALUE = 97;
  
  public static final byte SET_ANT_CONNECTION_DETECTOR = 98;
  
  public static final byte GET_ANT_CONNECTION_DETECTOR = 99;
  
  public static final byte SET_TEMPORARY_OUTPUT_POWER = 102;
  
  public static final byte SET_READER_IDENTIFIER = 103;
  
  public static final byte GET_READER_IDENTIFIER = 104;
  
  public static final byte SET_RF_LINK_PROFILE = 105;
  
  public static final byte GET_RF_LINK_PROFILE = 106;
  
  public static final byte GET_RF_PORT_RETURN_LOSS = 126;
  
  public static final byte INVENTORY = -128;
  
  public static final byte READ_TAG = -127;
  
  public static final byte WRITE_TAG = -126;
  
  public static final byte LOCK_TAG = -125;
  
  public static final byte KILL_TAG = -124;
  
  public static final byte SET_ACCESS_EPC_MATCH = -123;
  
  public static final byte GET_ACCESS_EPC_MATCH = -122;
  
  public static final byte REAL_TIME_INVENTORY = -119;
  
  public static final byte FAST_SWITCH_ANT_INVENTORY = -118;
  
  public static final byte CUSTOMIZED_SESSION_TARGET_INVENTORY = -117;
  
  public static final byte SET_IMPINJ_FAST_TID = -116;
  
  public static final byte SET_AND_SAVE_IMPINJ_FAST_TID_TAG_FOCUS = -115;
  
  public static final byte GET_IMPINJ_FAST_TID = -114;
  
  public static final byte ISO18000_6B_INVENTORY = -80;
  
  public static final byte ISO18000_6B_READ_TAG = -79;
  
  public static final byte ISO18000_6B_WRITE_TAG = -78;
  
  public static final byte ISO18000_6B_LOCK_TAG = -77;
  
  public static final byte ISO18000_6B_QUERY_LOCK_TAG = -76;
  
  public static final byte GET_INVENTORY_BUFFER = -112;
  
  public static final byte GET_AND_RESET_INVENTORY_BUFFER = -111;
  
  public static final byte GET_INVENTORY_BUFFER_TAG_COUNT = -110;
  
  public static final byte RESET_INVENTORY_BUFFER = -109;
  
  public static final byte OPERATE_TAG_MASK = -104;
  
  public static final byte SET_READER_STATUS = -96;
  
  public static final byte QUERY_READER_STATUS = -95;
  
  public static final byte GET_READER_VOL = 1;
  
  public static final byte GET_READER_ELEC = 2;
  
  public static final byte GET_READER_LOWELEC = 18;
  
  public static final byte GET_READER_CHARGING = 3;
  
  public static final byte GET_READER_CHARGING_CURRENT = 4;
  
  public static final byte GET_READER_CHARGING_NUM_TIMES = 5;
  
  public static final byte GET_READER_BOOT = 9;
  
  public static final byte GET_READER_VERSION = 50;
  
  public static final byte GET_READER_SN = 51;
  
  public static final byte GET_BEEP_MODE = 52;
}


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/constant/CMD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */