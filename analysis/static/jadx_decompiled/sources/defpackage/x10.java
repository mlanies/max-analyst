package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class x10 implements Serializable {
    public static final x10 w0 = new w10().a();
    public final boolean X;
    public final byte[] Y;
    public final String Z;
    public final String a;
    public final String b;
    public final int c;
    public final int o;
    public final long s0;
    public final String t0;
    public final String u0;
    public final String v0;

    public x10(w10 w10Var) {
        this.a = w10Var.a;
        this.b = w10Var.b;
        this.c = w10Var.c;
        this.o = w10Var.d;
        this.X = w10Var.e;
        this.Y = w10Var.f;
        this.Z = w10Var.g;
        this.s0 = w10Var.h;
        this.t0 = w10Var.i;
        this.u0 = w10Var.j;
        this.v0 = w10Var.k;
    }

    public final String a() {
        String str = this.b;
        if (!oag.t(str)) {
            return str;
        }
        String str2 = this.a;
        if (oag.t(str2)) {
            return null;
        }
        return ju0.t(str2, kk0.X, jk0.b);
    }

    public final w10 b() {
        w10 w10Var = new w10();
        w10Var.a = this.a;
        w10Var.b = this.b;
        w10Var.c = this.c;
        w10Var.d = this.o;
        w10Var.e = this.X;
        w10Var.f = this.Y;
        w10Var.g = this.Z;
        w10Var.h = this.s0;
        w10Var.i = this.t0;
        w10Var.j = this.u0;
        w10Var.k = this.v0;
        return w10Var;
    }
}
