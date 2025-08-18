package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public final class rgc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gh7 Z;
    public final /* synthetic */ fg7 s0;
    public final /* synthetic */ a66 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rgc(gh7 gh7Var, fg7 fg7Var, a66 a66Var, Continuation continuation) {
        super(2, continuation);
        this.Z = gh7Var;
        this.s0 = fg7Var;
        this.t0 = a66Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rgc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rgc rgcVar = new rgc(this.Z, this.s0, this.t0, continuation);
        rgcVar.Y = obj;
        return rgcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            sx3 sx3Var = (sx3) this.Y;
            jd4 jd4Var = ql4.a;
            cx7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
            qgc qgcVar = new qgc(this.Z, this.s0, sx3Var, this.t0, null);
            this.X = 1;
            if (j47.t0(immediate, qgcVar, this) == tx3Var) {
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
