package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class as7 extends ffe implements a66 {
    public av0 X;
    public int Y;
    public final /* synthetic */ bs7 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as7(bs7 bs7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = bs7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((as7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new as7(this.Z, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        av0 av0Var;
        tx3 tx3Var = tx3.a;
        int i = this.Y;
        e5f e5fVar = e5f.a;
        bs7 bs7Var = this.Z;
        if (i == 0) {
            od2.a0(obj);
            String str = bs7Var.Z;
            StringBuilder sb = new StringBuilder("onSuccess: tasksIds=");
            List list = bs7Var.X;
            sb.append(list);
            hm9.n(str, sb.toString());
            js7 js7VarO = bs7Var.o();
            this.Y = 1;
            hmc hmcVarB = js7VarO.b();
            Object objT0 = j47.t0(((w9a) hmcVarB.a).b(), new amc(hmcVarB, list, null), this);
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
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                av0Var = this.X;
                od2.a0(obj);
                ((Number) obj).longValue();
                av0Var.c(new su(7));
                return e5fVar;
            }
            od2.a0(obj);
        }
        if (bs7Var.Y) {
            av0 av0VarL = bs7Var.l();
            js7 js7VarO2 = bs7Var.o();
            this.X = av0VarL;
            this.Y = 2;
            hmc hmcVarB2 = js7VarO2.b();
            Object objT02 = j47.t0(((w9a) hmcVarB2.a).b(), new zlc(hmcVarB2, null), this);
            if (objT02 == tx3Var) {
                return tx3Var;
            }
            obj = objT02;
            av0Var = av0VarL;
            ((Number) obj).longValue();
            av0Var.c(new su(7));
        }
        return e5fVar;
    }
}
