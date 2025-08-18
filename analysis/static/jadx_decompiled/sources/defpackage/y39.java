package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y39 extends ffe implements a66 {
    public final /* synthetic */ n59 X;
    public final /* synthetic */ ej7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y39(n59 n59Var, ej7 ej7Var, Continuation continuation) {
        super(2, continuation);
        this.X = n59Var;
        this.Y = ej7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        y39 y39Var = (y39) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        y39Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new y39(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        n59 n59Var = this.X;
        rg1 rg1Var = n59Var.c;
        ej7 ej7Var = this.Y;
        rg1Var.j(((aj7) ej7Var).a, true, false, false, new yf3(n59Var, 19, ej7Var));
        return e5f.a;
    }
}
