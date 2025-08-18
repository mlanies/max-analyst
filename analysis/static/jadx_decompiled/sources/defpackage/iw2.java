package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class iw2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ nx2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw2(nx2 nx2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = nx2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((iw2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new iw2(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        nx2 nx2Var = this.Y;
        if (i == 0) {
            od2.a0(obj);
            bc7[] bc7VarArr = nx2.X0;
            ta2 ta2Var = (ta2) nx2Var.A0.getValue();
            this.X = 1;
            obj = ((zb2) ta2Var).d(nx2Var.c, this);
            if (obj == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        at5 at5Var = (at5) obj;
        Set set = at5Var != null ? at5Var.Y : null;
        nx2Var.M0.m(null, Boolean.valueOf(!(set == null || set.isEmpty())));
        return e5f.a;
    }
}
