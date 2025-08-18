package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class oi3 {
    public int b;
    public boolean c;
    public final hj3 d;
    public final int e;
    public oi3 f;
    public sud i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public oi3(hj3 hj3Var, int i) {
        this.d = hj3Var;
        this.e = i;
    }

    public final void a(oi3 oi3Var, int i) {
        b(oi3Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(oi3 oi3Var, int i, int i2, boolean z) {
        if (oi3Var == null) {
            j();
            return true;
        }
        if (!z && !i(oi3Var)) {
            return false;
        }
        this.f = oi3Var;
        if (oi3Var.a == null) {
            oi3Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, o5g o5gVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                f8.e(((oi3) it.next()).d, i, arrayList, o5gVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        oi3 oi3Var;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (oi3Var = this.f) == null || oi3Var.d.g0 != 8) ? this.g : i;
    }

    public final oi3 f() {
        int i = this.e;
        int iS = au1.s(i);
        hj3 hj3Var = this.d;
        switch (iS) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return hj3Var.K;
            case 2:
                return hj3Var.L;
            case 3:
                return hj3Var.I;
            case 4:
                return hj3Var.J;
            default:
                throw new AssertionError(ms2.n(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((oi3) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    public final boolean i(oi3 oi3Var) {
        if (oi3Var == null) {
            return false;
        }
        int i = this.e;
        hj3 hj3Var = oi3Var.d;
        int i2 = oi3Var.e;
        if (i2 == i) {
            return i != 6 || (hj3Var.E && this.d.E);
        }
        switch (au1.s(i)) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                boolean z = i2 == 2 || i2 == 4;
                if (hj3Var instanceof fh6) {
                    return z || i2 == 8;
                }
                return z;
            case 2:
            case 4:
                boolean z2 = i2 == 3 || i2 == 5;
                if (hj3Var instanceof fh6) {
                    return z2 || i2 == 9;
                }
                return z2;
            case 5:
                return (i2 == 2 || i2 == 4) ? false : true;
            case 6:
                return (i2 == 6 || i2 == 8 || i2 == 9) ? false : true;
            default:
                throw new AssertionError(ms2.n(i));
        }
    }

    public final void j() {
        HashSet hashSet;
        oi3 oi3Var = this.f;
        if (oi3Var != null && (hashSet = oi3Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        sud sudVar = this.i;
        if (sudVar == null) {
            this.i = new sud(1);
        } else {
            sudVar.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + ms2.n(this.e);
    }
}
