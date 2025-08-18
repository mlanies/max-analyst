package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class az3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cz3 Y;
    public final /* synthetic */ h32 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public az3(cz3 cz3Var, h32 h32Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cz3Var;
        this.Z = h32Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((az3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new az3(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            h32 h32Var = this.Z;
            yy3 yy3Var = new yy3(h32Var.a, h32Var.b);
            this.X = 1;
            if (kldVar.a(yy3Var, this) == tx3Var) {
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
