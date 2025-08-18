package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class p3b {
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Object a;
    public final int b;
    public final tb8 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        int i = oaf.a;
        j = Integer.toString(0, 36);
        k = Integer.toString(1, 36);
        l = Integer.toString(2, 36);
        m = Integer.toString(3, 36);
        n = Integer.toString(4, 36);
        o = Integer.toString(5, 36);
        p = Integer.toString(6, 36);
    }

    public p3b(Object obj, int i, tb8 tb8Var, Object obj2, int i2, long j2, long j3, int i3, int i4) {
        this.a = obj;
        this.b = i;
        this.c = tb8Var;
        this.d = obj2;
        this.e = i2;
        this.f = j2;
        this.g = j3;
        this.h = i3;
        this.i = i4;
    }

    public static p3b c(Bundle bundle) {
        int i = bundle.getInt(j, 0);
        Bundle bundle2 = bundle.getBundle(k);
        return new p3b(null, i, bundle2 == null ? null : tb8.b(bundle2), null, bundle.getInt(l, 0), bundle.getLong(m, 0L), bundle.getLong(n, 0L), bundle.getInt(o, -1), bundle.getInt(p, -1));
    }

    public final boolean a(p3b p3bVar) {
        return this.b == p3bVar.b && this.e == p3bVar.e && this.f == p3bVar.f && this.g == p3bVar.g && this.h == p3bVar.h && this.i == p3bVar.i && f46.B(this.c, p3bVar.c);
    }

    public final p3b b(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new p3b(this.a, z2 ? this.b : 0, z ? this.c : null, this.d, z2 ? this.e : 0, z ? this.f : 0L, z ? this.g : 0L, z ? this.h : -1, z ? this.i : -1);
    }

    public final Bundle d(int i) {
        Bundle bundle = new Bundle();
        int i2 = this.b;
        if (i < 3 || i2 != 0) {
            bundle.putInt(j, i2);
        }
        tb8 tb8Var = this.c;
        if (tb8Var != null) {
            bundle.putBundle(k, tb8Var.d(false));
        }
        int i3 = this.e;
        if (i < 3 || i3 != 0) {
            bundle.putInt(l, i3);
        }
        long j2 = this.f;
        if (i < 3 || j2 != 0) {
            bundle.putLong(m, j2);
        }
        long j3 = this.g;
        if (i < 3 || j3 != 0) {
            bundle.putLong(n, j3);
        }
        int i4 = this.h;
        if (i4 != -1) {
            bundle.putInt(o, i4);
        }
        int i5 = this.i;
        if (i5 != -1) {
            bundle.putInt(p, i5);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p3b.class != obj.getClass()) {
            return false;
        }
        p3b p3bVar = (p3b) obj;
        return a(p3bVar) && f46.B(this.a, p3bVar.a) && f46.B(this.d, p3bVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i)});
    }
}
