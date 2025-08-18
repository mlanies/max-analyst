package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fd8 implements su0 {
    public static final fd8 S0 = new fd8(new dd8());
    public static final wa8 T0 = new wa8(6);
    public final Integer A0;
    public final Boolean B0;
    public final Integer C0;
    public final Integer D0;
    public final Integer E0;
    public final Integer F0;
    public final Integer G0;
    public final Integer H0;
    public final Integer I0;
    public final CharSequence J0;
    public final CharSequence K0;
    public final CharSequence L0;
    public final Integer M0;
    public final Integer N0;
    public final CharSequence O0;
    public final CharSequence P0;
    public final CharSequence Q0;
    public final Bundle R0;
    public final CharSequence X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence o;
    public final Uri s0;
    public final d5c t0;
    public final d5c u0;
    public final byte[] v0;
    public final Integer w0;
    public final Uri x0;
    public final Integer y0;
    public final Integer z0;

    public fd8(dd8 dd8Var) {
        this.a = dd8Var.a;
        this.b = dd8Var.b;
        this.c = dd8Var.c;
        this.o = dd8Var.d;
        this.X = dd8Var.e;
        this.Y = dd8Var.f;
        this.Z = dd8Var.g;
        this.s0 = dd8Var.h;
        this.t0 = dd8Var.i;
        this.u0 = dd8Var.j;
        this.v0 = dd8Var.k;
        this.w0 = dd8Var.l;
        this.x0 = dd8Var.m;
        this.y0 = dd8Var.n;
        this.z0 = dd8Var.o;
        this.A0 = dd8Var.p;
        this.B0 = dd8Var.q;
        Integer num = dd8Var.r;
        this.C0 = num;
        this.D0 = num;
        this.E0 = dd8Var.s;
        this.F0 = dd8Var.t;
        this.G0 = dd8Var.u;
        this.H0 = dd8Var.v;
        this.I0 = dd8Var.w;
        this.J0 = dd8Var.x;
        this.K0 = dd8Var.y;
        this.L0 = dd8Var.z;
        this.M0 = dd8Var.A;
        this.N0 = dd8Var.B;
        this.O0 = dd8Var.C;
        this.P0 = dd8Var.D;
        this.Q0 = dd8Var.E;
        this.R0 = dd8Var.F;
    }

    public final dd8 a() {
        dd8 dd8Var = new dd8();
        dd8Var.a = this.a;
        dd8Var.b = this.b;
        dd8Var.c = this.c;
        dd8Var.d = this.o;
        dd8Var.e = this.X;
        dd8Var.f = this.Y;
        dd8Var.g = this.Z;
        dd8Var.h = this.s0;
        dd8Var.i = this.t0;
        dd8Var.j = this.u0;
        dd8Var.k = this.v0;
        dd8Var.l = this.w0;
        dd8Var.m = this.x0;
        dd8Var.n = this.y0;
        dd8Var.o = this.z0;
        dd8Var.p = this.A0;
        dd8Var.q = this.B0;
        dd8Var.r = this.D0;
        dd8Var.s = this.E0;
        dd8Var.t = this.F0;
        dd8Var.u = this.G0;
        dd8Var.v = this.H0;
        dd8Var.w = this.I0;
        dd8Var.x = this.J0;
        dd8Var.y = this.K0;
        dd8Var.z = this.L0;
        dd8Var.A = this.M0;
        dd8Var.B = this.N0;
        dd8Var.C = this.O0;
        dd8Var.D = this.P0;
        dd8Var.E = this.Q0;
        dd8Var.F = this.R0;
        return dd8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fd8.class != obj.getClass()) {
            return false;
        }
        fd8 fd8Var = (fd8) obj;
        return maf.a(this.a, fd8Var.a) && maf.a(this.b, fd8Var.b) && maf.a(this.c, fd8Var.c) && maf.a(this.o, fd8Var.o) && maf.a(this.X, fd8Var.X) && maf.a(this.Y, fd8Var.Y) && maf.a(this.Z, fd8Var.Z) && maf.a(this.s0, fd8Var.s0) && maf.a(this.t0, fd8Var.t0) && maf.a(this.u0, fd8Var.u0) && Arrays.equals(this.v0, fd8Var.v0) && maf.a(this.w0, fd8Var.w0) && maf.a(this.x0, fd8Var.x0) && maf.a(this.y0, fd8Var.y0) && maf.a(this.z0, fd8Var.z0) && maf.a(this.A0, fd8Var.A0) && maf.a(this.B0, fd8Var.B0) && maf.a(this.D0, fd8Var.D0) && maf.a(this.E0, fd8Var.E0) && maf.a(this.F0, fd8Var.F0) && maf.a(this.G0, fd8Var.G0) && maf.a(this.H0, fd8Var.H0) && maf.a(this.I0, fd8Var.I0) && maf.a(this.J0, fd8Var.J0) && maf.a(this.K0, fd8Var.K0) && maf.a(this.L0, fd8Var.L0) && maf.a(this.M0, fd8Var.M0) && maf.a(this.N0, fd8Var.N0) && maf.a(this.O0, fd8Var.O0) && maf.a(this.P0, fd8Var.P0) && maf.a(this.Q0, fd8Var.Q0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, this.X, this.Y, this.Z, this.s0, this.t0, this.u0, Integer.valueOf(Arrays.hashCode(this.v0)), this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0});
    }
}
