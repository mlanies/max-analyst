package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w95 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ x95 Y;
    public final /* synthetic */ v95 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w95(x95 x95Var, Continuation continuation) {
        super(2, continuation);
        v95 v95Var = v95.a;
        this.Y = x95Var;
        this.Z = v95Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((w95) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new w95(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.b;
            this.X = 1;
            if (kldVar.a(this.Z, this) == tx3Var) {
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
