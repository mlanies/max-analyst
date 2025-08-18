package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class nk1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ el1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk1(el1 el1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = el1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nk1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nk1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            el1 el1Var = this.Y;
            ac acVarT = od2.t(el1Var.C0, el1Var.w0, el1Var.D0, new mk1(el1Var, null, 0));
            this.X = 1;
            if (od2.q(acVarT, this) == tx3Var) {
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
