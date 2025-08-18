package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class un5 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ xa3 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un5(mn5 mn5Var, y77 y77Var, Continuation continuation) {
        super(2, continuation);
        this.Z = mn5Var;
        this.s0 = y77Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((un5) n((iab) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        un5 un5Var = new un5(this.Z, (y77) this.s0, continuation);
        un5Var.Y = obj;
        return un5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            tn5 tn5Var = new tn5((iab) this.Y, 0);
            this.X = 1;
            if (this.Z.d(tn5Var, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        ((y77) this.s0).H();
        return e5f.a;
    }
}
