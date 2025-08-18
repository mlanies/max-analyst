package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class at0 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ix Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(ix ixVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ixVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((at0) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new at0(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 2;
        tx3 tx3Var = tx3.a;
        int i2 = this.X;
        if (i2 == 0) {
            od2.a0(obj);
            ix ixVar = this.Y;
            long j = ixVar.a;
            zn5 zn5Var = new zn5(od2.F(od2.N((kld) ixVar.j, new mqc(new vs0(j, null)), (kld) ixVar.i), (nx3) ixVar.d), new ys0(ixVar, null));
            xw xwVar = new xw(i, ixVar);
            this.X = 1;
            if (zn5Var.d(xwVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
