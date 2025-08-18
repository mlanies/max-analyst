package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j72 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ k72 Y;
    public final /* synthetic */ String Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j72(k72 k72Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = k72Var;
        this.Z = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j72) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j72(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.q;
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
