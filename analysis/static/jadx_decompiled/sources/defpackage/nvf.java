package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nvf extends ffe implements a66 {
    public int X;
    public final /* synthetic */ vvf Y;
    public final /* synthetic */ yvf Z;
    public final /* synthetic */ evf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvf(evf evfVar, vvf vvfVar, yvf yvfVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vvfVar;
        this.Z = yvfVar;
        this.s0 = evfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nvf) n((e5f) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new nvf(this.s0, this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        evf evfVar = this.s0;
        vvf vvfVar = this.Y;
        if (i == 0) {
            od2.a0(obj);
            ja7 ja7Var = vvfVar.a;
            xbe xbeVar = new xbe(wbe.X, this.Z.b);
            ja7Var.getClass();
            x97 x97Var = new x97(evfVar.a, ja7Var.b(xbe.Companion.serializer(), xbeVar));
            this.X = 1;
            if (vvfVar.g.o(x97Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        vvf.e(vvfVar, evfVar.a);
        return e5f.a;
    }
}
