package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class jue implements su0 {
    public static final Object C0 = new Object();
    public static final Object D0 = new Object();
    public static final rb8 E0;
    public int A0;
    public long B0;
    public long X;
    public long Y;
    public long Z;
    public Object b;
    public Object o;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public gb8 v0;
    public boolean w0;
    public long x0;
    public long y0;
    public int z0;
    public Object a = C0;
    public rb8 c = E0;

    static {
        za8 za8Var = new za8();
        ls5 ls5Var = zw6.b;
        ffc ffcVar = ffc.X;
        List listEmptyList = Collections.emptyList();
        ffc ffcVar2 = ffc.X;
        Uri uri = Uri.EMPTY;
        E0 = new rb8("com.google.android.exoplayer2.Timeline", new cb8(za8Var), uri != null ? new kb8(uri, null, listEmptyList, ffcVar2) : null, new gb8(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f), fd8.S0);
    }

    public final boolean a() {
        np8.f(this.u0 == (this.v0 != null));
        return this.v0 != null;
    }

    public final void b(Object obj, rb8 rb8Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, gb8 gb8Var, long j4, long j5, int i, int i2, long j6) {
        kb8 kb8Var;
        this.a = obj;
        this.c = rb8Var != null ? rb8Var : E0;
        this.b = (rb8Var == null || (kb8Var = rb8Var.b) == null) ? null : kb8Var.f;
        this.o = obj2;
        this.X = j;
        this.Y = j2;
        this.Z = j3;
        this.s0 = z;
        this.t0 = z2;
        this.u0 = gb8Var != null;
        this.v0 = gb8Var;
        this.x0 = j4;
        this.y0 = j5;
        this.z0 = i;
        this.A0 = i2;
        this.B0 = j6;
        this.w0 = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !jue.class.equals(obj.getClass())) {
            return false;
        }
        jue jueVar = (jue) obj;
        return maf.a(this.a, jueVar.a) && maf.a(this.c, jueVar.c) && maf.a(this.o, jueVar.o) && maf.a(this.v0, jueVar.v0) && this.X == jueVar.X && this.Y == jueVar.Y && this.Z == jueVar.Z && this.s0 == jueVar.s0 && this.t0 == jueVar.t0 && this.w0 == jueVar.w0 && this.x0 == jueVar.x0 && this.y0 == jueVar.y0 && this.z0 == jueVar.z0 && this.A0 == jueVar.A0 && this.B0 == jueVar.B0;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.o;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        gb8 gb8Var = this.v0;
        int iHashCode3 = (iHashCode2 + (gb8Var != null ? gb8Var.hashCode() : 0)) * 31;
        long j = this.X;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.Y;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.Z;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.s0 ? 1 : 0)) * 31) + (this.t0 ? 1 : 0)) * 31) + (this.w0 ? 1 : 0)) * 31;
        long j4 = this.x0;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.y0;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.z0) * 31) + this.A0) * 31;
        long j6 = this.B0;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
