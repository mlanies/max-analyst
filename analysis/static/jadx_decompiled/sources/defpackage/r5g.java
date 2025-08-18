package defpackage;

/* loaded from: classes.dex */
public abstract class r5g implements oh4 {
    public int a;
    public hj3 b;
    public opc c;
    public int d;
    public final ek4 e = new ek4(this);
    public int f = 0;
    public boolean g = false;
    public final sh4 h = new sh4(this);
    public final sh4 i = new sh4(this);
    public int j = 1;

    public r5g(hj3 hj3Var) {
        this.b = hj3Var;
    }

    public static void b(sh4 sh4Var, sh4 sh4Var2, int i) {
        sh4Var.l.add(sh4Var2);
        sh4Var.f = i;
        sh4Var2.k.add(sh4Var);
    }

    public static sh4 h(oi3 oi3Var) {
        oi3 oi3Var2 = oi3Var.f;
        if (oi3Var2 == null) {
            return null;
        }
        int iS = au1.s(oi3Var2.e);
        hj3 hj3Var = oi3Var2.d;
        if (iS == 1) {
            return hj3Var.d.h;
        }
        if (iS == 2) {
            return hj3Var.e.h;
        }
        if (iS == 3) {
            return hj3Var.d.i;
        }
        if (iS == 4) {
            return hj3Var.e.i;
        }
        if (iS != 5) {
            return null;
        }
        return hj3Var.e.k;
    }

    public static sh4 i(oi3 oi3Var, int i) {
        oi3 oi3Var2 = oi3Var.f;
        if (oi3Var2 == null) {
            return null;
        }
        hj3 hj3Var = oi3Var2.d;
        r5g r5gVar = i == 0 ? hj3Var.d : hj3Var.e;
        int iS = au1.s(oi3Var2.e);
        if (iS == 1 || iS == 2) {
            return r5gVar.h;
        }
        if (iS == 3 || iS == 4) {
            return r5gVar.i;
        }
        return null;
    }

    public final void c(sh4 sh4Var, sh4 sh4Var2, int i, ek4 ek4Var) {
        sh4Var.l.add(sh4Var2);
        sh4Var.l.add(this.e);
        sh4Var.h = i;
        sh4Var.i = ek4Var;
        sh4Var2.k.add(sh4Var);
        ek4Var.k.add(sh4Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        int iMax;
        if (i2 == 0) {
            hj3 hj3Var = this.b;
            int i3 = hj3Var.v;
            iMax = Math.max(hj3Var.u, i);
            if (i3 > 0) {
                iMax = Math.min(i3, i);
            }
            if (iMax == i) {
                return i;
            }
        } else {
            hj3 hj3Var2 = this.b;
            int i4 = hj3Var2.y;
            iMax = Math.max(hj3Var2.x, i);
            if (i4 > 0) {
                iMax = Math.min(i4, i);
            }
            if (iMax == i) {
                return i;
            }
        }
        return iMax;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.oi3 r12, defpackage.oi3 r13, int r14) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5g.l(oi3, oi3, int):void");
    }
}
