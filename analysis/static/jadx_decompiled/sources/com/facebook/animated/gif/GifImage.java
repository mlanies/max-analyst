package com.facebook.animated.gif;

import android.graphics.Bitmap;
import defpackage.hm9;
import defpackage.ju6;
import defpackage.pm4;
import defpackage.ve;
import java.nio.ByteBuffer;

@pm4
/* loaded from: classes.dex */
public class GifImage {
    public static volatile boolean b;
    public Bitmap.Config a = null;

    @pm4
    private long mNativeContext;

    @pm4
    public GifImage() {
    }

    public static GifImage a(ByteBuffer byteBuffer, ju6 ju6Var) {
        c();
        byteBuffer.rewind();
        ju6Var.getClass();
        GifImage gifImageNativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, false);
        gifImageNativeCreateFromDirectByteBuffer.a = ju6Var.b;
        return gifImageNativeCreateFromDirectByteBuffer;
    }

    public static GifImage b(long j, int i, ju6 ju6Var) {
        c();
        if (!(j != 0)) {
            throw new IllegalArgumentException();
        }
        ju6Var.getClass();
        GifImage gifImageNativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, Integer.MAX_VALUE, false);
        gifImageNativeCreateFromNativeMemory.a = ju6Var.b;
        return gifImageNativeCreateFromNativeMemory;
    }

    public static synchronized void c() {
        if (!b) {
            b = true;
            hm9.M("gifimage");
        }
    }

    @pm4
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @pm4
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @pm4
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @pm4
    private native void nativeDispose();

    @pm4
    private native void nativeFinalize();

    @pm4
    private native int nativeGetDuration();

    @pm4
    private native GifFrame nativeGetFrame(int i);

    @pm4
    private native int nativeGetFrameCount();

    @pm4
    private native int[] nativeGetFrameDurations();

    @pm4
    private native int nativeGetHeight();

    @pm4
    private native int nativeGetLoopCount();

    @pm4
    private native int nativeGetSizeInBytes();

    @pm4
    private native int nativeGetWidth();

    @pm4
    private native boolean nativeIsAnimated();

    public final GifFrame d(int i) {
        return nativeGetFrame(i);
    }

    public final int e() {
        return nativeGetFrameCount();
    }

    public final int[] f() {
        return nativeGetFrameDurations();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public final ve g(int i) {
        GifFrame gifFrameNativeGetFrame = nativeGetFrame(i);
        try {
            int iE = gifFrameNativeGetFrame.e();
            int iF = gifFrameNativeGetFrame.f();
            int iD = gifFrameNativeGetFrame.d();
            int iC = gifFrameNativeGetFrame.c();
            int iB = gifFrameNativeGetFrame.b();
            int i2 = 1;
            if (iB != 0 && iB != 1) {
                int i3 = 2;
                if (iB == 2) {
                    i2 = i3;
                } else {
                    i3 = 3;
                    if (iB == 3) {
                        i2 = i3;
                    }
                }
            }
            return new ve(iE, iF, iD, iC, i2);
        } finally {
            gifFrameNativeGetFrame.a();
        }
    }

    public final int h() {
        return nativeGetHeight();
    }

    public final int i() {
        int iNativeGetLoopCount = nativeGetLoopCount();
        if (iNativeGetLoopCount == -1) {
            return 1;
        }
        if (iNativeGetLoopCount != 0) {
            return iNativeGetLoopCount + 1;
        }
        return 0;
    }

    public final int j() {
        return nativeGetSizeInBytes();
    }

    public final int k() {
        return nativeGetWidth();
    }

    @pm4
    public GifImage(long j) {
        this.mNativeContext = j;
    }
}
