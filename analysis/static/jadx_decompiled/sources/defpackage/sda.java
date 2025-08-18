package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sda extends ffe implements a66 {
    public int X;
    public final /* synthetic */ tda Y;
    public final /* synthetic */ uj3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sda(tda tdaVar, uj3 uj3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = tdaVar;
        this.Z = uj3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((sda) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new sda(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gt9 gt9VarA = this.Y.a();
            this.X = 1;
            obj = gt9VarA.c(this.Z, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return obj;
    }
}
