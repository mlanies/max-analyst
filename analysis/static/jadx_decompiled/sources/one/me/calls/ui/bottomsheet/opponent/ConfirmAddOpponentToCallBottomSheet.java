package one.me.calls.ui.bottomsheet.opponent;

import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.a14;
import defpackage.b7a;
import defpackage.b8a;
import defpackage.c5;
import defpackage.c7a;
import defpackage.du4;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fka;
import defpackage.hn2;
import defpackage.i4f;
import defpackage.je7;
import defpackage.l31;
import defpackage.md1;
import defpackage.od2;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.tb;
import defpackage.te3;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.ve3;
import defpackage.vxd;
import defpackage.y21;
import defpackage.y7a;
import defpackage.yz2;
import defpackage.z6a;
import defpackage.zn5;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponent/ConfirmAddOpponentToCallBottomSheet;", "Lone/me/sdk/bottomsheet/BottomSheetWidget;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ConfirmAddOpponentToCallBottomSheet extends BottomSheetWidget {
    public static final /* synthetic */ int A0 = 0;
    public final je7 y0;
    public final je7 z0;

    public ConfirmAddOpponentToCallBottomSheet() {
        super(null, 1, null);
        this.y0 = createViewModelLazy(ve3.class, new ti2(24, new hn2(27)));
        this.z0 = tu0.r(3, new md1(20, this));
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget, one.me.sdk.bottomsheet.BaseBottomSheetWidget, defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        vxd vxdVar = ((ve3) this.y0.getValue()).X;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((ve3) this.y0.getValue()).Y, getViewLifecycleOwner().Q(), fg7.o), new te3(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.bottomsheet.BaseBottomSheetWidget
    public final fka q0() {
        return qp4.u0.o(getContext()).c;
    }

    @Override // one.me.sdk.bottomsheet.BottomSheetWidget
    public final View x0(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        linearLayout.setOrientation(1);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(y7a.J0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        float f = 8;
        marginLayoutParams.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(marginLayoutParams);
        i4f.c.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.p(textView).c.getText().e);
        textView.setGravity(17);
        textView.setPadding(textView.getPaddingLeft(), tu0.G(24 * fk4.d().getDisplayMetrics().density), textView.getPaddingRight(), textView.getPaddingBottom());
        textView.setText(textView.getContext().getString(b8a.M0, ((y21) ((l31) ((ve3) this.y0.getValue()).b).k.getValue()).c));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(y7a.I0);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams2.bottomMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(marginLayoutParams2);
        i4f.p.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.p(textView2).c.getText().g);
        textView2.setGravity(17);
        textView2.setText(b8a.L0);
        linearLayout.addView(textView2);
        yz2 yz2Var = new yz2(linearLayout.getContext(), null);
        yz2Var.setId(y7a.F0);
        ViewGroup.MarginLayoutParams marginLayoutParams3 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams3.bottomMargin = tu0.G(20 * fk4.d().getDisplayMetrics().density);
        marginLayoutParams3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        marginLayoutParams3.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        yz2Var.setLayoutParams(marginLayoutParams3);
        yz2Var.setText(b8a.I0);
        i4f.j.b(yz2Var, du4.b);
        yz2Var.setTextColor(pq9Var.p(yz2Var).c.getText().e);
        je7 je7Var = this.z0;
        a14.g((StateListDrawable) je7Var.getValue(), pq9Var.p(yz2Var).c);
        yz2Var.setButtonDrawable((StateListDrawable) je7Var.getValue());
        yz2Var.setPaddingBetweenCheckbox(tu0.G(f * fk4.d().getDisplayMetrics().density));
        linearLayout.addView(yz2Var);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(y7a.H0);
        ViewGroup.MarginLayoutParams marginLayoutParams4 = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams4.bottomMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(marginLayoutParams4);
        z6a z6aVar = z6a.c;
        oneMeButton.setAppearance(z6aVar);
        c7a c7aVar = c7a.c;
        oneMeButton.setSize(c7aVar);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setCustomTheme(pq9Var.p(oneMeButton).c);
        oneMeButton.setText(b8a.K0);
        tu0.K(oneMeButton, 300L, new tb(this, 18, yz2Var));
        linearLayout.addView(oneMeButton);
        OneMeButton oneMeButton2 = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton2.setId(y7a.G0);
        oneMeButton2.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
        oneMeButton2.setAppearance(z6aVar);
        oneMeButton2.setSize(c7aVar);
        oneMeButton2.setMode(b7a.b);
        oneMeButton2.setCustomTheme(pq9Var.p(oneMeButton2).c);
        oneMeButton2.setText(b8a.J0);
        tu0.K(oneMeButton2, 300L, new c5(20, this));
        linearLayout.addView(oneMeButton2);
        return linearLayout;
    }
}
