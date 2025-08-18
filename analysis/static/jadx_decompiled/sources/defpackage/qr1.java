package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qr1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ wr1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr1(wr1 wr1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = wr1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qr1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new qr1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
            return e5fVar;
        }
        od2.a0(obj);
        wr1 wr1Var = this.Y;
        kld kldVar = ((cs1) wr1Var.q.getValue()).a;
        xw xwVar = new xw(4, wr1Var);
        this.X = 1;
        kldVar.d(new tk1(xwVar, 10), this);
        return tx3Var;
    }
}
