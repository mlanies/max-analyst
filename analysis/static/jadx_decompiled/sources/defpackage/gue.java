package defpackage;

/* loaded from: classes.dex */
public final class gue implements su0 {
    public long X;
    public boolean Y;
    public r8 Z = r8.Y;
    public Object a;
    public Object b;
    public int c;
    public long o;

    public final long a(int i, int i2) {
        p8 p8VarA = this.Z.a(i);
        if (p8VarA.b != -1) {
            return p8VarA.X[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int i;
        p8 p8VarA;
        int i2;
        r8 r8Var = this.Z;
        long j2 = this.o;
        r8Var.getClass();
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i3 = r8Var.o;
        while (true) {
            i = r8Var.a;
            if (i3 >= i || ((r8Var.a(i3).a == Long.MIN_VALUE || r8Var.a(i3).a > j) && ((i2 = (p8VarA = r8Var.a(i3)).b) == -1 || p8VarA.a(-1) < i2))) {
                break;
            }
            i3++;
        }
        if (i3 < i) {
            return i3;
        }
        return -1;
    }

    public final int c(long j) {
        r8 r8Var = this.Z;
        long j2 = this.o;
        int i = r8Var.a - 1;
        while (i >= 0 && j != Long.MIN_VALUE) {
            long j3 = r8Var.a(i).a;
            if (j3 != Long.MIN_VALUE) {
                if (j >= j3) {
                    break;
                }
                i--;
            } else {
                if (j2 != -9223372036854775807L && j >= j2) {
                    break;
                }
                i--;
            }
        }
        if (i >= 0) {
            p8 p8VarA = r8Var.a(i);
            int i2 = p8VarA.b;
            if (i2 == -1) {
                return i;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = p8VarA.o[i3];
                if (i4 == 0 || i4 == 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int d(int i, int i2) {
        p8 p8VarA = this.Z.a(i);
        if (p8VarA.b != -1) {
            return p8VarA.o[i2];
        }
        return 0;
    }

    public final int e(int i) {
        return this.Z.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !gue.class.equals(obj.getClass())) {
            return false;
        }
        gue gueVar = (gue) obj;
        return maf.a(this.a, gueVar.a) && maf.a(this.b, gueVar.b) && this.c == gueVar.c && this.o == gueVar.o && this.X == gueVar.X && this.Y == gueVar.Y && maf.a(this.Z, gueVar.Z);
    }

    public final long f() {
        return this.X;
    }

    public final boolean g(int i) {
        return this.Z.a(i).Z;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, r8 r8Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.o = j;
        this.X = j2;
        this.Z = r8Var;
        this.Y = z;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (((iHashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
        long j = this.o;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.X;
        return this.Z.hashCode() + ((((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.Y ? 1 : 0)) * 31);
    }
}
