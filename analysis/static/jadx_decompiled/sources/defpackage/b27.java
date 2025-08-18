package defpackage;

import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class b27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b27(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        b27 b27Var = (b27) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        b27Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        b27 b27Var = new b27(continuation, this.Y);
        b27Var.X = obj;
        return b27Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7VarArr = InputPhoneScreen.E0;
        this.Y.o0().setEnabled(zBooleanValue);
        return e5f.a;
    }
}
