package androidx.biometric;

import android.os.Looper;
import defpackage.a8g;
import defpackage.ay;
import defpackage.ci9;
import defpackage.fp3;
import defpackage.gn0;
import defpackage.imc;
import defpackage.qnf;
import defpackage.rm0;
import defpackage.y7g;

/* loaded from: classes.dex */
public class BiometricViewModel extends qnf {
    public fp3 b;
    public ay c;
    public a8g d;
    public imc e;
    public y7g f;
    public gn0 g;
    public CharSequence h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public ci9 n;
    public ci9 o;
    public ci9 p;
    public ci9 q;
    public ci9 r;
    public ci9 s;
    public int t = 0;
    public ci9 u;
    public ci9 v;

    public static void j(ci9 ci9Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            ci9Var.k(obj);
        } else {
            ci9Var.i(obj);
        }
    }

    public final CharSequence e() {
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            return charSequence;
        }
        ay ayVar = this.c;
        if (ayVar == null) {
            return null;
        }
        CharSequence charSequence2 = (CharSequence) ayVar.Y;
        return charSequence2 != null ? charSequence2 : "";
    }

    public final void f(rm0 rm0Var) {
        if (this.o == null) {
            this.o = new ci9();
        }
        j(this.o, rm0Var);
    }

    public final void g(CharSequence charSequence) {
        if (this.v == null) {
            this.v = new ci9();
        }
        j(this.v, charSequence);
    }

    public final void h(int i) {
        if (this.u == null) {
            this.u = new ci9();
        }
        j(this.u, Integer.valueOf(i));
    }

    public final void i(boolean z) {
        if (this.r == null) {
            this.r = new ci9();
        }
        j(this.r, Boolean.valueOf(z));
    }
}
