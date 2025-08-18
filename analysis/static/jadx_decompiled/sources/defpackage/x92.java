package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x92 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ka2 Y;
    public final /* synthetic */ int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x92(int i, ka2 ka2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ka2Var;
        this.Z = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x92) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x92(this.Z, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        rfb rfbVar;
        eqe eqeVar;
        rfb rfbVar2;
        tx3 tx3Var = tx3.a;
        switch (this.X) {
            case 0:
                od2.a0(obj);
                ka2 ka2Var = this.Y;
                wu4 wu4Var = (wu4) ka2Var.i.getValue();
                String str = wu4Var != null ? wu4Var.d : null;
                if (str == null) {
                    str = "";
                }
                e52 e52VarP = ka2Var.p();
                boolean z = e52VarP != null && e52VarP.c();
                int i = sea.r;
                kld kldVar = ka2Var.d;
                int i2 = this.Z;
                if (i2 == i) {
                    iv4 iv4VarC = ka2Var.c();
                    e52 e52VarP2 = ka2Var.p();
                    boolean z2 = e52VarP2 != null && e52VarP2.c();
                    iv4VarC.getClass();
                    gqe gqeVar = new gqe(vea.S, ys.m0(new Object[]{str}));
                    eqeVar = z2 ? new eqe(vea.Q) : null;
                    kl7 kl7VarL = j1e.l();
                    if (z2) {
                        kl7VarL.add(new mg3(sea.A, new eqe(vea.s0), 1, false));
                    }
                    kl7VarL.add(new mg3(sea.u, z2 ? new eqe(vea.R) : new eqe(vea.M), 1, false));
                    kl7VarL.add(new mg3(sea.s, new eqe(vea.N), 2, false));
                    rfb rfbVar3 = new rfb(gqeVar, eqeVar, j1e.d(kl7VarL));
                    this.X = 1;
                    if (kldVar.a(rfbVar3, this) == tx3Var) {
                        return tx3Var;
                    }
                } else if (i2 == sea.k) {
                    ka2Var.c().getClass();
                    rfb rfbVar4 = new rfb(new gqe(vea.D, ys.m0(new Object[]{str})), null, y53.M(new mg3(sea.m, new eqe(vea.B), 3, false), new mg3(sea.l, new eqe(vea.C), 2, false)));
                    this.X = 2;
                    if (kldVar.a(rfbVar4, this) == tx3Var) {
                        return tx3Var;
                    }
                } else if (i2 == sea.z) {
                    if (z) {
                        ka2Var.c().getClass();
                        rfbVar2 = new rfb(new eqe(vea.u0), new gqe(vea.t0, ys.m0(new Object[]{str})), y53.M(new mg3(sea.A, new eqe(vea.s0), 1, false), new mg3(sea.B, new eqe(vea.r0), 2, false)));
                    } else {
                        ka2Var.c().getClass();
                        rfbVar2 = new rfb(new eqe(vea.u0), new gqe(vea.t0, ys.m0(new Object[]{str})), y53.M(new mg3(sea.C, new eqe(vea.q0), 1, false), new mg3(sea.B, new eqe(vea.r0), 2, false)));
                    }
                    this.X = 3;
                    if (kldVar.a(rfbVar2, this) == tx3Var) {
                        return tx3Var;
                    }
                } else if (i2 == sea.n) {
                    iv4 iv4VarC2 = ka2Var.c();
                    e52 e52VarP3 = ka2Var.p();
                    boolean z3 = e52VarP3 != null && e52VarP3.c();
                    iv4VarC2.getClass();
                    gqe gqeVar2 = new gqe(vea.L, ys.m0(new Object[]{str}));
                    eqeVar = z3 ? new eqe(vea.J) : null;
                    kl7 kl7VarL2 = j1e.l();
                    if (z3) {
                        kl7VarL2.add(new mg3(sea.w, new eqe(vea.n0), 1, false));
                    }
                    kl7VarL2.add(new mg3(sea.q, z3 ? new eqe(vea.K) : new eqe(vea.E), 1, false));
                    kl7VarL2.add(new mg3(sea.o, new eqe(vea.F), 2, false));
                    rfb rfbVar5 = new rfb(gqeVar2, eqeVar, j1e.d(kl7VarL2));
                    this.X = 4;
                    if (kldVar.a(rfbVar5, this) == tx3Var) {
                        return tx3Var;
                    }
                } else if (i2 == sea.v) {
                    if (z) {
                        ka2Var.c().getClass();
                        rfbVar = new rfb(new eqe(vea.p0), new gqe(vea.o0, ys.m0(new Object[]{str})), y53.M(new mg3(sea.w, new eqe(vea.n0), 1, false), new mg3(sea.x, new eqe(vea.m0), 2, false)));
                    } else {
                        ka2Var.c().getClass();
                        rfbVar = new rfb(new eqe(vea.p0), new gqe(vea.o0, ys.m0(new Object[]{str})), y53.M(new mg3(sea.y, new eqe(vea.l0), 1, false), new mg3(sea.x, new eqe(vea.m0), 2, false)));
                    }
                    this.X = 5;
                    if (kldVar.a(rfbVar, this) == tx3Var) {
                        return tx3Var;
                    }
                } else if (i2 == sea.h) {
                    ka2Var.c().getClass();
                    rfb rfbVar6 = new rfb(new gqe(vea.A, ys.m0(new Object[]{str})), new eqe(vea.z), y53.M(new mg3(sea.j, new eqe(vea.x), 1, false), new mg3(sea.i, new eqe(vea.y), 2, false)));
                    this.X = 6;
                    if (kldVar.a(rfbVar6, this) == tx3Var) {
                        return tx3Var;
                    }
                } else {
                    int i3 = sea.E;
                    long j = ka2Var.n;
                    if (i2 == i3) {
                        gfb.c.getClass();
                        c64 c64Var = new c64(":profile/member_permissions?id=" + j);
                        this.X = 7;
                        if (kldVar.a(c64Var, this) == tx3Var) {
                            return tx3Var;
                        }
                    } else if (i2 == sea.g) {
                        ifb ifbVar = new ifb(j, reb.c);
                        this.X = 8;
                        if (kldVar.a(ifbVar, this) == tx3Var) {
                            return tx3Var;
                        }
                    } else if (i2 == sea.h0) {
                        lfb lfbVar = new lfb(j);
                        this.X = 9;
                        if (kldVar.a(lfbVar, this) == tx3Var) {
                            return tx3Var;
                        }
                    } else if (i2 == sea.D) {
                        gfb.c.getClass();
                        c64 c64Var2 = new c64(":profile/change-owner?chat_id=" + j + "&leave_chat=false");
                        this.X = 10;
                        if (kldVar.a(c64Var2, this) == tx3Var) {
                            return tx3Var;
                        }
                    }
                }
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                od2.a0(obj);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return e5f.a;
    }
}
