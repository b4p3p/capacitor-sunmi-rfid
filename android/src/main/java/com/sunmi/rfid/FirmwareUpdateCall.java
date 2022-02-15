package com.sunmi.rfid;

public abstract class FirmwareUpdateCall extends IFirmwareUpdateCall.Stub {
  public abstract void onSuccess();
  
  public abstract void onProgress(int paramInt);
  
  public abstract void onFailed(int paramInt, String paramString);
}


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/FirmwareUpdateCall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */