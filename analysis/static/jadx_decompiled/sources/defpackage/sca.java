package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sca extends ffe implements a66 {
    public int X;
    public final /* synthetic */ uca Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sca(uca ucaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ucaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sca) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sca(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = this.Y.k(this);
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
