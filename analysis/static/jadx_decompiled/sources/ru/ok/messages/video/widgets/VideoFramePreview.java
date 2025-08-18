package ru.ok.messages.video.widgets;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.bk4;
import defpackage.epc;
import defpackage.fm9;
import defpackage.hm9;
import defpackage.khe;
import defpackage.lt3;
import defpackage.ngg;
import defpackage.nse;
import defpackage.sme;
import ru.ok.utils.widgets.RoundedRectFrameLayout;

/* loaded from: classes2.dex */
public class VideoFramePreview extends RoundedRectFrameLayout implements nse {
    public final AppCompatImageView s0;
    public final AppCompatTextView t0;
    public final ProgressBar u0;
    public final View v0;

    public VideoFramePreview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bk4 bk4VarB = bk4.b();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        this.s0 = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(this.s0, new FrameLayout.LayoutParams(-1, -1));
        ProgressBar progressBar = new ProgressBar(context);
        this.u0 = progressBar;
        progressBar.setIndeterminate(true);
        int i = bk4VarB.n;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
        layoutParams.gravity = 17;
        addView(this.u0, layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        this.t0 = appCompatTextView;
        appCompatTextView.setTextColor(-1);
        this.t0.setTextSize(bk4VarB.F);
        this.t0.setGravity(17);
        AppCompatTextView appCompatTextView2 = this.t0;
        int i2 = bk4VarB.f;
        int i3 = bk4VarB.b;
        appCompatTextView2.setPadding(i2, i3, i2, i3);
        float f = bk4VarB.s;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#333344"));
        shapeDrawable.setAlpha(96);
        this.t0.setBackground(shapeDrawable);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = bk4VarB.d;
        addView(this.t0, layoutParams2);
        this.v0 = new View(getContext());
        this.v0.setBackground(hm9.b0(null, Integer.valueOf(lt3.a(getContext(), epc.g)), Integer.valueOf(bk4VarB.a), bk4VarB.g));
        addView(this.v0, new FrameLayout.LayoutParams(-1, -1));
        setCornerRadius(bk4VarB.h);
        c();
    }

    public final void a(boolean z) {
        if (z) {
            this.u0.setVisibility(0);
        } else {
            this.u0.setVisibility(8);
        }
    }

    @Override // defpackage.nse
    public final void c() {
        Context context = getContext();
        khe kheVar = sme.a0;
        ngg.H(this.u0, fm9.R(context).k);
    }

    public void setPreviewEnabled(boolean z) {
        View view = this.v0;
        AppCompatImageView appCompatImageView = this.s0;
        if (!z) {
            appCompatImageView.setVisibility(8);
            setBackground(null);
            view.setVisibility(8);
        } else {
            appCompatImageView.setVisibility(0);
            Context context = getContext();
            khe kheVar = sme.a0;
            setBackgroundColor(fm9.R(context).w);
            view.setVisibility(0);
        }
    }
}
