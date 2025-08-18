package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class gk8 {
    public long a;
    public int b;
    public Object c;
    public Serializable d;

    public gk8() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public long a(long j) {
        long jM = maf.M(j);
        if (jM == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.a + jM;
    }

    public void b(int i, oy5 oy5Var, int i2, Object obj, long j) {
        c(new pc8(1, i, oy5Var, i2, obj, a(j), -9223372036854775807L));
    }

    public void c(pc8 pc8Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8Var = (ek8) it.next();
            maf.H(ek8Var.a, new v05(this, ek8Var.b, pc8Var, 17));
        }
    }

    public void d(xn7 xn7Var, int i, int i2, oy5 oy5Var, int i3, Object obj, long j, long j2) {
        e(xn7Var, new pc8(i, i2, oy5Var, i3, obj, a(j), a(j2)));
    }

    public void e(xn7 xn7Var, pc8 pc8Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8Var = (ek8) it.next();
            maf.H(ek8Var.a, new bk8(this, ek8Var.b, xn7Var, pc8Var, 2));
        }
    }

    public void f(xn7 xn7Var, int i, int i2, oy5 oy5Var, int i3, Object obj, long j, long j2) {
        g(xn7Var, new pc8(i, i2, oy5Var, i3, obj, a(j), a(j2)));
    }

    public void g(xn7 xn7Var, pc8 pc8Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8Var = (ek8) it.next();
            maf.H(ek8Var.a, new bk8(this, ek8Var.b, xn7Var, pc8Var, 1));
        }
    }

    public void h(xn7 xn7Var, int i, int i2, oy5 oy5Var, int i3, Object obj, long j, long j2, IOException iOException, boolean z) {
        j(xn7Var, new pc8(i, i2, oy5Var, i3, obj, a(j), a(j2)), iOException, z);
    }

    public void i(xn7 xn7Var, int i, IOException iOException, boolean z) {
        h(xn7Var, i, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, iOException, z);
    }

    public void j(xn7 xn7Var, pc8 pc8Var, IOException iOException, boolean z) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8Var = (ek8) it.next();
            maf.H(ek8Var.a, new dk8(this, ek8Var.b, xn7Var, pc8Var, iOException, z, 0));
        }
    }

    public void k(xn7 xn7Var, int i, int i2, oy5 oy5Var, int i3, Object obj, long j, long j2) {
        l(xn7Var, new pc8(i, i2, oy5Var, i3, obj, a(j), a(j2)));
    }

    public void l(xn7 xn7Var, pc8 pc8Var) {
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8Var = (ek8) it.next();
            maf.H(ek8Var.a, new bk8(this, ek8Var.b, xn7Var, pc8Var, 0));
        }
    }

    public void m(pc8 pc8Var) {
        xj8 xj8Var = (xj8) this.c;
        xj8Var.getClass();
        Iterator it = ((CopyOnWriteArrayList) this.d).iterator();
        while (it.hasNext()) {
            ek8 ek8Var = (ek8) it.next();
            maf.H(ek8Var.a, new yg3(this, ek8Var.b, xj8Var, pc8Var, 12));
        }
    }

    public gk8(CopyOnWriteArrayList copyOnWriteArrayList, int i, xj8 xj8Var, long j) {
        this.d = copyOnWriteArrayList;
        this.b = i;
        this.c = xj8Var;
        this.a = j;
    }
}
