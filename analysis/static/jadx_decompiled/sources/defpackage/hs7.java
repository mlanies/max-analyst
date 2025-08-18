package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hs7 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ je7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs7(je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hs7) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hs7 hs7Var = new hs7(this.Z, continuation);
        hs7Var.Y = obj;
        return hs7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            List list = (List) this.Y;
            hmc hmcVar = (hmc) this.Z.getValue();
            this.X = 1;
            Object objT0 = j47.t0(((w9a) hmcVar.a).b(), new cmc(hmcVar, list, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
            if (objT0 == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
