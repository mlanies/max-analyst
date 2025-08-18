package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final class x8a extends ConstraintLayout implements kre {
    public static final int V0 = tu0.G(16 * fk4.d().getDisplayMetrics().density);
    public static final int W0 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
    public static final int X0 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
    public static final int Y0 = tu0.G(56 * fk4.d().getDisplayMetrics().density);
    public static final int Z0 = 52;
    public final int G0;
    public final int H0;
    public final int I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final LayerDrawable N0;
    public final je7 O0;
    public final View P0;
    public final ms6 Q0;
    public final GradientDrawable R0;
    public final je7 S0;
    public final je7 T0;
    public w8a U0;

    public x8a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = getContext().getResources().getDimensionPixelSize(xfa.c);
        this.H0 = getContext().getResources().getDimensionPixelSize(xfa.d);
        this.I0 = getContext().getResources().getDimensionPixelSize(xfa.b);
        tu0.r(3, new hy4(context, 26));
        this.J0 = tu0.r(3, new v8a(context, this, 0));
        this.K0 = tu0.r(3, new v8a(context, this, 1));
        this.L0 = tu0.r(3, new hy4(context, 27));
        this.M0 = tu0.r(3, new v8a(context, this, 2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setColors(new int[]{452984831, 16777215}, new float[]{0.0f, 1.0f});
        gradientDrawable.setGradientType(0);
        this.N0 = new LayerDrawable(new Drawable[]{gradientDrawable, kt3.b(getContext(), woc.G)});
        this.O0 = tu0.r(3, new v8a(context, this, 3));
        View view = new View(context);
        view.setId(View.generateViewId());
        ti3 ti3Var = new ti3(1, 1);
        ti3Var.i = 0;
        ti3Var.v = 0;
        ti3Var.l = 0;
        ti3Var.t = 0;
        view.setLayoutParams(ti3Var);
        this.P0 = view;
        ms6 ms6Var = new ms6(context, new ww9(5));
        ms6Var.setId(View.generateViewId());
        ti3 ti3Var2 = new ti3(0, tu0.G(100 * fk4.d().getDisplayMetrics().density));
        ti3Var2.i = 0;
        ti3Var2.l = 0;
        ms6Var.setLayoutParams(ti3Var2);
        ms6Var.setInitialRadius$common_release(fk4.d().getDisplayMetrics().density * 42.0f);
        this.Q0 = ms6Var;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.BL_TR);
        this.R0 = gradientDrawable2;
        this.S0 = tu0.r(3, new hy4(context, 28));
        this.T0 = tu0.r(3, new v8a(this, context));
        this.U0 = w8a.a;
        setClipToOutline(true);
        setOutlineProvider(new ix3(getContext().getResources().getDimensionPixelSize(xfa.a)));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            float f = 82;
            layoutParams.height = tu0.G(fk4.d().getDisplayMetrics().density * f);
            setMaxHeight(tu0.G(f * fk4.d().getDisplayMetrics().density));
        } else {
            float f2 = 82;
            layoutParams = new ViewGroup.LayoutParams(-1, tu0.G(fk4.d().getDisplayMetrics().density * f2));
            setMaxHeight(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        }
        setLayoutParams(layoutParams);
        setBackground(gradientDrawable2);
        ay7.b(this, view, null);
        ay7.b(this, ms6Var, null);
        onThemeChanged(qp4.u0.b(context).i());
    }

    private final Drawable getChevronDrawable() {
        return (Drawable) this.T0.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.S0.getValue();
    }

    public static ImageView w(x8a x8aVar, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(xoc.m);
        imageView.setImageDrawable(x8aVar.getCloseBadgeDrawable());
        float f = 24;
        ti3 ti3Var = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        ti3Var.i = 0;
        ti3Var.v = 0;
        int i = x8aVar.H0;
        ti3Var.setMarginEnd(i);
        ((ViewGroup.MarginLayoutParams) ti3Var).topMargin = i;
        imageView.setLayoutParams(ti3Var);
        return imageView;
    }

    public final void A() {
        ms6 ms6Var = this.Q0;
        ViewGroup.LayoutParams layoutParams = ms6Var.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ti3 ti3Var = (ti3) layoutParams;
        if (this.O0.a()) {
            ti3Var.t = this.P0.getId();
            ti3Var.setMarginStart(-tu0.G(((Z0 / 2) + 24) * fk4.d().getDisplayMetrics().density));
        }
        ms6Var.setLayoutParams(ti3Var);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable == null) {
            return;
        }
        int iOrdinal = this.U0.ordinal();
        if (iOrdinal == 0) {
            je7 je7Var = this.J0;
            Layout layout = ((TextView) je7Var.getValue()).getLayout();
            if (layout != null) {
                int i = V0;
                chevronDrawable.setBounds(0, 0, i, i);
                int lineCount = layout.getLineCount() - 1;
                float lineRight = layout.getLineRight(lineCount);
                int lineTop = layout.getLineTop(lineCount);
                int lineBottom = layout.getLineBottom(lineCount) - lineTop;
                float x = ((TextView) je7Var.getValue()).getX();
                float y = ((TextView) je7Var.getValue()).getY();
                iSave = canvas.save();
                canvas.translate(Math.min(lineRight + x, x + ((TextView) je7Var.getValue()).getWidth()), ((lineBottom - i) / 2.0f) + y + lineTop);
                try {
                    chevronDrawable.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        je7 je7Var2 = this.K0;
        Layout layout2 = ((TextView) je7Var2.getValue()).getLayout();
        if (layout2 != null) {
            int i2 = W0;
            chevronDrawable.setBounds(0, 0, i2, i2);
            int lineCount2 = layout2.getLineCount() - 1;
            float lineRight2 = layout2.getLineRight(lineCount2);
            int lineTop2 = layout2.getLineTop(lineCount2);
            int lineBottom2 = layout2.getLineBottom(lineCount2) - lineTop2;
            float x2 = ((TextView) je7Var2.getValue()).getX();
            float y2 = ((TextView) je7Var2.getValue()).getY();
            iSave = canvas.save();
            canvas.translate(Math.min(lineRight2 + x2, x2 + ((TextView) je7Var2.getValue()).getWidth()), ((lineBottom2 - i2) / 2.0f) + y2 + lineTop2);
            try {
                chevronDrawable.draw(canvas);
            } finally {
            }
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        je7 je7Var = this.J0;
        if (je7Var.a()) {
            TextView textView = (TextView) je7Var.getValue();
            fkaVar.getText();
            textView.setTextColor(-1);
        }
        je7 je7Var2 = this.K0;
        if (je7Var2.a()) {
            TextView textView2 = (TextView) je7Var2.getValue();
            fkaVar.getText();
            textView2.setTextColor(f8.G(-1, 0.7f));
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        c54.Z(closeBadgeDrawable, "cross", fkaVar.getIcon().i);
        c54.Z(closeBadgeDrawable, "circle_background", fkaVar.b().a.c);
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            chevronDrawable.setTint(fkaVar.getIcon().f);
        }
    }

    public final void setBannerClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setChevronAppearance(w8a w8aVar) {
        this.U0 = w8aVar;
        invalidate();
    }

    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        ((ImageView) this.M0.getValue()).setOnClickListener(onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        je7 je7Var = this.M0;
        if (z || je7Var.a()) {
            ImageView imageView = (ImageView) je7Var.getValue();
            imageView.setVisibility(z ? 0 : 8);
            ay7.b(this, imageView, null);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        A();
    }

    public final void setSubtitle(String str) {
        je7 je7Var = this.K0;
        if (str != null && !w9e.C0(str)) {
            TextView textView = (TextView) je7Var.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            ay7.b(this, textView, null);
            y();
            return;
        }
        if (je7Var.a()) {
            TextView textView2 = (TextView) je7Var.getValue();
            textView2.setVisibility(8);
            textView2.setText((CharSequence) null);
            y();
        }
    }

    public final void setTitle(String str) {
        je7 je7Var = this.J0;
        if (str != null && !w9e.C0(str)) {
            TextView textView = (TextView) je7Var.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            ay7.b(this, textView, null);
            y();
            return;
        }
        if (je7Var.a()) {
            TextView textView2 = (TextView) je7Var.getValue();
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            y();
        }
    }

    public final void x(Drawable drawable, int i, int i2) {
        je7 je7Var = this.O0;
        je7 je7Var2 = this.L0;
        ms6 ms6Var = this.Q0;
        if (drawable == null) {
            if (je7Var2.a()) {
                ((FrameLayout) je7Var.getValue()).setVisibility(8);
                ImageView imageView = (ImageView) je7Var2.getValue();
                imageView.setVisibility(8);
                imageView.setImageDrawable(null);
                ms6Var.setIcon$common_release((Drawable) null);
                y();
                return;
            }
            return;
        }
        FrameLayout frameLayout = (FrameLayout) je7Var.getValue();
        frameLayout.setVisibility(0);
        ImageView imageView2 = (ImageView) je7Var2.getValue();
        int i3 = X0;
        int i4 = Y0;
        if (i > i4) {
            i = i4;
        } else if (i < i3) {
            i = i3;
        }
        if (i2 > i4) {
            i2 = i4;
        } else if (i2 < i3) {
            i2 = i3;
        }
        ViewGroup.LayoutParams layoutParams = imageView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.width = i;
        layoutParams.height = i2;
        imageView2.setLayoutParams(layoutParams);
        imageView2.setVisibility(0);
        imageView2.setImageDrawable(drawable);
        ms6Var.setIcon$common_release(drawable);
        ay7.b(this, frameLayout, null);
        ay7.b(this, imageView2, null);
        y();
    }

    public final void y() {
        int id;
        int id2;
        int id3;
        je7 je7Var = this.J0;
        boolean zA = je7Var.a();
        je7 je7Var2 = this.K0;
        je7 je7Var3 = this.O0;
        int i = this.I0;
        int id4 = -1;
        if (zA) {
            View view = (View) je7Var.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ti3 ti3Var = (ti3) layoutParams;
            if (br7.H(je7Var3)) {
                id2 = ((FrameLayout) je7Var3.getValue()).getId();
            } else {
                ti3Var.v = 0;
                id2 = -1;
            }
            ti3Var.u = id2;
            if (br7.H(je7Var2)) {
                ((ViewGroup.MarginLayoutParams) ti3Var).topMargin = i;
                id3 = ((TextView) je7Var2.getValue()).getId();
            } else {
                ((ViewGroup.MarginLayoutParams) ti3Var).topMargin = 0;
                ti3Var.l = 0;
                id3 = -1;
            }
            ti3Var.k = id3;
            view.setLayoutParams(ti3Var);
        }
        if (je7Var2.a()) {
            View view2 = (View) je7Var2.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            ti3 ti3Var2 = (ti3) layoutParams2;
            if (br7.H(je7Var)) {
                ((ViewGroup.MarginLayoutParams) ti3Var2).topMargin = this.G0;
                ((ViewGroup.MarginLayoutParams) ti3Var2).bottomMargin = i;
                id = ((TextView) je7Var.getValue()).getId();
            } else {
                ((ViewGroup.MarginLayoutParams) ti3Var2).topMargin = 0;
                ((ViewGroup.MarginLayoutParams) ti3Var2).bottomMargin = 0;
                ti3Var2.i = 0;
                id = -1;
            }
            ti3Var2.j = id;
            if (br7.H(je7Var3)) {
                id4 = ((FrameLayout) je7Var3.getValue()).getId();
            } else {
                ti3Var2.v = 0;
            }
            ti3Var2.u = id4;
            view2.setLayoutParams(ti3Var2);
        }
        A();
    }
}
