package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g5g extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ a66 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5g(a66 a66Var, Continuation continuation) {
        super(2, continuation);
        this.Z = a66Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((g5g) n(obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        g5g g5gVar = new g5g(this.Z, continuation);
        g5gVar.Y = obj;
        return g5gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Object obj2 = this.Y;
            this.X = 1;
            if (this.Z.invoke(obj2, this) == tx3Var) {
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
