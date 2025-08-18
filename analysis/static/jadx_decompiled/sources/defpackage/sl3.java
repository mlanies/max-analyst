package defpackage;

import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sl3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ jm3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl3(int i, jm3 jm3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = jm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sl3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sl3(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i;
        tx3 tx3Var = tx3.a;
        int i2 = this.X;
        e5f e5fVar = e5f.a;
        if (i2 == 0) {
            od2.a0(obj);
            jm3 jm3Var = this.Z;
            int i3 = this.Y;
            if (i3 == 256) {
                j47.T(jm3Var.a, ((w9a) jm3Var.q()).b(), null, new wl3(jm3Var, false, null), 2);
            } else if (i3 == 128) {
                this.X = 1;
                if (jm3.n(jm3Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else if (i3 == sea.e0) {
                this.X = 2;
                if (jm3.n(jm3Var, this) == tx3Var) {
                    return tx3Var;
                }
            } else if (i3 == 64) {
                this.X = 3;
                kld kldVar = jm3Var.d;
                jm3Var.c().getClass();
                eqe eqeVar = new eqe(vea.h0);
                kl7 kl7VarL = j1e.l();
                Iterator it = hv4.a.iterator();
                while (true) {
                    u1 u1Var = (u1) it;
                    if (u1Var.hasNext()) {
                        faf fafVar = (faf) u1Var.next();
                        int iOrdinal = fafVar.ordinal();
                        if (iOrdinal == 0) {
                            i = sea.b;
                        } else if (iOrdinal == 1) {
                            i = sea.c;
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = sea.d;
                        }
                        kl7VarL.add(new mg3(i, new aqe(uea.a, fafVar.b), 2, false));
                    } else {
                        Object objA = kldVar.a(new rfb(eqeVar, null, j1e.d(kl7VarL)), this);
                        if (objA != tx3Var) {
                            objA = e5fVar;
                        }
                        if (objA == tx3Var) {
                            return tx3Var;
                        }
                    }
                }
            } else if (i3 == 512) {
                this.X = 4;
                kld kldVar2 = jm3Var.d;
                iv4 iv4VarC = jm3Var.c();
                boolean zQ = ((wr1) ((kr1) jm3Var.u.getValue())).q();
                iv4VarC.getClass();
                eqe eqeVar2 = new eqe(vea.z0);
                eqe eqeVar3 = zQ ? new eqe(vea.x0) : null;
                kl7 kl7VarL2 = j1e.l();
                kl7VarL2.add(new mg3(sea.k0, zQ ? new eqe(vea.w0) : new eqe(vea.y0), 1, false));
                kl7VarL2.add(new mg3(sea.e, new eqe(vea.E0), 2, false));
                Object objA2 = kldVar2.a(new rfb(eqeVar2, eqeVar3, j1e.d(kl7VarL2)), this);
                if (objA2 != tx3Var) {
                    objA2 = e5fVar;
                }
                if (objA2 == tx3Var) {
                    return tx3Var;
                }
            } else if (i3 == sea.v0) {
                kld kldVar3 = jm3Var.d;
                ifb ifbVar = new ifb(jm3Var.n, reb.o);
                this.X = 5;
                if (kldVar3.a(ifbVar, this) == tx3Var) {
                    return tx3Var;
                }
            }
        } else {
            if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4 && i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
