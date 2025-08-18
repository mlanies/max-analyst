package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oo5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ mn5 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo5(long j, mn5 mn5Var, Continuation continuation) {
        super(2, continuation);
        this.Z = j;
        this.s0 = mn5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((oo5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oo5 oo5Var = new oo5(this.Z, this.s0, continuation);
        oo5Var.Y = obj;
        return oo5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iabVar = (iab) this.Y;
            no5 no5Var = new no5(this.Z, this.s0, iabVar, null);
            this.X = 1;
            if (j1e.k(no5Var, this) == tx3Var) {
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
