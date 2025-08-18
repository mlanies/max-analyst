package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.ConfirmPinCodeScreen;

/* loaded from: classes2.dex */
public final class qf3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ConfirmPinCodeScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qf3(Continuation continuation, ConfirmPinCodeScreen confirmPinCodeScreen) {
        super(2, continuation);
        this.Y = confirmPinCodeScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qf3 qf3Var = (qf3) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qf3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qf3 qf3Var = new qf3(continuation, this.Y);
        qf3Var.X = obj;
        return qf3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        int iOrdinal = ((tf3) this.X).ordinal();
        ConfirmPinCodeScreen confirmPinCodeScreen = this.Y;
        if (iOrdinal == 0) {
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setErrorText(null);
            jg3 jg3Var = ConfirmPinCodeScreen.m0(confirmPinCodeScreen).J0;
            int childCount = jg3Var.getChildCount();
            for (int i = 0; i < childCount; i++) {
                l17 l17VarH0 = jg3Var.H0(i);
                if (l17VarH0 != null) {
                    ((ptd) l17VarH0).H0.setText((CharSequence) null);
                }
            }
            jg3Var.K0();
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setState(gg3.NORMAL);
        } else if (iOrdinal == 1) {
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setErrorText(null);
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setState(gg3.SUCCESS);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setErrorText(z7.B(confirmPinCodeScreen.getContext(), p1c.oneme_settings_privacy_onboarding_error_pin_code_equals));
            ConfirmPinCodeScreen.m0(confirmPinCodeScreen).setState(gg3.ERROR);
        }
        return e5f.a;
    }
}
