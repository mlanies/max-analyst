package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ea2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ka2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea2(ka2 ka2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ka2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ea2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ea2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        rfb rfbVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            ka2 ka2Var = this.Y;
            boolean z = ka2Var.B;
            q0e q0eVar = ka2Var.b;
            if (z) {
                iv4 iv4VarC = ka2Var.c();
                meb mebVar = (meb) q0eVar.getValue();
                boolean z2 = (mebVar == null || mebVar.a == null) ? false : true;
                iv4VarC.getClass();
                eqe eqeVar = new eqe(vea.l);
                kl7 kl7VarL = j1e.l();
                kl7VarL.add(new mg3(sea.a0, new eqe(vea.s), 3, false));
                kl7VarL.add(new mg3(sea.Z, new eqe(vea.r), 3, false));
                if (z2) {
                    kl7VarL.add(new mg3(sea.X, new eqe(vea.o), 1, false));
                }
                kl7VarL.add(new mg3(sea.W, new eqe(vea.k), 2, false));
                rfbVar = new rfb(eqeVar, null, j1e.d(kl7VarL));
            } else {
                iv4 iv4VarC2 = ka2Var.c();
                meb mebVar2 = (meb) q0eVar.getValue();
                boolean z3 = (mebVar2 == null || mebVar2.a == null) ? false : true;
                iv4VarC2.getClass();
                eqe eqeVar2 = new eqe(vea.m);
                kl7 kl7VarL2 = j1e.l();
                kl7VarL2.add(new mg3(sea.a0, new eqe(vea.s), 3, false));
                kl7VarL2.add(new mg3(sea.Z, new eqe(vea.r), 3, false));
                if (z3) {
                    kl7VarL2.add(new mg3(sea.X, new eqe(vea.o), 1, false));
                }
                kl7VarL2.add(new mg3(sea.W, new eqe(vea.k), 2, false));
                rfbVar = new rfb(eqeVar2, null, j1e.d(kl7VarL2));
            }
            kld kldVar = ka2Var.d;
            this.X = 1;
            if (kldVar.a(rfbVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
