package androidx.biometric;

import android.content.Context;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.a;
import androidx.fragment.app.c;
import defpackage.a8g;
import defpackage.ay;
import defpackage.ci9;
import defpackage.cn0;
import defpackage.f8;
import defpackage.fn0;
import defpackage.g0c;
import defpackage.gn0;
import defpackage.he0;
import defpackage.imc;
import defpackage.ksb;
import defpackage.l80;
import defpackage.n80;
import defpackage.nec;
import defpackage.oag;
import defpackage.q67;
import defpackage.sm0;
import defpackage.tm0;
import defpackage.um0;
import defpackage.vm0;
import defpackage.vu4;
import defpackage.wm0;
import defpackage.xje;
import defpackage.xm0;
import defpackage.y7g;
import defpackage.ym0;
import defpackage.zy1;

/* loaded from: classes.dex */
public class BiometricFragment extends a {
    public final Handler l1 = new Handler(Looper.getMainLooper());
    public BiometricViewModel m1;

    @Override // androidx.fragment.app.a
    public final void M0() {
        int i;
        this.S0 = true;
        if (Build.VERSION.SDK_INT == 29) {
            BiometricViewModel biometricViewModel = this.m1;
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
            if (f8.m(i)) {
                BiometricViewModel biometricViewModel2 = this.m1;
                biometricViewModel2.m = true;
                this.l1.postDelayed(new ym0(biometricViewModel2, 2), 250L);
            }
        }
    }

    @Override // androidx.fragment.app.a
    public final void N0() {
        this.S0 = true;
    }

    public final void e1(int i) {
        if (i == 3 || !this.m1.m) {
            g1();
            BiometricViewModel biometricViewModel = this.m1;
            if (biometricViewModel.f == null) {
                biometricViewModel.f = new y7g(9);
            }
            y7g y7gVar = biometricViewModel.f;
            CancellationSignal cancellationSignal = (CancellationSignal) y7gVar.c;
            if (cancellationSignal != null) {
                try {
                    zy1.a(cancellationSignal);
                } catch (NullPointerException unused) {
                }
                y7gVar.c = null;
            }
            y7gVar.getClass();
        }
    }

    public final void f1() {
        BiometricViewModel biometricViewModel = this.m1;
        biometricViewModel.i = false;
        biometricViewModel.i = false;
        if (o0()) {
            c cVarF0 = f0();
            FingerprintDialogFragment fingerprintDialogFragment = (FingerprintDialogFragment) cVarF0.E("androidx.biometric.FingerprintDialogFragment");
            if (fingerprintDialogFragment != null) {
                if (fingerprintDialogFragment.o0()) {
                    fingerprintDialogFragment.e1();
                } else {
                    he0 he0Var = new he0(cVarF0);
                    he0Var.h(fingerprintDialogFragment);
                    he0Var.d(true);
                }
            }
        }
        if (!this.m1.k && o0()) {
            he0 he0Var2 = new he0(f0());
            he0Var2.h(this);
            he0Var2.d(true);
        }
        Context contextD0 = d0();
        if (contextD0 != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT != 29) {
                return;
            }
            int i = ksb.delay_showing_prompt_models;
            if (str == null) {
                return;
            }
            for (String str2 : contextD0.getResources().getStringArray(i)) {
                if (str.equals(str2)) {
                    BiometricViewModel biometricViewModel2 = this.m1;
                    biometricViewModel2.l = true;
                    this.l1.postDelayed(new ym0(biometricViewModel2, 1), 600L);
                    return;
                }
            }
        }
    }

    public final void g1() {
        if (b0() == null || this.m1.d == null) {
            return;
        }
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
    }

    public final void h1(int i, CharSequence charSequence) {
        BiometricViewModel biometricViewModel = this.m1;
        if (!biometricViewModel.k && biometricViewModel.j) {
            biometricViewModel.j = false;
            new Handler(Looper.getMainLooper()).post(new sm0(this, i, charSequence));
        }
        f1();
    }

    public final void i1(cn0 cn0Var) {
        BiometricViewModel biometricViewModel = this.m1;
        if (biometricViewModel.j) {
            biometricViewModel.j = false;
            new Handler(Looper.getMainLooper()).post(new sm0(this, cn0Var));
        }
        f1();
    }

    public final void j1() {
        if (this.m1.i || d0() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = this.m1;
        biometricViewModel.i = true;
        biometricViewModel.j = true;
        g1();
        BiometricPrompt.Builder builderD = um0.d(U0().getApplicationContext());
        BiometricViewModel biometricViewModel2 = this.m1;
        ay ayVar = biometricViewModel2.c;
        CharSequence charSequence = ayVar != null ? (CharSequence) ayVar.o : null;
        biometricViewModel2.getClass();
        ay ayVar2 = this.m1.c;
        CharSequence charSequence2 = ayVar2 != null ? (CharSequence) ayVar2.X : null;
        if (charSequence != null) {
            um0.g(builderD, charSequence);
        }
        if (charSequence2 != null) {
            um0.e(builderD, charSequence2);
        }
        CharSequence charSequenceE = this.m1.e();
        if (!TextUtils.isEmpty(charSequenceE)) {
            this.m1.getClass();
            q67 q67Var = new q67(1);
            BiometricViewModel biometricViewModel3 = this.m1;
            if (biometricViewModel3.g == null) {
                biometricViewModel3.g = new gn0(biometricViewModel3);
            }
            um0.f(builderD, charSequenceE, q67Var, biometricViewModel3.g);
        }
        int i = Build.VERSION.SDK_INT;
        ay ayVar3 = this.m1.c;
        int i2 = 0;
        vm0.a(builderD, ayVar3 == null || ayVar3.b);
        BiometricViewModel biometricViewModel4 = this.m1;
        ay ayVar4 = biometricViewModel4.c;
        if (ayVar4 != null) {
            a8g a8gVar = biometricViewModel4.d;
            i2 = ayVar4.c;
            if (i2 == 0) {
                i2 = a8gVar != null ? 15 : 255;
            }
        }
        if (i >= 30) {
            wm0.a(builderD, i2);
        } else {
            vm0.b(builderD, f8.m(i2));
        }
        BiometricPrompt biometricPromptC = um0.c(builderD);
        Context contextD0 = d0();
        BiometricPrompt.CryptoObject cryptoObjectH = oag.H(this.m1.d);
        BiometricViewModel biometricViewModel5 = this.m1;
        if (biometricViewModel5.f == null) {
            biometricViewModel5.f = new y7g(9);
        }
        y7g y7gVar = biometricViewModel5.f;
        if (((CancellationSignal) y7gVar.c) == null) {
            ((vu4) y7gVar.b).getClass();
            y7gVar.c = zy1.b();
        }
        CancellationSignal cancellationSignal = (CancellationSignal) y7gVar.c;
        xm0 xm0Var = new xm0();
        BiometricViewModel biometricViewModel6 = this.m1;
        if (biometricViewModel6.e == null) {
            biometricViewModel6.e = new imc(new fn0(biometricViewModel6));
        }
        imc imcVar = biometricViewModel6.e;
        if (((BiometricPrompt.AuthenticationCallback) imcVar.b) == null) {
            imcVar.b = l80.a((n80) imcVar.c);
        }
        BiometricPrompt.AuthenticationCallback authenticationCallback = (BiometricPrompt.AuthenticationCallback) imcVar.b;
        try {
            if (cryptoObjectH == null) {
                um0.b(biometricPromptC, cancellationSignal, xm0Var, authenticationCallback);
            } else {
                um0.a(biometricPromptC, cryptoObjectH, cancellationSignal, xm0Var, authenticationCallback);
            }
        } catch (NullPointerException unused) {
            h1(1, contextD0 != null ? contextD0.getString(g0c.default_error_msg) : "");
        }
    }

    @Override // androidx.fragment.app.a
    public final void s0(int i, int i2, Intent intent) {
        super.s0(i, i2, intent);
        if (i == 1) {
            this.m1.k = false;
            if (i2 == -1) {
                i1(new cn0(null, 1));
            } else {
                h1(10, h0(g0c.generic_error_user_canceled));
            }
        }
    }

    @Override // androidx.fragment.app.a
    public final void v0(Bundle bundle) {
        super.v0(bundle);
        if (b0() == null) {
            return;
        }
        BiometricViewModel biometricViewModel = (BiometricViewModel) new xje(b0()).b(nec.a(BiometricViewModel.class));
        this.m1 = biometricViewModel;
        if (biometricViewModel.n == null) {
            biometricViewModel.n = new ci9();
        }
        biometricViewModel.n.e(this, new tm0(this, 0));
        BiometricViewModel biometricViewModel2 = this.m1;
        if (biometricViewModel2.o == null) {
            biometricViewModel2.o = new ci9();
        }
        biometricViewModel2.o.e(this, new tm0(this, 1));
        BiometricViewModel biometricViewModel3 = this.m1;
        if (biometricViewModel3.p == null) {
            biometricViewModel3.p = new ci9();
        }
        biometricViewModel3.p.e(this, new tm0(this, 2));
        BiometricViewModel biometricViewModel4 = this.m1;
        if (biometricViewModel4.q == null) {
            biometricViewModel4.q = new ci9();
        }
        biometricViewModel4.q.e(this, new tm0(this, 3));
        BiometricViewModel biometricViewModel5 = this.m1;
        if (biometricViewModel5.r == null) {
            biometricViewModel5.r = new ci9();
        }
        biometricViewModel5.r.e(this, new tm0(this, 4));
        BiometricViewModel biometricViewModel6 = this.m1;
        if (biometricViewModel6.s == null) {
            biometricViewModel6.s = new ci9();
        }
        biometricViewModel6.s.e(this, new tm0(this, 5));
    }
}
