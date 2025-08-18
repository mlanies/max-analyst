package ru.ok.messages.media.attaches;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a30;
import defpackage.b30;
import defpackage.bs0;
import defpackage.du4;
import defpackage.ee4;
import defpackage.f40;
import defpackage.f60;
import defpackage.fk4;
import defpackage.fm9;
import defpackage.g60;
import defpackage.gpc;
import defpackage.hm9;
import defpackage.i4f;
import defpackage.is0;
import defpackage.jpc;
import defpackage.ju0;
import defpackage.k8;
import defpackage.khe;
import defpackage.kqe;
import defpackage.l6d;
import defpackage.ls0;
import defpackage.lz7;
import defpackage.m;
import defpackage.mr0;
import defpackage.nse;
import defpackage.os2;
import defpackage.ote;
import defpackage.s70;
import defpackage.sme;
import defpackage.tu0;
import defpackage.x20;
import defpackage.x5;
import defpackage.xxb;
import defpackage.y20;
import defpackage.z20;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.ok.messages.views.widgets.audiowave.AudioWaveView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0004:\u0002\u0012\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ok/messages/media/attaches/AudioAttachView;", "Landroid/widget/RelativeLayout;", "Ls70;", "Lnse;", "", "", "Landroid/view/View;", "getClickableChildren", "()Ljava/util/List;", "Lx20;", "listener", "Le5f;", "setListener", "(Lx20;)V", "", "currentPosition", "setCurrentPosition", "(J)V", "Lb30;", "isActionModeDelegate", "setDelegate", "(Lb30;)V", "La30;", "audioTranscriptionStateChangeListener", "setAudioTranscriptionStateChangeListener", "(La30;)V", "Lf40;", "u0", "Lje7;", "getAudioController", "()Lf40;", "audioController", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class AudioAttachView extends RelativeLayout implements s70, nse {
    public static final /* synthetic */ int w0 = 0;
    public final AppCompatImageView a;
    public final AudioWaveView b;
    public final AppCompatTextView c;
    public final g60 o;
    public final AppCompatTextView s0;
    public Long t0;
    public final khe u0;
    public final HashMap v0;

    public AudioAttachView(Context context, AttributeSet attributeSet) {
        sme smeVarR;
        super(context, attributeSet, 0);
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context2 = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context2);
        }
        is0 is0Var = smeVarR.g;
        this.u0 = new khe(new m(13));
        int iG = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setImageResource(gpc.V);
        appCompatImageView.setId(xxb.view_audio_attach__btn_play);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.a = appCompatImageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iG, iG);
        layoutParams.addRule(20);
        layoutParams.addRule(10);
        addView(appCompatImageView, layoutParams);
        tu0.K(appCompatImageView, 300L, new y20(0));
        AudioWaveView audioWaveView = new AudioWaveView(context, null, 6);
        audioWaveView.setId(xxb.view_audio_attach__wave);
        audioWaveView.setListener(this);
        tu0.K(audioWaveView, 300L, new y20(0));
        audioWaveView.setOnLongClickListener(new z20(0));
        this.b = audioWaveView;
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, tu0.G(16 * fk4.d().getDisplayMetrics().density));
        layoutParams2.addRule(10);
        layoutParams2.addRule(17, appCompatImageView.getId());
        layoutParams2.addRule(21, -1);
        float f = 8;
        layoutParams2.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        addView(audioWaveView, layoutParams2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null);
        kqe kqeVar = i4f.a;
        os2.d.b(appCompatTextView, du4.b);
        appCompatTextView.setId(xxb.view_audio_attach__duration);
        this.c = appCompatTextView;
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams3.topMargin = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        layoutParams3.addRule(17, xxb.view_audio_attach__btn_play);
        layoutParams3.addRule(3, xxb.view_audio_attach__wave);
        addView(appCompatTextView, layoutParams3);
        g60 g60Var = new g60(context, attributeSet, 0);
        g60Var.setId(xxb.view_audio_attach__seek);
        g60Var.setVisibility(8);
        this.o = g60Var;
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(2, xxb.view_audio_attach__btn_play);
        layoutParams4.bottomMargin = tu0.F(fk4.d().getDisplayMetrics().density * 5.2d);
        addView(g60Var, layoutParams4);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, null);
        appCompatTextView2.setId(xxb.view_audio_attach__transcription_status);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setVisibility(8);
        appCompatTextView2.setGravity(17);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, tu0.G(18 * fk4.d().getDisplayMetrics().density));
        layoutParams5.addRule(17, xxb.view_audio_attach__duration);
        layoutParams5.addRule(3, xxb.view_audio_attach__wave);
        layoutParams5.setMarginStart(tu0.G(f * fk4.d().getDisplayMetrics().density));
        appCompatTextView2.setLayoutParams(layoutParams5);
        appCompatTextView2.setText(context.getString(jpc.R));
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        this.s0 = appCompatTextView2;
        addView(appCompatTextView2);
        c();
        this.v0 = new HashMap();
    }

    private final f40 getAudioController() {
        return (f40) this.u0.getValue();
    }

    @Override // defpackage.s70
    public final void a(float f) {
        this.o.setLayoutPosition(this.b.getX() + f);
    }

    @Override // defpackage.s70
    public final void b() {
        f();
        this.t0 = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // defpackage.nse
    public final void c() {
        Object objR;
        sme smeVarR;
        if (isInEditMode()) {
            objR = ee4.e0;
        } else {
            Context context = getContext();
            khe kheVar = sme.a0;
            objR = fm9.R(context);
        }
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context2 = getContext();
            khe kheVar2 = sme.a0;
            smeVarR = fm9.R(context2);
        }
        is0 is0Var = smeVarR.g;
        int i = is0Var.b.a;
        AppCompatImageView appCompatImageView = this.a;
        appCompatImageView.setColorFilter(i);
        bs0 bs0Var = is0Var.a;
        GradientDrawable gradientDrawableS = hm9.S(Integer.valueOf(bs0Var.e), null, null);
        objR.getClass();
        appCompatImageView.setBackground(hm9.g0(gradientDrawableS, hm9.S(Integer.valueOf(ote.b0(bs0Var.e, 0.8f)), null, null), null));
        AppCompatTextView appCompatTextView = this.c;
        ls0 ls0Var = is0Var.d;
        appCompatTextView.setTextColor(ls0Var.c);
        this.s0.setTextColor(ls0Var.c);
    }

    @Override // defpackage.s70
    public final void d(float f) {
        if (getAudioController().c.p(0L)) {
            this.o.setCurrentAudioPosition(0L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0019, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.s70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(float r5) {
        /*
            r4 = this;
            r5 = 0
            r4.setClipChildren(r5)
            r4.setClipToPadding(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewParent r1 = r4.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r2 == 0) goto L18
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L29
            r0.add(r1)
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L18
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L19
        L29:
            java.util.Iterator r0 = r0.iterator()
        L2d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r2 = r1.getClipToPadding()
            boolean r3 = r1.getClipChildren()
            if (r3 == 0) goto L45
            r2 = r2 | 2
        L45:
            r1.setClipChildren(r5)
            r1.setClipToPadding(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r3 = r4.v0
            r3.put(r1, r2)
            boolean r1 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L2d
        L58:
            g60 r4 = r4.o
            r0 = 0
            r4.setCurrentAudioPosition(r0)
            tg r0 = defpackage.mr0.w(r4)
            boolean r0 = r0.p()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L6f
            r4.setVisibility(r5)
            goto Lb6
        L6f:
            boolean r5 = r4.z0
            if (r5 == 0) goto L7e
            android.animation.Animator r5 = r4.y0
            if (r5 == 0) goto L7e
            boolean r5 = r5.isRunning()
            if (r5 != r1) goto L7e
            goto Lb6
        L7e:
            r4.z0 = r1
            android.animation.Animator r5 = r4.y0
            if (r5 == 0) goto L87
            defpackage.ju0.i(r5)
        L87:
            r5 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.ObjectAnimator r5 = r4.j(r5, r0)
            tg r0 = defpackage.mr0.w(r4)
            lg r0 = r0.a
            long r0 = r0.h()
            r5.setDuration(r0)
            tg r0 = defpackage.mr0.w(r4)
            lg r0 = r0.a
            android.view.animation.Interpolator r0 = r0.d()
            r5.setInterpolator(r0)
            mf r0 = new mf
            r1 = 1
            r0.<init>(r1, r4)
            r5.addListener(r0)
            r4.y0 = r5
            r5.start()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.e(float):void");
    }

    public final void f() {
        Animator animator;
        x5 x5Var = new x5(14, this);
        g60 g60Var = this.o;
        if (g60Var.getVisibility() == 8) {
            return;
        }
        if (!mr0.w(g60Var).p()) {
            g60Var.setVisibility(8);
            x5Var.invoke();
            return;
        }
        if (g60Var.A0 && (animator = g60Var.y0) != null && animator.isRunning()) {
            return;
        }
        g60Var.A0 = true;
        Animator animator2 = g60Var.y0;
        if (animator2 != null) {
            ju0.i(animator2);
        }
        ObjectAnimator objectAnimatorJ = g60Var.j(1.0f, 0.0f);
        objectAnimatorJ.setDuration(mr0.w(g60Var).a.h());
        objectAnimatorJ.setInterpolator(mr0.w(g60Var).a.l());
        objectAnimatorJ.addListener(new f60(g60Var, x5Var, x5Var, 0));
        g60Var.y0 = objectAnimatorJ;
        objectAnimatorJ.start();
    }

    public List<View> getClickableChildren() {
        return l6d.i0(l6d.Z(lz7.m(this), new k8(14)));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        f();
        super.onDetachedFromWindow();
    }

    public final void setAudioTranscriptionStateChangeListener(a30 audioTranscriptionStateChangeListener) {
    }

    public void setCurrentPosition(long currentPosition) {
        if (this.b.C0) {
            return;
        }
        Long l = this.t0;
        if (l == null || SystemClock.elapsedRealtime() - l.longValue() >= 34) {
            this.t0 = null;
            getAudioController().c.p(0L);
            this.o.setCurrentAudioPosition(currentPosition);
        }
    }

    public final void setDelegate(b30 isActionModeDelegate) {
    }

    public final void setListener(x20 listener) {
    }
}
