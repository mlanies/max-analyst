package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class np2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ rq2 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np2(rq2 rq2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = rq2Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((np2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new np2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            rq2 rq2Var = this.Y;
            ((jz2) rq2Var.X).l().Q(this.Z);
            x95 x95Var = rq2Var.c;
            x95Var.a.f(x95Var);
            kld kldVar = rq2Var.a1;
            g43 g43Var = g43.b;
            this.X = 1;
            if (kldVar.a(g43Var, this) == tx3Var) {
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
