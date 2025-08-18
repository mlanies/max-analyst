package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rq0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uq0 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rq0(uq0 uq0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = uq0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rq0) n((zs2) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new rq0(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = uq0.a(this.Y, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
