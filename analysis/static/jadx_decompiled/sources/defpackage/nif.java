package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class nif implements ckf {
    public dkf X;
    public final kld Y;
    public final v7c Z;
    public final String a = nif.class.getName();
    public vxd b;
    public final ContextScope c;
    public final je7 o;

    public nif(je7 je7Var, je7 je7Var2) {
        this.c = j1e.a(((w9a) ((kke) je7Var2.getValue())).c().plus(f46.a()));
        this.o = je7Var;
        kld kldVarB = lld.b(1, 0, 2, 2);
        this.Y = kldVarB;
        this.Z = new v7c(kldVarB);
    }

    public final void a(long j, wgf wgfVar, gef gefVar) {
        je7 je7Var = this.o;
        dkf dkfVar = ((f4b) je7Var.getValue()).get();
        this.X = dkfVar;
        kld kldVar = this.Y;
        if (dkfVar == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        kldVar.g(new ijf(j, wgfVar.b, wgfVar, gefVar, dkfVar, (f4b) je7Var.getValue()));
        dkf dkfVar2 = this.X;
        if (dkfVar2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        dkfVar2.g(1.0f);
        dkfVar2.L0(false);
        dkfVar2.Y = this;
        dkfVar2.I0(gefVar);
    }

    @Override // defpackage.ckf
    public final void h() {
        if (this.X != null) {
            ijf ijfVar = (ijf) x53.i0(this.Z.a.b());
            if (ijfVar != null) {
                kld kldVar = this.Y;
                ijfVar.X = 4;
                kldVar.g(ijfVar);
            }
            vxd vxdVar = this.b;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            this.b = null;
        }
    }

    @Override // defpackage.ckf
    public final void i() {
        if (this.X != null) {
            ijf ijfVar = (ijf) x53.i0(this.Z.a.b());
            if (ijfVar != null) {
                kld kldVar = this.Y;
                ijfVar.X = 2;
                kldVar.g(ijfVar);
            }
            dkf dkfVar = this.X;
            if (dkfVar == null) {
                return;
            }
            this.b = j47.T(this.c, null, null, new iif(dkfVar, this, null), 3);
        }
    }

    @Override // defpackage.ckf
    public final void o() {
        if (this.X != null) {
            ijf ijfVar = (ijf) x53.i0(this.Z.a.b());
            if (ijfVar != null) {
                kld kldVar = this.Y;
                ijfVar.X = 5;
                kldVar.g(ijfVar);
            }
            vxd vxdVar = this.b;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            this.b = null;
            dkf dkfVar = this.X;
            if (dkfVar != null) {
                hm9.n(dkfVar.c, "Player. Clear");
                u75 u75Var = dkfVar.o;
                u75Var.w2();
                u75Var.p2(null);
                u75Var.k2(0, 0);
                dkfVar.Y = null;
                dkfVar.Z = null;
            }
            dkf dkfVar2 = this.X;
            if (dkfVar2 != null) {
                ((f4b) this.o.getValue()).a(dkfVar2);
            }
            this.X = null;
        }
    }

    @Override // defpackage.ckf
    public final void u(float f) {
        dkf dkfVar = this.X;
        if (dkfVar != null) {
            dkfVar.g(f);
        }
    }

    @Override // defpackage.ckf
    public final void x() {
        if (this.X != null) {
            ijf ijfVar = (ijf) x53.i0(this.Z.a.b());
            if (ijfVar != null) {
                kld kldVar = this.Y;
                ijfVar.X = 5;
                kldVar.g(ijfVar);
            }
            vxd vxdVar = this.b;
            if (vxdVar != null) {
                vxdVar.cancel((CancellationException) null);
            }
            this.b = null;
            dkf dkfVar = this.X;
            if (dkfVar != null) {
                hm9.n(dkfVar.c, "Player. Clear");
                u75 u75Var = dkfVar.o;
                u75Var.w2();
                u75Var.p2(null);
                u75Var.k2(0, 0);
                dkfVar.Y = null;
                dkfVar.Z = null;
            }
            dkf dkfVar2 = this.X;
            if (dkfVar2 != null) {
                ((f4b) this.o.getValue()).a(dkfVar2);
            }
            this.X = null;
        }
    }
}
