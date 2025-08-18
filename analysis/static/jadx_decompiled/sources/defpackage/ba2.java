package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ba2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ ka2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba2(int i, ka2 ka2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = ka2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ba2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ba2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        switch (i) {
            case 0:
                od2.a0(obj);
                int i2 = sea.u;
                ka2 ka2Var = this.Z;
                int i3 = this.Y;
                if (i3 == i2) {
                    e52 e52VarP = ka2Var.p();
                    if (e52VarP == null || !e52VarP.c()) {
                        this.X = 2;
                        ka2.n(ka2Var);
                        if (e5fVar == tx3Var) {
                            return tx3Var;
                        }
                    } else {
                        kld kldVar = ka2Var.d;
                        ka2Var.c().getClass();
                        rfb rfbVar = new rfb(new eqe(vea.P), null, y53.M(new mg3(sea.t, new eqe(vea.O), 1, false), new mg3(sea.s, new eqe(vea.N), 2, false)));
                        this.X = 1;
                        if (kldVar.a(rfbVar, this) == tx3Var) {
                            return tx3Var;
                        }
                    }
                } else if (i3 == sea.q) {
                    e52 e52VarP2 = ka2Var.p();
                    if (e52VarP2 == null || !e52VarP2.c()) {
                        this.X = 4;
                        ka2.n(ka2Var);
                        if (e5fVar == tx3Var) {
                            return tx3Var;
                        }
                    } else {
                        kld kldVar2 = ka2Var.d;
                        ka2Var.c().getClass();
                        rfb rfbVar2 = new rfb(new eqe(vea.I), new eqe(vea.H), y53.M(new mg3(sea.p, new eqe(vea.G), 1, false), new mg3(sea.o, new eqe(vea.F), 2, false)));
                        this.X = 3;
                        if (kldVar2.a(rfbVar2, this) == tx3Var) {
                            return tx3Var;
                        }
                    }
                } else if (i3 == sea.t || i3 == sea.p) {
                    this.X = 5;
                    ka2.n(ka2Var);
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i3 == sea.m || i3 == sea.j) {
                    this.X = 6;
                    bc7[] bc7VarArr = ka2.E;
                    Object objT0 = j47.t0(((w9a) ka2Var.q()).b(), new y92(ka2Var, null), this);
                    if (objT0 != tx3Var) {
                        objT0 = e5fVar;
                    }
                    if (objT0 == tx3Var) {
                        return tx3Var;
                    }
                } else if (i3 == sea.C || i3 == sea.y) {
                    this.X = 7;
                    bc7[] bc7VarArr2 = ka2.E;
                    ka2Var.y.o1(ka2Var, ka2.E[0], j47.S(ka2Var.a, ((w9a) ka2Var.q()).b(), vx3.b, new aa2(ka2Var, null)));
                    if (e5fVar == tx3Var) {
                        return tx3Var;
                    }
                } else if (i3 == sea.A || i3 == sea.w) {
                    kld kldVar3 = ka2Var.d;
                    gfb.c.getClass();
                    c64 c64Var = new c64(":profile/change-owner?chat_id=" + ka2Var.n + "&leave_chat=true");
                    this.X = 8;
                    if (kldVar3.a(c64Var, this) == tx3Var) {
                        return tx3Var;
                    }
                }
                return e5fVar;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                od2.a0(obj);
                return e5fVar;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
