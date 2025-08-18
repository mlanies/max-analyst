package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y62 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ k72 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y62(int i, k72 k72Var, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = k72Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((y62) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new y62(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            if (this.Y == sea.A0) {
                kld kldVar = this.Z.f;
                bc7[] bc7VarArr = k72.x;
                scb scbVar = new scb(new eqe(vea.y2), new eqe(vea.x2), y53.M(new mg3(sea.E0, new eqe(vea.u2), 3, false), new mg3(sea.e, new eqe(vea.v2), 2, false)));
                this.X = 1;
                if (kldVar.a(scbVar, this) == tx3Var) {
                    return tx3Var;
                }
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
