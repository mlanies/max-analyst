package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rvf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ vvf Z;
    public final /* synthetic */ evf s0;
    public final /* synthetic */ btf t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvf(btf btfVar, evf evfVar, vvf vvfVar, Continuation continuation) {
        super(2, continuation);
        this.Z = vvfVar;
        this.s0 = evfVar;
        this.t0 = btfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rvf) n((Throwable) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rvf rvfVar = new rvf(this.t0, this.s0, this.Z, continuation);
        rvfVar.Y = obj;
        return rvfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            Throwable th = (Throwable) this.Y;
            List list = vvf.i;
            vvf vvfVar = this.Z;
            vvfVar.getClass();
            ga7 ga7VarF = vvf.f(th);
            y83 y83VarG = vvfVar.g();
            String str = this.t0.b;
            this.X = 1;
            if (y83VarG.a(vvfVar.g, ga7VarF, this.s0, str, this) == tx3Var) {
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
