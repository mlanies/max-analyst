package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aa2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ka2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa2(ka2 ka2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ka2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((aa2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new aa2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = ka2.E;
            ka2 ka2Var = this.Y;
            ((jz2) ((iy2) ka2Var.r.getValue())).l().Q(ka2Var.n);
            kld kldVar = ka2Var.d;
            nfb nfbVar = nfb.b;
            this.X = 1;
            if (kldVar.a(nfbVar, this) == tx3Var) {
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
