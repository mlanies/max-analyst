package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cq2 extends ffe implements a66 {
    public final /* synthetic */ rq2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq2(rq2 rq2Var, Continuation continuation) {
        super(2, continuation);
        this.X = rq2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cq2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cq2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        rq2 rq2Var = this.X;
        e52 e52Var = (e52) rq2Var.Y0.a.getValue();
        e5f e5fVar = e5f.a;
        if (e52Var != null) {
            long j = e52Var.b.a;
            sna snaVar = (sna) rq2Var.I0.getValue();
            snaVar.getClass();
            if (j != 0) {
                snaVar.f(j, b10.STICKER, 0L);
            }
        }
        return e5fVar;
    }
}
