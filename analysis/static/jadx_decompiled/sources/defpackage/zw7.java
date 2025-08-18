package defpackage;

import androidx.work.WorkRequest;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zw7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ax7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw7(ax7 ax7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = ax7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zw7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zw7 zw7Var = new zw7(this.Z, continuation);
        zw7Var.Y = obj;
        return zw7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        sx3 sx3Var;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            sx3Var = (sx3) this.Y;
            this.Y = sx3Var;
            this.X = 1;
            if (j47.x(WorkRequest.MIN_BACKOFF_MILLIS, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                if (i == 2) {
                    od2.a0(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sx3Var = (sx3) this.Y;
            od2.a0(obj);
        }
        if (!j1e.z(sx3Var)) {
            return e5fVar;
        }
        ax7 ax7Var = this.Z;
        cx7 cx7VarC = ((w9a) ax7Var.a).c();
        yw7 yw7Var = new yw7(ax7Var, null);
        this.Y = null;
        this.X = 2;
        return j47.t0(cx7VarC, yw7Var, this) == tx3Var ? tx3Var : e5fVar;
    }
}
