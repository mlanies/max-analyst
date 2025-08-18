package ru.ok.messages.media.attaches;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import defpackage.bk4;
import defpackage.dj3;
import defpackage.ed3;
import defpackage.fm9;
import defpackage.j47;
import defpackage.khe;
import defpackage.la6;
import defpackage.sme;
import defpackage.ssc;
import defpackage.ti3;
import defpackage.vl;
import defpackage.wnc;
import defpackage.xxb;
import defpackage.y8a;
import defpackage.zi3;

/* loaded from: classes2.dex */
public class ShareAttachHeaderView extends ConstraintLayout {
    public bk4 G0;
    public int H0;
    public int I0;
    public AppCompatTextView J0;
    public AppCompatTextView K0;
    public AppCompatTextView L0;
    public SimpleDraweeView M0;
    public sme N0;

    public ShareAttachHeaderView(Context context) {
        super(context);
        w();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) throws Resources.NotFoundException, NumberFormatException {
        boolean z = this.M0.getVisibility() == 0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i) - (z ? this.H0 - (this.I0 * 2) : 0), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        this.L0.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.J0.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        if (z) {
            int measuredHeight = this.J0.getMeasuredHeight() + this.L0.getMeasuredHeight();
            if (measuredHeight < this.H0) {
                this.M0.getLayoutParams().width = measuredHeight;
                this.M0.getLayoutParams().height = measuredHeight;
            } else {
                this.M0.getLayoutParams().width = this.H0;
                this.M0.getLayoutParams().height = this.H0;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setImageVisibility(int i) {
        this.M0.setVisibility(i);
    }

    public final void w() {
        ed3 ed3VarB = vl.b();
        getContext();
        this.G0 = bk4.b();
        ((y8a) ed3VarB).d();
        bk4 bk4Var = this.G0;
        this.H0 = bk4Var.y;
        this.I0 = bk4Var.h;
        Context context = getContext();
        khe kheVar = sme.a0;
        this.N0 = fm9.R(context);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.M0 = simpleDraweeView;
        simpleDraweeView.setId(xxb.view_share_attach__iv_small_image);
        ((la6) this.M0.getHierarchy()).h(ssc.l);
        la6 la6Var = (la6) this.M0.getHierarchy();
        float f = this.G0.d;
        wnc wncVarA = wnc.a(f, f, f, f);
        wncVarA.h = true;
        la6Var.n(wncVarA);
        j47.q(this.M0, this.I0);
        int i = this.G0.y;
        ti3 ti3Var = new ti3(this.I0 + i, i);
        ti3Var.X = true;
        ti3Var.W = true;
        addView(this.M0, ti3Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        this.L0 = appCompatTextView;
        appCompatTextView.setId(xxb.view_share_attach__tv_host);
        this.L0.setIncludeFontPadding(false);
        this.L0.setMaxLines(1);
        this.L0.setTextColor(this.N0.v);
        this.L0.setTextSize(0, this.G0.H);
        AppCompatTextView appCompatTextView2 = this.L0;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView2.setEllipsize(truncateAt);
        this.L0.setGravity(8388611);
        this.L0.setTextAlignment(5);
        ti3 ti3Var2 = new ti3(-2, -2);
        ti3Var2.W = true;
        ti3Var2.X = true;
        ti3Var2.E = 0.0f;
        addView(this.L0, ti3Var2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext(), null);
        this.J0 = appCompatTextView3;
        appCompatTextView3.setId(xxb.view_share_attach__tv_title);
        this.J0.setIncludeFontPadding(false);
        this.J0.setMaxLines(2);
        this.J0.setTextSize(0, this.G0.I);
        this.J0.setTypeface(Typeface.DEFAULT_BOLD);
        this.J0.setEllipsize(truncateAt);
        this.J0.setGravity(8388611);
        this.J0.setTextAlignment(5);
        ti3 ti3Var3 = new ti3(-2, -2);
        ti3Var3.W = true;
        ti3Var3.X = true;
        ti3Var3.E = 0.0f;
        addView(this.J0, ti3Var3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(getContext(), null);
        this.K0 = appCompatTextView4;
        appCompatTextView4.setId(xxb.view_share_attach__tv_description);
        this.K0.setMaxLines(3);
        this.K0.setTextColor(this.N0.v);
        this.K0.setTextSize(0, this.G0.I);
        this.K0.setEllipsize(truncateAt);
        this.K0.setGravity(8388611);
        this.K0.setTextAlignment(5);
        ti3 ti3Var4 = new ti3(-2, -2);
        ti3Var4.W = true;
        ti3Var4.X = true;
        ti3Var4.E = 0.0f;
        addView(this.K0, ti3Var4);
        dj3 dj3Var = new dj3();
        dj3Var.c(this);
        dj3Var.d(this.M0.getId(), 3, 0, 3);
        dj3Var.d(this.M0.getId(), 7, 0, 7);
        dj3Var.g(this.M0.getId()).d.y = "1:1";
        dj3Var.d(this.L0.getId(), 6, 0, 6);
        dj3Var.d(this.L0.getId(), 3, 0, 3);
        dj3Var.d(this.L0.getId(), 7, this.M0.getId(), 6);
        dj3Var.d(this.J0.getId(), 6, 0, 6);
        dj3Var.d(this.J0.getId(), 3, this.L0.getId(), 4);
        dj3Var.d(this.J0.getId(), 7, this.M0.getId(), 6);
        int i2 = xxb.view_share_attach_header__vertical_barrier;
        int[] iArr = {this.M0.getId(), this.L0.getId(), this.J0.getId()};
        zi3 zi3Var = dj3Var.g(i2).d;
        zi3Var.h0 = 1;
        zi3Var.f0 = 3;
        zi3Var.g0 = 0;
        zi3Var.a = false;
        zi3Var.i0 = iArr;
        dj3Var.d(this.K0.getId(), 6, 0, 6);
        dj3Var.d(this.K0.getId(), 3, xxb.view_share_attach_header__vertical_barrier, 3);
        dj3Var.d(this.K0.getId(), 7, 0, 7);
        dj3Var.d(this.K0.getId(), 4, 0, 4);
        dj3Var.a(this);
    }

    public ShareAttachHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        w();
    }
}
