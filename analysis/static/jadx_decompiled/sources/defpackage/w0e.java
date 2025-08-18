package defpackage;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class w0e implements Runnable {
    public final String X;
    public final AtomicInteger a = new AtomicInteger(0);
    public final fi0 b;
    public final hab c;
    public final eab o;

    public w0e(fi0 fi0Var, hab habVar, eab eabVar, String str) {
        this.b = fi0Var;
        this.c = habVar;
        this.o = eabVar;
        this.X = str;
        habVar.j(eabVar, str);
    }

    public final void a() {
        if (this.a.compareAndSet(0, 2)) {
            e();
        }
    }

    public abstract void b(Object obj);

    public Map c(Object obj) {
        return null;
    }

    public abstract Object d();

    public void e() {
        hab habVar = this.c;
        eab eabVar = this.o;
        String str = this.X;
        habVar.i(eabVar, str);
        habVar.k(eabVar, str);
        this.b.c();
    }

    public void f(Exception exc) {
        hab habVar = this.c;
        eab eabVar = this.o;
        String str = this.X;
        habVar.i(eabVar, str);
        habVar.d(eabVar, str, exc, null);
        this.b.e(exc);
    }

    public void g(Object obj) {
        hab habVar = this.c;
        eab eabVar = this.o;
        String str = this.X;
        habVar.a(eabVar, str, habVar.i(eabVar, str) ? c(obj) : null);
        this.b.g(1, obj);
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicInteger atomicInteger = this.a;
        if (atomicInteger.compareAndSet(0, 1)) {
            try {
                Object objD = d();
                atomicInteger.set(3);
                try {
                    g(objD);
                } finally {
                    b(objD);
                }
            } catch (Exception e) {
                atomicInteger.set(4);
                f(e);
            }
        }
    }
}
