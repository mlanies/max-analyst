package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cmc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;
    public final /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmc(hmc hmcVar, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = hmcVar;
        this.Z = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((cmc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new cmc(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            s1e s1eVarA = this.Y.a();
            List<ps7> list = this.Z;
            ArrayList arrayList = new ArrayList(z53.S(list, 10));
            for (ps7 ps7Var : list) {
                arrayList.add(new c0e(ps7Var.c, ps7Var.b, ps7Var.X, ps7Var.o));
            }
            this.X = 1;
            s1eVarA.getClass();
            if (ote.j(s1eVarA.a, new q1e(s1eVarA, arrayList, 1), this) == tx3Var) {
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
