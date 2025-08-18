package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* loaded from: classes2.dex */
public final class k25 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ EnterPinCodeScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k25(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.Y = enterPinCodeScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        k25 k25Var = (k25) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        k25Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k25 k25Var = new k25(continuation, this.Y);
        k25Var.X = obj;
        return k25Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        p25 p25Var = (p25) this.X;
        EnterPinCodeScreen enterPinCodeScreen = this.Y;
        Object targetController = enterPinCodeScreen.getTargetController();
        j25 j25Var = targetController instanceof j25 ? (j25) targetController : null;
        int iOrdinal = p25Var.ordinal();
        q7c q7cVar = enterPinCodeScreen.o;
        if (iOrdinal == 0) {
            ((m0b) q7cVar.T0(enterPinCodeScreen, EnterPinCodeScreen.X[0])).setState(gg3.SUCCESS);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ((m0b) q7cVar.T0(enterPinCodeScreen, EnterPinCodeScreen.X[0])).setState(gg3.ERROR);
        }
        if (j25Var != null) {
            cid cidVarM0 = ((SettingsPrivacyScreen) j25Var).m0();
            cidVarM0.getClass();
            int iOrdinal2 = p25Var.ordinal();
            if (iOrdinal2 == 0) {
                long j = cidVarM0.K0;
                if (j == jha.h) {
                    pnf.n(cidVarM0, ((w9a) cidVarM0.o).a(), null, new uhd(cidVarM0, null), 2);
                } else if (j == jha.i) {
                    cidVarM0.w(aed.i);
                } else if (j == jha.e) {
                    cidVarM0.w(aed.h);
                } else if (j == jha.c) {
                    cidVarM0.w(aed.j);
                } else if (j == jha.b) {
                    cidVarM0.w(aed.l);
                }
                cidVarM0.K0 = 0L;
            } else if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return e5f.a;
    }
}
