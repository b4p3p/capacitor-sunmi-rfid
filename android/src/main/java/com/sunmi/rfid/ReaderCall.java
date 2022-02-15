package com.sunmi.rfid;

import android.os.RemoteException;
import com.sunmi.rfid.entity.DataParameter;

public abstract class ReaderCall extends IReaderCall.Stub {
  public abstract void onSuccess(byte paramByte, DataParameter paramDataParameter) throws RemoteException;
  
  public abstract void onTag(byte paramByte1, byte paramByte2, DataParameter paramDataParameter) throws RemoteException;
  
  public abstract void onFailed(byte paramByte1, byte paramByte2, String paramString) throws RemoteException;
}


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/ReaderCall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */