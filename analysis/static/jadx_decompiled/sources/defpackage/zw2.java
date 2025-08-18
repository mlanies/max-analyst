package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zw2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zw2) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zw2 zw2Var = new zw2(2, continuation);
        zw2Var.Y = obj;
        return zw2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            on5 on5Var = (on5) this.Y;
            this.X = 1;
            if (on5Var.a(e5fVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
