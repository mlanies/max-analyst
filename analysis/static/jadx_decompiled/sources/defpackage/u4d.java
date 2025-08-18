package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.List;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes.dex */
public final class u4d extends hl7 {
    public final p58 X;
    public a66 Y;

    public u4d(p58 p58Var) {
        super(y34.h);
        this.X = p58Var;
        this.Y = new ai0(26);
    }

    @Override // defpackage.hl7
    public final void D(List list, List list2) {
        this.Y.invoke(list, list2);
    }

    @Override // defpackage.hdc
    public final void r(dec decVar, int i) throws NumberFormatException {
        t4d t4dVar = (t4d) decVar;
        q4d q4dVar = (q4d) C(i);
        t4dVar.I0 = q4dVar;
        Uri uri = t4dVar.J0;
        Uri uri2 = q4dVar.o;
        boolean zF = tpa.f(uri, uri2);
        Uri uri3 = q4dVar.s0;
        if (!zF || !tpa.f(t4dVar.K0, uri3)) {
            t4dVar.J0 = uri2;
            t4dVar.K0 = uri3;
            xv6 xv6VarD = xv6.d(uri2);
            xv6VarD.i = true;
            OneMeDraweeView oneMeDraweeView = t4dVar.G0;
            if (uri3 != null) {
                xv6VarD.l = new eoa(oneMeDraweeView.getContext(), uri3);
            }
            wv6 wv6VarA = xv6VarD.a();
            int i2 = OneMeDraweeView.B0;
            oneMeDraweeView.o(wv6VarA, null);
        }
        t4dVar.H0.setVisibility(q4dVar.a.w0 == 4 ? 0 : 8);
    }

    @Override // defpackage.hdc
    public final dec t(ViewGroup viewGroup, int i) {
        int i2 = t4d.L0;
        Context context = viewGroup.getContext();
        OneMeDraweeView oneMeDraweeView = new OneMeDraweeView(context);
        oneMeDraweeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Drawable drawableB = kt3.b(context, s8a.g);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 10.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        float f = 20;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 8388613);
        float f2 = 4;
        int iG = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        layoutParams.setMargins(iG, iG, iG, iG);
        appCompatImageView.setLayoutParams(layoutParams);
        int iG2 = tu0.G(fk4.d().getDisplayMetrics().density * f2);
        appCompatImageView.setPadding(iG2, iG2, iG2, iG2);
        appCompatImageView.setImageDrawable(drawableB);
        appCompatImageView.setBackground(gradientDrawable);
        Drawable drawableB2 = kt3.b(context, s8a.l);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2, 8388693);
        int iG3 = tu0.G(f2 * fk4.d().getDisplayMetrics().density);
        layoutParams2.setMargins(iG3, iG3, iG3, iG3);
        appCompatImageView2.setLayoutParams(layoutParams2);
        appCompatImageView2.setImageDrawable(drawableB2);
        FrameLayout frameLayout = new FrameLayout(context);
        float f3 = 64;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        float f4 = 2;
        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f4), ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin, tu0.G(f4 * fk4.d().getDisplayMetrics().density), ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin);
        frameLayout.setLayoutParams(layoutParams3);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(fk4.d().getDisplayMetrics().density * 12.0f);
        frameLayout.setBackground(gradientDrawable2);
        frameLayout.setClipToOutline(true);
        frameLayout.addView(oneMeDraweeView);
        frameLayout.addView(appCompatImageView);
        frameLayout.addView(appCompatImageView2);
        v3c.y(new jf1(drawableB, drawableB2, gradientDrawable, null, 6), frameLayout);
        return new t4d(this.X, oneMeDraweeView, appCompatImageView, appCompatImageView2, frameLayout);
    }
}
