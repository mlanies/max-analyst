package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ gw2 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw2(gw2 gw2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = gw2Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cw2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        gw2 gw2Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            el3 el3Var = ((ds3) gw2Var.w0.getValue()).a;
            el3Var.getClass();
            long j = this.Z;
            cqc.a(new i82(el3Var, j, 1), el3Var.m, null, new un0(26), null);
            iy2 iy2VarS = gw2Var.s();
            this.X = 1;
            obj = ((jz2) iy2VarS).u(j, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        e52 e52Var = (e52) obj;
        if (e52Var != null) {
            pnf.o(gw2Var.H0, gy2.a2(gy2.c, e52Var.a));
        }
        return e5f.a;
    }
}
