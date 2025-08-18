package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class we2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ye2 Y;
    public final /* synthetic */ gs9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we2(ye2 ye2Var, gs9 gs9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ye2Var;
        this.Z = gs9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((we2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new we2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pk pkVar = (pk) this.Y.Z.getValue();
            this.X = 1;
            obj = ((k4a) pkVar).J(this.Z, this);
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
