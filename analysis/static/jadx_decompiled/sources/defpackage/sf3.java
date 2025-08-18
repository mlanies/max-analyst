package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* loaded from: classes2.dex */
public final class sf3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPinCodeScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.Y = confirmPinCodeScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sf3 sf3Var = (sf3) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sf3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sf3 sf3Var = new sf3(continuation, this.Y);
        sf3Var.X = obj;
        return sf3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        String str = (String) this.X;
        wha whaVar = new wha(this.Y);
        whaVar.h(eae.g0(str));
        whaVar.i();
        return e5f.a;
    }
}
