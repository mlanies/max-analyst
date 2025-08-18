package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ceb extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ feb s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceb(j31 j31Var, Continuation continuation, feb febVar) {
        super(2, continuation);
        this.Z = j31Var;
        this.s0 = febVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ceb) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ceb cebVar = new ceb((j31) this.Z, continuation, this.s0);
        cebVar.Y = obj;
        return cebVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            beb bebVar = new beb((on5) this.Y, this.s0, 0);
            this.X = 1;
            if (this.Z.d(bebVar, this) == tx3Var) {
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
