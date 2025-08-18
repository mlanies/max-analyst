package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public class aba extends ConstraintLayout implements kre {
    public static final /* synthetic */ bc7[] L0;
    public final ImageView G0;
    public final TextView H0;
    public final TextView I0;
    public final OneMeButton J0;
    public final yj K0;

    static {
        oi9 oi9Var = new oi9(aba.class, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;");
        nec.a.getClass();
        L0 = new bc7[]{oi9Var};
    }

    public aba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView imageView = new ImageView(context);
        imageView.setId(vxb.oneme_empty_view_icon);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setElevation(fk4.d().getDisplayMetrics().density * 8.0f);
        pq9 pq9Var = qp4.u0;
        imageView.setImageTintList(ColorStateList.valueOf(pq9Var.j(imageView).getIcon().b));
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, hm9.a(pq9Var.b(context).i()));
        gradientDrawable.setShape(1);
        imageView.setBackground(gradientDrawable);
        this.G0 = imageView;
        TextView textView = new TextView(context);
        textView.setId(vxb.oneme_empty_view_title);
        i4f.c.b(textView, du4.b);
        this.H0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(vxb.oneme_empty_view_subtitle);
        textView2.setMaxLines(4);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        i4f.n.b(textView2, du4.b);
        textView2.setVisibility(8);
        this.I0 = textView2;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setId(vxb.oneme_empty_view_main_action);
        oneMeButton.setVisibility(8);
        oneMeButton.setAppearance(z6a.o);
        this.J0 = oneMeButton;
        this.K0 = new yj(20, this);
        float f = 80;
        addView(imageView, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(textView, -2, -2);
        addView(textView2, 0, -2);
        addView(oneMeButton, -2, -2);
        onThemeChanged(pq9Var.b(context).i());
        v3c.y(new xh0(context, (Continuation) null, 24), this);
        setBackground(new lmd(context));
        float f2 = 32;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        dj3 dj3VarQ = fp3.q(this);
        int id = imageView.getId();
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 7, 0, 7);
        dj3VarQ.d(id, 4, 0, 4);
        dj3VarQ.g(id).d.x = 0.4f;
        int id2 = textView.getId();
        dj3VarQ.d(id2, 3, imageView.getId(), 4);
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id2, 4));
        dj3VarQ.d(id2, 6, 0, 6);
        new l2a(dj3VarQ, 6, id2, 4).e(iG);
        dj3VarQ.d(id2, 7, 0, 7);
        new l2a(dj3VarQ, 7, id2, 4).e(iG);
        int id3 = textView2.getId();
        dj3VarQ.d(id3, 3, textView.getId(), 4);
        au1.p(8, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id3, 4));
        dj3VarQ.d(id3, 6, 0, 6);
        new l2a(dj3VarQ, 6, id3, 4).e(iG);
        dj3VarQ.d(id3, 7, 0, 7);
        new l2a(dj3VarQ, 7, id3, 4).e(iG);
        int id4 = oneMeButton.getId();
        dj3VarQ.d(id4, 3, textView2.getId(), 4);
        au1.p(24, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        new l2a(dj3VarQ, 6, id4, 4).e(iG);
        dj3VarQ.d(id4, 7, 0, 7);
        new l2a(dj3VarQ, 7, id4, 4).e(iG);
        dj3VarQ.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    public final fka getCustomTheme() {
        bc7 bc7Var = L0[0];
        return (fka) this.K0.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(getCurrentTheme());
        lmd background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lmd background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            int top = this.G0.getTop();
            lmd background = getBackground();
            if (background != null) {
                background.a(top);
            }
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        lmd background = getBackground();
        if (background != null) {
            background.setPadding(0, 0, 0, getPaddingBottom());
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        lmd background = getBackground();
        if (background != null) {
            background.onThemeChanged(getCurrentTheme());
        }
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(getCurrentTheme().getIcon().b);
        ImageView imageView = this.G0;
        imageView.setImageTintList(colorStateListValueOf);
        ((GradientDrawable) imageView.getBackground()).setColors(hm9.a(getCurrentTheme()));
        this.H0.setTextColor(getCurrentTheme().getText().e);
        this.I0.setTextColor(getCurrentTheme().getText().g);
        this.J0.setCustomTheme(getCustomTheme());
    }

    public final void setCustomTheme(fka fkaVar) {
        this.K0.o1(this, L0[0], fkaVar);
    }

    public final void setIcon(int i) {
        this.G0.setImageResource(i);
    }

    public final void setSubtitle(jqe jqeVar) {
        TextView textView = this.I0;
        textView.setText(jqeVar.b(textView.getContext()));
        CharSequence text = textView.getText();
        textView.setVisibility((text == null || text.length() == 0) ^ true ? 0 : 8);
    }

    public final void setTitle(jqe jqeVar) {
        TextView textView = this.H0;
        textView.setText(jqeVar.b(textView.getContext()));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        lmd background = getBackground();
        return background != null && background.b(drawable);
    }

    public final void x(String str, View.OnClickListener onClickListener) {
        OneMeButton oneMeButton = this.J0;
        oneMeButton.setVisibility(0);
        oneMeButton.setText(str);
        tu0.K(oneMeButton, 300L, onClickListener);
    }

    @Override // android.view.View
    public lmd getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof lmd) {
            return (lmd) background;
        }
        return null;
    }
}
