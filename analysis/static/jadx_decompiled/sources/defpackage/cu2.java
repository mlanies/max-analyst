package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cu2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ pu2 Y;
    public final /* synthetic */ it2 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu2(pu2 pu2Var, it2 it2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = pu2Var;
        this.Z = it2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cu2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cu2(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            gt2 gt2Var = (gt2) this.Z;
            this.X = 1;
            if (pu2.a(this.Y, gt2Var, this) == tx3Var) {
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
