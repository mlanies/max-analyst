package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class t62 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k72 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t62(k72 k72Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k72Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((t62) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new t62(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            k72 k72Var = this.Y;
            kld kldVar = k72Var.f;
            bc7[] bc7VarArr = k72.x;
            kl7 kl7VarL = j1e.l();
            o22 o22Var = (o22) k72Var.i.getValue();
            if ((o22Var != null ? o22Var.b : null) == n22.c) {
                kl7VarL.add(new tt3(sea.A0, new eqe(vea.N1), Integer.valueOf(wfa.U), Integer.valueOf(woc.O1), Integer.valueOf(wfa.P)));
            }
            tcb tcbVar = new tcb(j1e.d(kl7VarL));
            this.X = 1;
            if (kldVar.a(tcbVar, this) == tx3Var) {
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
