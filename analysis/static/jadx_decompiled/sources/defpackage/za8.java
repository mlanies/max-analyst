package defpackage;

/* loaded from: classes.dex */
public final class za8 {
    public long a;
    public long b = Long.MIN_VALUE;
    public boolean c;
    public boolean d;
    public boolean e;

    public bb8 a() {
        return new bb8(this);
    }

    public cb8 b() {
        return new cb8(this);
    }

    public db8 c() {
        return new db8(this);
    }

    public void d(long j) {
        fm9.f(j == Long.MIN_VALUE || j >= 0);
        this.b = j;
    }

    public void e(long j) {
        f(oaf.S(j));
    }

    public void f(long j) {
        fm9.f(j >= 0);
        this.a = j;
    }

    public void g(boolean z) {
        this.e = z;
    }
}
