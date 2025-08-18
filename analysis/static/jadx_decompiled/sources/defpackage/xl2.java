package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xl2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ Set Z;
    public final /* synthetic */ cm2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl2(xs xsVar, cm2 cm2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = xsVar;
        this.s0 = cm2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xl2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xl2 xl2Var = new xl2((xs) this.Z, this.s0, continuation);
        xl2Var.Y = obj;
        return xl2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            StringBuilder sb = new StringBuilder("getFcmHistory: chats=");
            Set set = this.Z;
            sb.append(set);
            hm9.n("cm2", sb.toString());
            if (set.isEmpty()) {
                return lz4.a;
            }
            mqc mqcVar = new mqc(new wl2(this.s0, set, null));
            this.X = 1;
            ty tyVarJ = i24.j(mqcVar, 1);
            ua3 ua3VarA = ngg.a();
            j47.T(sx3Var, (lx3) tyVarJ.o, null, new jq5((mn5) tyVarJ.c, ua3VarA, null), 2);
            obj = ua3VarA.awaitInternal(this);
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
