package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j49 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ List Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j49(n59 n59Var, List list, Continuation continuation) {
        super(2, continuation);
        this.Y = n59Var;
        this.Z = list;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j49) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j49(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        n59 n59Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            u79 u79Var = (u79) n59Var.H0.getValue();
            long j = n59Var.b.a;
            this.X = 1;
            obj = u79Var.b(j, this.Z, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                od2.a0(obj);
                return e5f.a;
            }
            od2.a0(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            cx7 cx7VarC = ((w9a) n59Var.Y).c();
            i49 i49Var = new i49(n59Var, null);
            this.X = 2;
            if (j47.t0(cx7VarC, i49Var, this) == tx3Var) {
                return tx3Var;
            }
        }
        return e5f.a;
    }
}
