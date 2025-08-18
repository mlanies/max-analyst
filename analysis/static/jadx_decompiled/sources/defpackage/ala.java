package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class ala {
    public final /* synthetic */ cla a;

    public ala(cla claVar) {
        this.a = claVar;
    }

    public final void a() {
        cla claVar = this.a;
        claVar.F0 = true;
        claVar.setPadding(0, claVar.getPaddingTop(), tu0.G(12 * fk4.d().getDisplayMetrics().density), claVar.getPaddingBottom());
        View view = claVar.C0;
        if (view instanceof eha) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginEnd(0);
                view.setLayoutParams(marginLayoutParams);
            }
            View view2 = claVar.B0;
            if (view2 != null) {
                view2.setVisibility(8);
            }
        }
        claVar.u0.setVisibility(8);
        je7 je7Var = claVar.v0;
        if (je7Var.a()) {
            ((fmd) je7Var.getValue()).setVisibility(8);
        }
        je7 je7Var2 = claVar.w0;
        if (je7Var2.a()) {
            ((s5a) je7Var2.getValue()).setVisibility(8);
        }
        je7 je7Var3 = claVar.x0;
        if (je7Var3.a()) {
            ((ImageView) je7Var3.getValue()).setVisibility(8);
        }
        OneMeButton oneMeButton = claVar.A0;
        if (oneMeButton != null) {
            oneMeButton.setVisibility(8);
        }
    }
}
