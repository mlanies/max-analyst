package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: classes.dex */
public abstract class wm0 {
    public static void a(BiometricPrompt.Builder builder, int i) {
        builder.setAllowedAuthenticators(i);
    }
}
