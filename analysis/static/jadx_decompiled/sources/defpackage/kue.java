package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class kue {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final Object q = new Object();
    public static final Object r = new Object();
    public static final tb8 s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public hb8 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public tb8 c = s;

    static {
        ib8 ib8Var;
        za8 za8Var = new za8();
        s74 s74Var = new s74();
        List listEmptyList = Collections.emptyList();
        ffc ffcVar = ffc.X;
        fb8 fb8Var = new fb8();
        lb8 lb8Var = lb8.d;
        Uri uri = Uri.EMPTY;
        fm9.k(((Uri) s74Var.e) == null || ((UUID) s74Var.d) != null);
        if (uri != null) {
            ib8Var = new ib8(uri, null, ((UUID) s74Var.d) != null ? new eb8(s74Var) : null, null, listEmptyList, null, ffcVar, null, -9223372036854775807L);
        } else {
            ib8Var = null;
        }
        s = new tb8("androidx.media3.common.Timeline", new db8(za8Var), ib8Var, new hb8(fb8Var), gd8.J, lb8Var);
        t = Integer.toString(1, 36);
        u = Integer.toString(2, 36);
        v = Integer.toString(3, 36);
        w = Integer.toString(4, 36);
        x = Integer.toString(5, 36);
        y = Integer.toString(6, 36);
        z = Integer.toString(7, 36);
        A = Integer.toString(8, 36);
        B = Integer.toString(9, 36);
        C = Integer.toString(10, 36);
        D = Integer.toString(11, 36);
        E = Integer.toString(12, 36);
        F = Integer.toString(13, 36);
    }

    public final boolean a() {
        return this.j != null;
    }

    public final void b(Object obj, tb8 tb8Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, hb8 hb8Var, long j4, long j5, int i, int i2, long j6) {
        ib8 ib8Var;
        this.a = obj;
        this.c = tb8Var != null ? tb8Var : s;
        this.b = (tb8Var == null || (ib8Var = tb8Var.b) == null) ? null : ib8Var.h;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z2;
        this.i = z3;
        this.j = hb8Var;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = i2;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kue.class.equals(obj.getClass())) {
            return false;
        }
        kue kueVar = (kue) obj;
        return oaf.a(this.a, kueVar.a) && oaf.a(this.c, kueVar.c) && oaf.a(this.d, kueVar.d) && oaf.a(this.j, kueVar.j) && this.e == kueVar.e && this.f == kueVar.f && this.g == kueVar.g && this.h == kueVar.h && this.i == kueVar.i && this.k == kueVar.k && this.l == kueVar.l && this.m == kueVar.m && this.n == kueVar.n && this.o == kueVar.o && this.p == kueVar.p;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        hb8 hb8Var = this.j;
        int iHashCode3 = (iHashCode2 + (hb8Var != null ? hb8Var.hashCode() : 0)) * 31;
        long j = this.e;
        int i = (iHashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i5 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
