package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ct5 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ et5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct5(et5 et5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = et5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ct5) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ct5(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            et5 et5Var = this.Y;
            zn5 zn5VarB = et5Var.c.b();
            kld kldVar = et5Var.a;
            this.X = 1;
            if (zn5VarB.d(kldVar, this) == tx3Var) {
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
