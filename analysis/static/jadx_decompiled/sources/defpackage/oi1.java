package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final class oi1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi1(Continuation continuation, CallScreen callScreen) {
        super(2, continuation);
        this.Y = callScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        oi1 oi1Var = (oi1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        oi1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oi1 oi1Var = new oi1(continuation, this.Y);
        oi1Var.X = obj;
        return oi1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        cn1 cn1Var = (cn1) this.X;
        yxc yxcVar = CallScreen.R0;
        CallScreen callScreen = this.Y;
        callScreen.getClass();
        int i = cn1Var != null ? cn1Var.a : 0;
        int i2 = i == 0 ? -1 : hi1.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 == 1) {
            pn1 pn1VarW0 = callScreen.w0();
            if (pn1VarW0 != null) {
                CharSequence charSequence = cn1Var.b;
                CallTopPanelWidget callTopPanelWidget = (CallTopPanelWidget) pn1VarW0;
                if (callTopPanelWidget.getView() != null) {
                    callTopPanelWidget.m0().setTitle(charSequence);
                }
            }
            pn1 pn1VarW02 = callScreen.w0();
            if (pn1VarW02 != null) {
                CharSequence charSequence2 = cn1Var.c;
                CallTopPanelWidget callTopPanelWidget2 = (CallTopPanelWidget) pn1VarW02;
                if (callTopPanelWidget2.getView() != null) {
                    callTopPanelWidget2.m0().setStatus(charSequence2);
                }
            }
        } else if (i2 == 2) {
            pn1 pn1VarW03 = callScreen.w0();
            if (pn1VarW03 != null) {
                CallTopPanelWidget callTopPanelWidget3 = (CallTopPanelWidget) pn1VarW03;
                if (callTopPanelWidget3.getView() != null) {
                    callTopPanelWidget3.m0().setTitle(null);
                }
            }
            pn1 pn1VarW04 = callScreen.w0();
            if (pn1VarW04 != null) {
                CallTopPanelWidget callTopPanelWidget4 = (CallTopPanelWidget) pn1VarW04;
                if (callTopPanelWidget4.getView() != null) {
                    callTopPanelWidget4.m0().setStatus(null);
                }
            }
        }
        return e5f.a;
    }
}
