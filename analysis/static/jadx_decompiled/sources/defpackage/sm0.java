package defpackage;

import androidx.biometric.BiometricFragment;
import androidx.biometric.BiometricViewModel;

/* loaded from: classes.dex */
public final class sm0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ BiometricFragment b;

    public sm0(BiometricFragment biometricFragment, cn0 cn0Var) {
        this.b = biometricFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                BiometricViewModel biometricViewModel = this.b.m1;
                if (biometricViewModel.b == null) {
                    biometricViewModel.b = new en0();
                }
                biometricViewModel.b.A();
                break;
            case 1:
                BiometricViewModel biometricViewModel2 = this.b.m1;
                if (biometricViewModel2.b == null) {
                    biometricViewModel2.b = new en0();
                }
                biometricViewModel2.b.B();
                break;
            default:
                BiometricViewModel biometricViewModel3 = this.b.m1;
                if (biometricViewModel3.b == null) {
                    biometricViewModel3.b = new en0();
                }
                biometricViewModel3.b.C();
                break;
        }
    }

    public sm0(BiometricFragment biometricFragment, int i, CharSequence charSequence) {
        this.b = biometricFragment;
    }

    public sm0(BiometricFragment biometricFragment) {
        this.b = biometricFragment;
    }
}
