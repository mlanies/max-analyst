package defpackage;

import android.widget.EditText;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;

/* loaded from: classes2.dex */
public final class c27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c27(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        c27 c27Var = (c27) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        c27Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        c27 c27Var = new c27(continuation, this.Y);
        c27Var.X = obj;
        return c27Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = InputPhoneScreen.E0;
        lea leaVarP0 = this.Y.p0();
        if (leaVarP0.hasWindowFocus()) {
            EditText editText = leaVarP0.w0;
            editText.requestFocus();
            editText.post(new do9(leaVarP0, 3, editText));
        } else {
            leaVarP0.setOnWindowFocusChanged(new c01(4, leaVarP0));
        }
        return e5f.a;
    }
}
