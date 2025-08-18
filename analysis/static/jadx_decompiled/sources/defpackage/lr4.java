package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class lr4 {
    public final int a;
    public final yj8 b;
    public final CopyOnWriteArrayList c;

    public lr4(CopyOnWriteArrayList copyOnWriteArrayList, int i, yj8 yj8Var) {
        this.c = copyOnWriteArrayList;
        this.a = i;
        this.b = yj8Var;
    }

    public final void a() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4Var = (jr4) it.next();
            oaf.W(jr4Var.a, new hr4(this, jr4Var.b, 3));
        }
    }

    public final void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4Var = (jr4) it.next();
            oaf.W(jr4Var.a, new hr4(this, jr4Var.b, 1));
        }
    }

    public final void c() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4Var = (jr4) it.next();
            oaf.W(jr4Var.a, new hr4(this, jr4Var.b, 2));
        }
    }

    public final void d(int i) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4Var = (jr4) it.next();
            oaf.W(jr4Var.a, new si1(this, jr4Var.b, i, 7));
        }
    }

    public final void e(Exception exc) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4Var = (jr4) it.next();
            oaf.W(jr4Var.a, new f5(this, jr4Var.b, exc, 23));
        }
    }

    public final void f() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            jr4 jr4Var = (jr4) it.next();
            oaf.W(jr4Var.a, new hr4(this, jr4Var.b, 0));
        }
    }
}
