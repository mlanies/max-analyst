package defpackage;

import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class krd implements la5 {
    public int X;
    public pa5 Y;
    public yze Z;
    public final int a;
    public final int b;
    public final String c;
    public int o;

    public krd(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        this.Y = pa5Var;
        yze yzeVarMo6B = pa5Var.mo6B(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, 4);
        this.Z = yzeVarMo6B;
        ny5 ny5Var = new ny5();
        ny5Var.m = ia9.l(this.c);
        yzeVarMo6B.e(new qy5(ny5Var));
        this.Y.w();
        this.Y.J(new rrd());
        this.X = 1;
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        if (j == 0 || this.X == 1) {
            this.X = 1;
            this.o = 0;
        }
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) {
        int i = this.X;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        yze yzeVar = this.Z;
        yzeVar.getClass();
        int iC = yzeVar.c(na5Var, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY, true);
        if (iC == -1) {
            this.X = 2;
            this.Z.a(0L, 1, this.o, 0, null);
            this.o = 0;
        } else {
            this.o += iC;
        }
        return 0;
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        int i = this.b;
        int i2 = this.a;
        fm9.k((i2 == -1 || i == -1) ? false : true);
        wpa wpaVar = new wpa(i);
        ((sa4) na5Var).q(wpaVar.a, 0, i, false);
        return wpaVar.A() == i2;
    }

    @Override // defpackage.la5
    public final void release() {
    }
}
