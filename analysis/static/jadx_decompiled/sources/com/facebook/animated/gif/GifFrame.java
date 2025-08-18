package com.facebook.animated.gif;

import android.graphics.Bitmap;
import defpackage.pm4;

/* loaded from: classes.dex */
public class GifFrame {

    @pm4
    private long mNativeContext;

    @pm4
    public GifFrame(long j) {
        this.mNativeContext = j;
    }

    @pm4
    private native void nativeDispose();

    @pm4
    private native void nativeFinalize();

    @pm4
    private native int nativeGetDisposalMode();

    @pm4
    private native int nativeGetDurationMs();

    @pm4
    private native int nativeGetHeight();

    @pm4
    private native int nativeGetTransparentPixelColor();

    @pm4
    private native int nativeGetWidth();

    @pm4
    private native int nativeGetXOffset();

    @pm4
    private native int nativeGetYOffset();

    @pm4
    private native boolean nativeHasTransparency();

    @pm4
    private native void nativeRenderFrame(int i, int i2, Bitmap bitmap);

    public final void a() {
        nativeDispose();
    }

    public final int b() {
        return nativeGetDisposalMode();
    }

    public final int c() {
        return nativeGetHeight();
    }

    public final int d() {
        return nativeGetWidth();
    }

    public final int e() {
        return nativeGetXOffset();
    }

    public final int f() {
        return nativeGetYOffset();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public final void g(int i, int i2, Bitmap bitmap) {
        nativeRenderFrame(i, i2, bitmap);
    }
}
