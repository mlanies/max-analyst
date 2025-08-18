package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ba7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ c8d Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba7(c8d c8dVar, Continuation continuation) {
        super(2, continuation);
        this.Z = c8dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ba7) n((z97) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ba7 ba7Var = new ba7(this.Z, continuation);
        ba7Var.Y = obj;
        return ba7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            z97 z97Var = (z97) this.Y;
            zt0 zt0Var = (zt0) this.Z.o;
            this.X = 1;
            if (zt0Var.o(z97Var, this) == tx3Var) {
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
