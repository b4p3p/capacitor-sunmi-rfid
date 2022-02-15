/*      */ package com.sunmi.rfid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface IScanRFIDInterface extends IInterface { int getScanModel() throws RemoteException; void registerReaderCall(IReaderCall paramIReaderCall) throws RemoteException; void unregisterReaderCall() throws RemoteException; void inventory(byte paramByte) throws RemoteException; void realTimeInventory(byte paramByte) throws RemoteException; void customizedSessionTargetInventory(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6) throws RemoteException; void fastSwitchAntInventory(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte paramByte7, byte paramByte8, byte paramByte9, byte paramByte10) throws RemoteException; void readTag(byte paramByte1, byte paramByte2, byte paramByte3, byte[] paramArrayOfbyte) throws RemoteException; void writeTag(byte[] paramArrayOfbyte1, byte paramByte1, byte paramByte2, byte paramByte3, byte[] paramArrayOfbyte2) throws RemoteException; void lockTag(byte[] paramArrayOfbyte, byte paramByte1, byte paramByte2) throws RemoteException; void killTag(byte[] paramArrayOfbyte) throws RemoteException; void setAccessEpcMatch(byte paramByte, byte[] paramArrayOfbyte) throws RemoteException; void cancelAccessEpcMatch() throws RemoteException; void getAccessEpcMatch() throws RemoteException; void setImpinjFastTid(boolean paramBoolean1, boolean paramBoolean2) throws RemoteException; void getImpinjFastTid() throws RemoteException; void iso180006BInventory() throws RemoteException; void iso180006BReadTag(byte[] paramArrayOfbyte, byte paramByte1, byte paramByte2) throws RemoteException; void iso180006BWriteTag(byte[] paramArrayOfbyte1, byte paramByte1, byte paramByte2, byte[] paramArrayOfbyte2) throws RemoteException; void iso180006BLockTag(byte[] paramArrayOfbyte, byte paramByte) throws RemoteException; void iso180006BQueryLockTag(byte[] paramArrayOfbyte, byte paramByte) throws RemoteException; void getInventoryBuffer() throws RemoteException; void getAndResetInventoryBuffer() throws RemoteException; void getInventoryBufferTagCount() throws RemoteException; void resetInventoryBuffer() throws RemoteException; void setWorkAntenna(byte paramByte) throws RemoteException; void getWorkAntenna() throws RemoteException; void setOutputAllPower(byte paramByte) throws RemoteException; void setOutputPower(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4) throws RemoteException; void getOutputPower() throws RemoteException; void setFrequencyRegion(byte paramByte1, byte paramByte2, byte paramByte3) throws RemoteException; void setUserDefineFrequency(byte paramByte1, byte paramByte2, int paramInt) throws RemoteException; void getFrequencyRegion() throws RemoteException; void setBeeperMode(byte paramByte) throws RemoteException; void getBeeperMode() throws RemoteException; void getReaderTemperature() throws RemoteException; void readGpioValue() throws RemoteException; void writeGpioValue(byte paramByte1, byte paramByte2) throws RemoteException; void setAntConnectionDetector(byte paramByte) throws RemoteException; void getAntConnectionDetector() throws RemoteException; void setTemporaryOutputPower(byte paramByte) throws RemoteException; void setReaderIdentifier(byte[] paramArrayOfbyte) throws RemoteException; void getReaderIdentifier() throws RemoteException; void setRfLinkProfile(byte paramByte) throws RemoteException; void getRfLinkProfile() throws RemoteException; void getRfPortReturnLoss(byte paramByte) throws RemoteException; void getReaderSN() throws RemoteException; void getReaderVersion() throws RemoteException; void getFirmwareVersion() throws RemoteException; void getBatteryRemainingPercent() throws RemoteException;
/*      */   void getBatteryVoltage() throws RemoteException;
/*      */   void getBatteryChargeState() throws RemoteException;
/*      */   void resetReader() throws RemoteException;
/*      */   void setReaderAddress(byte paramByte) throws RemoteException;
/*      */   void reset() throws RemoteException;
/*      */   void getBatteryChargeNumTimes() throws RemoteException;
/*      */   void firmwareUpdate(String paramString, IFirmwareUpdateCall paramIFirmwareUpdateCall) throws RemoteException;
/*      */   void setImpinjSaveTagFocus(boolean paramBoolean) throws RemoteException;
/*      */   void setTagMask(byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4, byte paramByte5, byte paramByte6, byte[] paramArrayOfbyte) throws RemoteException;
/*      */   void clearTagMask(byte paramByte) throws RemoteException;
/*      */   void getTagMask() throws RemoteException;
/*      */   public static abstract class Stub extends Binder implements IScanRFIDInterface { private static final String DESCRIPTOR = "com.sunmi.rfid.IScanRFIDInterface"; static final int TRANSACTION_getScanModel = 1; static final int TRANSACTION_registerReaderCall = 2; static final int TRANSACTION_unregisterReaderCall = 3; static final int TRANSACTION_inventory = 4; static final int TRANSACTION_realTimeInventory = 5; static final int TRANSACTION_customizedSessionTargetInventory = 6; static final int TRANSACTION_fastSwitchAntInventory = 7; static final int TRANSACTION_readTag = 8; static final int TRANSACTION_writeTag = 9; static final int TRANSACTION_lockTag = 10; static final int TRANSACTION_killTag = 11; static final int TRANSACTION_setAccessEpcMatch = 12; static final int TRANSACTION_cancelAccessEpcMatch = 13; static final int TRANSACTION_getAccessEpcMatch = 14;
/*      */     public Stub() {
/*   15 */       attachInterface(this, "com.sunmi.rfid.IScanRFIDInterface");
/*      */     }
/*      */     static final int TRANSACTION_setImpinjFastTid = 15; static final int TRANSACTION_getImpinjFastTid = 16; static final int TRANSACTION_iso180006BInventory = 17; static final int TRANSACTION_iso180006BReadTag = 18; static final int TRANSACTION_iso180006BWriteTag = 19; static final int TRANSACTION_iso180006BLockTag = 20; static final int TRANSACTION_iso180006BQueryLockTag = 21; static final int TRANSACTION_getInventoryBuffer = 22; static final int TRANSACTION_getAndResetInventoryBuffer = 23; static final int TRANSACTION_getInventoryBufferTagCount = 24; static final int TRANSACTION_resetInventoryBuffer = 25; static final int TRANSACTION_setWorkAntenna = 26; static final int TRANSACTION_getWorkAntenna = 27; static final int TRANSACTION_setOutputAllPower = 28; static final int TRANSACTION_setOutputPower = 29; static final int TRANSACTION_getOutputPower = 30; static final int TRANSACTION_setFrequencyRegion = 31; static final int TRANSACTION_setUserDefineFrequency = 32; static final int TRANSACTION_getFrequencyRegion = 33; static final int TRANSACTION_setBeeperMode = 34; static final int TRANSACTION_getBeeperMode = 35; static final int TRANSACTION_getReaderTemperature = 36; static final int TRANSACTION_readGpioValue = 37; static final int TRANSACTION_writeGpioValue = 38; static final int TRANSACTION_setAntConnectionDetector = 39; static final int TRANSACTION_getAntConnectionDetector = 40; static final int TRANSACTION_setTemporaryOutputPower = 41; static final int TRANSACTION_setReaderIdentifier = 42; static final int TRANSACTION_getReaderIdentifier = 43; static final int TRANSACTION_setRfLinkProfile = 44; static final int TRANSACTION_getRfLinkProfile = 45; static final int TRANSACTION_getRfPortReturnLoss = 46; static final int TRANSACTION_getReaderSN = 47; static final int TRANSACTION_getReaderVersion = 48; static final int TRANSACTION_getFirmwareVersion = 49; static final int TRANSACTION_getBatteryRemainingPercent = 50; static final int TRANSACTION_getBatteryVoltage = 51; static final int TRANSACTION_getBatteryChargeState = 52; static final int TRANSACTION_resetReader = 53; static final int TRANSACTION_setReaderAddress = 54; static final int TRANSACTION_reset = 55; static final int TRANSACTION_getBatteryChargeNumTimes = 56; static final int TRANSACTION_firmwareUpdate = 57; static final int TRANSACTION_setImpinjSaveTagFocus = 58;
/*      */     static final int TRANSACTION_setTagMask = 59;
/*      */     static final int TRANSACTION_clearTagMask = 60;
/*      */     static final int TRANSACTION_getTagMask = 61;
/*      */
/*      */     public static IScanRFIDInterface asInterface(IBinder obj) {
/*   23 */       if (obj == null) {
/*   24 */         return null;
/*      */       }
/*   26 */       IInterface iin = obj.queryLocalInterface("com.sunmi.rfid.IScanRFIDInterface");
/*   27 */       if (iin != null && iin instanceof IScanRFIDInterface) {
/*   28 */         return (IScanRFIDInterface)iin;
/*      */       }
/*   30 */       return new Proxy(obj);
/*      */     }
/*      */
/*      */     public IBinder asBinder() {
/*   34 */       return (IBinder)this; } public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException { int _result; IReaderCall iReaderCall; byte b4; byte[] arrayOfByte3; byte b3; boolean bool2; byte[] arrayOfByte2; byte b2; byte[] arrayOfByte1; byte b1; String str; boolean bool1; byte _arg0; byte b6; byte[] arrayOfByte4; boolean bool3; byte b5; IFirmwareUpdateCall iFirmwareUpdateCall; byte _arg1; byte b7; int i; byte _arg2; byte b9; byte[] arrayOfByte6; byte b8; byte[] arrayOfByte5; byte _arg3; byte b10; byte[] arrayOfByte7; byte _arg4; byte _arg5; byte b11; byte[] _arg6;
/*      */       byte _arg7;
/*      */       byte _arg8;
/*      */       byte _arg9;
/*   38 */       switch (code) {
/*      */
/*      */
/*      */         case 1598968902:
/*   42 */           reply.writeString("com.sunmi.rfid.IScanRFIDInterface");
/*   43 */           return true;
/*      */
/*      */
/*      */         case 1:
/*   47 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*   48 */           _result = getScanModel();
/*   49 */           reply.writeNoException();
/*   50 */           reply.writeInt(_result);
/*   51 */           return true;
/*      */
/*      */
/*      */         case 2:
/*   55 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*   57 */           iReaderCall = IReaderCall.Stub.asInterface(data.readStrongBinder());
/*   58 */           registerReaderCall(iReaderCall);
/*   59 */           reply.writeNoException();
/*   60 */           return true;
/*      */
/*      */
/*      */         case 3:
/*   64 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*   65 */           unregisterReaderCall();
/*   66 */           reply.writeNoException();
/*   67 */           return true;
/*      */
/*      */
/*      */         case 4:
/*   71 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*   73 */           b4 = data.readByte();
/*   74 */           inventory(b4);
/*   75 */           reply.writeNoException();
/*   76 */           return true;
/*      */
/*      */
/*      */         case 5:
/*   80 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*   82 */           b4 = data.readByte();
/*   83 */           realTimeInventory(b4);
/*   84 */           reply.writeNoException();
/*   85 */           return true;
/*      */
/*      */
/*      */         case 6:
/*   89 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*   91 */           b4 = data.readByte();
/*      */
/*   93 */           b6 = data.readByte();
/*      */
/*   95 */           b7 = data.readByte();
/*      */
/*   97 */           b9 = data.readByte();
/*      */
/*   99 */           b10 = data.readByte();
/*      */
/*  101 */           _arg5 = data.readByte();
/*  102 */           customizedSessionTargetInventory(b4, b6, b7, b9, b10, _arg5);
/*  103 */           reply.writeNoException();
/*  104 */           return true;
/*      */
/*      */
/*      */         case 7:
/*  108 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  110 */           b4 = data.readByte();
/*      */
/*  112 */           b6 = data.readByte();
/*      */
/*  114 */           b7 = data.readByte();
/*      */
/*  116 */           b9 = data.readByte();
/*      */
/*  118 */           b10 = data.readByte();
/*      */
/*  120 */           _arg5 = data.readByte();
/*      */
/*  122 */           b11 = data.readByte();
/*      */
/*  124 */           _arg7 = data.readByte();
/*      */
/*  126 */           _arg8 = data.readByte();
/*      */
/*  128 */           _arg9 = data.readByte();
/*  129 */           fastSwitchAntInventory(b4, b6, b7, b9, b10, _arg5, b11, _arg7, _arg8, _arg9);
/*  130 */           reply.writeNoException();
/*  131 */           return true;
/*      */
/*      */
/*      */         case 8:
/*  135 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  137 */           b4 = data.readByte();
/*      */
/*  139 */           b6 = data.readByte();
/*      */
/*  141 */           b7 = data.readByte();
/*      */
/*  143 */           arrayOfByte6 = data.createByteArray();
/*  144 */           readTag(b4, b6, b7, arrayOfByte6);
/*  145 */           reply.writeNoException();
/*  146 */           return true;
/*      */
/*      */
/*      */         case 9:
/*  150 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  152 */           arrayOfByte3 = data.createByteArray();
/*      */
/*  154 */           b6 = data.readByte();
/*      */
/*  156 */           b7 = data.readByte();
/*      */
/*  158 */           b8 = data.readByte();
/*      */
/*  160 */           arrayOfByte7 = data.createByteArray();
/*  161 */           writeTag(arrayOfByte3, b6, b7, b8, arrayOfByte7);
/*  162 */           reply.writeNoException();
/*  163 */           return true;
/*      */
/*      */
/*      */         case 10:
/*  167 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  169 */           arrayOfByte3 = data.createByteArray();
/*      */
/*  171 */           b6 = data.readByte();
/*      */
/*  173 */           b7 = data.readByte();
/*  174 */           lockTag(arrayOfByte3, b6, b7);
/*  175 */           reply.writeNoException();
/*  176 */           return true;
/*      */
/*      */
/*      */         case 11:
/*  180 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  182 */           arrayOfByte3 = data.createByteArray();
/*  183 */           killTag(arrayOfByte3);
/*  184 */           reply.writeNoException();
/*  185 */           return true;
/*      */
/*      */
/*      */         case 12:
/*  189 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  191 */           b3 = data.readByte();
/*      */
/*  193 */           arrayOfByte4 = data.createByteArray();
/*  194 */           setAccessEpcMatch(b3, arrayOfByte4);
/*  195 */           reply.writeNoException();
/*  196 */           return true;
/*      */
/*      */
/*      */         case 13:
/*  200 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  201 */           cancelAccessEpcMatch();
/*  202 */           reply.writeNoException();
/*  203 */           return true;
/*      */
/*      */
/*      */         case 14:
/*  207 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  208 */           getAccessEpcMatch();
/*  209 */           reply.writeNoException();
/*  210 */           return true;
/*      */
/*      */
/*      */         case 15:
/*  214 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  216 */           bool2 = (0 != data.readInt());
/*      */
/*  218 */           bool3 = (0 != data.readInt());
/*  219 */           setImpinjFastTid(bool2, bool3);
/*  220 */           reply.writeNoException();
/*  221 */           return true;
/*      */
/*      */
/*      */         case 16:
/*  225 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  226 */           getImpinjFastTid();
/*  227 */           reply.writeNoException();
/*  228 */           return true;
/*      */
/*      */
/*      */         case 17:
/*  232 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  233 */           iso180006BInventory();
/*  234 */           reply.writeNoException();
/*  235 */           return true;
/*      */
/*      */
/*      */         case 18:
/*  239 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  241 */           arrayOfByte2 = data.createByteArray();
/*      */
/*  243 */           b5 = data.readByte();
/*      */
/*  245 */           b7 = data.readByte();
/*  246 */           iso180006BReadTag(arrayOfByte2, b5, b7);
/*  247 */           reply.writeNoException();
/*  248 */           return true;
/*      */
/*      */
/*      */         case 19:
/*  252 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  254 */           arrayOfByte2 = data.createByteArray();
/*      */
/*  256 */           b5 = data.readByte();
/*      */
/*  258 */           b7 = data.readByte();
/*      */
/*  260 */           arrayOfByte5 = data.createByteArray();
/*  261 */           iso180006BWriteTag(arrayOfByte2, b5, b7, arrayOfByte5);
/*  262 */           reply.writeNoException();
/*  263 */           return true;
/*      */
/*      */
/*      */         case 20:
/*  267 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  269 */           arrayOfByte2 = data.createByteArray();
/*      */
/*  271 */           b5 = data.readByte();
/*  272 */           iso180006BLockTag(arrayOfByte2, b5);
/*  273 */           reply.writeNoException();
/*  274 */           return true;
/*      */
/*      */
/*      */         case 21:
/*  278 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  280 */           arrayOfByte2 = data.createByteArray();
/*      */
/*  282 */           b5 = data.readByte();
/*  283 */           iso180006BQueryLockTag(arrayOfByte2, b5);
/*  284 */           reply.writeNoException();
/*  285 */           return true;
/*      */
/*      */
/*      */         case 22:
/*  289 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  290 */           getInventoryBuffer();
/*  291 */           reply.writeNoException();
/*  292 */           return true;
/*      */
/*      */
/*      */         case 23:
/*  296 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  297 */           getAndResetInventoryBuffer();
/*  298 */           reply.writeNoException();
/*  299 */           return true;
/*      */
/*      */
/*      */         case 24:
/*  303 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  304 */           getInventoryBufferTagCount();
/*  305 */           reply.writeNoException();
/*  306 */           return true;
/*      */
/*      */
/*      */         case 25:
/*  310 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  311 */           resetInventoryBuffer();
/*  312 */           reply.writeNoException();
/*  313 */           return true;
/*      */
/*      */
/*      */         case 26:
/*  317 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  319 */           b2 = data.readByte();
/*  320 */           setWorkAntenna(b2);
/*  321 */           reply.writeNoException();
/*  322 */           return true;
/*      */
/*      */
/*      */         case 27:
/*  326 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  327 */           getWorkAntenna();
/*  328 */           reply.writeNoException();
/*  329 */           return true;
/*      */
/*      */
/*      */         case 28:
/*  333 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  335 */           b2 = data.readByte();
/*  336 */           setOutputAllPower(b2);
/*  337 */           reply.writeNoException();
/*  338 */           return true;
/*      */
/*      */
/*      */         case 29:
/*  342 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  344 */           b2 = data.readByte();
/*      */
/*  346 */           b5 = data.readByte();
/*      */
/*  348 */           b7 = data.readByte();
/*      */
/*  350 */           _arg3 = data.readByte();
/*  351 */           setOutputPower(b2, b5, b7, _arg3);
/*  352 */           reply.writeNoException();
/*  353 */           return true;
/*      */
/*      */
/*      */         case 30:
/*  357 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  358 */           getOutputPower();
/*  359 */           reply.writeNoException();
/*  360 */           return true;
/*      */
/*      */
/*      */         case 31:
/*  364 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  366 */           b2 = data.readByte();
/*      */
/*  368 */           b5 = data.readByte();
/*      */
/*  370 */           b7 = data.readByte();
/*  371 */           setFrequencyRegion(b2, b5, b7);
/*  372 */           reply.writeNoException();
/*  373 */           return true;
/*      */
/*      */
/*      */         case 32:
/*  377 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  379 */           b2 = data.readByte();
/*      */
/*  381 */           b5 = data.readByte();
/*      */
/*  383 */           i = data.readInt();
/*  384 */           setUserDefineFrequency(b2, b5, i);
/*  385 */           reply.writeNoException();
/*  386 */           return true;
/*      */
/*      */
/*      */         case 33:
/*  390 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  391 */           getFrequencyRegion();
/*  392 */           reply.writeNoException();
/*  393 */           return true;
/*      */
/*      */
/*      */         case 34:
/*  397 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  399 */           b2 = data.readByte();
/*  400 */           setBeeperMode(b2);
/*  401 */           reply.writeNoException();
/*  402 */           return true;
/*      */
/*      */
/*      */         case 35:
/*  406 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  407 */           getBeeperMode();
/*  408 */           reply.writeNoException();
/*  409 */           return true;
/*      */
/*      */
/*      */         case 36:
/*  413 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  414 */           getReaderTemperature();
/*  415 */           reply.writeNoException();
/*  416 */           return true;
/*      */
/*      */
/*      */         case 37:
/*  420 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  421 */           readGpioValue();
/*  422 */           reply.writeNoException();
/*  423 */           return true;
/*      */
/*      */
/*      */         case 38:
/*  427 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  429 */           b2 = data.readByte();
/*      */
/*  431 */           b5 = data.readByte();
/*  432 */           writeGpioValue(b2, b5);
/*  433 */           reply.writeNoException();
/*  434 */           return true;
/*      */
/*      */
/*      */         case 39:
/*  438 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  440 */           b2 = data.readByte();
/*  441 */           setAntConnectionDetector(b2);
/*  442 */           reply.writeNoException();
/*  443 */           return true;
/*      */
/*      */
/*      */         case 40:
/*  447 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  448 */           getAntConnectionDetector();
/*  449 */           reply.writeNoException();
/*  450 */           return true;
/*      */
/*      */
/*      */         case 41:
/*  454 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  456 */           b2 = data.readByte();
/*  457 */           setTemporaryOutputPower(b2);
/*  458 */           reply.writeNoException();
/*  459 */           return true;
/*      */
/*      */
/*      */         case 42:
/*  463 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  465 */           arrayOfByte1 = data.createByteArray();
/*  466 */           setReaderIdentifier(arrayOfByte1);
/*  467 */           reply.writeNoException();
/*  468 */           return true;
/*      */
/*      */
/*      */         case 43:
/*  472 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  473 */           getReaderIdentifier();
/*  474 */           reply.writeNoException();
/*  475 */           return true;
/*      */
/*      */
/*      */         case 44:
/*  479 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  481 */           b1 = data.readByte();
/*  482 */           setRfLinkProfile(b1);
/*  483 */           reply.writeNoException();
/*  484 */           return true;
/*      */
/*      */
/*      */         case 45:
/*  488 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  489 */           getRfLinkProfile();
/*  490 */           reply.writeNoException();
/*  491 */           return true;
/*      */
/*      */
/*      */         case 46:
/*  495 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  497 */           b1 = data.readByte();
/*  498 */           getRfPortReturnLoss(b1);
/*  499 */           reply.writeNoException();
/*  500 */           return true;
/*      */
/*      */
/*      */         case 47:
/*  504 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  505 */           getReaderSN();
/*  506 */           reply.writeNoException();
/*  507 */           return true;
/*      */
/*      */
/*      */         case 48:
/*  511 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  512 */           getReaderVersion();
/*  513 */           reply.writeNoException();
/*  514 */           return true;
/*      */
/*      */
/*      */         case 49:
/*  518 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  519 */           getFirmwareVersion();
/*  520 */           reply.writeNoException();
/*  521 */           return true;
/*      */
/*      */
/*      */         case 50:
/*  525 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  526 */           getBatteryRemainingPercent();
/*  527 */           reply.writeNoException();
/*  528 */           return true;
/*      */
/*      */
/*      */         case 51:
/*  532 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  533 */           getBatteryVoltage();
/*  534 */           reply.writeNoException();
/*  535 */           return true;
/*      */
/*      */
/*      */         case 52:
/*  539 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  540 */           getBatteryChargeState();
/*  541 */           reply.writeNoException();
/*  542 */           return true;
/*      */
/*      */
/*      */         case 53:
/*  546 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  547 */           resetReader();
/*  548 */           reply.writeNoException();
/*  549 */           return true;
/*      */
/*      */
/*      */         case 54:
/*  553 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  555 */           b1 = data.readByte();
/*  556 */           setReaderAddress(b1);
/*  557 */           reply.writeNoException();
/*  558 */           return true;
/*      */
/*      */
/*      */         case 55:
/*  562 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  563 */           reset();
/*  564 */           reply.writeNoException();
/*  565 */           return true;
/*      */
/*      */
/*      */         case 56:
/*  569 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  570 */           getBatteryChargeNumTimes();
/*  571 */           reply.writeNoException();
/*  572 */           return true;
/*      */
/*      */
/*      */         case 57:
/*  576 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  578 */           str = data.readString();
/*      */
/*  580 */           iFirmwareUpdateCall = IFirmwareUpdateCall.Stub.asInterface(data.readStrongBinder());
/*  581 */           firmwareUpdate(str, iFirmwareUpdateCall);
/*  582 */           reply.writeNoException();
/*  583 */           return true;
/*      */
/*      */
/*      */         case 58:
/*  587 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  589 */           bool1 = (0 != data.readInt());
/*  590 */           setImpinjSaveTagFocus(bool1);
/*  591 */           reply.writeNoException();
/*  592 */           return true;
/*      */
/*      */
/*      */         case 59:
/*  596 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  598 */           _arg0 = data.readByte();
/*      */
/*  600 */           _arg1 = data.readByte();
/*      */
/*  602 */           _arg2 = data.readByte();
/*      */
/*  604 */           _arg3 = data.readByte();
/*      */
/*  606 */           _arg4 = data.readByte();
/*      */
/*  608 */           _arg5 = data.readByte();
/*      */
/*  610 */           _arg6 = data.createByteArray();
/*  611 */           setTagMask(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
/*  612 */           reply.writeNoException();
/*  613 */           return true;
/*      */
/*      */
/*      */         case 60:
/*  617 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*      */
/*  619 */           _arg0 = data.readByte();
/*  620 */           clearTagMask(_arg0);
/*  621 */           reply.writeNoException();
/*  622 */           return true;
/*      */
/*      */
/*      */         case 61:
/*  626 */           data.enforceInterface("com.sunmi.rfid.IScanRFIDInterface");
/*  627 */           getTagMask();
/*  628 */           reply.writeNoException();
/*  629 */           return true;
/*      */       }
/*      */
/*  632 */       return super.onTransact(code, data, reply, flags); }
/*      */
/*      */
/*      */     private static class Proxy implements IScanRFIDInterface {
/*      */       private IBinder mRemote;
/*      */
/*      */       Proxy(IBinder remote) {
/*  639 */         this.mRemote = remote;
/*      */       }
/*      */
/*      */       public IBinder asBinder() {
/*  643 */         return this.mRemote;
/*      */       }
/*      */
/*      */       public String getInterfaceDescriptor() {
/*  647 */         return "com.sunmi.rfid.IScanRFIDInterface";
/*      */       }
/*      */       public int getScanModel() throws RemoteException {
/*      */         int _result;
/*  651 */         Parcel _data = Parcel.obtain();
/*  652 */         Parcel _reply = Parcel.obtain();
/*      */
/*      */         try {
/*  655 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  656 */           this.mRemote.transact(1, _data, _reply, 0);
/*  657 */           _reply.readException();
/*  658 */           _result = _reply.readInt();
/*      */         } finally {
/*      */
/*  661 */           _reply.recycle();
/*  662 */           _data.recycle();
/*      */         }
/*  664 */         return _result;
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void registerReaderCall(IReaderCall call) throws RemoteException {
/*  673 */         Parcel _data = Parcel.obtain();
/*  674 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  676 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  677 */           _data.writeStrongBinder((call != null) ? call.asBinder() : null);
/*  678 */           this.mRemote.transact(2, _data, _reply, 0);
/*  679 */           _reply.readException();
/*      */         } finally {
/*      */
/*  682 */           _reply.recycle();
/*  683 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */       public void unregisterReaderCall() throws RemoteException {
/*  688 */         Parcel _data = Parcel.obtain();
/*  689 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  691 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  692 */           this.mRemote.transact(3, _data, _reply, 0);
/*  693 */           _reply.readException();
/*      */         } finally {
/*      */
/*  696 */           _reply.recycle();
/*  697 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void inventory(byte btRepeat) throws RemoteException {
/*  711 */         Parcel _data = Parcel.obtain();
/*  712 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  714 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  715 */           _data.writeByte(btRepeat);
/*  716 */           this.mRemote.transact(4, _data, _reply, 0);
/*  717 */           _reply.readException();
/*      */         } finally {
/*      */
/*  720 */           _reply.recycle();
/*  721 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void realTimeInventory(byte btRepeat) throws RemoteException {
/*  733 */         Parcel _data = Parcel.obtain();
/*  734 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  736 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  737 */           _data.writeByte(btRepeat);
/*  738 */           this.mRemote.transact(5, _data, _reply, 0);
/*  739 */           _reply.readException();
/*      */         } finally {
/*      */
/*  742 */           _reply.recycle();
/*  743 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void customizedSessionTargetInventory(byte btSession, byte btTarget, byte btSL, byte btPhase, byte btPowerSave, byte btRepeat) throws RemoteException {
/*  755 */         Parcel _data = Parcel.obtain();
/*  756 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  758 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  759 */           _data.writeByte(btSession);
/*  760 */           _data.writeByte(btTarget);
/*  761 */           _data.writeByte(btSL);
/*  762 */           _data.writeByte(btPhase);
/*  763 */           _data.writeByte(btPowerSave);
/*  764 */           _data.writeByte(btRepeat);
/*  765 */           this.mRemote.transact(6, _data, _reply, 0);
/*  766 */           _reply.readException();
/*      */         } finally {
/*      */
/*  769 */           _reply.recycle();
/*  770 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void fastSwitchAntInventory(byte btA, byte btStayA, byte btB, byte btStayB, byte btC, byte btStayC, byte btD, byte btStayD, byte btInterval, byte btRepeat) throws RemoteException {
/*  792 */         Parcel _data = Parcel.obtain();
/*  793 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  795 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  796 */           _data.writeByte(btA);
/*  797 */           _data.writeByte(btStayA);
/*  798 */           _data.writeByte(btB);
/*  799 */           _data.writeByte(btStayB);
/*  800 */           _data.writeByte(btC);
/*  801 */           _data.writeByte(btStayC);
/*  802 */           _data.writeByte(btD);
/*  803 */           _data.writeByte(btStayD);
/*  804 */           _data.writeByte(btInterval);
/*  805 */           _data.writeByte(btRepeat);
/*  806 */           this.mRemote.transact(7, _data, _reply, 0);
/*  807 */           _reply.readException();
/*      */         } finally {
/*      */
/*  810 */           _reply.recycle();
/*  811 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void readTag(byte btMemBank, byte btWordAdd, byte btWordCnt, byte[] btAryPassWord) throws RemoteException {
/*  826 */         Parcel _data = Parcel.obtain();
/*  827 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  829 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  830 */           _data.writeByte(btMemBank);
/*  831 */           _data.writeByte(btWordAdd);
/*  832 */           _data.writeByte(btWordCnt);
/*  833 */           _data.writeByteArray(btAryPassWord);
/*  834 */           this.mRemote.transact(8, _data, _reply, 0);
/*  835 */           _reply.readException();
/*      */         } finally {
/*      */
/*  838 */           _reply.recycle();
/*  839 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void writeTag(byte[] btAryPassWord, byte btMemBank, byte btWordAdd, byte btWordCnt, byte[] btAryData) throws RemoteException {
/*  853 */         Parcel _data = Parcel.obtain();
/*  854 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  856 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  857 */           _data.writeByteArray(btAryPassWord);
/*  858 */           _data.writeByte(btMemBank);
/*  859 */           _data.writeByte(btWordAdd);
/*  860 */           _data.writeByte(btWordCnt);
/*  861 */           _data.writeByteArray(btAryData);
/*  862 */           this.mRemote.transact(9, _data, _reply, 0);
/*  863 */           _reply.readException();
/*      */         } finally {
/*      */
/*  866 */           _reply.recycle();
/*  867 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void lockTag(byte[] btAryPassWord, byte btMemBank, byte btLockType) throws RemoteException {
/*  879 */         Parcel _data = Parcel.obtain();
/*  880 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  882 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  883 */           _data.writeByteArray(btAryPassWord);
/*  884 */           _data.writeByte(btMemBank);
/*  885 */           _data.writeByte(btLockType);
/*  886 */           this.mRemote.transact(10, _data, _reply, 0);
/*  887 */           _reply.readException();
/*      */         } finally {
/*      */
/*  890 */           _reply.recycle();
/*  891 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void killTag(byte[] btAryPassWord) throws RemoteException {
/*  901 */         Parcel _data = Parcel.obtain();
/*  902 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  904 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  905 */           _data.writeByteArray(btAryPassWord);
/*  906 */           this.mRemote.transact(11, _data, _reply, 0);
/*  907 */           _reply.readException();
/*      */         } finally {
/*      */
/*  910 */           _reply.recycle();
/*  911 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setAccessEpcMatch(byte btEpcLen, byte[] btAryEpc) throws RemoteException {
/*  922 */         Parcel _data = Parcel.obtain();
/*  923 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  925 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  926 */           _data.writeByte(btEpcLen);
/*  927 */           _data.writeByteArray(btAryEpc);
/*  928 */           this.mRemote.transact(12, _data, _reply, 0);
/*  929 */           _reply.readException();
/*      */         } finally {
/*      */
/*  932 */           _reply.recycle();
/*  933 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void cancelAccessEpcMatch() throws RemoteException {
/*  941 */         Parcel _data = Parcel.obtain();
/*  942 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  944 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  945 */           this.mRemote.transact(13, _data, _reply, 0);
/*  946 */           _reply.readException();
/*      */         } finally {
/*      */
/*  949 */           _reply.recycle();
/*  950 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getAccessEpcMatch() throws RemoteException {
/*  959 */         Parcel _data = Parcel.obtain();
/*  960 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  962 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  963 */           this.mRemote.transact(14, _data, _reply, 0);
/*  964 */           _reply.readException();
/*      */         } finally {
/*      */
/*  967 */           _reply.recycle();
/*  968 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setImpinjFastTid(boolean blnOpen, boolean blnSave) throws RemoteException {
/*  986 */         Parcel _data = Parcel.obtain();
/*  987 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/*  989 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/*  990 */           _data.writeInt(blnOpen ? 1 : 0);
/*  991 */           _data.writeInt(blnSave ? 1 : 0);
/*  992 */           this.mRemote.transact(15, _data, _reply, 0);
/*  993 */           _reply.readException();
/*      */         } finally {
/*      */
/*  996 */           _reply.recycle();
/*  997 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getImpinjFastTid() throws RemoteException {
/* 1006 */         Parcel _data = Parcel.obtain();
/* 1007 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1009 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1010 */           this.mRemote.transact(16, _data, _reply, 0);
/* 1011 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1014 */           _reply.recycle();
/* 1015 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void iso180006BInventory() throws RemoteException {
/* 1025 */         Parcel _data = Parcel.obtain();
/* 1026 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1028 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1029 */           this.mRemote.transact(17, _data, _reply, 0);
/* 1030 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1033 */           _reply.recycle();
/* 1034 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void iso180006BReadTag(byte[] btAryUID, byte btWordAdd, byte btWordCnt) throws RemoteException {
/* 1046 */         Parcel _data = Parcel.obtain();
/* 1047 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1049 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1050 */           _data.writeByteArray(btAryUID);
/* 1051 */           _data.writeByte(btWordAdd);
/* 1052 */           _data.writeByte(btWordCnt);
/* 1053 */           this.mRemote.transact(18, _data, _reply, 0);
/* 1054 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1057 */           _reply.recycle();
/* 1058 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void iso180006BWriteTag(byte[] btAryUID, byte btWordAdd, byte btWordCnt, byte[] btAryBuffer) throws RemoteException {
/* 1071 */         Parcel _data = Parcel.obtain();
/* 1072 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1074 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1075 */           _data.writeByteArray(btAryUID);
/* 1076 */           _data.writeByte(btWordAdd);
/* 1077 */           _data.writeByte(btWordCnt);
/* 1078 */           _data.writeByteArray(btAryBuffer);
/* 1079 */           this.mRemote.transact(19, _data, _reply, 0);
/* 1080 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1083 */           _reply.recycle();
/* 1084 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void iso180006BLockTag(byte[] btAryUID, byte btWordAdd) throws RemoteException {
/* 1095 */         Parcel _data = Parcel.obtain();
/* 1096 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1098 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1099 */           _data.writeByteArray(btAryUID);
/* 1100 */           _data.writeByte(btWordAdd);
/* 1101 */           this.mRemote.transact(20, _data, _reply, 0);
/* 1102 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1105 */           _reply.recycle();
/* 1106 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void iso180006BQueryLockTag(byte[] btAryUID, byte btWordAdd) throws RemoteException {
/* 1117 */         Parcel _data = Parcel.obtain();
/* 1118 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1120 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1121 */           _data.writeByteArray(btAryUID);
/* 1122 */           _data.writeByte(btWordAdd);
/* 1123 */           this.mRemote.transact(21, _data, _reply, 0);
/* 1124 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1127 */           _reply.recycle();
/* 1128 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getInventoryBuffer() throws RemoteException {
/* 1142 */         Parcel _data = Parcel.obtain();
/* 1143 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1145 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1146 */           this.mRemote.transact(22, _data, _reply, 0);
/* 1147 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1150 */           _reply.recycle();
/* 1151 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getAndResetInventoryBuffer() throws RemoteException {
/* 1160 */         Parcel _data = Parcel.obtain();
/* 1161 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1163 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1164 */           this.mRemote.transact(23, _data, _reply, 0);
/* 1165 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1168 */           _reply.recycle();
/* 1169 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getInventoryBufferTagCount() throws RemoteException {
/* 1178 */         Parcel _data = Parcel.obtain();
/* 1179 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1181 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1182 */           this.mRemote.transact(24, _data, _reply, 0);
/* 1183 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1186 */           _reply.recycle();
/* 1187 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void resetInventoryBuffer() throws RemoteException {
/* 1196 */         Parcel _data = Parcel.obtain();
/* 1197 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1199 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1200 */           this.mRemote.transact(25, _data, _reply, 0);
/* 1201 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1204 */           _reply.recycle();
/* 1205 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setWorkAntenna(byte btWorkAntenna) throws RemoteException {
/* 1216 */         Parcel _data = Parcel.obtain();
/* 1217 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1219 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1220 */           _data.writeByte(btWorkAntenna);
/* 1221 */           this.mRemote.transact(26, _data, _reply, 0);
/* 1222 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1225 */           _reply.recycle();
/* 1226 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getWorkAntenna() throws RemoteException {
/* 1234 */         Parcel _data = Parcel.obtain();
/* 1235 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1237 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1238 */           this.mRemote.transact(27, _data, _reply, 0);
/* 1239 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1242 */           _reply.recycle();
/* 1243 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setOutputAllPower(byte btOutputPower) throws RemoteException {
/* 1255 */         Parcel _data = Parcel.obtain();
/* 1256 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1258 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1259 */           _data.writeByte(btOutputPower);
/* 1260 */           this.mRemote.transact(28, _data, _reply, 0);
/* 1261 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1264 */           _reply.recycle();
/* 1265 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setOutputPower(byte btPower1, byte btPower2, byte btPower3, byte btPower4) throws RemoteException {
/* 1287 */         Parcel _data = Parcel.obtain();
/* 1288 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1290 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1291 */           _data.writeByte(btPower1);
/* 1292 */           _data.writeByte(btPower2);
/* 1293 */           _data.writeByte(btPower3);
/* 1294 */           _data.writeByte(btPower4);
/* 1295 */           this.mRemote.transact(29, _data, _reply, 0);
/* 1296 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1299 */           _reply.recycle();
/* 1300 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getOutputPower() throws RemoteException {
/* 1308 */         Parcel _data = Parcel.obtain();
/* 1309 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1311 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1312 */           this.mRemote.transact(30, _data, _reply, 0);
/* 1313 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1316 */           _reply.recycle();
/* 1317 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setFrequencyRegion(byte btRegion, byte btStartRegion, byte btEndRegion) throws RemoteException {
/* 1329 */         Parcel _data = Parcel.obtain();
/* 1330 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1332 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1333 */           _data.writeByte(btRegion);
/* 1334 */           _data.writeByte(btStartRegion);
/* 1335 */           _data.writeByte(btEndRegion);
/* 1336 */           this.mRemote.transact(31, _data, _reply, 0);
/* 1337 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1340 */           _reply.recycle();
/* 1341 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setUserDefineFrequency(byte btFreqInterval, byte btChannelQuantity, int nStartFreq) throws RemoteException {
/* 1353 */         Parcel _data = Parcel.obtain();
/* 1354 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1356 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1357 */           _data.writeByte(btFreqInterval);
/* 1358 */           _data.writeByte(btChannelQuantity);
/* 1359 */           _data.writeInt(nStartFreq);
/* 1360 */           this.mRemote.transact(32, _data, _reply, 0);
/* 1361 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1364 */           _reply.recycle();
/* 1365 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getFrequencyRegion() throws RemoteException {
/* 1373 */         Parcel _data = Parcel.obtain();
/* 1374 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1376 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1377 */           this.mRemote.transact(33, _data, _reply, 0);
/* 1378 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1381 */           _reply.recycle();
/* 1382 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setBeeperMode(byte btMode) throws RemoteException {
/* 1393 */         Parcel _data = Parcel.obtain();
/* 1394 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1396 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1397 */           _data.writeByte(btMode);
/* 1398 */           this.mRemote.transact(34, _data, _reply, 0);
/* 1399 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1402 */           _reply.recycle();
/* 1403 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */       public void getBeeperMode() throws RemoteException {
/* 1408 */         Parcel _data = Parcel.obtain();
/* 1409 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1411 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1412 */           this.mRemote.transact(35, _data, _reply, 0);
/* 1413 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1416 */           _reply.recycle();
/* 1417 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getReaderTemperature() throws RemoteException {
/* 1425 */         Parcel _data = Parcel.obtain();
/* 1426 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1428 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1429 */           this.mRemote.transact(36, _data, _reply, 0);
/* 1430 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1433 */           _reply.recycle();
/* 1434 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void readGpioValue() throws RemoteException {
/* 1442 */         Parcel _data = Parcel.obtain();
/* 1443 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1445 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1446 */           this.mRemote.transact(37, _data, _reply, 0);
/* 1447 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1450 */           _reply.recycle();
/* 1451 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void writeGpioValue(byte btChooseGpio, byte btGpioValue) throws RemoteException {
/* 1462 */         Parcel _data = Parcel.obtain();
/* 1463 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1465 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1466 */           _data.writeByte(btChooseGpio);
/* 1467 */           _data.writeByte(btGpioValue);
/* 1468 */           this.mRemote.transact(38, _data, _reply, 0);
/* 1469 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1472 */           _reply.recycle();
/* 1473 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setAntConnectionDetector(byte btDetectorStatus) throws RemoteException {
/* 1483 */         Parcel _data = Parcel.obtain();
/* 1484 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1486 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1487 */           _data.writeByte(btDetectorStatus);
/* 1488 */           this.mRemote.transact(39, _data, _reply, 0);
/* 1489 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1492 */           _reply.recycle();
/* 1493 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getAntConnectionDetector() throws RemoteException {
/* 1501 */         Parcel _data = Parcel.obtain();
/* 1502 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1504 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1505 */           this.mRemote.transact(40, _data, _reply, 0);
/* 1506 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1509 */           _reply.recycle();
/* 1510 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setTemporaryOutputPower(byte btRfPower) throws RemoteException {
/* 1522 */         Parcel _data = Parcel.obtain();
/* 1523 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1525 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1526 */           _data.writeByte(btRfPower);
/* 1527 */           this.mRemote.transact(41, _data, _reply, 0);
/* 1528 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1531 */           _reply.recycle();
/* 1532 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setReaderIdentifier(byte[] btAryIdentifier) throws RemoteException {
/* 1543 */         Parcel _data = Parcel.obtain();
/* 1544 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1546 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1547 */           _data.writeByteArray(btAryIdentifier);
/* 1548 */           this.mRemote.transact(42, _data, _reply, 0);
/* 1549 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1552 */           _reply.recycle();
/* 1553 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getReaderIdentifier() throws RemoteException {
/* 1561 */         Parcel _data = Parcel.obtain();
/* 1562 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1564 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1565 */           this.mRemote.transact(43, _data, _reply, 0);
/* 1566 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1569 */           _reply.recycle();
/* 1570 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setRfLinkProfile(byte btProfile) throws RemoteException {
/* 1581 */         Parcel _data = Parcel.obtain();
/* 1582 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1584 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1585 */           _data.writeByte(btProfile);
/* 1586 */           this.mRemote.transact(44, _data, _reply, 0);
/* 1587 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1590 */           _reply.recycle();
/* 1591 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getRfLinkProfile() throws RemoteException {
/* 1599 */         Parcel _data = Parcel.obtain();
/* 1600 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1602 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1603 */           this.mRemote.transact(45, _data, _reply, 0);
/* 1604 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1607 */           _reply.recycle();
/* 1608 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getRfPortReturnLoss(byte btFrequency) throws RemoteException {
/* 1619 */         Parcel _data = Parcel.obtain();
/* 1620 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1622 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1623 */           _data.writeByte(btFrequency);
/* 1624 */           this.mRemote.transact(46, _data, _reply, 0);
/* 1625 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1628 */           _reply.recycle();
/* 1629 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getReaderSN() throws RemoteException {
/* 1638 */         Parcel _data = Parcel.obtain();
/* 1639 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1641 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1642 */           this.mRemote.transact(47, _data, _reply, 0);
/* 1643 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1646 */           _reply.recycle();
/* 1647 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getReaderVersion() throws RemoteException {
/* 1655 */         Parcel _data = Parcel.obtain();
/* 1656 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1658 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1659 */           this.mRemote.transact(48, _data, _reply, 0);
/* 1660 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1663 */           _reply.recycle();
/* 1664 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getFirmwareVersion() throws RemoteException {
/* 1672 */         Parcel _data = Parcel.obtain();
/* 1673 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1675 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1676 */           this.mRemote.transact(49, _data, _reply, 0);
/* 1677 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1680 */           _reply.recycle();
/* 1681 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getBatteryRemainingPercent() throws RemoteException {
/* 1690 */         Parcel _data = Parcel.obtain();
/* 1691 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1693 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1694 */           this.mRemote.transact(50, _data, _reply, 0);
/* 1695 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1698 */           _reply.recycle();
/* 1699 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getBatteryVoltage() throws RemoteException {
/* 1707 */         Parcel _data = Parcel.obtain();
/* 1708 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1710 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1711 */           this.mRemote.transact(51, _data, _reply, 0);
/* 1712 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1715 */           _reply.recycle();
/* 1716 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getBatteryChargeState() throws RemoteException {
/* 1724 */         Parcel _data = Parcel.obtain();
/* 1725 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1727 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1728 */           this.mRemote.transact(52, _data, _reply, 0);
/* 1729 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1732 */           _reply.recycle();
/* 1733 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void resetReader() throws RemoteException {
/* 1742 */         Parcel _data = Parcel.obtain();
/* 1743 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1745 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1746 */           this.mRemote.transact(53, _data, _reply, 0);
/* 1747 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1750 */           _reply.recycle();
/* 1751 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setReaderAddress(byte btNewReadId) throws RemoteException {
/* 1761 */         Parcel _data = Parcel.obtain();
/* 1762 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1764 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1765 */           _data.writeByte(btNewReadId);
/* 1766 */           this.mRemote.transact(54, _data, _reply, 0);
/* 1767 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1770 */           _reply.recycle();
/* 1771 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void reset() throws RemoteException {
/* 1779 */         Parcel _data = Parcel.obtain();
/* 1780 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1782 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1783 */           this.mRemote.transact(55, _data, _reply, 0);
/* 1784 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1787 */           _reply.recycle();
/* 1788 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void getBatteryChargeNumTimes() throws RemoteException {
/* 1797 */         Parcel _data = Parcel.obtain();
/* 1798 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1800 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1801 */           this.mRemote.transact(56, _data, _reply, 0);
/* 1802 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1805 */           _reply.recycle();
/* 1806 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void firmwareUpdate(String binFile, IFirmwareUpdateCall call) throws RemoteException {
/* 1818 */         Parcel _data = Parcel.obtain();
/* 1819 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1821 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1822 */           _data.writeString(binFile);
/* 1823 */           _data.writeStrongBinder((call != null) ? call.asBinder() : null);
/* 1824 */           this.mRemote.transact(57, _data, _reply, 0);
/* 1825 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1828 */           _reply.recycle();
/* 1829 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setImpinjSaveTagFocus(boolean blnOpen) throws RemoteException {
/* 1838 */         Parcel _data = Parcel.obtain();
/* 1839 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1841 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1842 */           _data.writeInt(blnOpen ? 1 : 0);
/* 1843 */           this.mRemote.transact(58, _data, _reply, 0);
/* 1844 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1847 */           _reply.recycle();
/* 1848 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void setTagMask(byte btMaskNo, byte btTarget, byte btAction, byte btMembank, byte btStartAdd, byte btMaskLen, byte[] maskValue) throws RemoteException {
/* 1865 */         Parcel _data = Parcel.obtain();
/* 1866 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1868 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1869 */           _data.writeByte(btMaskNo);
/* 1870 */           _data.writeByte(btTarget);
/* 1871 */           _data.writeByte(btAction);
/* 1872 */           _data.writeByte(btMembank);
/* 1873 */           _data.writeByte(btStartAdd);
/* 1874 */           _data.writeByte(btMaskLen);
/* 1875 */           _data.writeByteArray(maskValue);
/* 1876 */           this.mRemote.transact(59, _data, _reply, 0);
/* 1877 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1880 */           _reply.recycle();
/* 1881 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */
/*      */       public void clearTagMask(byte btMaskNo) throws RemoteException {
/* 1891 */         Parcel _data = Parcel.obtain();
/* 1892 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1894 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1895 */           _data.writeByte(btMaskNo);
/* 1896 */           this.mRemote.transact(60, _data, _reply, 0);
/* 1897 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1900 */           _reply.recycle();
/* 1901 */           _data.recycle();
/*      */         }
/*      */       }
/*      */
/*      */
/*      */
/*      */
/*      */       public void getTagMask() throws RemoteException {
/* 1909 */         Parcel _data = Parcel.obtain();
/* 1910 */         Parcel _reply = Parcel.obtain();
/*      */         try {
/* 1912 */           _data.writeInterfaceToken("com.sunmi.rfid.IScanRFIDInterface");
/* 1913 */           this.mRemote.transact(61, _data, _reply, 0);
/* 1914 */           _reply.readException();
/*      */         } finally {
/*      */
/* 1917 */           _reply.recycle();
/* 1918 */           _data.recycle();
/*      */         }
/*      */       }
/*      */     } }
/*      */    }


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/IScanRFIDInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
