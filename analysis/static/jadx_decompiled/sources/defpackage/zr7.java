package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zr7 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ bs7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr7(bs7 bs7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = bs7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zr7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zr7(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            bs7 bs7Var = this.Y;
            String str = bs7Var.Z;
            StringBuilder sb = new StringBuilder("onFail: tasksIds=");
            List list = bs7Var.X;
            sb.append(list);
            hm9.n(str, sb.toString());
            js7 js7VarO = bs7Var.o();
            this.X = 1;
            hmc hmcVarB = js7VarO.b();
            Object objT0 = j47.t0(((w9a) hmcVarB.a).b(), new gmc(hmcVarB, list, 1, null), this);
            if (objT0 != tx3Var) {
                objT0 = e5fVar;
            }
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
