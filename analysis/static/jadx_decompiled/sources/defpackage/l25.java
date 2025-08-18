package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* loaded from: classes2.dex */
public final class l25 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l25(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l25 l25Var = (l25) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        l25Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        l25 l25Var = new l25(continuation, this.Y);
        l25Var.X = obj;
        return l25Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        i3a onBackPressedDispatcher = this.Y.getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.d();
        }
        return e5f.a;
    }
}
