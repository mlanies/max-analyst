package defpackage;

/* loaded from: classes.dex */
public abstract class fi0 {
    public boolean a = false;

    public static boolean a(int i) {
        return (i & 1) == 1;
    }

    public static boolean b(int i) {
        return !a(i);
    }

    public static boolean l(int i, int i2) {
        return (i & i2) == i2;
    }

    public final synchronized void c() {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            d();
        } catch (Exception e) {
            k(e);
        }
    }

    public abstract void d();

    public final synchronized void e(Throwable th) {
        if (this.a) {
            return;
        }
        this.a = true;
        try {
            f(th);
        } catch (Exception e) {
            k(e);
        }
    }

    public abstract void f(Throwable th);

    public final synchronized void g(int i, Object obj) {
        if (this.a) {
            return;
        }
        this.a = a(i);
        try {
            h(i, obj);
        } catch (Exception e) {
            k(e);
        }
    }

    public abstract void h(int i, Object obj);

    public final synchronized void i(float f) {
        if (this.a) {
            return;
        }
        try {
            j(f);
        } catch (Exception e) {
            k(e);
        }
    }

    public abstract void j(float f);

    public final void k(Exception exc) {
        Class<?> cls = getClass();
        if (ta5.a.i(6)) {
            ta5.a.c(cls.getSimpleName(), "unhandled exception", exc);
        }
    }
}
