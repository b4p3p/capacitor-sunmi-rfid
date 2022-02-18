/*     */ package com.sunmi.rfid;
/*     */ 
/*     */ import android.os.RemoteException;
/*     */ 
/*     */ public class ServicesHelper implements RFIDHelper {
/*     */   private IScanRFIDInterface scan;
/*     */   
/*     */   public ServicesHelper(IScanRFIDInterface scan) {
/*   9 */     this.scan = scan;
/*     */   }
/*     */ 
/*     */   
/*     */   public int getScanModel() throws RemoteException {
/*  14 */     return this.scan.getScanModel();
/*     */   }
/*     */ 
/*     */   
/*     */   public void registerReaderCall(ReaderCall call) {
/*  19 */     handleError(() -> this.scan.registerReaderCall(call));
/*     */   }
/*     */ 
/*     */   
/*     */   public void unregisterReaderCall() {
/*  24 */     handleError(() -> this.scan.unregisterReaderCall());
/*     */   }
/*     */ 
/*     */   
/*     */   public void inventory(byte btRepeat) {
/*  29 */     handleError(() -> this.scan.inventory(btRepeat));
/*     */   }
/*     */ 
/*     */   
/*     */   public void realTimeInventory(byte btRepeat) {
/*  34 */     handleError(() -> this.scan.realTimeInventory(btRepeat));
/*     */   }
/*     */ 
/*     */   
/*     */   public void customizedSessionTargetInventory(byte btSession, byte btTarget, byte btSL, byte btPhase, byte btPowerSave, byte btRepeat) {
/*  39 */     handleError(() -> this.scan.customizedSessionTargetInventory(btSession, btTarget, btSL, btPhase, btPowerSave, btRepeat));
/*     */   }
/*     */ 
/*     */   
/*     */   public void fastSwitchAntInventory(byte btA, byte btStayA, byte btB, byte btStayB, byte btC, byte btStayC, byte btD, byte btStayD, byte btInterval, byte btRepeat) {
/*  44 */     handleError(() -> this.scan.fastSwitchAntInventory(btA, btStayA, btB, btStayB, btC, btStayC, btD, btStayD, btInterval, btRepeat));
/*     */   }
/*     */ 
/*     */   
/*     */   public void readTag(byte btMemBank, byte btWordAdd, byte btWordCnt, byte[] btAryPassWord) {
/*  49 */     handleError(() -> this.scan.readTag(btMemBank, btWordAdd, btWordCnt, btAryPassWord));
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeTag(byte[] btAryPassWord, byte btMemBank, byte btWordAdd, byte btWordCnt, byte[] btAryData) {
/*  54 */     handleError(() -> this.scan.writeTag(btAryPassWord, btMemBank, btWordAdd, btWordCnt, btAryData));
/*     */   }
/*     */ 
/*     */   
/*     */   public void lockTag(byte[] btAryPassWord, byte btMemBank, byte btLockType) {
/*  59 */     handleError(() -> this.scan.lockTag(btAryPassWord, btMemBank, btLockType));
/*     */   }
/*     */ 
/*     */   
/*     */   public void killTag(byte[] btAryPassWord) {
/*  64 */     handleError(() -> this.scan.killTag(btAryPassWord));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAccessEpcMatch(byte btEpcLen, byte[] btAryEpc) {
/*  69 */     handleError(() -> this.scan.setAccessEpcMatch(btEpcLen, btAryEpc));
/*     */   }
/*     */ 
/*     */   
/*     */   public void cancelAccessEpcMatch() {
/*  74 */     handleError(() -> this.scan.cancelAccessEpcMatch());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getAccessEpcMatch() {
/*  79 */     handleError(() -> this.scan.getAccessEpcMatch());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setImpinjFastTid(boolean blnOpen, boolean blnSave) {
/*  84 */     handleError(() -> this.scan.setImpinjFastTid(blnOpen, blnSave));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getImpinjFastTid() {
/*  89 */     handleError(() -> this.scan.getImpinjFastTid());
/*     */   }
/*     */ 
/*     */   
/*     */   public void iso180006BInventory() {
/*  94 */     handleError(() -> this.scan.iso180006BInventory());
/*     */   }
/*     */ 
/*     */   
/*     */   public void iso180006BReadTag(byte[] btAryUID, byte btWordAdd, byte btWordCnt) {
/*  99 */     handleError(() -> this.scan.iso180006BReadTag(btAryUID, btWordAdd, btWordCnt));
/*     */   }
/*     */ 
/*     */   
/*     */   public void iso180006BWriteTag(byte[] btAryUID, byte btWordAdd, byte btWordCnt, byte[] btAryBuffer) {
/* 104 */     handleError(() -> this.scan.iso180006BWriteTag(btAryUID, btWordAdd, btWordCnt, btAryBuffer));
/*     */   }
/*     */ 
/*     */   
/*     */   public void iso180006BLockTag(byte[] btAryUID, byte btWordAdd) {
/* 109 */     handleError(() -> this.scan.iso180006BLockTag(btAryUID, btWordAdd));
/*     */   }
/*     */ 
/*     */   
/*     */   public void iso180006BQueryLockTag(byte[] btAryUID, byte btWordAdd) {
/* 114 */     handleError(() -> this.scan.iso180006BQueryLockTag(btAryUID, btWordAdd));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getInventoryBuffer() {
/* 119 */     handleError(() -> this.scan.getInventoryBuffer());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getAndResetInventoryBuffer() {
/* 124 */     handleError(() -> this.scan.getAndResetInventoryBuffer());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getInventoryBufferTagCount() {
/* 129 */     handleError(() -> this.scan.getInventoryBufferTagCount());
/*     */   }
/*     */ 
/*     */   
/*     */   public void resetInventoryBuffer() {
/* 134 */     handleError(() -> this.scan.getInventoryBuffer());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setWorkAntenna(byte btWorkAntenna) {
/* 139 */     handleError(() -> this.scan.setWorkAntenna(btWorkAntenna));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getWorkAntenna() {
/* 144 */     handleError(() -> this.scan.getWorkAntenna());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOutputAllPower(byte btOutputPower) {
/* 149 */     handleError(() -> this.scan.setOutputAllPower(btOutputPower));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setOutputPower(byte btPower1, byte btPower2, byte btPower3, byte btPower4) {
/* 154 */     handleError(() -> this.scan.setOutputPower(btPower1, btPower2, btPower3, btPower4));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getOutputPower() {
/* 159 */     handleError(() -> this.scan.getOutputPower());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setFrequencyRegion(byte btRegion, byte btStartRegion, byte btEndRegion) {
/* 164 */     handleError(() -> this.scan.setFrequencyRegion(btRegion, btStartRegion, btEndRegion));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setUserDefineFrequency(byte btFreqInterval, byte btChannelQuantity, int nStartFreq) {
/* 169 */     handleError(() -> this.scan.setUserDefineFrequency(btFreqInterval, btChannelQuantity, nStartFreq));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getFrequencyRegion() {
/* 174 */     handleError(() -> this.scan.getFrequencyRegion());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setBeeperMode(byte btMode) {
/* 179 */     handleError(() -> this.scan.setBeeperMode(btMode));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getBeeperMode() {
/* 184 */     handleError(() -> this.scan.getBeeperMode());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getReaderTemperature() {
/* 189 */     handleError(() -> this.scan.getReaderTemperature());
/*     */   }
/*     */ 
/*     */   
/*     */   public void readGpioValue() {
/* 194 */     handleError(() -> this.scan.readGpioValue());
/*     */   }
/*     */ 
/*     */   
/*     */   public void writeGpioValue(byte btChooseGpio, byte btGpioValue) {
/* 199 */     handleError(() -> this.scan.writeGpioValue(btChooseGpio, btGpioValue));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setAntConnectionDetector(byte btDetectorStatus) {
/* 204 */     handleError(() -> this.scan.setAntConnectionDetector(btDetectorStatus));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getAntConnectionDetector() {
/* 209 */     handleError(() -> this.scan.getAntConnectionDetector());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTemporaryOutputPower(byte btRfPower) {
/* 214 */     handleError(() -> this.scan.setTemporaryOutputPower(btRfPower));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setReaderIdentifier(byte[] btAryIdentifier) {
/* 219 */     handleError(() -> this.scan.setReaderIdentifier(btAryIdentifier));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getReaderIdentifier() {
/* 224 */     handleError(() -> this.scan.getReaderIdentifier());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setRfLinkProfile(byte btProfile) {
/* 229 */     handleError(() -> this.scan.setRfLinkProfile(btProfile));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getRfLinkProfile() {
/* 234 */     handleError(() -> this.scan.getRfLinkProfile());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getRfPortReturnLoss(byte btFrequency) {
/* 239 */     handleError(() -> this.scan.getRfPortReturnLoss(btFrequency));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getReaderSN() {
/* 244 */     handleError(() -> this.scan.getReaderSN());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getReaderVersion() {
/* 249 */     handleError(() -> this.scan.getReaderVersion());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getFirmwareVersion() {
/* 254 */     handleError(() -> this.scan.getFirmwareVersion());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getBatteryRemainingPercent() {
/* 259 */     handleError(() -> this.scan.getBatteryRemainingPercent());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getBatteryVoltage() {
/* 264 */     handleError(() -> this.scan.getBatteryVoltage());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getBatteryChargeState() {
/* 269 */     handleError(() -> this.scan.getBatteryChargeState());
/*     */   }
/*     */ 
/*     */   
/*     */   public void resetReader() {
/* 274 */     handleError(() -> this.scan.resetReader());
/*     */   }
/*     */ 
/*     */   
/*     */   public void setReaderAddress(byte btNewReadId) {
/* 279 */     handleError(() -> this.scan.setReaderAddress(btNewReadId));
/*     */   }
/*     */ 
/*     */   
/*     */   public void reset() {
/* 284 */     handleError(() -> this.scan.reset());
/*     */   }
/*     */ 
/*     */   
/*     */   public void getBatteryChargeNumTimes() {
/* 289 */     handleError(() -> this.scan.getBatteryChargeNumTimes());
/*     */   }
/*     */ 
/*     */   
/*     */   public void firmwareUpdate(String binFile, IFirmwareUpdateCall call) {
/* 294 */     handleError(() -> this.scan.firmwareUpdate(binFile, call));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setImpinjSaveTagFocus(boolean blnOpen) {
/* 299 */     handleError(() -> this.scan.setImpinjSaveTagFocus(blnOpen));
/*     */   }
/*     */ 
/*     */   
/*     */   public void setTagMask(byte btMaskNo, byte btTarget, byte btAction, byte btMembank, byte btStartAdd, byte btMaskLen, byte[] maskValue) {
/* 304 */     handleError(() -> this.scan.setTagMask(btMaskNo, btTarget, btAction, btMembank, btStartAdd, btMaskLen, maskValue));
/*     */   }
/*     */ 
/*     */   
/*     */   public void clearTagMask(byte btMaskNo) {
/* 309 */     handleError(() -> this.scan.clearTagMask(btMaskNo));
/*     */   }
/*     */ 
/*     */   
/*     */   public void getTagMask() {
/* 314 */     handleError(() -> this.scan.getTagMask());
/*     */   }
/*     */   
/*     */   private void handleError(RFIDHelper.Call call) {
/*     */     try {
/* 319 */       call.run();
/* 320 */     } catch (RemoteException e) {
/* 321 */       e.printStackTrace();
/* 322 */       throw new RuntimeException("aidl operate error.");
/*     */     } 
/*     */   }
/*     */ }


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/ServicesHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */