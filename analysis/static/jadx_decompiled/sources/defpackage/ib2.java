package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ib2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ zb2 Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ Set s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib2(zb2 zb2Var, List list, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = zb2Var;
        this.Z = list;
        this.s0 = set;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ib2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ib2(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            String str = zb2.K0;
            alc alcVarE = this.Y.e();
            this.X = 1;
            alcVarE.getClass();
            if (z04.e0(alcVarE.a, new lr1(alcVarE, this.Z, this.s0, 11), this) == tx3Var) {
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
