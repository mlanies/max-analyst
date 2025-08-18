package defpackage;

import android.text.TextUtils;
import android.widget.TextView;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class xc1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallLinkInfoScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc1(Continuation continuation, CallLinkInfoScreen callLinkInfoScreen) {
        super(2, continuation);
        this.Y = callLinkInfoScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        xc1 xc1Var = (xc1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        xc1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xc1 xc1Var = new xc1(continuation, this.Y);
        xc1Var.X = obj;
        return xc1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i = 4;
        int i2 = 1;
        int i3 = 2;
        int i4 = 3;
        od2.a0(obj);
        rc1 rc1Var = (rc1) this.X;
        b46 b46Var = CallLinkInfoScreen.B0;
        CallLinkInfoScreen callLinkInfoScreen = this.Y;
        callLinkInfoScreen.getClass();
        bc7[] bc7VarArr = CallLinkInfoScreen.C0;
        ((TextView) callLinkInfoScreen.u0.T0(callLinkInfoScreen, bc7VarArr[3])).setText(rc1Var.e.b(callLinkInfoScreen.getContext()));
        callLinkInfoScreen.z0.E(rc1Var.f);
        cla claVar = (cla) callLinkInfoScreen.t0.T0(callLinkInfoScreen, bc7VarArr[2]);
        CharSequence charSequenceB = rc1Var.e.b(callLinkInfoScreen.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        claVar.setTitle(charSequenceB);
        s5a s5aVar = (s5a) callLinkInfoScreen.x0.T0(callLinkInfoScreen, bc7VarArr[6]);
        int i5 = s5a.K0;
        uc0 uc0Var = rc1Var.b;
        s5aVar.g(uc0Var, true);
        s5aVar.setAvatarUrl(rc1Var.a);
        if (uc0Var == null) {
            s5aVar.setCustomPlaceholder((rd0) callLinkInfoScreen.o.getValue());
            s5aVar.setCustomOverlay(null);
        } else {
            s5aVar.setCustomPlaceholder(null);
            s5aVar.setCustomOverlay((od0) callLinkInfoScreen.X.getValue());
        }
        TextView textView = (TextView) callLinkInfoScreen.v0.T0(callLinkInfoScreen, bc7VarArr[4]);
        qc1 qc1Var = rc1Var.d;
        if (qc1Var instanceof pc1) {
            aof aofVar = callLinkInfoScreen.y0;
            if (aofVar != null) {
                textView.removeTextChangedListener(aofVar);
                textView.removeOnAttachStateChangeListener(aofVar);
                h2a h2aVar = textView instanceof h2a ? (h2a) textView : null;
                if (h2aVar != null) {
                    h2aVar.setObserverSpanListener(null);
                }
            }
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setMaxLines(1);
            textView.setOnLongClickListener(new zl0(i2, callLinkInfoScreen));
        } else {
            if (callLinkInfoScreen.y0 == null) {
                callLinkInfoScreen.y0 = np8.n(textView);
            }
            textView.setMaxLines(Integer.MAX_VALUE);
            textView.setEllipsize(null);
            textView.setOnLongClickListener(new z20(i3));
        }
        tu0.K(textView, 300L, new tb(rc1Var, i4, callLinkInfoScreen));
        textView.setText(qc1Var.getText().b(textView.getContext()));
        OneMeButton oneMeButton = (OneMeButton) callLinkInfoScreen.w0.T0(callLinkInfoScreen, bc7VarArr[5]);
        mc1 mc1Var = rc1Var.g;
        oneMeButton.setVisibility(mc1Var != null ? 0 : 8);
        if (mc1Var != null) {
            oneMeButton.setMode(mc1Var.a());
            oneMeButton.setText(mc1Var.getTitle().b(oneMeButton.getContext()));
            tu0.K(oneMeButton, 300L, new tb(callLinkInfoScreen, i, mc1Var));
        }
        return e5f.a;
    }
}
