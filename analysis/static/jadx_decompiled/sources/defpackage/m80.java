package defpackage;

import android.hardware.biometrics.BiometricPrompt;

/* loaded from: classes.dex */
public abstract class m80 {
    public static int a(BiometricPrompt.AuthenticationResult authenticationResult) {
        return authenticationResult.getAuthenticationType();
    }
}
