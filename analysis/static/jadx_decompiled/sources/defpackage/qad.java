package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qad {
    public static final p3b k;
    public static final qad l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public final p3b a;
    public final boolean b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;

    static {
        p3b p3bVar = new p3b(null, 0, null, null, 0, 0L, 0L, -1, -1);
        k = p3bVar;
        l = new qad(p3bVar, false, -9223372036854775807L, -9223372036854775807L, 0L, 0, 0L, -9223372036854775807L, -9223372036854775807L, 0L);
        int i = oaf.a;
        m = Integer.toString(0, 36);
        n = Integer.toString(1, 36);
        o = Integer.toString(2, 36);
        p = Integer.toString(3, 36);
        q = Integer.toString(4, 36);
        r = Integer.toString(5, 36);
        s = Integer.toString(6, 36);
        t = Integer.toString(7, 36);
        u = Integer.toString(8, 36);
        v = Integer.toString(9, 36);
    }

    public qad(p3b p3bVar, boolean z, long j, long j2, long j3, int i, long j4, long j5, long j6, long j7) {
        fm9.f(z == (p3bVar.h != -1));
        this.a = p3bVar;
        this.b = z;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i;
        this.g = j4;
        this.h = j5;
        this.i = j6;
        this.j = j7;
    }

    public static qad b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(m);
        return new qad(bundle2 == null ? k : p3b.c(bundle2), bundle.getBoolean(n, false), bundle.getLong(o, -9223372036854775807L), bundle.getLong(p, -9223372036854775807L), bundle.getLong(q, 0L), bundle.getInt(r, 0), bundle.getLong(s, 0L), bundle.getLong(t, -9223372036854775807L), bundle.getLong(u, -9223372036854775807L), bundle.getLong(v, 0L));
    }

    public final qad a(boolean z, boolean z2) {
        if (z && z2) {
            return this;
        }
        return new qad(this.a.b(z, z2), z && this.b, this.c, z ? this.d : -9223372036854775807L, z ? this.e : 0L, z ? this.f : 0, z ? this.g : 0L, z ? this.h : -9223372036854775807L, z ? this.i : -9223372036854775807L, z ? this.j : 0L);
    }

    public final Bundle c(int i) {
        Bundle bundle = new Bundle();
        p3b p3bVar = this.a;
        if (i < 3 || !k.a(p3bVar)) {
            bundle.putBundle(m, p3bVar.d(i));
        }
        boolean z = this.b;
        if (z) {
            bundle.putBoolean(n, z);
        }
        long j = this.c;
        if (j != -9223372036854775807L) {
            bundle.putLong(o, j);
        }
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            bundle.putLong(p, j2);
        }
        long j3 = this.e;
        if (i < 3 || j3 != 0) {
            bundle.putLong(q, j3);
        }
        int i2 = this.f;
        if (i2 != 0) {
            bundle.putInt(r, i2);
        }
        long j4 = this.g;
        if (j4 != 0) {
            bundle.putLong(s, j4);
        }
        long j5 = this.h;
        if (j5 != -9223372036854775807L) {
            bundle.putLong(t, j5);
        }
        long j6 = this.i;
        if (j6 != -9223372036854775807L) {
            bundle.putLong(u, j6);
        }
        long j7 = this.j;
        if (i < 3 || j7 != 0) {
            bundle.putLong(v, j7);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qad.class != obj.getClass()) {
            return false;
        }
        qad qadVar = (qad) obj;
        return this.c == qadVar.c && this.a.equals(qadVar.a) && this.b == qadVar.b && this.d == qadVar.d && this.e == qadVar.e && this.f == qadVar.f && this.g == qadVar.g && this.h == qadVar.h && this.i == qadVar.i && this.j == qadVar.j;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionPositionInfo {PositionInfo {mediaItemIndex=");
        p3b p3bVar = this.a;
        sb.append(p3bVar.b);
        sb.append(", periodIndex=");
        sb.append(p3bVar.e);
        sb.append(", positionMs=");
        sb.append(p3bVar.f);
        sb.append(", contentPositionMs=");
        sb.append(p3bVar.g);
        sb.append(", adGroupIndex=");
        sb.append(p3bVar.h);
        sb.append(", adIndexInAdGroup=");
        sb.append(p3bVar.i);
        sb.append("}, isPlayingAd=");
        sb.append(this.b);
        sb.append(", eventTimeMs=");
        sb.append(this.c);
        sb.append(", durationMs=");
        sb.append(this.d);
        sb.append(", bufferedPositionMs=");
        sb.append(this.e);
        sb.append(", bufferedPercentage=");
        sb.append(this.f);
        sb.append(", totalBufferedDurationMs=");
        sb.append(this.g);
        sb.append(", currentLiveOffsetMs=");
        sb.append(this.h);
        sb.append(", contentDurationMs=");
        sb.append(this.i);
        sb.append(", contentBufferedPositionMs=");
        return zr6.k(sb, this.j, "}");
    }
}
