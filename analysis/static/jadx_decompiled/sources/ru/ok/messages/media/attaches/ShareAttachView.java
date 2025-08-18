package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import defpackage.bk4;
import defpackage.ed3;
import defpackage.fk4;
import defpackage.fm9;
import defpackage.khe;
import defpackage.la6;
import defpackage.ps8;
import defpackage.sme;
import defpackage.ss8;
import defpackage.ssc;
import defpackage.tp0;
import defpackage.ts8;
import defpackage.ujd;
import defpackage.vl;
import defpackage.wnc;
import defpackage.xxb;
import defpackage.y8a;

/* loaded from: classes2.dex */
public class ShareAttachView extends FrameLayout implements ps8, View.OnClickListener {
    public final bk4 a;
    public final LinearLayout b;
    public final FrameLayout c;
    public final ShareAttachHeaderView o;
    public final View s0;
    public final View t0;
    public final ShareAttachHeaderView u0;
    public final ShareAttachBigImageView v0;
    public final ShareAttachBigImageBgView w0;
    public final ShareMediaView x0;
    public final sme y0;
    public boolean z0;

    public ShareAttachView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.z0 = true;
        getContext();
        this.a = bk4.b();
        Context context2 = getContext();
        khe kheVar = sme.a0;
        this.y0 = fm9.R(context2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(this.b, new FrameLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        ShareAttachHeaderView shareAttachHeaderView = new ShareAttachHeaderView(getContext());
        this.o = shareAttachHeaderView;
        bk4 bk4Var = this.a;
        int i = bk4Var.h;
        shareAttachHeaderView.setPadding(i, i, i, bk4Var.f);
        this.b.addView(this.o, new LinearLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        View view = new View(getContext());
        this.s0 = view;
        view.setBackgroundColor(this.y0.p);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, this.a.a);
        layoutParams.setMarginStart(this.a.h);
        layoutParams.setMarginEnd(this.a.h);
        this.b.addView(this.s0, layoutParams);
        ShareAttachHeaderView shareAttachHeaderView2 = new ShareAttachHeaderView(getContext());
        this.u0 = shareAttachHeaderView2;
        int i2 = this.a.h;
        shareAttachHeaderView2.setPadding(i2, i2, i2, 0);
        this.b.addView(this.u0, new LinearLayout.LayoutParams(this.z0 ? -1 : -2, -2));
        this.c = new FrameLayout(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = this.a.f;
        this.b.addView(this.c, layoutParams2);
        ShareAttachBigImageBgView shareAttachBigImageBgView = new ShareAttachBigImageBgView(getContext());
        ed3 ed3VarB = vl.b();
        int i3 = tp0.f;
        ed3VarB.a(25, 1);
        ((y8a) ed3VarB).d();
        this.w0 = shareAttachBigImageBgView;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.c.addView(this.w0, layoutParams3);
        ShareAttachBigImageView shareAttachBigImageView = new ShareAttachBigImageView(getContext());
        ed3 ed3VarB2 = vl.b();
        shareAttachBigImageView.getContext();
        bk4.b();
        ((y8a) ed3VarB2).d();
        this.v0 = shareAttachBigImageView;
        ((la6) shareAttachBigImageView.getHierarchy()).h(ssc.l);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams4.gravity = 17;
        this.c.addView(this.v0, layoutParams4);
        ShareMediaView shareMediaView = new ShareMediaView(getContext());
        shareMediaView.getContext();
        bk4.b();
        shareMediaView.Y0 = fk4.b(r1);
        this.x0 = shareMediaView;
        shareMediaView.setId(xxb.view_share_attach__media);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams5.gravity = 17;
        this.c.addView(this.x0, layoutParams5);
        View view2 = new View(getContext());
        this.t0 = view2;
        view2.setBackgroundColor(this.y0.p);
        this.c.addView(this.t0, new FrameLayout.LayoutParams(-1, this.a.a));
        setClickable(true);
        la6 la6Var = (la6) this.w0.getHierarchy();
        this.a.getClass();
        float fB = fk4.b((int) 9.0f);
        this.a.getClass();
        wnc wncVarA = wnc.a(0.0f, 0.0f, fB, fk4.b(r1));
        wncVarA.h = true;
        la6Var.n(wncVarA);
        this.w0.setOnClickListener(this);
        this.x0.setAttachClickListener(this);
    }

    public ts8 getMediaView() {
        return this.x0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.x0.getVisibility();
        callOnClick();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        throw null;
    }

    public void setEmbeddedPlayer(boolean z) {
        this.x0.setEmbeddedPlayer(z);
    }

    public void setMatchHeaderWidthToParentWidth(boolean z) {
        if (this.z0 == z) {
            return;
        }
        this.z0 = z;
        this.b.setLayoutParams(new FrameLayout.LayoutParams(z ? -1 : -2, -2));
        this.u0.setLayoutParams(new LinearLayout.LayoutParams(z ? -1 : -2, -2));
        this.o.setLayoutParams(new LinearLayout.LayoutParams(z ? -1 : -2, -2));
    }

    public void setMediaClickListener(ujd ujdVar) {
    }

    public void setPipRequestListener(ss8 ss8Var) {
        this.x0.setPipRequestListener(ss8Var);
    }
}
