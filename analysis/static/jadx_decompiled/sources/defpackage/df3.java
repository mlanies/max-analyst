package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final class df3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public df3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((df3) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        df3 df3Var = new df3(this.Y, continuation);
        df3Var.X = obj;
        return df3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        bc7[] bc7VarArr = ConfirmPhoneScreen.C0;
        ConfirmPhoneScreen confirmPhoneScreen = this.Y;
        confirmPhoneScreen.getClass();
        x77 x77Var = (x77) confirmPhoneScreen.B0.T0(confirmPhoneScreen, ConfirmPhoneScreen.C0[7]);
        e5f e5fVar = e5f.a;
        if ((x77Var != null && x77Var.isActive()) || confirmPhoneScreen.A0 != null) {
            return e5fVar;
        }
        confirmPhoneScreen.s0(str);
        return e5fVar;
    }
}
