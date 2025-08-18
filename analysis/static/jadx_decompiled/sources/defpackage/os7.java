package defpackage;

/* loaded from: classes2.dex */
public final class os7 {
    public static final ThreadLocal h = new ThreadLocal();
    public final us7 a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final Throwable f;
    public final je7 g;

    public os7(us7 us7Var, String str, String str2, String str3, Throwable th) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.a = us7Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = jCurrentTimeMillis;
        this.f = th;
        final int i = 0;
        tu0.r(2, new k56(this) { // from class: ks7
            public final /* synthetic */ os7 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                os7 os7Var = this.b;
                switch (i) {
                    case 0:
                        ThreadLocal threadLocal = os7.h;
                        return ema.f(os7Var.d, os7Var.b);
                    default:
                        ThreadLocal threadLocal2 = os7.h;
                        return ema.g(os7Var.d, os7Var.b);
                }
            }
        });
        final int i2 = 1;
        this.g = tu0.r(2, new k56(this) { // from class: ks7
            public final /* synthetic */ os7 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                os7 os7Var = this.b;
                switch (i2) {
                    case 0:
                        ThreadLocal threadLocal = os7.h;
                        return ema.f(os7Var.d, os7Var.b);
                    default:
                        ThreadLocal threadLocal2 = os7.h;
                        return ema.g(os7Var.d, os7Var.b);
                }
            }
        });
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof os7)) {
            return false;
        }
        os7 os7Var = (os7) obj;
        return this.a == os7Var.a && tpa.f(this.b, os7Var.b) && tpa.f(this.c, os7Var.c) && tpa.f(this.d, os7Var.d) && this.e == os7Var.e && tpa.f(this.f, os7Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iM = h4f.m(rh4.d((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
        Throwable th = this.f;
        return iM + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "LogEntry(level=" + this.a + ", tag=" + this.b + ", message=" + this.c + ", threadName=" + this.d + ", time=" + this.e + ", throwable=" + this.f + ")";
    }
}
