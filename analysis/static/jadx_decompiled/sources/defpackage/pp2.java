package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pp2 extends ffe implements a66 {
    public final /* synthetic */ rq2 X;
    public final /* synthetic */ View Y;
    public final /* synthetic */ boolean Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pp2(rq2 rq2Var, View view, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = rq2Var;
        this.Y = view;
        this.Z = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pp2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pp2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        rq2 rq2Var = this.X;
        e52 e52Var = (e52) rq2Var.Y0.a.getValue();
        e5f e5fVar = e5f.a;
        if (e52Var == null) {
            return e5fVar;
        }
        boolean z = !e52Var.V((q33) rq2Var.x0.getValue());
        kl7 kl7VarL = j1e.l();
        if (rq2Var.w() && !e52Var.H() && this.Z) {
            kl7VarL.add(new tt3(xoc.J0, new eqe(yoc.N), new Integer(woc.n2), (Integer) null, 20));
        }
        boolean zM = e52Var.M();
        k92 k92Var = e52Var.b;
        if ((zM || k92Var.c != i92.c) && !e52Var.T() && !e52Var.L()) {
            kl7VarL.add(new tt3(xoc.H0, new eqe(yoc.M), new Integer(woc.O0), (Integer) null, 20));
        }
        if (!e52Var.S()) {
            kl7VarL.add(new tt3(z ? xoc.G0 : xoc.F0, new eqe(yoc.L), new Integer(z ? woc.w1 : woc.v1), (Integer) null, 20));
            if (!e52Var.I() || e52Var.c0()) {
                kl7VarL.add(new tt3(xoc.E0, new eqe(yoc.j), new Integer(woc.c), (Integer) null, 20));
            }
        }
        if (e52Var.I() && e52Var.a0()) {
            kl7VarL.add(new tt3(xoc.I0, new eqe(yoc.z), new Integer(woc.Z1), (Integer) null, 20));
        }
        kl7 kl7VarD = j1e.d(kl7VarL);
        kpa kpaVar = new kpa("chat_server_id", new Long(k92Var.a));
        uj3 uj3VarL = e52Var.l();
        pnf.o(rq2Var.b1, new dp2(kl7VarD, dy7.g(kpaVar, new kpa("contact_id", uj3VarL != null ? new Long(uj3VarL.n()) : null)), this.Y));
        return e5fVar;
    }
}
