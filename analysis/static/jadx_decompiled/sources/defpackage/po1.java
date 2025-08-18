package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class po1 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ so1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public po1(so1 so1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = so1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((po1) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new po1(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            this.X = 1;
            obj = so1.a(this.Y, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        uj3 uj3Var = (uj3) obj;
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        if (strD == null) {
            strD = "";
        }
        return new baf(jN, strD, uj3Var.m(), uj3Var.w(), uj3Var.p(kk0.o));
    }
}
