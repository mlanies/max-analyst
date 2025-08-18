package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ju2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ju2) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ju2 ju2Var = new ju2(2, continuation);
        ju2Var.Y = obj;
        return ju2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            on5 on5Var = (on5) this.Y;
            ht2 ht2Var = ht2.a;
            this.X = 1;
            if (on5Var.a(ht2Var, this) == tx3Var) {
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
