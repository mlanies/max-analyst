package androidx.camera.core.impl.utils;

import android.view.Surface;
import defpackage.w3;

/* loaded from: classes.dex */
public abstract class SurfaceUtil {
    static {
        System.loadLibrary("surface_util_jni");
    }

    public static w3 a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        w3 w3Var = new w3();
        w3Var.a = 0;
        w3Var.b = 0;
        w3Var.c = 0;
        w3Var.a = iArrNativeGetSurfaceInfo[0];
        w3Var.b = iArrNativeGetSurfaceInfo[1];
        w3Var.c = iArrNativeGetSurfaceInfo[2];
        return w3Var;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
