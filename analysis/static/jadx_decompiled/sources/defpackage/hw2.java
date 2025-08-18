package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final /* synthetic */ class hw2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nx2 b;
    public final /* synthetic */ long c;

    public /* synthetic */ hw2(nx2 nx2Var, long j, int i) {
        this.a = i;
        this.b = nx2Var;
        this.c = j;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        vx3 vx3Var = vx3.c;
        int i = 0;
        int i2 = 1;
        e5f e5fVar = e5f.a;
        long j = this.c;
        nx2 nx2Var = this.b;
        yha yhaVar = (yha) obj;
        switch (this.a) {
            case 0:
                int iOrdinal = yhaVar.ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    j47.S(nx2Var.a, ((w9a) nx2Var.Y).b().plus(xq9.a), vx3Var, new lx2(nx2Var, j, null));
                } else if (iOrdinal == 3) {
                    nx2Var.getClass();
                    pnf.o(nx2Var.P0, new cnd(new eqe(r8a.t), new hw2(nx2Var, j, i)));
                }
                return e5fVar;
            case 1:
                int iOrdinal2 = yhaVar.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    j47.S(nx2Var.a, ((w9a) nx2Var.Y).b().plus(xq9.a), vx3Var, new lx2(nx2Var, j, null));
                    zfc.a((zfc) nx2Var.Z.getValue(), j);
                } else if (iOrdinal2 != 2) {
                    if (iOrdinal2 == 3) {
                        nx2Var.getClass();
                        pnf.o(nx2Var.P0, new cnd(new eqe(r8a.s), new hw2(nx2Var, j, i2)));
                    } else if (iOrdinal2 != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return e5fVar;
            default:
                if (yhaVar != yha.X) {
                    bc7[] bc7VarArr = nx2.X0;
                    ((s8g) nx2Var.E0.getValue()).a(new g8d(j, false));
                }
                return e5fVar;
        }
    }
}
