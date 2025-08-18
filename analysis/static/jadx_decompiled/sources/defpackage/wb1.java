package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final /* synthetic */ class wb1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CallJoinLinkPreviewWidget b;

    public /* synthetic */ wb1(CallJoinLinkPreviewWidget callJoinLinkPreviewWidget, int i) {
        this.a = i;
        this.b = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        final int i = 1;
        final int i2 = 0;
        fnc fncVar = fnc.a;
        pq9 pq9Var = qp4.u0;
        final CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = CallJoinLinkPreviewWidget.B0;
                return new rg1(new khe(new wb1(callJoinLinkPreviewWidget, 4)), new l5g(callJoinLinkPreviewWidget, 0));
            case 1:
                bc7[] bc7VarArr2 = CallJoinLinkPreviewWidget.B0;
                OneMeButton oneMeButton = new OneMeButton(callJoinLinkPreviewWidget.getContext(), null);
                oneMeButton.setId(View.generateViewId());
                oneMeButton.setText(b8a.b0);
                oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
                oneMeButton.setMode(b7a.a);
                oneMeButton.setSize(c7a.c);
                oneMeButton.setAppearance(z6a.o);
                tu0.K(oneMeButton, 300L, new View.OnClickListener() { // from class: yb1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget2 = callJoinLinkPreviewWidget;
                        switch (i) {
                            case 0:
                                bc7[] bc7VarArr3 = CallJoinLinkPreviewWidget.B0;
                                callJoinLinkPreviewWidget2.r0();
                                break;
                            default:
                                bc7[] bc7VarArr4 = CallJoinLinkPreviewWidget.B0;
                                vb1 vb1VarQ0 = callJoinLinkPreviewWidget2.q0();
                                nb1 nb1Var = (nb1) vb1VarQ0.x0.getValue();
                                m38 m38Var = nb1Var.c;
                                m38 m38Var2 = m38.b;
                                pnf.o(vb1VarQ0.A0, new ea1(vb1VarQ0.b, m38Var == m38Var2, nb1Var.b == m38Var2, nb1Var.d));
                                break;
                        }
                    }
                });
                return oneMeButton;
            case 2:
                bc7[] bc7VarArr3 = CallJoinLinkPreviewWidget.B0;
                return kt3.b(callJoinLinkPreviewWidget.getContext(), x7a.Z);
            case 3:
                bc7[] bc7VarArr4 = CallJoinLinkPreviewWidget.B0;
                return kt3.b(callJoinLinkPreviewWidget.getContext(), x7a.a0);
            case 4:
                bc7[] bc7VarArr5 = CallJoinLinkPreviewWidget.B0;
                return callJoinLinkPreviewWidget.getRouter();
            case 5:
                bc7[] bc7VarArr6 = CallJoinLinkPreviewWidget.B0;
                return kt3.b(callJoinLinkPreviewWidget.getContext(), x7a.C0);
            case 6:
                bc7[] bc7VarArr7 = CallJoinLinkPreviewWidget.B0;
                return kt3.b(callJoinLinkPreviewWidget.getContext(), x7a.E0);
            case 7:
                bc7[] bc7VarArr8 = CallJoinLinkPreviewWidget.B0;
                TextView textView = new TextView(callJoinLinkPreviewWidget.getContext());
                textView.setId(y7a.b0);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                textView.setText(b8a.c0);
                i4f.j.b(textView, du4.b);
                textView.setTextColor(pq9Var.p(textView).c.getText().e);
                return textView;
            case 8:
                bc7[] bc7VarArr9 = CallJoinLinkPreviewWidget.B0;
                knc kncVar = new knc(callJoinLinkPreviewWidget.getContext(), null);
                kncVar.setId(y7a.Z);
                kncVar.setContentDescription(kncVar.getContext().getString(b8a.F));
                kncVar.y(x7a.F, pq9Var.p(kncVar).c.getIcon().f);
                tu0.K(kncVar, 300L, new View.OnClickListener() { // from class: yb1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget2 = callJoinLinkPreviewWidget;
                        switch (i2) {
                            case 0:
                                bc7[] bc7VarArr32 = CallJoinLinkPreviewWidget.B0;
                                callJoinLinkPreviewWidget2.r0();
                                break;
                            default:
                                bc7[] bc7VarArr42 = CallJoinLinkPreviewWidget.B0;
                                vb1 vb1VarQ0 = callJoinLinkPreviewWidget2.q0();
                                nb1 nb1Var = (nb1) vb1VarQ0.x0.getValue();
                                m38 m38Var = nb1Var.c;
                                m38 m38Var2 = m38.b;
                                pnf.o(vb1VarQ0.A0, new ea1(vb1VarQ0.b, m38Var == m38Var2, nb1Var.b == m38Var2, nb1Var.d));
                                break;
                        }
                    }
                });
                float f = 40;
                kncVar.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
                kncVar.setButtonPadding(tu0.G(3 * fk4.d().getDisplayMetrics().density));
                kncVar.setMode(fncVar);
                return kncVar;
            case 9:
                bc7[] bc7VarArr10 = CallJoinLinkPreviewWidget.B0;
                yia yiaVar = new yia(callJoinLinkPreviewWidget.getContext());
                yiaVar.setId(y7a.a0);
                yiaVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                return yiaVar;
            case 10:
                bc7[] bc7VarArr11 = CallJoinLinkPreviewWidget.B0;
                knc kncVar2 = new knc(callJoinLinkPreviewWidget.getContext(), null);
                kncVar2.setId(y7a.c0);
                kncVar2.setAccessibility(Integer.valueOf(b8a.a0));
                kncVar2.setTextColor(pq9Var.p(kncVar2).c.getText().e);
                kncVar2.setListener(new hnc() { // from class: xb1
                    @Override // defpackage.hnc
                    public final void b() {
                        m38 m38Var = m38.b;
                        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget2 = callJoinLinkPreviewWidget;
                        switch (i2) {
                            case 0:
                                bc7[] bc7VarArr12 = CallJoinLinkPreviewWidget.B0;
                                callJoinLinkPreviewWidget2.q0().r(!(((nb1) callJoinLinkPreviewWidget2.q0().x0.getValue()).b == m38Var));
                                break;
                            default:
                                bc7[] bc7VarArr13 = CallJoinLinkPreviewWidget.B0;
                                callJoinLinkPreviewWidget2.q0().s(!(((nb1) callJoinLinkPreviewWidget2.q0().x0.getValue()).c == m38Var));
                                break;
                        }
                    }
                });
                kncVar2.setMode(fncVar);
                kncVar2.y(x7a.Y, pq9Var.p(kncVar2).c.getIcon().f);
                float f2 = 54;
                kncVar2.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
                kncVar2.setButtonPadding(tu0.G(5 * fk4.d().getDisplayMetrics().density));
                return kncVar2;
            default:
                bc7[] bc7VarArr12 = CallJoinLinkPreviewWidget.B0;
                knc kncVar3 = new knc(callJoinLinkPreviewWidget.getContext(), null);
                kncVar3.setId(y7a.f0);
                kncVar3.y(x7a.B0, pq9Var.p(kncVar3).c.getIcon().f);
                kncVar3.setAccessibility(Integer.valueOf(b8a.d0));
                kncVar3.setTextColor(pq9Var.p(kncVar3).c.getText().e);
                kncVar3.setMode(fncVar);
                kncVar3.setListener(new hnc() { // from class: xb1
                    @Override // defpackage.hnc
                    public final void b() {
                        m38 m38Var = m38.b;
                        CallJoinLinkPreviewWidget callJoinLinkPreviewWidget2 = callJoinLinkPreviewWidget;
                        switch (i) {
                            case 0:
                                bc7[] bc7VarArr122 = CallJoinLinkPreviewWidget.B0;
                                callJoinLinkPreviewWidget2.q0().r(!(((nb1) callJoinLinkPreviewWidget2.q0().x0.getValue()).b == m38Var));
                                break;
                            default:
                                bc7[] bc7VarArr13 = CallJoinLinkPreviewWidget.B0;
                                callJoinLinkPreviewWidget2.q0().s(!(((nb1) callJoinLinkPreviewWidget2.q0().x0.getValue()).c == m38Var));
                                break;
                        }
                    }
                });
                float f3 = 54;
                kncVar3.setImageSize(new gnc(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                kncVar3.setButtonPadding(tu0.G(5 * fk4.d().getDisplayMetrics().density));
                return kncVar3;
        }
    }
}
