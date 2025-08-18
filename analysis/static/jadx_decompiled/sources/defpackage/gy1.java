package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class gy1 extends kgb implements kre {
    public final OneMeButton F0;
    public final AppCompatTextView G0;

    public gy1(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        super(linearLayout);
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(vea.i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        float f = 12;
        layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.leftMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        oneMeButton.setLayoutParams(layoutParams);
        this.F0 = oneMeButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        Drawable drawableB = kt3.b(context, rea.a);
        ArrayList arrayList = qqe.a;
        appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableB, (Drawable) null, (Drawable) null, (Drawable) null);
        pq9 pq9Var = qp4.u0;
        appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(pq9Var.j(linearLayout).getIcon().c));
        float f2 = 20;
        appCompatTextView.setCompoundDrawablePadding(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        i4f.d.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(pq9Var.j(linearLayout).getText().b);
        appCompatTextView.setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(10 * fk4.d().getDisplayMetrics().density));
        this.G0 = appCompatTextView;
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout.setBackground(null);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(oneMeButton);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        this.G0.setText(((fy1) ol7Var).a.b(this.a.getContext()));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        AppCompatTextView appCompatTextView = this.G0;
        pq9 pq9Var = qp4.u0;
        View view = this.a;
        appCompatTextView.setTextColor(pq9Var.j(view).getText().b);
        bs6 icon = pq9Var.j(view).getIcon();
        ArrayList arrayList = qqe.a;
        appCompatTextView.setCompoundDrawableTintList(ColorStateList.valueOf(icon.c));
    }
}
