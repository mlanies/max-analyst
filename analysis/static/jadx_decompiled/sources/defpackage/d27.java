package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class d27 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InputPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d27(Continuation continuation, InputPhoneScreen inputPhoneScreen) {
        super(2, continuation);
        this.Y = inputPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        d27 d27Var = (d27) n((tt7) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        d27Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        d27 d27Var = new d27(continuation, this.Y);
        d27Var.X = obj;
        return d27Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        Integer numE;
        od2.a0(obj);
        tt7 tt7Var = (tt7) this.X;
        bc7[] bc7VarArr = InputPhoneScreen.E0;
        InputPhoneScreen inputPhoneScreen = this.Y;
        OneMeButton oneMeButtonO0 = inputPhoneScreen.o0();
        oneMeButtonO0.setProgressEnabled(false);
        oneMeButtonO0.setClickable(true);
        if (tt7Var instanceof ot7) {
            InputPhoneScreen.n0(inputPhoneScreen, ((ot7) tt7Var).c.b(inputPhoneScreen.getContext()));
        } else if (tt7Var instanceof pt7) {
            InputPhoneScreen.n0(inputPhoneScreen, ((pt7) tt7Var).c.b(inputPhoneScreen.getContext()));
        } else if (tt7Var instanceof qt7) {
            fm9.N(inputPhoneScreen);
        } else {
            if (tt7Var instanceof st7) {
                st7 st7Var = (st7) tt7Var;
                ((d80) inputPhoneScreen.B0.getValue()).a(new c80(st7Var.e));
                inputPhoneScreen.a.getClass();
                CharSequence charSequenceB = st7Var.c.b(inputPhoneScreen.getContext());
                if (charSequenceB != null) {
                    jqe jqeVar = st7Var.d;
                    CharSequence charSequenceB2 = jqeVar != null ? jqeVar.b(inputPhoneScreen.getContext()) : null;
                    wha whaVar = new wha(inputPhoneScreen);
                    whaVar.h(charSequenceB);
                    whaVar.b(charSequenceB2);
                    View view = inputPhoneScreen.getView();
                    whaVar.c(new eia(1, (view == null || (numE = br7.E(view)) == null) ? 0 : numE.intValue(), 0, 4));
                    whaVar.i();
                }
            } else {
                if (tt7Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                InputPhoneScreen.n0(inputPhoneScreen, null);
            }
        }
        return e5f.a;
    }
}
