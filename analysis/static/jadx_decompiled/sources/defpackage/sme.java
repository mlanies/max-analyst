package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import java.io.File;
import java.util.Locale;

/* loaded from: classes2.dex */
public class sme {
    public static final khe a0 = new khe(new xid(29));
    public static ase b0;
    public static final q0e c0;
    public static final w7c d0;
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final int R;
    public final int S;
    public final int T;
    public final int U;
    public final Integer V;
    public final Integer W;
    public final Integer X;
    public final Integer Y;
    public final Integer Z;
    public final String a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final t63 f;
    public final is0 g;
    public final is0 h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    static {
        q0e q0eVarA = r0e.a(null);
        c0 = q0eVarA;
        d0 = new w7c(q0eVarA);
    }

    public sme(String str, String str2, boolean z, int i, String str3, t63 t63Var, is0 is0Var, is0 is0Var2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = t63Var;
        this.g = is0Var;
        this.h = is0Var2;
        int i2 = t63Var.v;
        this.i = ote.b0(i2, 0.15f);
        this.j = z ? q2c.darkPopup : q2c.defaultPopup;
        this.k = t63Var.a;
        this.l = t63Var.b;
        this.m = t63Var.c;
        this.n = t63Var.e;
        this.o = t63Var.f;
        this.p = t63Var.Q;
        this.q = t63Var.R;
        this.r = t63Var.S;
        this.s = t63Var.h;
        this.t = t63Var.j;
        this.u = t63Var.k;
        this.v = t63Var.l;
        this.w = t63Var.m;
        this.x = t63Var.n;
        this.y = t63Var.o;
        this.z = t63Var.p;
        this.A = t63Var.q;
        this.B = t63Var.r;
        this.C = t63Var.s;
        this.D = t63Var.t;
        this.E = t63Var.u;
        this.F = i2;
        this.G = t63Var.w;
        this.H = t63Var.x;
        this.I = t63Var.y;
        this.J = t63Var.z;
        this.K = t63Var.A;
        this.L = t63Var.B;
        this.M = t63Var.C;
        this.N = t63Var.D;
        this.O = t63Var.E;
        this.P = t63Var.F;
        this.Q = t63Var.G;
        this.R = t63Var.H;
        this.S = t63Var.I;
        this.T = t63Var.J;
        this.U = t63Var.K;
        this.V = t63Var.L;
        this.W = t63Var.M;
        this.X = t63Var.N;
        this.Y = t63Var.O;
        this.Z = t63Var.P;
    }

    public static final boolean b(String str, boolean z) {
        File file = new File(str);
        if (z && !file.isFile()) {
            return false;
        }
        if (!z || file.exists()) {
            return file.getName().toLowerCase(Locale.getDefault()).endsWith(".ttstyle");
        }
        return false;
    }

    public final RippleDrawable a() {
        return new RippleDrawable(ColorStateList.valueOf(this.i), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sme)) {
            return false;
        }
        sme smeVar = (sme) obj;
        if (tpa.f(this.a, smeVar.a) && tpa.f(this.b, smeVar.b) && this.c == smeVar.c && this.d == smeVar.d && tpa.f(this.e, smeVar.e)) {
            return tpa.f(this.f, smeVar.f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode() + rh4.d((ms2.d(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31, 31, this.e);
    }
}
