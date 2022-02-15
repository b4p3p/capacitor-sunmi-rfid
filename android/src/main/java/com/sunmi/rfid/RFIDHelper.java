package com.sunmi.rfid;

import android.os.RemoteException;

public interface RFIDHelper {
  int getScanModel() throws RemoteException;
  
  void registerReaderCall(ReaderCall paramReaderCall);
  
  void unregisterReaderCall();
  
  void inventory(byte paramByte);
  
  void realTimeInventory(byte paramByte);
  
  void customizedSessionTargetInventory(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6);
  
  void fastSwitchAntInventory(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, byte paramByte9, byte paramByte10);
  
  void readTag(byte paramByte1, byte paramByte2, byte paramByte3, byte[] paramArrayOfbyte);
  
  void writeTag(byte[] paramArrayOfbyte1, byte paramByte1, byte paramByte2, byte paramByte3, byte[] paramArrayOfbyte2);
  
  void lockTag(byte[] paramArrayOfbyte, byte paramByte1, byte paramByte2);
  
  void killTag(byte[] paramArrayOfbyte);
  
  void setAccessEpcMatch(byte paramByte, byte[] paramArrayOfbyte);
  
  void cancelAccessEpcMatch();
  
  void getAccessEpcMatch();
  
  void setImpinjFastTid(boolean paramBoolean1, boolean paramBoolean2);
  
  void getImpinjFastTid();
  
  void iso180006BInventory();
  
  void iso180006BReadTag(byte[] paramArrayOfbyte, byte paramByte1, byte paramByte2);
  
  void iso180006BWriteTag(byte[] paramArrayOfbyte1, byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte2);
  
  void iso180006BLockTag(byte[] paramArrayOfbyte, byte paramByte);
  
  void iso180006BQueryLockTag(byte[] paramArrayOfbyte, byte paramByte);
  
  void getInventoryBuffer();
  
  void getAndResetInventoryBuffer();
  
  void getInventoryBufferTagCount();
  
  void resetInventoryBuffer();
  
  void setWorkAntenna(byte paramByte);
  
  void getWorkAntenna();
  
  void setOutputAllPower(byte paramByte);
  
  void setOutputPower(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4);
  
  void getOutputPower();
  
  void setFrequencyRegion(byte paramByte1, byte paramByte2, byte paramByte3);
  
  void setUserDefineFrequency(byte paramByte1, byte paramByte2, int paramInt);
  
  void getFrequencyRegion();
  
  void setBeeperMode(byte paramByte);
  
  void getBeeperMode();
  
  void getReaderTemperature();
  
  void readGpioValue();
  
  void writeGpioValue(byte paramByte1, byte paramByte2);
  
  void setAntConnectionDetector(byte paramByte);
  
  void getAntConnectionDetector();
  
  void setTemporaryOutputPower(byte paramByte);
  
  void setReaderIdentifier(byte[] paramArrayOfbyte);
  
  void getReaderIdentifier();
  
  void setRfLinkProfile(byte paramByte);
  
  void getRfLinkProfile();
  
  void getRfPortReturnLoss(byte paramByte);
  
  void getReaderSN();
  
  void getReaderVersion();
  
  void getFirmwareVersion();
  
  void getBatteryRemainingPercent();
  
  void getBatteryVoltage();
  
  void getBatteryChargeState();
  
  void resetReader();
  
  void setReaderAddress(byte paramByte);
  
  void reset();
  
  void getBatteryChargeNumTimes();
  
  void firmwareUpdate(String paramString, IFirmwareUpdateCall paramIFirmwareUpdateCall);
  
  void setImpinjSaveTagFocus(boolean paramBoolean);
  
  void setTagMask(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte[] paramArrayOfbyte);
  
  void clearTagMask(byte paramByte);
  
  void getTagMask();
  
  public static interface Call {
    void run() throws RemoteException;
  }
}


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/RFIDHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */