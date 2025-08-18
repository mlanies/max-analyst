package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y1g extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ f2g Z;
    public final /* synthetic */ v1g s0;
    public final /* synthetic */ i1g t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1g(i1g i1gVar, v1g v1gVar, f2g f2gVar, Continuation continuation) {
        super(2, continuation);
        this.Z = f2gVar;
        this.s0 = v1gVar;
        this.t0 = i1gVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((y1g) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        y1g y1gVar = new y1g(this.t0, this.s0, this.Z, continuation);
        y1gVar.Y = obj;
        return y1gVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Throwable th = (Throwable) this.Y;
            f2g f2gVar = this.Z;
            f2gVar.getClass();
            ga7 ga7VarF = f2g.f(th);
            y83 y83VarG = f2gVar.g();
            String str = this.t0.b;
            this.X = 1;
            if (y83VarG.a(f2gVar.e, ga7VarF, this.s0, str, this) == tx3Var) {
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
