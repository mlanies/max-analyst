package one.me.sdk.uikit.common.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.b7a;
import defpackage.c7a;
import defpackage.du4;
import defpackage.fk4;
import defpackage.fka;
import defpackage.i4f;
import defpackage.k56;
import defpackage.kre;
import defpackage.kt3;
import defpackage.m6;
import defpackage.pq9;
import defpackage.qp4;
import defpackage.tu0;
import defpackage.z6a;
import defpackage.z7;
import kotlin.Metadata;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0011\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\b\b\u0001\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\rJ\u001b\u0010\u0019\u001a\u00020\u000b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lone/me/sdk/uikit/common/views/EmptySearchView;", "Landroid/widget/LinearLayout;", "Lkre;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "drawableRes", "Le5f;", "setImage", "(I)V", "titleRes", "setTitle", "descriptionRes", "setDescription", "", "description", "(Ljava/lang/String;)V", "buttonTitle", "setButtonTitle", "Lkotlin/Function0;", "action", "setButtonAction", "(Lk56;)V", "", "visible", "setIsButtonVisible", "(Z)V", "common_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class EmptySearchView extends LinearLayout implements kre {
    public static final /* synthetic */ int s0 = 0;
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final OneMeButton o;

    public EmptySearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        float f = 188;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.setMargins(0, 0, 0, tu0.G(16 * fk4.d().getDisplayMetrics().density));
        appCompatImageView.setLayoutParams(layoutParams);
        setGravity(17);
        pq9 pq9Var = qp4.u0;
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(appCompatImageView).getIcon().h));
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, 0, 0, tu0.G(2 * fk4.d().getDisplayMetrics().density));
        appCompatTextView.setLayoutParams(layoutParams2);
        i4f.d.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(pq9Var.j(appCompatTextView).getText().e);
        appCompatTextView.setGravity(17);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, tu0.G(24 * fk4.d().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams3);
        i4f.n.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(pq9Var.j(appCompatTextView2).getText().g);
        appCompatTextView2.setGravity(17);
        this.c = appCompatTextView2;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        oneMeButton.setSize(c7a.b);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.a);
        setGravity(17);
        this.o = oneMeButton;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        setOrientation(1);
        setPaddingRelative(tu0.F(fk4.d().getDisplayMetrics().density * 21.5d), 0, tu0.F(fk4.d().getDisplayMetrics().density * 21.5d), 0);
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(oneMeButton);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().h));
        this.b.setTextColor(fkaVar.getText().e);
        this.c.setTextColor(fkaVar.getText().g);
    }

    public final void setButtonAction(k56 action) {
        tu0.K(this.o, 300L, new m6(9, action));
    }

    public final void setButtonTitle(int buttonTitle) {
        this.o.setText(buttonTitle);
    }

    public final void setDescription(int descriptionRes) {
        this.c.setText(z7.B(getContext(), descriptionRes));
    }

    public final void setImage(int drawableRes) {
        this.a.setImageDrawable(kt3.b(getContext(), drawableRes));
    }

    public final void setIsButtonVisible(boolean visible) {
        this.o.setVisibility(visible ? 0 : 8);
    }

    public final void setTitle(int titleRes) {
        this.b.setText(z7.B(getContext(), titleRes));
    }

    public final void setDescription(String description) {
        this.c.setText(description);
    }
}
