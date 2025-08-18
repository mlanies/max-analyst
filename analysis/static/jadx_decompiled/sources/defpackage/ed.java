package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ed {
    public final long a;
    public final lue b;
    public final int c;
    public final xj8 d;
    public final long e;
    public final lue f;
    public final int g;
    public final xj8 h;
    public final long i;
    public final long j;

    public ed(long j, lue lueVar, int i, xj8 xj8Var, long j2, lue lueVar2, int i2, xj8 xj8Var2, long j3, long j4) {
        this.a = j;
        this.b = lueVar;
        this.c = i;
        this.d = xj8Var;
        this.e = j2;
        this.f = lueVar2;
        this.g = i2;
        this.h = xj8Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ed.class != obj.getClass()) {
            return false;
        }
        ed edVar = (ed) obj;
        return this.a == edVar.a && this.c == edVar.c && this.e == edVar.e && this.g == edVar.g && this.i == edVar.i && this.j == edVar.j && f46.B(this.b, edVar.b) && f46.B(this.d, edVar.d) && f46.B(this.f, edVar.f) && f46.B(this.h, edVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
