package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qjb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ zjb Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qjb(long j, zjb zjbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = zjbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qjb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qjb(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            if (this.Y == sea.p0) {
                wha whaVar = (wha) this.Z.Y.getValue();
                whaVar.g(new eqe(vea.G1));
                whaVar.i();
            }
            this.X = 1;
            if (j47.x(250L, this) == tx3Var) {
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
