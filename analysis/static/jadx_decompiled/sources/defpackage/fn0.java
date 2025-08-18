package defpackage;

import androidx.biometric.BiometricViewModel;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class fn0 extends n80 {
    public final WeakReference a;

    public fn0(BiometricViewModel biometricViewModel) {
        this.a = new WeakReference(biometricViewModel);
    }

    @Override // defpackage.n80
    public final void a(int i, CharSequence charSequence) {
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || ((BiometricViewModel) weakReference.get()).k || !((BiometricViewModel) weakReference.get()).j) {
            return;
        }
        ((BiometricViewModel) weakReference.get()).f(new rm0(i, charSequence));
    }

    @Override // defpackage.n80
    public final void b(cn0 cn0Var) {
        int i;
        WeakReference weakReference = this.a;
        if (weakReference.get() == null || !((BiometricViewModel) weakReference.get()).j) {
            return;
        }
        int i2 = -1;
        if (cn0Var.b == -1) {
            BiometricViewModel biometricViewModel = (BiometricViewModel) weakReference.get();
            ay ayVar = biometricViewModel.c;
            if (ayVar != null) {
                a8g a8gVar = biometricViewModel.d;
                i = ayVar.c;
                if (i == 0) {
                    i = a8gVar != null ? 15 : 255;
                }
            } else {
                i = 0;
            }
            if ((i & 32767) != 0 && !f8.m(i)) {
                i2 = 2;
            }
            cn0Var = new cn0(cn0Var.a, i2);
        }
        BiometricViewModel biometricViewModel2 = (BiometricViewModel) weakReference.get();
        if (biometricViewModel2.n == null) {
            biometricViewModel2.n = new ci9();
        }
        BiometricViewModel.j(biometricViewModel2.n, cn0Var);
    }
}
