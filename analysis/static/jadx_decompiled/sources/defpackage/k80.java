package defpackage;

import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.security.identity.IdentityCredential;
import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;
import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* loaded from: classes.dex */
public final class k80 extends BiometricPrompt.AuthenticationCallback {
    public final /* synthetic */ n80 a;

    public k80(n80 n80Var) {
        this.a = n80Var;
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationError(int i, CharSequence charSequence) {
        this.a.a(i, charSequence);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationFailed() {
        WeakReference weakReference = ((fn0) this.a).a;
        if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).j) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
        if (biometricViewModel.q == null) {
            biometricViewModel.q = new ci9();
        }
        BiometricViewModel.j(biometricViewModel.q, Boolean.TRUE);
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationHelp(int i, CharSequence charSequence) {
    }

    @Override // android.hardware.biometrics.BiometricPrompt.AuthenticationCallback
    public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
        BiometricPrompt.CryptoObject cryptoObject;
        IdentityCredential identityCredentialB;
        a8g a8gVar = null;
        if (authenticationResult != null && (cryptoObject = authenticationResult.getCryptoObject()) != null) {
            Cipher cipherD = tz3.d(cryptoObject);
            if (cipherD != null) {
                a8gVar = new a8g(cipherD);
            } else {
                Signature signatureF = tz3.f(cryptoObject);
                if (signatureF != null) {
                    a8gVar = new a8g();
                    a8gVar.a = signatureF;
                    a8gVar.b = null;
                    a8gVar.c = null;
                    a8gVar.o = null;
                } else {
                    Mac macE = tz3.e(cryptoObject);
                    if (macE != null) {
                        a8gVar = new a8g();
                        a8gVar.a = null;
                        a8gVar.b = null;
                        a8gVar.c = macE;
                        a8gVar.o = null;
                    } else if (Build.VERSION.SDK_INT >= 30 && (identityCredentialB = uz3.b(cryptoObject)) != null) {
                        a8gVar = new a8g();
                        a8gVar.a = null;
                        a8gVar.b = null;
                        a8gVar.c = null;
                        a8gVar.o = identityCredentialB;
                    }
                }
            }
        }
        int i = Build.VERSION.SDK_INT;
        int iA = -1;
        if (i >= 30) {
            if (authenticationResult != null) {
                iA = m80.a(authenticationResult);
            }
        } else if (i != 29) {
            iA = 2;
        }
        this.a.b(new cn0(a8gVar, iA));
    }
}
