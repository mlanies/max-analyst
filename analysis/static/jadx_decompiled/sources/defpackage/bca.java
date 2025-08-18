package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bca extends ffe implements a66 {
    public int X;
    public final /* synthetic */ eca Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bca(eca ecaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ecaVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((bca) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bca(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            na9 na9Var = (na9) this.Y.b.getValue();
            this.X = 1;
            obj = na9Var.d(this);
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
