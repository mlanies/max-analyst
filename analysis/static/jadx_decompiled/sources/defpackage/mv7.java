package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class mv7 extends pnf {
    public static final /* synthetic */ bc7[] v0;
    public final q0e Y;
    public final LinkedBlockingQueue Z;
    public final uca b;
    public final kke c;
    public final q0e s0;
    public final w4d t0;
    public z87 u0;
    public final khe o = new khe(new vu7(this, 0));
    public final LinkedBlockingQueue X = new LinkedBlockingQueue(1);

    static {
        oi9 oi9Var = new oi9(mv7.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        v0 = new bc7[]{oi9Var};
    }

    public mv7(uca ucaVar, kke kkeVar) {
        this.b = ucaVar;
        this.c = kkeVar;
        nz4 nz4Var = nz4.a;
        this.Y = r0e.a(nz4Var);
        this.Z = new LinkedBlockingQueue(1);
        this.s0 = r0e.a(nz4Var);
        this.t0 = mqd.D();
        y77 y77VarA = pag.a();
        y77VarA.H();
        this.u0 = y77VarA;
        pnf.n(this, ((w9a) kkeVar).b(), null, new av7(this, null), 2);
        q();
    }

    public final void q() {
        if (this.u0.isCompleted()) {
            x77 x77Var = (x77) this.t0.T0(this, v0[0]);
            kke kkeVar = this.c;
            ContextScope contextScope = this.a;
            this.u0 = (x77Var == null || !x77Var.isActive()) ? j47.T(contextScope, ((w9a) kkeVar).b(), null, new fv7(this, null), 2) : j47.T(contextScope, ((w9a) kkeVar).b(), null, new ev7(this, null), 2);
        }
    }
}
