package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class j9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ k9 Z;
    public final /* synthetic */ Set s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9(int i, k9 k9Var, Set set, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = k9Var;
        this.s0 = set;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new j9(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        k9 k9Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            boolean z = this.Y == wea.j;
            bc7[] bc7VarArr = k9.i;
            iy2 iy2Var = (iy2) k9Var.b.getValue();
            List listD0 = x53.D0(this.s0);
            this.X = 1;
            if (((jz2) iy2Var).e(k9Var.a, listD0, this, z) == tx3Var) {
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
        kld kldVar = k9Var.e;
        g43 g43Var = g43.b;
        this.X = 2;
        if (kldVar.a(g43Var, this) == tx3Var) {
            return tx3Var;
        }
        return e5f.a;
    }
}
