package defpackage;

import android.hardware.biometrics.BiometricManager;

/* loaded from: classes.dex */
public abstract class an0 {
    public static int a(BiometricManager biometricManager, int i) {
        return biometricManager.canAuthenticate(i);
    }
}
