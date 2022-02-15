/*     */ package com.sunmi.rfid;
/*     */
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.ServiceConnection;
/*     */ import android.content.pm.PackageInfo;
/*     */ import android.content.pm.PackageManager;
/*     */ import android.os.IBinder;
/*     */ import android.os.SystemClock;
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
/*     */ public class RFIDManager
/*     */ {
/*     */   public static final int NONE = 100;
/*     */   public static final int UHF_R2000 = 101;
/*     */   public static final int INNER = 102;
/*     */   private static final String TAG = "RFIDManager";
/*     */   private static final int RE_CONNECT = 20;
/*     */   protected boolean printLog;
/*     */   private Context appContext;
/*     */   private boolean isConnect;
/*     */   private int count;
/*     */   private RFIDHelper helper;
/*     */   private IScanRFIDInterface scanInterface;
/*     */
/*     */   private static class SingletonInstance
/*     */   {
/*  38 */     private static RFIDManager sInstance = new RFIDManager();
/*     */   }
/*     */
/*     */   public static RFIDManager getInstance() {
/*  42 */     return SingletonInstance.sInstance;
/*     */   }
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*  51 */   private ServiceConnection conn = new ServiceConnection()
/*     */     {
/*     */       public void onServiceConnected(ComponentName name, IBinder service) {
/*  54 */         RFIDManager.this.scanInterface = IScanRFIDInterface.Stub.asInterface(service);
/*  55 */         if (RFIDManager.this.printLog) Log.i("RFIDManager", "Service Connected!");
/*     */
/*     */       }
/*     */
/*     */       public void onServiceDisconnected(ComponentName name) {
/*  60 */         RFIDManager.this.scanInterface = null;
/*  61 */         if (RFIDManager.this.printLog) Log.w("RFIDManager", "Service error Disconnected!");
/*     */       }
/*     */     };
/*     */
/*     */   public boolean isConnect() {
/*  66 */     return (this.isConnect && this.scanInterface != null);
/*     */   }
/*     */
/*     */   public void connect(Context context) {
/*  70 */     if (context == null) throw new RuntimeException("Parameter context is Null");
/*  71 */     this.appContext = context.getApplicationContext();
/*  72 */     if (this.scanInterface == null)
/*  73 */     { PackageInfo packageInfo = getPackageInfo(this.appContext, "com.sunmi.scanner");
/*  74 */       if (packageInfo != null)
/*  75 */       // { if (packageInfo.versionCode >= 20032002) - fix bug upgrade firmware
/*  75 */       { if (packageInfo.versionCode >= 0)
/*  76 */         { Intent intent = new Intent();
/*  77 */           intent.setPackage("com.sunmi.scanner");
/*  78 */           intent.setAction("com.sunmi.scanner.IScanRFIDInterface");
/*  79 */           this.appContext.startService(intent);
/*  80 */           this.appContext.bindService(intent, this.conn, 1);
/*  81 */           this.isConnect = true; }
/*     */
/*  83 */         else if (this.printLog) { Log.w("RFIDManager", "connect: Service is not supported."); }
/*     */
/*     */          }
/*  86 */       else if (this.printLog) { Log.w("RFIDManager", "connect: un found service."); }
/*     */
/*     */        }
/*  89 */     else if (this.printLog) { Log.i("RFIDManager", "connect: scanner rfid is connect."); }
/*     */
/*     */   }
/*     */
/*     */   public void disconnect() {
/*     */     try {
/*  95 */       if (this.scanInterface != null) {
/*  96 */         this.isConnect = false;
/*  97 */         this.appContext.unbindService(this.conn);
/*  98 */         this.scanInterface = null;
/*  99 */         this.appContext = null;
/* 100 */         if (this.printLog) Log.i("RFIDManager", "Service Disconnected!");
/*     */       }
/* 102 */     } catch (Exception e) {
/* 103 */       e.printStackTrace();
/* 104 */       Log.e("RFIDManager", "disconnect: error", e);
/*     */     }
/*     */   }
/*     */
/*     */   public void setPrintLog(boolean printLog) {
/* 109 */     this.printLog = printLog;
/*     */   }
/*     */
/*     */   public RFIDHelper getHelper() {
/* 113 */     if (this.helper == null) {
/* 114 */       if (this.scanInterface != null)
/* 115 */       { this.helper = new ServicesHelper(this.scanInterface); }
/* 116 */       else { if (this.isConnect && this.count > 20) {
/* 117 */           this.count++;
/* 118 */           SystemClock.sleep(50L);
/* 119 */           return getHelper();
/*     */         }
/* 121 */         if (this.printLog) {
/* 122 */           Log.e("RFIDManager", "getHelper: Please call connect() method first or Service is not supported.");
/*     */         }
/* 124 */         throw new RuntimeException("Please call connect() method first or Service is not supported."); }
/*     */
/*     */     }
/* 127 */     this.count = 0;
/* 128 */     return this.helper;
/*     */   }
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */
/*     */   private PackageInfo getPackageInfo(Context context, String packageName) {
/*     */     PackageInfo packageInfo;
/*     */     try {
/* 139 */       packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
/* 140 */     } catch (android.content.pm.PackageManager.NameNotFoundException e) {
/* 141 */       packageInfo = null;
/* 142 */       e.printStackTrace();
/*     */     }
/* 144 */     return packageInfo;
/*     */   }
/*     */
/*     */   private RFIDManager() {}
/*     */ }


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/RFIDManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
