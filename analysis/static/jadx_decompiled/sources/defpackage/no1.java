package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class no1 extends ConstraintLayout implements bk1, zj1, pv3 {
    public static final /* synthetic */ bc7[] s1 = {new oi9(no1.class, "mode", "getMode()Lone/me/calls/ui/view/CallUserLargeView$Companion$ActionsMode;"), rh4.g(nec.a, no1.class, "backgroundState", "getBackgroundState()Lone/me/calls/ui/view/CallUserLargeView$Companion$BackgroundState;")};
    public final s5a G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public final je7 O0;
    public final je7 P0;
    public final ViewStub Q0;
    public final ViewStub R0;
    public final ViewStub S0;
    public final ViewStub T0;
    public final ViewStub U0;
    public final ViewStub V0;
    public final ViewStub W0;
    public final ViewStub X0;
    public final GestureDetector Y0;
    public Boolean Z0;
    public Boolean a1;
    public Boolean b1;
    public CharSequence c1;
    public CharSequence d1;
    public CharSequence e1;
    public lo1 f1;
    public k56 g1;
    public qv3 h1;
    public gg1 i1;
    public AnimatorSet j1;
    public final je7 k1;
    public final je7 l1;
    public final je7 m1;
    public final je7 n1;
    public final je7 o1;
    public final je7 p1;
    public final mo1 q1;
    public final mo1 r1;

    public no1(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.H0 = tu0.r(3, new a5(context, 18));
        this.I0 = tu0.r(3, new a5(context, 19));
        final int i = 3;
        this.J0 = tu0.r(3, new k56() { // from class: go1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return no1.E(context, this);
                    case 1:
                        return no1.C(context, this);
                    case 2:
                        lmd lmdVar = new lmd(context);
                        kmd kmdVar = lmdVar.b;
                        kmdVar.c(false);
                        lmdVar.onThemeChanged(qp4.u0.p(this).c);
                        lmdVar.o = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        imd imdVar = imd.b;
                        jmd jmdVar = kmdVar.u0;
                        bc7[] bc7VarArr = kmd.A0;
                        jmdVar.o1(kmdVar, bc7VarArr[2], imdVar);
                        kmdVar.getClass();
                        kmdVar.v0.o1(kmdVar, bc7VarArr[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        return lmdVar;
                    default:
                        return no1.w(context, this);
                }
            }
        });
        this.K0 = tu0.r(3, new a5(context, 20));
        this.L0 = tu0.r(3, new a5(context, 14));
        this.M0 = tu0.r(3, new a5(context, 15));
        final int i2 = 0;
        this.N0 = tu0.r(3, new k56() { // from class: go1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return no1.E(context, this);
                    case 1:
                        return no1.C(context, this);
                    case 2:
                        lmd lmdVar = new lmd(context);
                        kmd kmdVar = lmdVar.b;
                        kmdVar.c(false);
                        lmdVar.onThemeChanged(qp4.u0.p(this).c);
                        lmdVar.o = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        imd imdVar = imd.b;
                        jmd jmdVar = kmdVar.u0;
                        bc7[] bc7VarArr = kmd.A0;
                        jmdVar.o1(kmdVar, bc7VarArr[2], imdVar);
                        kmdVar.getClass();
                        kmdVar.v0.o1(kmdVar, bc7VarArr[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        return lmdVar;
                    default:
                        return no1.w(context, this);
                }
            }
        });
        final int i3 = 1;
        this.O0 = tu0.r(3, new k56() { // from class: go1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return no1.E(context, this);
                    case 1:
                        return no1.C(context, this);
                    case 2:
                        lmd lmdVar = new lmd(context);
                        kmd kmdVar = lmdVar.b;
                        kmdVar.c(false);
                        lmdVar.onThemeChanged(qp4.u0.p(this).c);
                        lmdVar.o = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        imd imdVar = imd.b;
                        jmd jmdVar = kmdVar.u0;
                        bc7[] bc7VarArr = kmd.A0;
                        jmdVar.o1(kmdVar, bc7VarArr[2], imdVar);
                        kmdVar.getClass();
                        kmdVar.v0.o1(kmdVar, bc7VarArr[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        return lmdVar;
                    default:
                        return no1.w(context, this);
                }
            }
        });
        this.P0 = tu0.r(3, new a5(context, 16));
        this.i1 = gg1.c;
        this.k1 = tu0.r(3, new a5(context, 17));
        this.l1 = tu0.r(3, new io1(this, 1));
        this.m1 = tu0.r(3, new io1(this, 2));
        this.n1 = tu0.r(3, new dk1(13));
        this.o1 = tu0.r(3, new io1(this, 3));
        final int i4 = 2;
        this.p1 = tu0.r(3, new k56() { // from class: go1
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return no1.E(context, this);
                    case 1:
                        return no1.C(context, this);
                    case 2:
                        lmd lmdVar = new lmd(context);
                        kmd kmdVar = lmdVar.b;
                        kmdVar.c(false);
                        lmdVar.onThemeChanged(qp4.u0.p(this).c);
                        lmdVar.o = tu0.G(30 * fk4.d().getDisplayMetrics().density);
                        imd imdVar = imd.b;
                        jmd jmdVar = kmdVar.u0;
                        bc7[] bc7VarArr = kmd.A0;
                        jmdVar.o1(kmdVar, bc7VarArr[2], imdVar);
                        kmdVar.getClass();
                        kmdVar.v0.o1(kmdVar, bc7VarArr[3], Long.valueOf(MultiFileUploader.UPLOAD_NEXT_INTERVAL));
                        return lmdVar;
                    default:
                        return no1.w(context, this);
                }
            }
        });
        this.q1 = new mo1(this, 0);
        this.r1 = new mo1(this, 1);
        setLayoutParams(new ti3(-1, -1));
        s5a s5aVar = new s5a(context);
        s5aVar.setId(y7a.E1);
        s5aVar.setAvatarShape(j5a.a);
        this.G0 = s5aVar;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(y7a.F1);
        this.S0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(y7a.G1);
        this.R0 = viewStub2;
        ViewStub viewStub3 = new ViewStub(context);
        viewStub3.setId(y7a.M1);
        this.T0 = viewStub3;
        ViewStub viewStub4 = new ViewStub(context);
        viewStub4.setId(y7a.I1);
        this.U0 = viewStub4;
        ViewStub viewStub5 = new ViewStub(context);
        viewStub5.setId(y7a.J1);
        this.V0 = viewStub5;
        ViewStub viewStub6 = new ViewStub(context);
        viewStub6.setId(y7a.L1);
        this.W0 = viewStub6;
        ViewStub viewStub7 = new ViewStub(context);
        viewStub7.setId(y7a.K1);
        this.X0 = viewStub7;
        ViewStub viewStub8 = new ViewStub(context);
        viewStub8.setId(y7a.t0);
        this.Q0 = viewStub8;
        this.Y0 = new GestureDetector(context, new q00(3, this));
        float f = 200;
        addView(s5aVar, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(viewStub3, -1, -1);
        addView(viewStub);
        addView(viewStub2);
        addView(viewStub4);
        addView(viewStub5);
        addView(viewStub6);
        addView(viewStub7);
        addView(viewStub8);
        dj3 dj3VarQ = fp3.q(this);
        int id = viewStub.getId();
        dj3VarQ.d(id, 3, 0, 3);
        au1.p(82, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id, 4));
        dj3VarQ.d(id, 6, 0, 6);
        float f2 = 24;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 6, id, 4));
        dj3VarQ.d(id, 7, 0, 7);
        new l2a(dj3VarQ, 7, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        dj3VarQ.d(id, 4, viewStub2.getId(), 3);
        dj3VarQ.g(id).d.W = 2;
        int id2 = viewStub2.getId();
        dj3VarQ.d(id2, 3, viewStub.getId(), 4);
        float f3 = 12;
        new l2a(dj3VarQ, 3, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        dj3VarQ.d(id2, 6, viewStub.getId(), 6);
        new l2a(dj3VarQ, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        dj3VarQ.d(id2, 7, viewStub.getId(), 7);
        new l2a(dj3VarQ, 7, id2, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id2, 4, s5aVar.getId(), 3);
        new l2a(dj3VarQ, 4, id2, 4).e(tu0.G(16 * fk4.d().getDisplayMetrics().density));
        int id3 = s5aVar.getId();
        dj3VarQ.d(id3, 3, 0, 3);
        dj3VarQ.d(id3, 4, 0, 4);
        dj3VarQ.d(id3, 6, 0, 6);
        dj3VarQ.d(id3, 7, 0, 7);
        dj3VarQ.g(id3).d.x = 0.45f;
        int id4 = viewStub6.getId();
        dj3VarQ.d(id4, 3, s5aVar.getId(), 4);
        au1.p(32, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id4, 4));
        dj3VarQ.d(id4, 6, 0, 6);
        dj3VarQ.d(id4, 7, 0, 7);
        int id5 = viewStub3.getId();
        dj3VarQ.d(id5, 4, 0, 4);
        dj3VarQ.d(id5, 3, 0, 3);
        dj3VarQ.d(id5, 6, 0, 6);
        dj3VarQ.d(id5, 7, 0, 7);
        int id6 = viewStub4.getId();
        dj3VarQ.d(id6, 6, 0, 6);
        dj3VarQ.d(id6, 7, viewStub5.getId(), 6);
        dj3VarQ.d(id6, 4, 0, 4);
        new l2a(dj3VarQ, 4, id6, 4).e(tu0.G(86 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.g(id6).d.V = 2;
        int id7 = viewStub5.getId();
        dj3VarQ.d(id7, 7, 0, 7);
        dj3VarQ.d(id7, 6, viewStub4.getId(), 7);
        new l2a(dj3VarQ, 6, id7, 4).e(tu0.G(92 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.d(id7, 4, viewStub4.getId(), 4);
        int id8 = viewStub7.getId();
        dj3VarQ.d(id8, 3, 0, 3);
        dj3VarQ.d(id8, 4, 0, 4);
        dj3VarQ.d(id8, 7, s5aVar.getId(), 7);
        dj3VarQ.g(id8).d.x = 0.56f;
        int id9 = viewStub8.getId();
        dj3VarQ.d(id9, 3, 0, 3);
        au1.p(f3, fk4.d().getDisplayMetrics().density, new l2a(dj3VarQ, 3, id9, 4));
        dj3VarQ.d(id9, 6, 0, 6);
        new l2a(dj3VarQ, 6, id9, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        dj3VarQ.a(this);
    }

    public static ImageView C(Context context, no1 no1Var) {
        ImageView imageView = new ImageView(context);
        imageView.setId(y7a.t0);
        float f = 40;
        imageView.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView.setImageDrawable(no1Var.getRaiseHandIcon());
        tu0.K(imageView, 300L, new c5(12, no1Var));
        return imageView;
    }

    public static ImageView E(Context context, no1 no1Var) {
        ImageView imageView = new ImageView(context);
        imageView.setId(y7a.K1);
        int iG = tu0.G(18 * fk4.d().getDisplayMetrics().density);
        imageView.setPadding(iG, iG, iG, iG);
        float f = 72;
        imageView.setLayoutParams(new ViewGroup.MarginLayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView.setVisibility(8);
        imageView.setBackground(no1Var.getLockedDrawable());
        imageView.setImageResource(x7a.U);
        imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.p(imageView).c.getIcon().f));
        return imageView;
    }

    public static void F(no1 no1Var, CharSequence charSequence) {
        no1Var.getSpeakerLabelView().setLabel(charSequence);
    }

    public static void G(no1 no1Var, CharSequence charSequence) {
        no1Var.getStatusTextView().setText(charSequence);
    }

    public static void I(no1 no1Var, boolean z) {
        dy7.M(no1Var.getRenderVideoView(), z);
        boolean z2 = !z;
        if (ft.l(no1Var.G0) != z2) {
            ft.g(no1Var.G0, z2, 0L, new xa1(no1Var, z2, 1), 2);
        }
        no1Var.S(z2 ? 255 : 0, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lmd getAnimatedBackground() {
        return (lmd) this.p1.getValue();
    }

    private final int getBackgroundCenterY() {
        s5a s5aVar = this.G0;
        return (s5aVar.getMeasuredHeight() / 2) + s5aVar.getTop();
    }

    private final ImageView getBlockedLabelView() {
        return (ImageView) this.N0.getValue();
    }

    private final ShapeDrawable getDisableDrawable() {
        return (ShapeDrawable) this.m1.getValue();
    }

    private final GradientDrawable getForegroundDrawable() {
        return (GradientDrawable) this.o1.getValue();
    }

    private final ShapeDrawable getLockedDrawable() {
        return (ShapeDrawable) this.l1.getValue();
    }

    private final ov3 getMarginTop() {
        ov3 ov3Var;
        ov3 ov3Var2 = ov3.d;
        qv3 qv3Var = this.h1;
        return (qv3Var == null || (ov3Var = ((uv3) qv3Var).j) == null) ? ov3Var2 : ov3Var;
    }

    private final TextView getNameTextView() {
        return (TextView) this.H0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final knc getNegativeButtonView() {
        return (knc) this.M0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final knc getPositiveButtonView() {
        return (knc) this.L0.getValue();
    }

    private final k4c getRaiseHandIcon() {
        return (k4c) this.k1.getValue();
    }

    private final int getRaiseHandTopPadding() {
        return tu0.G(12 * fk4.d().getDisplayMetrics().density);
    }

    private final ImageView getRaiseHandView() {
        return (ImageView) this.O0.getValue();
    }

    private final ip1 getRenderVideoView() {
        return (ip1) this.J0.getValue();
    }

    private final ivc getScreenInfo() {
        return (ivc) this.P0.getValue();
    }

    private final dm1 getSpeakerLabelView() {
        return (dm1) this.K0.getValue();
    }

    private final TextView getStatusTextView() {
        return (TextView) this.I0.getValue();
    }

    private final InsetDrawable getTalkingDrawable() {
        return (InsetDrawable) this.n1.getValue();
    }

    public static ip1 w(Context context, no1 no1Var) {
        ip1 ip1Var = new ip1(context);
        ip1Var.setId(y7a.M1);
        ip1Var.setForeground(no1Var.getForegroundDrawable());
        ip1Var.setLayoutParams(new ti3(-1, -1));
        ip1Var.setFullScreen(true);
        dy7.M(ip1Var, false);
        ip1Var.setListener(new ync(18, no1Var));
        ip1Var.setVideoLayoutUpdatesControllerProvider(new io1(no1Var, 0));
        return ip1Var;
    }

    public static void x(bg bgVar, no1 no1Var) {
        float f = bgVar.a;
        int iMax = Math.max((int) (no1Var.getHeight() * f), tu0.G(100 * fk4.d().getDisplayMetrics().density));
        int i = br7.G(no1Var.T0) ? no1Var.getRenderVideoView().y0 : false ? 0 : (int) (255 * f);
        int backgroundCenterY = (int) (no1Var.getBackgroundCenterY() * f);
        lmd background = no1Var.getBackground();
        if (background != null) {
            background.a(backgroundCenterY);
            background.setBounds(0, 0, no1Var.getWidth(), iMax);
            no1Var.S(i, true);
        }
    }

    public static void y(no1 no1Var, CharSequence charSequence) {
        no1Var.getNameTextView().setText(charSequence);
    }

    @Override // defpackage.pv3
    public final void D(ov3 ov3Var) {
        if (br7.G(this.Q0)) {
            dy7.L(getRaiseHandView(), ov3Var.b() + getRaiseHandTopPadding());
        }
    }

    @Override // defpackage.pv3
    public final List H(nv3 nv3Var, nv3 nv3Var2) {
        kl7 kl7VarL = j1e.l();
        if (br7.G(this.Q0)) {
            kl7VarL.add(z7.C(getRaiseHandView(), (Math.abs(nv3Var.d) - nv3Var.f) * nv3Var.c));
        }
        return j1e.d(kl7VarL);
    }

    public final void N(boolean z) {
        if (tpa.f(this.a1, Boolean.valueOf(z))) {
            return;
        }
        br7.F(this.X0, getBlockedLabelView(), null);
        this.a1 = Boolean.valueOf(z);
        getBlockedLabelView().setVisibility(z ? 0 : 8);
        this.G0.setForeground(z ? getDisableDrawable() : null);
    }

    public final void O(boolean z) {
        if (tpa.f(this.Z0, Boolean.valueOf(z))) {
            return;
        }
        this.Z0 = Boolean.valueOf(z);
        InsetDrawable talkingDrawable = getTalkingDrawable();
        if (!z) {
            talkingDrawable = null;
        }
        this.G0.setForeground(talkingDrawable);
    }

    public final void P(String str, CharSequence charSequence) {
        ViewStub viewStub = this.W0;
        if (((charSequence == null || w9e.C0(charSequence)) && !br7.G(viewStub)) || tpa.f(this.e1, charSequence)) {
            return;
        }
        br7.F(viewStub, getSpeakerLabelView(), null);
        this.e1 = charSequence;
        if (charSequence != null && !w9e.C0(charSequence)) {
            getSpeakerLabelView().setLabel(charSequence);
        }
        ft.g(getSpeakerLabelView(), !(charSequence == null || w9e.C0(charSequence)), 0L, new fo1(this, charSequence, 2), 2);
        getSpeakerLabelView().setContentDescription(str);
    }

    public final void Q(int i, int i2, k56 k56Var) {
        ViewStub viewStub = this.U0;
        br7.G(viewStub);
        br7.F(viewStub, getNegativeButtonView(), null);
        knc negativeButtonView = getNegativeButtonView();
        negativeButtonView.setVisibility(0);
        if (negativeButtonView.getVisibility() == 0) {
            knc.B(negativeButtonView, i);
            negativeButtonView.setAccessibility(Integer.valueOf(i2));
            negativeButtonView.setListener(new ho1(1, k56Var));
        }
    }

    public final void R(boolean z, int i, int i2, k56 k56Var) {
        ViewStub viewStub = this.V0;
        if (br7.G(viewStub) || z) {
            br7.F(viewStub, getPositiveButtonView(), null);
            knc positiveButtonView = getPositiveButtonView();
            positiveButtonView.setVisibility(z ? 0 : 8);
            if (positiveButtonView.getVisibility() == 0) {
                knc.B(positiveButtonView, i);
                positiveButtonView.setAccessibility(Integer.valueOf(i2));
                positiveButtonView.setListener(new ho1(0, k56Var));
            }
        }
    }

    public final void S(int i, boolean z) {
        Drawable background;
        int i2 = y7a.l;
        Object tag = getTag(i2);
        if ((tag != null || ((background = getBackground()) != null && background.getAlpha() == i)) && tpa.f(tag, Integer.valueOf(i))) {
            return;
        }
        AnimatorSet animatorSet = this.j1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        long j = z ? 0L : 200L;
        Drawable background2 = getBackground();
        int alpha = background2 != null ? background2.getAlpha() : 0;
        hg hgVar = new hg("alpha", alpha);
        setTag(i2, Integer.valueOf(i));
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.setDuration(j);
        animatorSet2.setInterpolator(new DecelerateInterpolator());
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt((Object) null, hgVar, alpha, i);
        int i3 = 0;
        objectAnimatorOfInt.addUpdateListener(new pg(this, hgVar, i3));
        animatorSet2.addListener(new qg(i, i3, this));
        animatorSet2.play(objectAnimatorOfInt);
        animatorSet2.start();
        this.j1 = animatorSet2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(defpackage.haf r8) {
        /*
            r7 = this;
            android.view.ViewStub r0 = r7.T0
            r1 = 0
            if (r8 == 0) goto L22
            boolean r2 = r8.b
            r3 = 0
            boolean r4 = r8.g
            if (r2 == 0) goto Lf
            if (r4 == 0) goto Lf
            goto L1a
        Lf:
            if (r4 == 0) goto L14
            llf r3 = r8.h
            goto L1a
        L14:
            boolean r2 = r8.c
            if (r2 == 0) goto L1a
            llf r3 = r8.d
        L1a:
            if (r3 == 0) goto L1f
            boolean r2 = r3.a
            goto L20
        L1f:
            r2 = r1
        L20:
            if (r2 != 0) goto L29
        L22:
            boolean r2 = defpackage.br7.G(r0)
            if (r2 != 0) goto L29
            return
        L29:
            ip1 r2 = r7.getRenderVideoView()
            boolean r3 = defpackage.br7.G(r0)
            if (r3 != 0) goto L65
            android.view.ViewParent r3 = r0.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r4 = r3.indexOfChild(r0)
            r3.removeViewInLayout(r0)
            android.view.ViewGroup$LayoutParams r5 = r0.getLayoutParams()
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.height
            r5.height = r6
            android.view.ViewGroup$LayoutParams r6 = r2.getLayoutParams()
            int r6 = r6.width
            r5.width = r6
            int r0 = r0.getId()
            r2.setId(r0)
            r3.addView(r2, r4, r5)
            ip1 r0 = r7.getRenderVideoView()
            defpackage.dy7.M(r0, r1)
        L65:
            ip1 r0 = r7.getRenderVideoView()
            int r2 = defpackage.ip1.z0
            r0.t0 = r8
            r0.u0 = r1
            ip1 r7 = r7.getRenderVideoView()
            r7.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no1.T(haf):void");
    }

    @Override // defpackage.bk1
    public final void a(boolean z) {
        if (z) {
            if (br7.G(this.R0)) {
                TextView statusTextView = getStatusTextView();
                statusTextView.setTranslationY(0.0f);
                statusTextView.setAlpha(1.0f);
            }
            if (br7.G(this.S0)) {
                TextView nameTextView = getNameTextView();
                nameTextView.setTranslationY(0.0f);
                nameTextView.setAlpha(1.0f);
            }
            s5a s5aVar = this.G0;
            s5aVar.setTranslationY(0.0f);
            s5aVar.setAlpha(1.0f);
            int i = br7.G(this.T0) ? getRenderVideoView().y0 : false ? 0 : 255;
            int measuredHeight = getMeasuredHeight();
            int backgroundCenterY = getBackgroundCenterY();
            lmd background = getBackground();
            if (background != null) {
                background.a(backgroundCenterY);
                background.setBounds(0, 0, getWidth(), measuredHeight);
                S(i, true);
            }
        }
    }

    @Override // defpackage.zj1
    public final void f(kl7 kl7Var, boolean z, long j) {
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        if (br7.G(this.W0)) {
            dm1 speakerLabelView = getSpeakerLabelView();
            if (ft.q(speakerLabelView, z)) {
                kl7Var.add(ft.c(speakerLabelView, z, f, f2, j));
            }
        }
        if (br7.G(this.S0)) {
            TextView nameTextView = getNameTextView();
            if (ft.q(nameTextView, z)) {
                kl7Var.add(ft.c(nameTextView, z, f, f2, j));
            }
        }
        if (br7.G(this.R0)) {
            TextView statusTextView = getStatusTextView();
            if (ft.q(statusTextView, z)) {
                kl7Var.add(ft.c(statusTextView, z, f, f2, j));
            }
        }
    }

    public final ko1 getBackgroundState() {
        bc7 bc7Var = s1[1];
        return (ko1) this.r1.b;
    }

    public final jo1 getMode() {
        bc7 bc7Var = s1[0];
        return (jo1) this.q1.b;
    }

    public /* bridge */ /* synthetic */ boolean getShouldScaleMainOpponent() {
        return false;
    }

    @Override // defpackage.bk1
    public final void h(kl7 kl7Var, boolean z, long j) {
        int i = 1;
        if (br7.G(this.R0)) {
            ft.a(kl7Var, getStatusTextView(), z);
        }
        if (br7.G(this.S0)) {
            ft.a(kl7Var, getNameTextView(), z);
        }
        float f = z ? 0.0f : 1.0f;
        float f2 = z ? 1.0f : 0.0f;
        bg bgVar = new bg("background", f);
        if (br7.G(this.T0) ? getRenderVideoView().y0 : false) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, bgVar, f, f2);
        objectAnimatorOfFloat.addUpdateListener(new yl(bgVar, i, this));
        kl7Var.add(objectAnimatorOfFloat);
        ft.a(kl7Var, this.G0, z);
    }

    @Override // defpackage.zj1
    public final void o(boolean z) {
        if (z) {
            if (br7.G(this.W0)) {
                getSpeakerLabelView().setAlpha(1.0f);
            }
            if (br7.G(this.S0)) {
                getNameTextView().setAlpha(1.0f);
            }
            if (br7.G(this.R0)) {
                getStatusTextView().setAlpha(1.0f);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lmd background = getBackground();
        if (background != null) {
            background.onThemeChanged(qp4.u0.p(this).c);
        }
        lmd background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        if (br7.G(this.Q0) && tpa.f(this.b1, Boolean.TRUE)) {
            getRaiseHandIcon().start();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        lmd background = getBackground();
        if (background != null) {
            background.stop();
        }
        if (br7.G(this.Q0)) {
            getRaiseHandIcon().stop();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        lmd background;
        super.onLayout(z, i, i2, i3, i4);
        if (z && (background = getBackground()) != null) {
            background.a(getBackgroundCenterY());
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (getScreenInfo().g) {
            getAnimatedBackground().o = Math.min(i, i2) / 4;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.Y0.onTouchEvent(motionEvent);
    }

    public final void setBackgroundState(ko1 ko1Var) {
        this.r1.o1(this, s1[1], ko1Var);
    }

    public final void setControlsMediator(qv3 qv3Var) {
        this.h1 = qv3Var;
    }

    public final void setListener(lo1 lo1Var) {
        this.f1 = lo1Var;
    }

    public final void setMode(jo1 jo1Var) {
        this.q1.o1(this, s1[0], jo1Var);
    }

    public final void setName(CharSequence charSequence) {
        ViewStub viewStub = this.S0;
        if ((br7.G(viewStub) || charSequence != null) && !tpa.f(this.c1, charSequence)) {
            br7.F(viewStub, getNameTextView(), null);
            this.c1 = charSequence;
            if (charSequence != null && !w9e.C0(charSequence)) {
                getNameTextView().setText(charSequence);
            }
            ft.g(getNameTextView(), !(charSequence == null || w9e.C0(charSequence)), 0L, new fo1(this, charSequence, 1), 2);
        }
    }

    public final void setParticipantId(gg1 gg1Var) {
        this.i1 = gg1Var;
    }

    public final void setRaiseHand(boolean z) {
        ViewStub viewStub = this.Q0;
        if (br7.G(viewStub) || z) {
            this.b1 = Boolean.valueOf(z);
            ImageView raiseHandView = getRaiseHandView();
            if (!br7.G(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int iIndexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = raiseHandView.getLayoutParams().height;
                layoutParams.width = raiseHandView.getLayoutParams().width;
                raiseHandView.setId(viewStub.getId());
                viewGroup.addView(raiseHandView, iIndexOfChild, layoutParams);
                dy7.L(getRaiseHandView(), getMarginTop().b() + getRaiseHandTopPadding());
            }
            ft.g(getRaiseHandView(), z, 50L, null, 4);
            k4c raiseHandIcon = getRaiseHandIcon();
            if (z) {
                raiseHandIcon.start();
            } else {
                raiseHandIcon.stop();
            }
        }
    }

    public final void setStatus(CharSequence charSequence) {
        ViewStub viewStub = this.R0;
        if ((br7.G(viewStub) || charSequence != null) && !tpa.f(this.d1, charSequence)) {
            br7.F(viewStub, getStatusTextView(), null);
            this.d1 = charSequence;
            if (charSequence != null && !w9e.C0(charSequence)) {
                getStatusTextView().setText(charSequence);
            }
            ft.g(getStatusTextView(), !(charSequence == null || w9e.C0(charSequence)), 0L, new fo1(this, charSequence, 0), 2);
        }
    }

    public final void setVideoLayoutUpdatesControllerProvider(k56 k56Var) {
        this.g1 = k56Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable)) {
            return true;
        }
        lmd background = getBackground();
        return background != null && background.b(drawable);
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
