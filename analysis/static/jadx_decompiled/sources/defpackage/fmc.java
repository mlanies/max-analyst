package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fmc extends ffe implements a66 {
    public int X;
    public final /* synthetic */ hmc Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ int s0 = 2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fmc(hmc hmcVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = hmcVar;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((fmc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fmc(this.Y, this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            List listSingletonList = Collections.singletonList(new Long(this.Z));
            this.X = 1;
            hmc hmcVar = this.Y;
            Object objT0 = j47.t0(((w9a) hmcVar.a).b(), new gmc(hmcVar, listSingletonList, this.s0, null), this);
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
