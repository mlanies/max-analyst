package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class emc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;
    public final /* synthetic */ m56 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public emc(hmc hmcVar, k5d k5dVar, Continuation continuation) {
        super(2, continuation);
        this.Y = hmcVar;
        this.Z = k5dVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((emc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new emc(this.Y, (k5d) this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            hmc hmcVar = this.Y;
            ilc ilcVarM = hmcVar.b.m();
            m44 m44Var = new m44(hmcVar, (k5d) this.Z, null, 2);
            this.X = 1;
            if (z04.e0(ilcVarM, m44Var, this) == tx3Var) {
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
