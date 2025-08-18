package defpackage;

/* loaded from: classes.dex */
public final class hue {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public s8 g = s8.g;

    static {
        int i2 = oaf.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
    }

    public final long a(int i2, int i3) {
        q8 q8VarA = this.g.a(i2);
        if (q8VarA.b != -1) {
            return q8VarA.g[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        int i2;
        q8 q8VarA;
        int i3;
        s8 s8Var = this.g;
        long j3 = this.d;
        s8Var.getClass();
        if (j2 == Long.MIN_VALUE) {
            return -1;
        }
        if (j3 != -9223372036854775807L && j2 >= j3) {
            return -1;
        }
        int i4 = s8Var.e;
        while (true) {
            i2 = s8Var.b;
            if (i4 >= i2 || ((s8Var.a(i4).a == Long.MIN_VALUE || s8Var.a(i4).a > j2) && ((i3 = (q8VarA = s8Var.a(i4)).b) == -1 || q8VarA.a(-1) < i3))) {
                break;
            }
            i4++;
        }
        if (i4 < i2) {
            return i4;
        }
        return -1;
    }

    public final int c(long j2) {
        s8 s8Var = this.g;
        long j3 = this.d;
        int i2 = s8Var.b - 1;
        int i3 = i2 - (s8Var.b(i2) ? 1 : 0);
        while (i3 >= 0 && j2 != Long.MIN_VALUE) {
            q8 q8VarA = s8Var.a(i3);
            long j4 = q8VarA.a;
            if (j4 != Long.MIN_VALUE) {
                if (j2 >= j4) {
                    break;
                }
                i3--;
            } else {
                if (j3 != -9223372036854775807L && ((!q8VarA.i || q8VarA.b != -1) && j2 >= j3)) {
                    break;
                }
                i3--;
            }
        }
        if (i3 >= 0) {
            q8 q8VarA2 = s8Var.a(i3);
            int i4 = q8VarA2.b;
            if (i4 == -1) {
                return i3;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = q8VarA2.f[i5];
                if (i6 == 0 || i6 == 1) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public final long d(int i2) {
        return this.g.a(i2).a;
    }

    public final int e(int i2, int i3) {
        q8 q8VarA = this.g.a(i2);
        if (q8VarA.b != -1) {
            return q8VarA.f[i3];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !hue.class.equals(obj.getClass())) {
            return false;
        }
        hue hueVar = (hue) obj;
        return oaf.a(this.a, hueVar.a) && oaf.a(this.b, hueVar.b) && this.c == hueVar.c && this.d == hueVar.d && this.e == hueVar.e && this.f == hueVar.f && oaf.a(this.g, hueVar.g);
    }

    public final int f(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final long g() {
        return this.e;
    }

    public final boolean h(int i2) {
        s8 s8Var = this.g;
        return i2 == s8Var.b - 1 && s8Var.b(i2);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j2 = this.d;
        int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }

    public final boolean i(int i2) {
        return this.g.a(i2).i;
    }

    public final void j(Object obj, Object obj2, int i2, long j2, long j3, s8 s8Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = s8Var;
        this.f = z;
    }
}
