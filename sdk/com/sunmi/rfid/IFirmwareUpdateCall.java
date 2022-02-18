/*     */ package com.sunmi.rfid;
/*     */ import android.os.Binder;
import android.os.IBinder;
/*     */ import android.os.IInterface;
import android.os.Parcel;
/*     */ import android.os.RemoteException;
/*     */
/*     */ public interface IFirmwareUpdateCall extends IInterface {
/*     */   void onSuccess() throws RemoteException;
/*     */
/*     */   void onProgress(int paramInt) throws RemoteException;
/*     */
/*     */   void onFailed(int paramInt, String paramString) throws RemoteException;
/*     */
/*     */   public static abstract class Stub extends Binder implements IFirmwareUpdateCall {
/*     */     public Stub() {
/*  15 */       attachInterface(this, "com.sunmi.rfid.IFirmwareUpdateCall");
/*     */     }
/*     */     private static final String DESCRIPTOR = "com.sunmi.rfid.IFirmwareUpdateCall";
/*     */     static final int TRANSACTION_onSuccess = 1;
/*     */     static final int TRANSACTION_onProgress = 2;
/*     */     static final int TRANSACTION_onFailed = 3;
/*     */
/*     */     public static IFirmwareUpdateCall asInterface(IBinder obj) {
/*  23 */       if (obj == null) {
/*  24 */         return null;
/*     */       }
/*  26 */       IInterface iin = obj.queryLocalInterface("com.sunmi.rfid.IFirmwareUpdateCall");
/*  27 */       if (iin != null && iin instanceof IFirmwareUpdateCall) {
/*  28 */         return (IFirmwareUpdateCall)iin;
/*     */       }
/*  30 */       return new Proxy(obj);
/*     */     }
/*     */
/*     */     public IBinder asBinder() {
/*  34 */       return (IBinder)this;
/*     */     } public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
/*     */       int _arg0;
/*     */       String _arg1;
/*  38 */       switch (code) {
/*     */
/*     */
/*     */         case 1598968902:
/*  42 */           reply.writeString("com.sunmi.rfid.IFirmwareUpdateCall");
/*  43 */           return true;
/*     */
/*     */
/*     */         case 1:
/*  47 */           data.enforceInterface("com.sunmi.rfid.IFirmwareUpdateCall");
/*  48 */           onSuccess();
/*  49 */           reply.writeNoException();
/*  50 */           return true;
/*     */
/*     */
/*     */         case 2:
/*  54 */           data.enforceInterface("com.sunmi.rfid.IFirmwareUpdateCall");
/*     */
/*  56 */           _arg0 = data.readInt();
/*  57 */           onProgress(_arg0);
/*  58 */           reply.writeNoException();
/*  59 */           return true;
/*     */
/*     */
/*     */         case 3:
/*  63 */           data.enforceInterface("com.sunmi.rfid.IFirmwareUpdateCall");
/*     */
/*  65 */           _arg0 = data.readInt();
/*     */
/*  67 */           _arg1 = data.readString();
/*  68 */           onFailed(_arg0, _arg1);
/*  69 */           reply.writeNoException();
/*  70 */           return true;
/*     */       }
/*     */
/*  73 */       return super.onTransact(code, data, reply, flags);
/*     */     }
/*     */
/*     */     private static class Proxy implements IFirmwareUpdateCall {
/*     */       private IBinder mRemote;
/*     */
/*     */       Proxy(IBinder remote) {
/*  80 */         this.mRemote = remote;
/*     */       }
/*     */
/*     */       public IBinder asBinder() {
/*  84 */         return this.mRemote;
/*     */       }
/*     */
/*     */       public String getInterfaceDescriptor() {
/*  88 */         return "com.sunmi.rfid.IFirmwareUpdateCall";
/*     */       }
/*     */
/*     */
/*     */
/*     */
/*     */       public void onSuccess() throws RemoteException {
/*  95 */         Parcel _data = Parcel.obtain();
/*  96 */         Parcel _reply = Parcel.obtain();
/*     */         try {
/*  98 */           _data.writeInterfaceToken("com.sunmi.rfid.IFirmwareUpdateCall");
/*  99 */           this.mRemote.transact(1, _data, _reply, 0);
/* 100 */           _reply.readException();
/*     */         } finally {
/*     */
/* 103 */           _reply.recycle();
/* 104 */           _data.recycle();
/*     */         }
/*     */       }
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */       public void onProgress(int progress) throws RemoteException {
/* 114 */         Parcel _data = Parcel.obtain();
/* 115 */         Parcel _reply = Parcel.obtain();
/*     */         try {
/* 117 */           _data.writeInterfaceToken("com.sunmi.rfid.IFirmwareUpdateCall");
/* 118 */           _data.writeInt(progress);
/* 119 */           this.mRemote.transact(2, _data, _reply, 0);
/* 120 */           _reply.readException();
/*     */         } finally {
/*     */
/* 123 */           _reply.recycle();
/* 124 */           _data.recycle();
/*     */         }
/*     */       }
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */       public void onFailed(int code, String msg) throws RemoteException {
/* 137 */         Parcel _data = Parcel.obtain();
/* 138 */         Parcel _reply = Parcel.obtain();
/*     */         try {
/* 140 */           _data.writeInterfaceToken("com.sunmi.rfid.IFirmwareUpdateCall");
/* 141 */           _data.writeInt(code);
/* 142 */           _data.writeString(msg);
/* 143 */           this.mRemote.transact(3, _data, _reply, 0);
/* 144 */           _reply.readException();
/*     */         } finally {
/*     */
/* 147 */           _reply.recycle();
/* 148 */           _data.recycle();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/IFirmwareUpdateCall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
