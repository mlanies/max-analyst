package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class rnb implements grc {
    public final int a;
    public final /* synthetic */ vnb b;

    public rnb(vnb vnbVar, int i) {
        this.b = vnbVar;
        this.a = i;
    }

    @Override // defpackage.grc
    public final void c() throws IOException {
        vnb vnbVar = this.b;
        vnbVar.E0[this.a].u();
        int iP = vnbVar.o.p(vnbVar.O0);
        vq7 vq7Var = vnbVar.w0;
        IOException iOException = (IOException) vq7Var.o;
        if (iOException != null) {
            throw iOException;
        }
        eo7 eo7Var = (eo7) vq7Var.c;
        if (eo7Var != null) {
            if (iP == Integer.MIN_VALUE) {
                iP = eo7Var.b;
            }
            IOException iOException2 = eo7Var.o;
            if (iOException2 != null && eo7Var.X > iP) {
                throw iOException2;
            }
        }
    }

    @Override // defpackage.grc
    public final boolean d() {
        vnb vnbVar = this.b;
        return !vnbVar.D() && vnbVar.E0[this.a].s(vnbVar.X0);
    }

    @Override // defpackage.grc
    public final int e(long j) {
        vnb vnbVar = this.b;
        if (vnbVar.D()) {
            return 0;
        }
        int i = this.a;
        vnbVar.x(i);
        erc ercVar = vnbVar.E0[i];
        int iP = ercVar.p(j, vnbVar.X0);
        ercVar.B(iP);
        if (iP == 0) {
            vnbVar.y(i);
        }
        return iP;
    }

    @Override // defpackage.grc
    public final int j(y7g y7gVar, p54 p54Var, int i) {
        vnb vnbVar = this.b;
        if (vnbVar.D()) {
            return -3;
        }
        int i2 = this.a;
        vnbVar.x(i2);
        int iX = vnbVar.E0[i2].x(y7gVar, p54Var, i, vnbVar.X0);
        if (iX == -3) {
            vnbVar.y(i2);
        }
        return iX;
    }
}
