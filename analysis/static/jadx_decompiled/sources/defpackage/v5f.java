package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v5f extends ffe implements a66 {
    public int X;
    public final /* synthetic */ w5f Y;
    public final /* synthetic */ e52 Z;
    public final /* synthetic */ k56 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5f(w5f w5fVar, e52 e52Var, k56 k56Var, Continuation continuation) {
        super(2, continuation);
        this.Y = w5fVar;
        this.Z = e52Var;
        this.s0 = k56Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v5f) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new v5f(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.Y.g = false;
            w5f w5fVar = this.Y;
            e52 e52Var = this.Z;
            l29 l29Var = (l29) w5fVar.b.getValue();
            this.X = 1;
            if (w5fVar.a(e52Var, l29Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        this.s0.invoke();
        return e5f.a;
    }
}
