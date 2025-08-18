package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qj5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ float Y;
    public final /* synthetic */ iab Z;
    public final /* synthetic */ yj5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj5(iab iabVar, yj5 yj5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = iabVar;
        this.s0 = yj5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((qj5) n(Float.valueOf(((Number) obj).floatValue()), (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qj5 qj5Var = new qj5(this.Z, this.s0, continuation);
        qj5Var.Y = ((Number) obj).floatValue();
        return qj5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            pjc pjcVar = new pjc(new h8f(this.Y * 100.0f, this.s0.j, null));
            this.X = 1;
            if (((fab) this.Z).a.o(pjcVar, this) == tx3Var) {
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
