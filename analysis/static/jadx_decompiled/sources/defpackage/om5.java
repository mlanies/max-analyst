package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class om5 extends a9e {
    public qm5 o;
    public qy p;

    @Override // defpackage.a9e
    public final long b(wpa wpaVar) {
        byte[] bArr = wpaVar.a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            wpaVar.H(4);
            wpaVar.B();
        }
        int iK = z7.K(i, wpaVar);
        wpaVar.G(0);
        return iK;
    }

    @Override // defpackage.a9e
    public final boolean d(wpa wpaVar, long j, djb djbVar) {
        byte[] bArr = wpaVar.a;
        qm5 qm5Var = this.o;
        if (qm5Var == null) {
            qm5 qm5Var2 = new qm5(bArr, 17, 1);
            this.o = qm5Var2;
            djbVar.b = qm5Var2.e(Arrays.copyOfRange(bArr, 9, wpaVar.c), null);
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
                djbVar.c = qyVar;
            }
            ((qy5) djbVar.b).getClass();
            return false;
        }
        h7b h7bVarS = ft.s(wpaVar);
        qm5 qm5Var3 = new qm5(qm5Var.b, qm5Var.c, qm5Var.d, qm5Var.e, qm5Var.f, qm5Var.h, qm5Var.i, qm5Var.k, h7bVarS, (f99) qm5Var.m);
        this.o = qm5Var3;
        qy qyVar2 = new qy(3);
        qyVar2.o = qm5Var3;
        qyVar2.X = h7bVarS;
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
