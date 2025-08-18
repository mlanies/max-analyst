package defpackage;

import android.app.Application;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wp9 extends pnf {
    public final q0e X;
    public volatile int Y;
    public final s35 Z;
    public final /* synthetic */ mo9 b;
    public final z4d c;
    public volatile qo9 o;
    public final gld s0;
    public final dre t0;
    public final w7c u0;
    public final kld v0;
    public final v7c w0;
    public final j31 x0;
    public final q0e y0;
    public final m58 z0;

    /* JADX WARN: Type inference failed for: r10v3, types: [rp9] */
    /* JADX WARN: Type inference failed for: r11v2, types: [rp9] */
    public wp9(Long l, afc afcVar, khe kheVar, khe kheVar2, khe kheVar3, je7 je7Var, je7 je7Var2) {
        z4d x99Var;
        final int i = 1;
        final int i2 = 0;
        lt7 lt7Var = lt7.a;
        khe kheVarD = lt7Var.getAccessor().d(eua.class);
        khe kheVarD2 = lt7Var.getAccessor().d(kk5.class);
        khe kheVarD3 = lt7Var.getAccessor().d(Application.class);
        khe kheVarD4 = lt7Var.getAccessor().d(y7d.class);
        khe kheVarD5 = lt7Var.getAccessor().d(pk.class);
        khe kheVarD6 = lt7Var.getAccessor().d(wha.class);
        khe kheVarD7 = lt7Var.getAccessor().d(ds3.class);
        khe kheVarD8 = lt7Var.getAccessor().d(d80.class);
        khe kheVarB = lt7Var.getAccessor().b(z2a.class);
        mo9 mo9Var = new mo9(kheVarD, je7Var, kheVarD2, kheVarD3, kheVarD4, kheVarD6);
        this.b = mo9Var;
        if (afcVar != null) {
            x99Var = new dfc(afcVar, this.a, new k56(this) { // from class: rp9
                public final /* synthetic */ wp9 b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            pnf.o(this.b.Z, wo9.b);
                            break;
                        default:
                            pnf.o(this.b.Z, g43.b);
                            break;
                    }
                    return e5f.a;
                }
            }, kheVar3, je7Var2, kheVar2, je7Var, kheVarD5, kheVarD8, kheVarB);
        } else {
            if (l == null) {
                throw new IllegalStateException("Pass registrationData or contactId to work with NeuroAvatarsDelegate".toString());
            }
            x99Var = new x99(l.longValue(), this.a, new k56(this) { // from class: rp9
                public final /* synthetic */ wp9 b;

                {
                    this.b = this;
                }

                @Override // defpackage.k56
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            pnf.o(this.b.Z, wo9.b);
                            break;
                        default:
                            pnf.o(this.b.Z, g43.b);
                            break;
                    }
                    return e5f.a;
                }
            }, (ds3) kheVarD7.getValue(), kheVarD5);
        }
        this.c = x99Var;
        m58 m58Var = new m58(mo9Var.j, 13);
        q0e q0eVarA = r0e.a(nz4.a);
        this.X = q0eVarA;
        this.Z = new s35(0);
        Continuation continuation = null;
        dh3 dh3Var = x99Var instanceof dh3 ? (dh3) x99Var : null;
        this.s0 = dh3Var != null ? dh3Var.f() : null;
        this.t0 = x99Var.g();
        this.u0 = od2.X(new zn5(od2.x(new j31(od2.N(x99Var.e(), m58Var), x99Var.c(), new xh0(3, continuation, 23), 4)), new tp9(this, null), 5), this.a, wld.a, new k4d(null, i2b.a));
        kld kldVarB = lld.b(0, Integer.MAX_VALUE, 0, 4);
        this.v0 = kldVarB;
        this.w0 = new v7c(kldVarB);
        kld kldVarA = lld.a(1, 1, 2);
        this.x0 = new j31(new w7c(q0eVarA), kldVarA, new wu7(3, null, 2), 4);
        q0e q0eVarA2 = r0e.a(oz4.a);
        this.y0 = q0eVarA2;
        this.z0 = new m58(new w7c(q0eVarA2), 14);
        ArrayList arrayList = new ArrayList(16);
        while (i2 < 16) {
            arrayList.add(new op9());
            i2++;
        }
        kldVarA.g(arrayList);
        vo9 vo9Var = (vo9) kheVar.getValue();
        vo9Var.getClass();
        od2.L(od2.F(new zn5(od2.F(new mqc(new uo9(vo9Var, null)), ((w9a) ((kke) vo9Var.c.getValue())).b()), new sp9(this, null), 5), ((w9a) ((kke) je7Var.getValue())).b()), this.a);
    }

    @Override // defpackage.pnf
    public final void p() {
        pag.d(this.b.f.getCoroutineContext());
    }

    public final void q() {
        mo9 mo9Var = this.b;
        if (!((eua) mo9Var.a.getValue()).b(eua.l)) {
            mo9Var.g.g(bd0.a);
        } else {
            j47.T(mo9Var.f, null, null, new lo9(mo9Var, null), 3);
        }
    }
}
