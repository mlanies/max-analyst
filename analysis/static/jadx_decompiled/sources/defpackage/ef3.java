package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;

/* loaded from: classes2.dex */
public final class ef3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef3(ConfirmPhoneScreen confirmPhoneScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = confirmPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ef3 ef3Var = (ef3) n((String) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ef3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ef3 ef3Var = new ef3(this.Y, continuation);
        ef3Var.X = obj;
        return ef3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        bc7[] bc7VarArr = ConfirmPhoneScreen.C0;
        this.Y.p0().J0(0, str);
        return e5f.a;
    }
}
