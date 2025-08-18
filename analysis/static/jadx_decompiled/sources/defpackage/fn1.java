package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class fn1 extends gle {
    public final long X;
    public final long Y;
    public final String c;
    public final long o;

    public /* synthetic */ fn1() {
        this("", 0L, 0L, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn1)) {
            return false;
        }
        fn1 fn1Var = (fn1) obj;
        return tpa.f(this.c, fn1Var.c) && this.o == fn1Var.o && this.X == fn1Var.X && this.Y == fn1Var.Y;
    }

    public final int hashCode() {
        return Long.hashCode(this.Y) + h4f.m(h4f.m(this.c.hashCode() * 31, 31, this.o), 31, this.X);
    }

    @Override // defpackage.zje
    public final String toString() {
        String str = this.c;
        return zr6.k(au1.m("Response(token=", w9e.M0(str, 0, str.length(), "*").toString(), " expiredDurationSec="), this.o, ")");
    }

    public fn1(String str, long j, long j2, long j3) {
        this.c = str;
        this.o = j;
        this.X = j2;
        this.Y = j3;
        this.a = TimeUnit.NANOSECONDS.toMillis(Math.abs(System.nanoTime() - j3));
    }
}
