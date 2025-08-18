package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hw5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ iw5 Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw5(iw5 iw5Var, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.Y = iw5Var;
        this.Z = str;
        this.s0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hw5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hw5(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            ta2 ta2Var = this.Y.b;
            this.X = 1;
            zb2 zb2Var = (zb2) ta2Var;
            zb2Var.getClass();
            Object objT0 = j47.t0(zb2Var.Y, new kb2(zb2Var, this.Z, this.s0, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
