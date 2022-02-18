/*     */ package com.sunmi.rfid;
/*     */ import android.os.Binder;
import android.os.IBinder;
/*     */ import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
/*     */ import com.sunmi.rfid.entity.DataParameter;
/*     */
/*     */ public interface IReaderCall extends IInterface {
/*     */   void onSuccess(byte paramByte, DataParameter paramDataParameter) throws RemoteException;
/*     */
/*     */   void onTag(byte paramByte1, byte paramByte2, DataParameter paramDataParameter) throws RemoteException;
/*     */
/*     */   void onFailed(byte paramByte1, byte paramByte2, String paramString) throws RemoteException;
/*     */
/*     */   public static abstract class Stub extends Binder implements IReaderCall {
/*     */     private static final String DESCRIPTOR = "com.sunmi.rfid.IReaderCall";
/*     */     static final int TRANSACTION_onSuccess = 1;
/*     */
/*     */     public Stub() {
/*  18 */       attachInterface(this, "com.sunmi.rfid.IReaderCall");
/*     */     }
/*     */
/*     */
/*     */     static final int TRANSACTION_onTag = 2;
/*     */     static final int TRANSACTION_onFailed = 3;
/*     */
/*     */     public static IReaderCall asInterface(IBinder obj) {
/*  26 */       if (obj == null) {
/*  27 */         return null;
/*     */       }
/*  29 */       IInterface iin = obj.queryLocalInterface("com.sunmi.rfid.IReaderCall");
/*  30 */       if (iin != null && iin instanceof IReaderCall) {
/*  31 */         return (IReaderCall)iin;
/*     */       }
/*  33 */       return new Proxy(obj);
/*     */     }
/*     */
/*     */     public IBinder asBinder() {
/*  37 */       return (IBinder)this; } public boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException { byte _arg0; DataParameter dataParameter1;
/*     */       byte _arg1;
/*     */       DataParameter dataParameter2;
/*     */       String _arg2;
/*  41 */       switch (code) {
/*     */
/*     */
/*     */         case 1598968902:
/*  45 */           reply.writeString("com.sunmi.rfid.IReaderCall");
/*  46 */           return true;
/*     */
/*     */
/*     */         case 1:
/*  50 */           data.enforceInterface("com.sunmi.rfid.IReaderCall");
/*     */
/*  52 */           _arg0 = data.readByte();
/*     */
/*  54 */           if (0 != data.readInt()) {
/*  55 */             dataParameter1 = (DataParameter)DataParameter.CREATOR.createFromParcel(data);
/*     */           } else {
/*     */
/*  58 */             dataParameter1 = null;
/*     */           }
/*  60 */           onSuccess(_arg0, dataParameter1);
/*  61 */           reply.writeNoException();
/*  62 */           return true;
/*     */
/*     */
/*     */         case 2:
/*  66 */           data.enforceInterface("com.sunmi.rfid.IReaderCall");
/*     */
/*  68 */           _arg0 = data.readByte();
/*     */
/*  70 */           _arg1 = data.readByte();
/*     */
/*  72 */           if (0 != data.readInt()) {
/*  73 */             dataParameter2 = (DataParameter)DataParameter.CREATOR.createFromParcel(data);
/*     */           } else {
/*     */
/*  76 */             dataParameter2 = null;
/*     */           }
/*  78 */           onTag(_arg0, _arg1, dataParameter2);
/*  79 */           reply.writeNoException();
/*  80 */           return true;
/*     */
/*     */
/*     */         case 3:
/*  84 */           data.enforceInterface("com.sunmi.rfid.IReaderCall");
/*     */
/*  86 */           _arg0 = data.readByte();
/*     */
/*  88 */           _arg1 = data.readByte();
/*     */
/*  90 */           _arg2 = data.readString();
/*  91 */           onFailed(_arg0, _arg1, _arg2);
/*  92 */           reply.writeNoException();
/*  93 */           return true;
/*     */       }
/*     */
/*  96 */       return super.onTransact(code, data, reply, flags); }
/*     */
/*     */
/*     */     private static class Proxy implements IReaderCall {
/*     */       private IBinder mRemote;
/*     */
/*     */       Proxy(IBinder remote) {
/* 103 */         this.mRemote = remote;
/*     */       }
/*     */
/*     */       public IBinder asBinder() {
/* 107 */         return this.mRemote;
/*     */       }
/*     */
/*     */       public String getInterfaceDescriptor() {
/* 111 */         return "com.sunmi.rfid.IReaderCall";
/*     */       }
/*     */
/*     */
/*     */
/*     */
/*     */       public void onSuccess(byte cmd, DataParameter params) throws RemoteException {
/* 118 */         Parcel _data = Parcel.obtain();
/* 119 */         Parcel _reply = Parcel.obtain();
/*     */         try {
/* 121 */           _data.writeInterfaceToken("com.sunmi.rfid.IReaderCall");
/* 122 */           _data.writeByte(cmd);
/* 123 */           if (params != null) {
/* 124 */             _data.writeInt(1);
/* 125 */             params.writeToParcel(_data, 0);
/*     */           } else {
/*     */
/* 128 */             _data.writeInt(0);
/*     */           }
/* 130 */           this.mRemote.transact(1, _data, _reply, 0);
/* 131 */           _reply.readException();
/*     */         } finally {
/*     */
/* 134 */           _reply.recycle();
/* 135 */           _data.recycle();
/*     */         }
/*     */       }
/*     */
/*     */
/*     */
/*     */
/*     */       public void onTag(byte cmd, byte state, DataParameter tag) throws RemoteException {
/* 143 */         Parcel _data = Parcel.obtain();
/* 144 */         Parcel _reply = Parcel.obtain();
/*     */         try {
/* 146 */           _data.writeInterfaceToken("com.sunmi.rfid.IReaderCall");
/* 147 */           _data.writeByte(cmd);
/* 148 */           _data.writeByte(state);
/* 149 */           if (tag != null) {
/* 150 */             _data.writeInt(1);
/* 151 */             tag.writeToParcel(_data, 0);
/*     */           } else {
/*     */
/* 154 */             _data.writeInt(0);
/*     */           }
/* 156 */           this.mRemote.transact(2, _data, _reply, 0);
/* 157 */           _reply.readException();
/*     */         } finally {
/*     */
/* 160 */           _reply.recycle();
/* 161 */           _data.recycle();
/*     */         }
/*     */       }
/*     */
/*     */
/*     */
/*     */
/*     */       public void onFailed(byte cmd, byte errorCode, String msg) throws RemoteException {
/* 169 */         Parcel _data = Parcel.obtain();
/* 170 */         Parcel _reply = Parcel.obtain();
/*     */         try {
/* 172 */           _data.writeInterfaceToken("com.sunmi.rfid.IReaderCall");
/* 173 */           _data.writeByte(cmd);
/* 174 */           _data.writeByte(errorCode);
/* 175 */           _data.writeString(msg);
/* 176 */           this.mRemote.transact(3, _data, _reply, 0);
/* 177 */           _reply.readException();
/*     */         } finally {
/*     */
/* 180 */           _reply.recycle();
/* 181 */           _data.recycle();
/*     */         }
/*     */       }
/*     */     }
/*     */   }
/*     */ }


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/IReaderCall.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
