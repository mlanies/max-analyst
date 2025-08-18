package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class kf2 extends ConstraintLayout implements kre {
    public final TextView G0;
    public final TextView H0;
    public final Drawable I0;
    public final FrameLayout J0;
    public final je7 K0;
    public final s5a L0;
    public final ImageView M0;

    public kf2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        ti3 ti3Var = new ti3(-1, -2);
        ((ViewGroup.MarginLayoutParams) ti3Var).bottomMargin = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(ti3Var);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine(true);
        textView.setMaxLines(1);
        textView.setLetterSpacing(0.0f);
        textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        textView2.setLayoutParams(new ti3(-1, -2));
        i4f.n.b(textView2, du4.b);
        textView2.setMaxLines(1);
        this.H0 = textView2;
        int iG = tu0.G(48 * fk4.d().getDisplayMetrics().density);
        Drawable drawableB = kt3.b(getContext(), woc.L);
        this.I0 = drawableB;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setId(wea.g0);
        ti3 ti3Var2 = new ti3(iG, iG);
        float f = 12;
        ti3Var2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        frameLayout.setLayoutParams(ti3Var2);
        this.J0 = frameLayout;
        this.K0 = tu0.r(3, new x2(context, 20, this));
        s5a s5aVar = new s5a(context);
        s5aVar.setId(wea.h0);
        s5aVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        s5aVar.setAvatarShape(l5a.a);
        s5a.j(s5aVar, drawableB, null, 30);
        frameLayout.addView(s5aVar);
        this.L0 = s5aVar;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(wea.e0);
        linearLayout.setLayoutParams(new ti3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        ImageView imageView = new ImageView(context);
        imageView.setId(wea.f0);
        float f2 = 24;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        imageView.setVisibility(4);
        this.M0 = imageView;
        setLayoutParams(new ti3(-1, -2));
        pq9 pq9Var = qp4.u0;
        setBackground(new RippleDrawable(ColorStateList.valueOf(pq9Var.j(this).d().a.a.h), null, new ColorDrawable(-1)));
        setMinimumHeight(tu0.G(72 * fk4.d().getDisplayMetrics().density));
        float f3 = 15;
        setPaddingRelative(0, tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        addView(frameLayout);
        addView(linearLayout);
        addView(imageView);
        dj3 dj3VarQ = fp3.q(this);
        int id = frameLayout.getId();
        dj3VarQ.d(id, 6, 0, 6);
        dj3VarQ.d(id, 3, 0, 3);
        dj3VarQ.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        dj3VarQ.d(id2, 3, 0, 3);
        dj3VarQ.d(id2, 4, 0, 4);
        dj3VarQ.d(id2, 6, frameLayout.getId(), 7);
        au1.p(f, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id2, 4));
        dj3VarQ.d(id2, 7, 0, 7);
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(f * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
        onThemeChanged(pq9Var.j(this));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.G0.setTextColor(fkaVar.getText().e);
        this.H0.setTextColor(fkaVar.getText().g);
        this.L0.onThemeChanged(fkaVar);
        this.M0.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().f));
    }

    public final void setFileDescription(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }
}
