package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public abstract class z12 {
    public final long a;
    public final sx3 b;
    public final q0e c = r0e.a(null);
    public final q0e d = r0e.a(nz4.a);
    public final kld e = lld.b(0, 0, 0, 7);
    public final kld f = lld.b(0, 0, 0, 7);
    public final khe g = new khe(new dk1(24));
    public final q0e h = r0e.a(null);
    public final q0e i = r0e.a(null);

    public z12(long j, sx3 sx3Var) {
        this.a = j;
        this.b = sx3Var;
    }

    public void a() {
    }

    public abstract void b();

    public Object c(Continuation continuation) {
        return e5f.a;
    }

    public final void d(y12 y12Var) {
        this.c.setValue(y12Var.a);
        this.d.setValue(y12Var.b);
    }

    public void e() {
    }

    public abstract mn5 f();

    public void g(int i) {
    }

    public void h(int i) {
    }

    public void i(int i) {
    }

    public abstract Object j(Continuation continuation);

    public abstract void k(String str);

    public void l(int i) {
    }
}
