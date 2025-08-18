package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gf1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ of1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf1(of1 of1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = of1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gf1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new gf1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            of1 of1Var = this.Y;
            w7c w7cVar = ((cra) of1Var.o).w0;
            ff1 ff1Var = new ff1(of1Var, null);
            this.X = 1;
            if (od2.r(w7cVar, ff1Var, this) == tx3Var) {
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
