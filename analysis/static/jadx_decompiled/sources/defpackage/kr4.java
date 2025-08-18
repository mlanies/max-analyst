package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class kr4 {
    public final int a;
    public final xj8 b;
    public final CopyOnWriteArrayList c;

    public kr4() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4Var = (ir4) it.next();
            maf.H(ir4Var.a, new gr4(this, ir4Var.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4Var = (ir4) it.next();
            maf.H(ir4Var.a, new gr4(this, ir4Var.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4Var = (ir4) it.next();
            maf.H(ir4Var.a, new gr4(this, ir4Var.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4Var = (ir4) it.next();
            maf.H(ir4Var.a, new si1(this, ir4Var.b, i, 8));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4Var = (ir4) it.next();
            maf.H(ir4Var.a, new f5(this, ir4Var.b, exc, 22));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ir4 ir4Var = (ir4) it.next();
            maf.H(ir4Var.a, new gr4(this, ir4Var.b, 0));
        }
    }

    public kr4(CopyOnWriteArrayList copyOnWriteArrayList, int i, xj8 xj8Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = xj8Var;
    }
}
