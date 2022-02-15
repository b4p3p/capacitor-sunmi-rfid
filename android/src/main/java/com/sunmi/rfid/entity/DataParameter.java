/*     */ package com.sunmi.rfid.entity;
/*     */
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.util.ArrayMap;
/*     */ import android.util.Log;
/*     */ import java.io.Serializable;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Map;
/*     */ import java.util.Set;
/*     */
/*     */ public class DataParameter
/*     */   implements Parcelable, Serializable
/*     */ {
/*  15 */   private static final String TAG = DataParameter.class.getSimpleName();
/*     */   private ArrayMap<String, Object> mMap;
/*     */
/*     */   public DataParameter() {
/*  19 */     this.mMap = new ArrayMap();
/*     */   }
/*     */
/*     */   public DataParameter(DataParameter data) {
/*  23 */     this();
/*  24 */     if (data != null && data.mMap != null) {
/*  25 */       putAll((Map)data.mMap);
/*     */     }
/*     */   }
/*     */
/*     */   public DataParameter(Map<String, Object> map) {
/*  30 */     this();
/*  31 */     if (map != null) {
/*  32 */       putAll(map);
/*     */     }
/*     */   }
/*     */
/*     */   protected DataParameter(Parcel in) {
/*  37 */     in.readMap((Map)(this.mMap = new ArrayMap()), ArrayMap.class.getClassLoader());
/*     */   }
/*     */
/*     */
/*     */   public void writeToParcel(Parcel dest, int flags) {
/*  42 */     dest.writeMap((Map)this.mMap);
/*     */   }
/*     */
/*     */
/*     */   public int describeContents() {
/*  47 */     return 0;
/*     */   }
/*     */
/*  50 */   public static final Parcelable.Creator<DataParameter> CREATOR = new Parcelable.Creator<DataParameter>()
/*     */     {
/*     */       public DataParameter createFromParcel(Parcel in) {
/*  53 */         return new DataParameter(in);
/*     */       }
/*     */
/*     */
/*     */       public DataParameter[] newArray(int size) {
/*  58 */         return new DataParameter[size];
/*     */       }
/*     */     };
/*     */
/*     */   public boolean containsKey(String key) {
/*  63 */     return this.mMap.containsKey(key);
/*     */   }
/*     */
/*     */   public boolean containsValue(Object value) {
/*  67 */     return this.mMap.containsValue(value);
/*     */   }
/*     */
/*     */   public boolean isEmpty() {
/*  71 */     return this.mMap.isEmpty();
/*     */   }
/*     */
/*     */   public Object get(String key) {
/*  75 */     return this.mMap.get(key);
/*     */   }
/*     */
/*     */   public Object put(String key, Object value) {
/*  79 */     return this.mMap.put(key, value);
/*     */   }
/*     */
/*     */   public void clear() {
/*  83 */     this.mMap.clear();
/*     */   }
/*     */
/*     */   public void remove(String key) {
/*  87 */     this.mMap.remove(key);
/*     */   }
/*     */
/*     */   public int size() {
/*  91 */     return this.mMap.size();
/*     */   }
/*     */
/*     */   public void putAll(Map map) {
/*  95 */     this.mMap.putAll(map);
/*     */   }
/*     */
/*     */   public void putAll(DataParameter map) {
/*  99 */     this.mMap.putAll(map.mMap);
/*     */   }
/*     */
/*     */   public Set<String> keySet() {
/* 103 */     return this.mMap.keySet();
/*     */   }
/*     */
/*     */
/*     */
/*     */   private void typeWarning(String key, Object value, String className, Object defaultValue, ClassCastException e) {
/* 109 */     StringBuilder sb = new StringBuilder();
/* 110 */     sb.append("Key ");
/* 111 */     sb.append(key);
/* 112 */     sb.append(" expected ");
/* 113 */     sb.append(className);
/* 114 */     sb.append(" but value was a ");
/* 115 */     sb.append(value.getClass().getName());
/* 116 */     sb.append(".  The default value ");
/* 117 */     sb.append(defaultValue);
/* 118 */     sb.append(" was returned.");
/* 119 */     Log.w(TAG, sb.toString());
/* 120 */     Log.w(TAG, "Attempt to cast generated internal exception:", e);
/*     */   }
/*     */
/*     */   private void typeWarning(String key, Object value, String className, ClassCastException e) {
/* 124 */     typeWarning(key, value, className, "<null>", e);
/*     */   }
/*     */
/*     */   public boolean getBoolean(String key) {
/* 128 */     return getBoolean(key, false);
/*     */   }
/*     */
/*     */   public boolean getBoolean(String key, boolean defaultValue) {
/* 132 */     Object o = get(key);
/* 133 */     if (o == null) {
/* 134 */       return defaultValue;
/*     */     }
/*     */     try {
/* 137 */       return ((Boolean)o).booleanValue();
/* 138 */     } catch (ClassCastException e) {
/* 139 */       typeWarning(key, o, "Boolean", Boolean.valueOf(defaultValue), e);
/* 140 */       return defaultValue;
/*     */     }
/*     */   }
/*     */
/*     */   public byte getByte(String key) {
/* 145 */     return getByte(key, (byte)0).byteValue();
/*     */   }
/*     */
/*     */   public Byte getByte(String key, byte defaultValue) {
/* 149 */     Object o = get(key);
/* 150 */     if (o == null) {
/* 151 */       return Byte.valueOf(defaultValue);
/*     */     }
/*     */     try {
/* 154 */       return (Byte)o;
/* 155 */     } catch (ClassCastException e) {
/* 156 */       typeWarning(key, o, "Byte", Byte.valueOf(defaultValue), e);
/* 157 */       return Byte.valueOf(defaultValue);
/*     */     }
/*     */   }
/*     */
/*     */   public char getChar(String key) {
/* 162 */     return getChar(key, '0');
/*     */   }
/*     */
/*     */   public char getChar(String key, char defaultValue) {
/* 166 */     Object o = get(key);
/* 167 */     if (o == null) {
/* 168 */       return defaultValue;
/*     */     }
/*     */     try {
/* 171 */       return ((Character)o).charValue();
/* 172 */     } catch (ClassCastException e) {
/* 173 */       typeWarning(key, o, "Character", Character.valueOf(defaultValue), e);
/* 174 */       return defaultValue;
/*     */     }
/*     */   }
/*     */
/*     */   public short getShort(String key) {
/* 179 */     return getShort(key, (short)0);
/*     */   }
/*     */
/*     */   public short getShort(String key, short defaultValue) {
/* 183 */     Object o = get(key);
/* 184 */     if (o == null) {
/* 185 */       return defaultValue;
/*     */     }
/*     */     try {
/* 188 */       return ((Short)o).shortValue();
/* 189 */     } catch (ClassCastException e) {
/* 190 */       typeWarning(key, o, "Short", Short.valueOf(defaultValue), e);
/* 191 */       return defaultValue;
/*     */     }
/*     */   }
/*     */
/*     */   public int getInt(String key) {
/* 196 */     return getInt(key, 0);
/*     */   }
/*     */
/*     */   public int getInt(String key, int defaultValue) {
/* 200 */     Object o = get(key);
/* 201 */     if (o == null) {
/* 202 */       return defaultValue;
/*     */     }
/*     */     try {
/* 205 */       return ((Integer)o).intValue();
/* 206 */     } catch (ClassCastException e) {
/* 207 */       typeWarning(key, o, "Integer", Integer.valueOf(defaultValue), e);
/* 208 */       return defaultValue;
/*     */     }
/*     */   }
/*     */
/*     */   public long getLong(String key) {
/* 213 */     return getLong(key, 0L);
/*     */   }
/*     */
/*     */   public long getLong(String key, long defaultValue) {
/* 217 */     Object o = get(key);
/* 218 */     if (o == null) {
/* 219 */       return defaultValue;
/*     */     }
/*     */     try {
/* 222 */       return ((Long)o).longValue();
/* 223 */     } catch (ClassCastException e) {
/* 224 */       typeWarning(key, o, "Long", Long.valueOf(defaultValue), e);
/* 225 */       return defaultValue;
/*     */     }
/*     */   }
/*     */
/*     */
/*     */   public float getFloat(String key) {
/* 231 */     return getFloat(key, 0.0F);
/*     */   }
/*     */
/*     */   public float getFloat(String key, float defaultValue) {
/* 235 */     Object o = get(key);
/* 236 */     if (o == null) {
/* 237 */       return defaultValue;
/*     */     }
/*     */     try {
/* 240 */       return ((Float)o).floatValue();
/* 241 */     } catch (ClassCastException e) {
/* 242 */       typeWarning(key, o, "Float", Float.valueOf(defaultValue), e);
/* 243 */       return defaultValue;
/*     */     }
/*     */   }
/*     */
/*     */   public double getDouble(String key) {
/* 248 */     return getDouble(key, 0.0D);
/*     */   }
/*     */
/*     */   public double getDouble(String key, double defaultValue) {
/* 252 */     Object o = get(key);
/* 253 */     if (o == null) {
/* 254 */       return defaultValue;
/*     */     }
/*     */     try {
/* 257 */       return ((Double)o).doubleValue();
/* 258 */     } catch (ClassCastException e) {
/* 259 */       typeWarning(key, o, "Double", Double.valueOf(defaultValue), e);
/* 260 */       return defaultValue;
/*     */     }
/*     */   }
/*     */
/*     */
/*     */   public String getString(String key) {
/* 266 */     Object o = get(key);
/*     */     try {
/* 268 */       return (String)o;
/* 269 */     } catch (ClassCastException e) {
/* 270 */       typeWarning(key, o, "String", e);
/* 271 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */
/*     */   public String getString(String key, String defaultValue) {
/* 277 */     String s = getString(key);
/* 278 */     return (s == null) ? defaultValue : s;
/*     */   }
/*     */
/*     */
/*     */   public CharSequence getCharSequence(String key) {
/* 283 */     Object o = get(key);
/*     */     try {
/* 285 */       return (CharSequence)o;
/* 286 */     } catch (ClassCastException e) {
/* 287 */       typeWarning(key, o, "CharSequence", e);
/* 288 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public CharSequence getCharSequence(String key, CharSequence defaultValue) {
/* 293 */     CharSequence cs = getCharSequence(key);
/* 294 */     return (cs == null) ? defaultValue : cs;
/*     */   }
/*     */
/*     */   public ArrayList<Integer> getIntegerArrayList(String key) {
/* 298 */     Object o = get(key);
/* 299 */     if (o == null) {
/* 300 */       return null;
/*     */     }
/*     */     try {
/* 303 */       return (ArrayList<Integer>)o;
/* 304 */     } catch (ClassCastException e) {
/* 305 */       typeWarning(key, o, "ArrayList<Integer>", e);
/* 306 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public ArrayList<String> getStringArrayList(String key) {
/* 311 */     Object o = get(key);
/* 312 */     if (o == null) {
/* 313 */       return null;
/*     */     }
/*     */     try {
/* 316 */       return (ArrayList<String>)o;
/* 317 */     } catch (ClassCastException e) {
/* 318 */       typeWarning(key, o, "ArrayList<String>", e);
/* 319 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public ArrayList<CharSequence> getCharSequenceArrayList(String key) {
/* 324 */     Object o = get(key);
/* 325 */     if (o == null) {
/* 326 */       return null;
/*     */     }
/*     */     try {
/* 329 */       return (ArrayList<CharSequence>)o;
/* 330 */     } catch (ClassCastException e) {
/* 331 */       typeWarning(key, o, "ArrayList<CharSequence>", e);
/* 332 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */
/*     */   public boolean[] getBooleanArray(String key) {
/* 338 */     Object o = get(key);
/* 339 */     if (o == null) {
/* 340 */       return null;
/*     */     }
/*     */     try {
/* 343 */       return (boolean[])o;
/* 344 */     } catch (ClassCastException e) {
/* 345 */       typeWarning(key, o, "byte[]", e);
/* 346 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public byte[] getByteArray(String key) {
/* 351 */     Object o = get(key);
/* 352 */     if (o == null) {
/* 353 */       return null;
/*     */     }
/*     */     try {
/* 356 */       return (byte[])o;
/* 357 */     } catch (ClassCastException e) {
/* 358 */       typeWarning(key, o, "byte[]", e);
/* 359 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public short[] getShortArray(String key) {
/* 364 */     Object o = get(key);
/* 365 */     if (o == null) {
/* 366 */       return null;
/*     */     }
/*     */     try {
/* 369 */       return (short[])o;
/* 370 */     } catch (ClassCastException e) {
/* 371 */       typeWarning(key, o, "short[]", e);
/* 372 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public char[] getCharArray(String key) {
/* 377 */     Object o = get(key);
/* 378 */     if (o == null) {
/* 379 */       return null;
/*     */     }
/*     */     try {
/* 382 */       return (char[])o;
/* 383 */     } catch (ClassCastException e) {
/* 384 */       typeWarning(key, o, "char[]", e);
/* 385 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public int[] getIntArray(String key) {
/* 390 */     Object o = get(key);
/* 391 */     if (o == null) {
/* 392 */       return null;
/*     */     }
/*     */     try {
/* 395 */       return (int[])o;
/* 396 */     } catch (ClassCastException e) {
/* 397 */       typeWarning(key, o, "int[]", e);
/* 398 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */
/*     */   public long[] getLongArray(String key) {
/* 404 */     Object o = get(key);
/* 405 */     if (o == null) {
/* 406 */       return null;
/*     */     }
/*     */     try {
/* 409 */       return (long[])o;
/* 410 */     } catch (ClassCastException e) {
/* 411 */       typeWarning(key, o, "long[]", e);
/* 412 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public float[] getFloatArray(String key) {
/* 417 */     Object o = get(key);
/* 418 */     if (o == null) {
/* 419 */       return null;
/*     */     }
/*     */     try {
/* 422 */       return (float[])o;
/* 423 */     } catch (ClassCastException e) {
/* 424 */       typeWarning(key, o, "float[]", e);
/* 425 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public double[] getDoubleArray(String key) {
/* 430 */     Object o = get(key);
/* 431 */     if (o == null) {
/* 432 */       return null;
/*     */     }
/*     */     try {
/* 435 */       return (double[])o;
/* 436 */     } catch (ClassCastException e) {
/* 437 */       typeWarning(key, o, "double[]", e);
/* 438 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public String[] getStringArray(String key) {
/* 443 */     Object o = get(key);
/* 444 */     if (o == null) {
/* 445 */       return null;
/*     */     }
/*     */     try {
/* 448 */       return (String[])o;
/* 449 */     } catch (ClassCastException e) {
/* 450 */       typeWarning(key, o, "String[]", e);
/* 451 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */   public CharSequence[] getCharSequenceArray(String key) {
/* 456 */     Object o = get(key);
/* 457 */     if (o == null) {
/* 458 */       return null;
/*     */     }
/*     */     try {
/* 461 */       return (CharSequence[])o;
/* 462 */     } catch (ClassCastException e) {
/* 463 */       typeWarning(key, o, "CharSequence[]", e);
/* 464 */       return null;
/*     */     }
/*     */   }
/*     */
/*     */
/*     */   public boolean equals(Object o) {
/* 470 */     if (this == o) {
/* 471 */       return true;
/*     */     }
/* 473 */     if (o == null || getClass() != o.getClass()) {
/* 474 */       return false;
/*     */     }
/* 476 */     DataParameter that = (DataParameter)o;
/* 477 */     return this.mMap.equals(that.mMap);
/*     */   }
/*     */
/*     */
/*     */   public int hashCode() {
/* 482 */     return this.mMap.hashCode();
/*     */   }
/*     */
/*     */
/*     */   public String toString() {
/* 487 */     return "DataParameter:" + this.mMap.toString();
/*     */   }
/*     */ }


/* Location:              /home/b4p3p/progetti/rms/rms-mobile-marbel/docs/classes.jar!/com/sunmi/rfid/entity/DataParameter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
