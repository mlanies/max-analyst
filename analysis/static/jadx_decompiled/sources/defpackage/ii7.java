package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ii7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ki7 Y;
    public final /* synthetic */ hi7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii7(ki7 ki7Var, hi7 hi7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ki7Var;
        this.Z = hi7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ii7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ii7(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            kld kldVar = this.Y.a;
            hi7 hi7Var = this.Z;
            ci7 ci7Var = new ci7(hi7Var.a, hi7Var.b, new Long(hi7Var.c), hi7Var.o, hi7Var.X, hi7Var.Y, hi7Var.Z, hi7Var.s0);
            this.X = 1;
            if (kldVar.a(ci7Var, this) == tx3Var) {
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
