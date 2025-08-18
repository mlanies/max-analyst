package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class qnb implements frc {
    public final int a;
    public final /* synthetic */ unb b;

    public qnb(unb unbVar, int i) {
        this.b = unbVar;
        this.a = i;
    }

    @Override // defpackage.frc
    public final void c() throws IOException {
        unb unbVar = this.b;
        unbVar.D0[this.a].v();
        int iV = unbVar.o.v(unbVar.M0);
        jo7 jo7Var = unbVar.v0;
        IOException iOException = (IOException) jo7Var.c;
        if (iOException != null) {
            throw iOException;
        }
        eo7 eo7Var = (eo7) jo7Var.b;
        if (eo7Var != null) {
            if (iV == Integer.MIN_VALUE) {
                iV = eo7Var.b;
            }
            IOException iOException2 = eo7Var.o;
            if (iOException2 != null && eo7Var.X > iV) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.frc
    public final boolean d() {
        unb unbVar = this.b;
        return !unbVar.v() && unbVar.D0[this.a].t(unbVar.V0);
    }

    @Override // defpackage.frc
    public final int e(long j) {
        unb unbVar = this.b;
        if (unbVar.v()) {
            return 0;
        }
        int i = this.a;
        unbVar.j(i);
        drc drcVar = unbVar.D0[i];
        int iQ = drcVar.q(j, unbVar.V0);
        drcVar.B(iQ);
        if (iQ == 0) {
            unbVar.m(i);
        }
        return iQ;
    }

    @Override // defpackage.frc
    public final int g(imc imcVar, o54 o54Var, int i) {
        unb unbVar = this.b;
        if (unbVar.v()) {
            return -3;
        }
        int i2 = this.a;
        unbVar.j(i2);
        int iY = unbVar.D0[i2].y(imcVar, o54Var, i, unbVar.V0);
        if (iY == -3) {
            unbVar.m(i2);
        }
        return iY;
    }
}
