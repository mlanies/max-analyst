package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p39 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ n59 Y;
    public final /* synthetic */ da3 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p39(n59 n59Var, da3 da3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n59Var;
        this.Z = da3Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((p39) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new p39(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        n59 n59Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            kt8 kt8Var = (kt8) n59Var.M0.getValue();
            this.X = 1;
            kt8Var.getClass();
            Object objA = kt8Var.a(this.Z, Collections.singletonList(new Long(this.s0)), this);
            if (objA != tx3Var) {
                objA = e5fVar;
            }
            if (objA == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        cx7 cx7VarC = ((w9a) n59Var.Y).c();
        o39 o39Var = new o39(n59Var, null);
        this.X = 2;
        return j47.t0(cx7VarC, o39Var, this) == tx3Var ? tx3Var : e5fVar;
    }
}
