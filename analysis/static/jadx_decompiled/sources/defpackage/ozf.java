package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ozf extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ozf) n((cpa) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ozf ozfVar = new ozf(2, continuation);
        ozfVar.Y = obj;
        return ozfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        cpa cpaVar;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            cpa cpaVar2 = (cpa) this.Y;
            if (cpaVar2 != cpa.b) {
                return cpaVar2;
            }
            this.Y = cpaVar2;
            this.X = 1;
            if (j47.x(600L, this) == tx3Var) {
                return tx3Var;
            }
            cpaVar = cpaVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cpaVar = (cpa) this.Y;
            od2.a0(obj);
        }
        return cpaVar;
    }
}
