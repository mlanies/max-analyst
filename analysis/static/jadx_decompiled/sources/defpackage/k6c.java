package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.ImageView;

/* loaded from: classes2.dex */
public final class k6c extends hqd implements kre {
    public final l6c F0;
    public final GradientDrawable G0;
    public final RippleDrawable H0;
    public final RippleDrawable I0;

    public k6c(Context context, l6c l6cVar) {
        int iG = tu0.G(l6cVar.a() * fk4.d().getDisplayMetrics().density);
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(new pdc(iG, iG));
        imageView.setClipToOutline(false);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.addOnAttachStateChangeListener(new ck(7, imageView));
        super(imageView);
        this.F0 = l6cVar;
        pq9 pq9Var = qp4.u0;
        GradientDrawable gradientDrawableS = hm9.S(Integer.valueOf(pq9Var.j(imageView).b().a.h), null, null);
        this.G0 = gradientDrawableS;
        this.H0 = new RippleDrawable(ColorStateList.valueOf(ote.b0(pq9Var.j(imageView).getText().e, 0.3f)), gradientDrawableS, hm9.S(-65536, null, null));
        this.I0 = new RippleDrawable(ColorStateList.valueOf(ote.b0(pq9Var.j(imageView).getText().e, 0.3f)), null, null);
    }

    @Override // defpackage.hqd
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final void A(j6c j6cVar) {
        int iG;
        boolean z = j6cVar.o;
        if (z) {
            iG = tu0.G(((r1.a() - (ay7.B(this.F0.a) >= 360 ? 22 : 20)) / 2) * fk4.d().getDisplayMetrics().density);
        } else {
            iG = 0;
        }
        View view = this.a;
        view.setPadding(iG, iG, iG, iG);
        view.setBackground(z ? this.H0 : this.I0);
        ((ImageView) view).setImageDrawable(j6cVar.c);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.H0.setColor(ColorStateList.valueOf(ote.b0(fkaVar.getText().e, 0.3f)));
        this.G0.setColor(fkaVar.b().a.h);
        this.I0.setColor(ColorStateList.valueOf(ote.b0(fkaVar.getText().e, 0.3f)));
    }
}
