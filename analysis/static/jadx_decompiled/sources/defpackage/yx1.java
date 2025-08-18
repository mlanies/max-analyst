package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class yx1 {
    public static final px1 a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new tf7(2));
        a = new px1(linkedHashSet);
    }

    public static void a(Context context, va8 va8Var, px1 px1Var) throws CameraValidator$CameraIdListIncorrectException {
        Integer numB;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && on0.b(context) != 0) {
            LinkedHashSet linkedHashSetW = va8Var.w();
            if (linkedHashSetW.isEmpty()) {
                throw new CameraValidator$CameraIdListIncorrectException("No cameras available", 0, null);
            }
            on0.b(context);
            linkedHashSetW.size();
            return;
        }
        if (px1Var != null) {
            try {
                numB = px1Var.b();
                if (numB == null) {
                    return;
                }
            } catch (IllegalStateException unused) {
                return;
            }
        } else {
            numB = null;
        }
        String str = Build.DEVICE;
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera") && (px1Var == null || numB.intValue() == 1)) {
                px1.c.c(va8Var.w());
                i = 1;
            }
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front") && (px1Var == null || numB.intValue() == 0)) {
                px1.b.c(va8Var.w());
                i++;
            }
        } catch (IllegalArgumentException e2) {
            illegalArgumentException = e2;
        }
        try {
            a.c(va8Var.w());
            i++;
        } catch (IllegalArgumentException unused2) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        va8Var.w().toString();
        throw new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
    }
}
