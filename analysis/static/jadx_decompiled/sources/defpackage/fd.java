package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class fd {
    public final long a;
    public final mue b;
    public final int c;
    public final yj8 d;
    public final long e;
    public final mue f;
    public final int g;
    public final yj8 h;
    public final long i;
    public final long j;

    public fd(long j, mue mueVar, int i, yj8 yj8Var, long j2, mue mueVar2, int i2, yj8 yj8Var2, long j3, long j4) {
        this.a = j;
        this.b = mueVar;
        this.c = i;
        this.d = yj8Var;
        this.e = j2;
        this.f = mueVar2;
        this.g = i2;
        this.h = yj8Var2;
        this.i = j3;
        this.j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fd.class != obj.getClass()) {
            return false;
        }
        fd fdVar = (fd) obj;
        return this.a == fdVar.a && this.c == fdVar.c && this.e == fdVar.e && this.g == fdVar.g && this.i == fdVar.i && this.j == fdVar.j && f46.B(this.b, fdVar.b) && f46.B(this.d, fdVar.d) && f46.B(this.f, fdVar.f) && f46.B(this.h, fdVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, Long.valueOf(this.e), this.f, Integer.valueOf(this.g), this.h, Long.valueOf(this.i), Long.valueOf(this.j)});
    }
}
