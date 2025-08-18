package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gr1 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gh3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr1(gh3 gh3Var, Continuation continuation) {
        super(2, continuation);
        this.Z = gh3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gr1) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gr1 gr1Var = new gr1(this.Z, continuation);
        gr1Var.Y = obj;
        return gr1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            iab iabVar = (iab) this.Y;
            gh3 gh3Var = this.Z;
            khe kheVar = new khe(new x2(gh3Var, 18, iabVar));
            fab fabVar = (fab) iabVar;
            fabVar.n(gh3Var.d() ? u9f.a : u9f.b);
            gh3Var.c((fh3) kheVar.getValue());
            x2 x2Var = new x2(gh3Var, 19, kheVar);
            this.X = 1;
            if (j47.j(fabVar, x2Var, this) == tx3Var) {
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
