/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.couchbase.cbforest;

public class KeyStore {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected KeyStore(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(KeyStore obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        cbforestJNI.delete_KeyStore(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public KvsInfo getKvsInfo() {
    return new KvsInfo(cbforestJNI.KeyStore_getKvsInfo(swigCPtr, this), true);
  }

  public java.math.BigInteger getLastSequence() {
    return cbforestJNI.KeyStore_getLastSequence(swigCPtr, this);
  }

  public String getName() {
    return cbforestJNI.KeyStore_getName(swigCPtr, this);
  }

  public Document get(Slice key, ContentOptions option) {
    long cPtr = cbforestJNI.KeyStore_get__SWIG_0(swigCPtr, this, Slice.getCPtr(key), key, option.swigValue());
    return (cPtr == 0) ? null : new Document(cPtr, false);
  }

  public Document get(Slice key) {
    long cPtr = cbforestJNI.KeyStore_get__SWIG_1(swigCPtr, this, Slice.getCPtr(key), key);
    return (cPtr == 0) ? null : new Document(cPtr, false);
  }

  public Document get(java.math.BigInteger seq, ContentOptions option) {
    long cPtr = cbforestJNI.KeyStore_get__SWIG_2(swigCPtr, this, seq, option.swigValue());
    return (cPtr == 0) ? null : new Document(cPtr, false);
  }

  public Document get(java.math.BigInteger seq) {
    long cPtr = cbforestJNI.KeyStore_get__SWIG_3(swigCPtr, this, seq);
    return (cPtr == 0) ? null : new Document(cPtr, false);
  }

  public boolean read(Document doc, ContentOptions option) {
    return cbforestJNI.KeyStore_read__SWIG_0(swigCPtr, this, Document.getCPtr(doc), doc, option.swigValue());
  }

  public boolean read(Document doc) {
    return cbforestJNI.KeyStore_read__SWIG_1(swigCPtr, this, Document.getCPtr(doc), doc);
  }

  public Document getByOffset(java.math.BigInteger arg0, java.math.BigInteger arg1) {
    long cPtr = cbforestJNI.KeyStore_getByOffset(swigCPtr, this, arg0, arg1);
    return (cPtr == 0) ? null : new Document(cPtr, false);
  }

  public void deleteKeyStore(Transaction arg0) {
    cbforestJNI.KeyStore_deleteKeyStore(swigCPtr, this, Transaction.getCPtr(arg0), arg0);
  }

  public void erase(Transaction arg0) {
    cbforestJNI.KeyStore_erase(swigCPtr, this, Transaction.getCPtr(arg0), arg0);
  }

}
