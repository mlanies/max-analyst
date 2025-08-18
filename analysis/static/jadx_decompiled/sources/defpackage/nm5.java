package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nm5 extends a9e {
    public qm5 o;
    public qy p;

    @Override // defpackage.a9e
    public final long c(yaf yafVar) {
        byte[] bArr = yafVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            yafVar.I(4);
            yafVar.D();
        }
        int iE = ngg.E(i, yafVar);
        yafVar.H(0);
        return iE;
    }

    @Override // defpackage.a9e
    public final boolean e(yaf yafVar, long j, l7b l7bVar) {
        byte[] bArr = yafVar.a;
        qm5 qm5Var = this.o;
        if (qm5Var == null) {
            qm5 qm5Var2 = new qm5(bArr, 17, 0);
            this.o = qm5Var2;
            l7bVar.b = qm5Var2.d(Arrays.copyOfRange(bArr, 9, yafVar.c), null);
            return true;
        }
        byte b = bArr[0];
        if ((b & Byte.MAX_VALUE) != 3) {
            if (b != -1) {
                return true;
            }
            qy qyVar = this.p;
            if (qyVar != null) {
                qyVar.b = j;
                l7bVar.c = qyVar;
            }
            ((oy5) l7bVar.b).getClass();
            return false;
        }
        va8 va8VarT = kp.t(yafVar);
        qm5 qm5Var3 = new qm5(qm5Var.b, qm5Var.c, qm5Var.d, qm5Var.e, qm5Var.f, qm5Var.h, qm5Var.i, qm5Var.k, va8VarT, (e99) qm5Var.m);
        this.o = qm5Var3;
        qy qyVar2 = new qy(2);
        qyVar2.o = qm5Var3;
        qyVar2.X = va8VarT;
        qyVar2.b = -1L;
        qyVar2.c = -1L;
        this.p = qyVar2;
        return true;
    }

    @Override // defpackage.a9e
    public final void f(boolean z) {
        super.f(z);
        if (z) {
            this.o = null;
            this.p = null;
        }
    }
}
