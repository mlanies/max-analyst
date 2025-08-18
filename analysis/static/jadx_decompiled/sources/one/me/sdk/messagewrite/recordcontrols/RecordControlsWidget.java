package one.me.sdk.messagewrite.recordcontrols;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.PathInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.ag;
import defpackage.bac;
import defpackage.bc7;
import defpackage.cbc;
import defpackage.dbc;
import defpackage.dy7;
import defpackage.ebc;
import defpackage.ev8;
import defpackage.fac;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.fua;
import defpackage.gbc;
import defpackage.hbc;
import defpackage.hob;
import defpackage.ibc;
import defpackage.j1e;
import defpackage.j37;
import defpackage.jac;
import defpackage.je7;
import defpackage.jp8;
import defpackage.kbc;
import defpackage.kl7;
import defpackage.kpa;
import defpackage.kwd;
import defpackage.lab;
import defpackage.lbc;
import defpackage.lc8;
import defpackage.lga;
import defpackage.lsf;
import defpackage.lwd;
import defpackage.m58;
import defpackage.mbc;
import defpackage.mga;
import defpackage.nbc;
import defpackage.nec;
import defpackage.ng3;
import defpackage.ngg;
import defpackage.obc;
import defpackage.od2;
import defpackage.oi9;
import defpackage.pbc;
import defpackage.pnf;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.rbc;
import defpackage.rv8;
import defpackage.sbc;
import defpackage.suc;
import defpackage.sv8;
import defpackage.t03;
import defpackage.tu0;
import defpackage.u33;
import defpackage.v3c;
import defpackage.vxd;
import defpackage.w7c;
import defpackage.woc;
import defpackage.z7b;
import defpackage.z84;
import defpackage.ze2;
import defpackage.zn5;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\r"}, d2 = {"Lone/me/sdk/messagewrite/recordcontrols/RecordControlsWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "Lbac;", "type", "(Ljava/lang/String;Lbac;Lz84;)V", "ibc", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class RecordControlsWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] b1 = {new oi9(RecordControlsWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;"), z7b.g(nec.a, RecordControlsWidget.class, "type", "getType()Lone/me/sdk/messagewrite/recordcontrols/RecordControlType;", 0), new hob(RecordControlsWidget.class, "rootView", "getRootView()Landroid/view/View;", 0), new hob(RecordControlsWidget.class, "recordingPanel", "getRecordingPanel()Landroid/view/View;", 0), new hob(RecordControlsWidget.class, "dotView", "getDotView()Landroid/view/View;", 0), new hob(RecordControlsWidget.class, "durationView", "getDurationView()Landroid/widget/TextView;", 0), new hob(RecordControlsWidget.class, "trashView", "getTrashView()Landroid/widget/ImageView;", 0), new hob(RecordControlsWidget.class, "cancelView", "getCancelView()Landroid/widget/TextView;", 0), new hob(RecordControlsWidget.class, "audioHandFreeRecordView", "getAudioHandFreeRecordView()Landroid/view/View;", 0), new hob(RecordControlsWidget.class, "removeButton", "getRemoveButton()Landroid/widget/ImageView;", 0), new hob(RecordControlsWidget.class, "pauseRecordingButton", "getPauseRecordingButton()Landroid/widget/ImageView;", 0), new hob(RecordControlsWidget.class, "playRecordingButton", "getPlayRecordingButton()Landroid/widget/ImageView;", 0), new hob(RecordControlsWidget.class, "actionViewContainer", "getActionViewContainer()Landroid/view/View;", 0), new hob(RecordControlsWidget.class, "actionViewBgContainer", "getActionViewBgContainer()Landroid/view/View;", 0), new hob(RecordControlsWidget.class, "actionViewBackground", "getActionViewBackground()Landroid/view/View;", 0), new hob(RecordControlsWidget.class, "actionView", "getActionView()Landroid/widget/ImageView;", 0), new hob(RecordControlsWidget.class, "lockView", "getLockView()Landroid/view/View;", 0)};
    public static final j37 c1 = new j37(0, 135, 1);
    public static final j37 d1 = new j37(135, 275, 1);
    public final q7c A0;
    public final q7c B0;
    public final q7c C0;
    public final q7c D0;
    public lsf E0;
    public final ibc F0;
    public final je7 G0;
    public final je7 H0;
    public final je7 I0;
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final je7 N0;
    public Float O0;
    public kpa P0;
    public kpa Q0;
    public float R0;
    public float S0;
    public kwd T0;
    public vxd U0;
    public AnimatorSet V0;
    public AnimatorSet W0;
    public final q7c X;
    public AnimatorSet X0;
    public final q7c Y;
    public AnimatorSet Y0;
    public final q7c Z;
    public AnimatorSet Z0;
    public final fs a;
    public float a1;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public final q7c y0;
    public final q7c z0;

    public RecordControlsWidget(String str, bac bacVar, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str)), new kpa("arg_key_type", bacVar)));
    }

    public static final u33 m0(RecordControlsWidget recordControlsWidget) {
        Object parentController = recordControlsWidget.getParentController();
        if (parentController instanceof u33) {
            return (u33) parentController;
        }
        return null;
    }

    public static final View n0(RecordControlsWidget recordControlsWidget) {
        recordControlsWidget.getClass();
        return (View) recordControlsWidget.Y.T0(recordControlsWidget, b1[3]);
    }

    public static final void o0(RecordControlsWidget recordControlsWidget) {
        kpa kpaVar = recordControlsWidget.Q0;
        if (kpaVar != null) {
            recordControlsWidget.z0().setTranslationX(((Number) kpaVar.a).floatValue());
            recordControlsWidget.z0().setTranslationY(((Number) kpaVar.b).floatValue());
        }
        kpa kpaVar2 = recordControlsWidget.P0;
        if (kpaVar2 != null) {
            recordControlsWidget.t0().setX(((Number) kpaVar2.a).floatValue());
            recordControlsWidget.t0().setY(((Number) kpaVar2.b).floatValue());
        }
        recordControlsWidget.P0 = null;
        recordControlsWidget.Q0 = null;
    }

    public final ev8 A0() {
        Object parentController = getParentController();
        if (parentController instanceof ev8) {
            return (ev8) parentController;
        }
        return null;
    }

    public final Drawable B0() {
        return (Drawable) this.G0.getValue();
    }

    public final ImageView C0() {
        return (ImageView) this.x0.T0(this, b1[10]);
    }

    public final ImageView D0() {
        return (ImageView) this.y0.T0(this, b1[11]);
    }

    public final ImageView E0() {
        return (ImageView) this.w0.T0(this, b1[9]);
    }

    public final View F0() {
        return (View) this.X.T0(this, b1[2]);
    }

    @Override // defpackage.ng3
    public final void G() {
        I0().A();
    }

    public final ImageView G0() {
        return (ImageView) this.t0.T0(this, b1[6]);
    }

    public final bac H0() {
        bc7 bc7Var = b1[1];
        return (bac) this.a.a(this);
    }

    public final cbc I0() {
        return (cbc) this.c.getValue();
    }

    public final void J0() {
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.W0;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.W0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        AnimatorSet animatorSet4 = this.Z0;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        this.W0 = new AnimatorSet();
        kl7 kl7VarL = j1e.l();
        if (H0() == bac.b) {
            ValueAnimator duration = ValueAnimator.ofInt(tu0.G(48 * fk4.d().getDisplayMetrics().density), tu0.G(96 * fk4.d().getDisplayMetrics().density)).setDuration(300L);
            duration.addUpdateListener(new dbc(this, 1));
            kl7VarL.add(duration);
        }
        View viewU0 = u0();
        Property property = View.ALPHA;
        kl7VarL.add(ngg.e(viewU0, property, 0.0f, 1.0f, 300L, 0L, 112));
        ImageView imageViewE0 = E0();
        Property property2 = View.TRANSLATION_Y;
        kl7VarL.add(ngg.e(imageViewE0, property2, fk4.d().getDisplayMetrics().density * 48.0f, 0.0f, 300L, 0L, 112));
        kl7VarL.add(ngg.e(E0(), property, 0.0f, 1.0f, 150L, 150L, 96));
        kl7VarL.add(ngg.e(C0(), property2, fk4.d().getDisplayMetrics().density * 48.0f, 0.0f, 300L, 0L, 112));
        kl7VarL.add(ngg.e(C0(), property, 0.0f, 1.0f, 150L, 150L, 96));
        kl7VarL.add(ngg.e(w0(), property, w0().getAlpha(), 0.0f, 150L, 0L, 112));
        kl7VarL.add(ngg.e(w0(), property2, 0.0f, fk4.d().getDisplayMetrics().density * 48.0f, 300L, 0L, 112));
        kl7VarL.add(ngg.e(x0(), property, 1.0f, 0.0f, 150L, 0L, 112));
        kl7VarL.add(ngg.e(x0(), property2, 0.0f, fk4.d().getDisplayMetrics().density * 48.0f, 300L, 0L, 112));
        kl7VarL.add(ngg.e(v0(), property, v0().getAlpha(), 0.0f, 150L, 0L, 112));
        kl7VarL.add(ngg.e(v0(), property2, v0().getTranslationY(), fk4.d().getDisplayMetrics().density * 48.0f, 300L, 0L, 112));
        kpa kpaVar = this.Q0;
        kl7VarL.add(ngg.e(z0(), property2, z0().getTranslationY(), kpaVar != null ? ((Number) kpaVar.b).floatValue() : 0.0f, 300L, 0L, 112));
        kl7VarL.add(ngg.e(z0(), property, 1.0f, 0.0f, 300L, 0L, 112));
        kl7VarL.add(ngg.e(t0(), property2, t0().getTranslationY(), 0.0f, 150L, 0L, 112));
        kl7VarL.addAll(ngg.F(s0(), 1.0f, tu0.G(36 * fk4.d().getDisplayMetrics().density) / (fk4.d().getDisplayMetrics().density * 124.0f), 300L, 0L));
        kl7 kl7VarD = j1e.d(kl7VarL);
        AnimatorSet animatorSet5 = this.W0;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new kbc(this, 6));
        }
        AnimatorSet animatorSet6 = this.W0;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new kbc(this, 5));
        }
        AnimatorSet animatorSet7 = this.W0;
        if (animatorSet7 != null) {
            animatorSet7.setInterpolator(y0());
        }
        AnimatorSet animatorSet8 = this.W0;
        if (animatorSet8 != null) {
            animatorSet8.playTogether(kl7VarD);
        }
        AnimatorSet animatorSet9 = this.W0;
        if (animatorSet9 != null) {
            animatorSet9.start();
        }
    }

    public final void K0() {
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.W0;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.W0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.W0 = new AnimatorSet();
        kl7 kl7VarL = j1e.l();
        kl7VarL.addAll(ngg.F(C0(), 1.0f, 0.5f, 150L, 0L));
        ImageView imageViewC0 = C0();
        Property property = View.ALPHA;
        kl7VarL.add(ngg.e(imageViewC0, property, 1.0f, 0.0f, 150L, 0L, 112));
        kl7VarL.addAll(ngg.F(D0(), 0.5f, 1.0f, 150L, 50L));
        kl7VarL.add(ngg.e(D0(), property, 0.0f, 1.0f, 150L, 50L, 96));
        lsf lsfVar = this.E0;
        if (lsfVar != null) {
            kl7VarL.addAll(lsfVar.getPauseAnimations());
        }
        kl7 kl7VarD = j1e.d(kl7VarL);
        AnimatorSet animatorSet4 = this.W0;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new kbc(this, 8));
        }
        AnimatorSet animatorSet5 = this.W0;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new kbc(this, 7));
        }
        AnimatorSet animatorSet6 = this.W0;
        if (animatorSet6 != null) {
            animatorSet6.setInterpolator(y0());
        }
        AnimatorSet animatorSet7 = this.W0;
        if (animatorSet7 != null) {
            animatorSet7.playTogether(kl7VarD);
        }
        AnimatorSet animatorSet8 = this.W0;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
    }

    public final void L0(boolean z) {
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.W0;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.W0;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.W0 = new AnimatorSet();
        kl7 kl7VarL = j1e.l();
        View viewW0 = w0();
        Property property = View.ALPHA;
        kl7VarL.add(ngg.e(viewW0, property, 0.0f, 1.0f, 300L, 150L, 96));
        View viewW02 = w0();
        Property property2 = View.TRANSLATION_X;
        kl7VarL.add(ngg.e(viewW02, property2, fk4.d().getDisplayMetrics().density * 72.0f, 0.0f, 300L, 150L, 96));
        kl7VarL.add(ngg.e(x0(), property, 0.0f, 1.0f, 300L, 150L, 96));
        kl7VarL.add(ngg.e(x0(), property2, fk4.d().getDisplayMetrics().density * 72.0f, 0.0f, 300L, 150L, 96));
        kl7VarL.add(ngg.e(v0(), property, 0.0f, 1.0f, 250L, 250L, 96));
        kl7VarL.add(ngg.e(v0(), property2, fk4.d().getDisplayMetrics().density * 70.0f, 0.0f, 300L, 200L, 96));
        kl7VarL.add(ngg.e(z0(), property, 0.0f, 1.0f, 150L, 250L, 96));
        kpa kpaVar = this.Q0;
        kl7VarL.add(ngg.e(z0(), View.TRANSLATION_Y, (-48) - (fk4.d().getDisplayMetrics().density * 2.0f), kpaVar != null ? ((Number) kpaVar.b).floatValue() : 0.0f, 200L, 200L, 96));
        pq9 pq9Var = qp4.u0;
        int i = pq9Var.j(q0()).a().s().a.b.b;
        pq9Var.j(q0()).a().s().a.b.getClass();
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(i, -1);
        valueAnimatorOfArgb.setStartDelay(150L);
        valueAnimatorOfArgb.setDuration(300L);
        valueAnimatorOfArgb.addUpdateListener(new dbc(this, 2));
        kl7VarL.add(valueAnimatorOfArgb);
        kl7VarL.addAll(ngg.F(s0(), 0.0f, 1.0f, 300L, 100L));
        kl7VarL.add(ngg.e(s0(), property, 0.0f, 1.0f, 300L, 100L, 96));
        kl7 kl7VarD = j1e.d(kl7VarL);
        AnimatorSet animatorSet4 = this.W0;
        if (animatorSet4 != null) {
            animatorSet4.setInterpolator(y0());
        }
        AnimatorSet animatorSet5 = this.W0;
        if (animatorSet5 != null) {
            animatorSet5.playTogether(kl7VarD);
        }
        AnimatorSet animatorSet6 = this.W0;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new kbc(this, 11));
        }
        AnimatorSet animatorSet7 = this.W0;
        if (animatorSet7 != null) {
            animatorSet7.addListener(new ag(this, z));
        }
        ev8 ev8VarA0 = A0();
        AnimatorSet animatorSet8 = null;
        if (ev8VarA0 != null) {
            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) ev8VarA0;
            if (messageWriteWidget.getView() != null) {
                sv8 sv8VarQ0 = messageWriteWidget.q0();
                sv8VarQ0.getClass();
                AnimatorSet animatorSet9 = new AnimatorSet();
                kl7 kl7VarL2 = j1e.l();
                kl7VarL2.add(ngg.e(sv8VarQ0.c, property2, 0.0f, fk4.d().getDisplayMetrics().density * (-74.0f), 300L, 0L, 112));
                kl7VarL2.add(ngg.e(sv8VarQ0.c, property, 1.0f, 0.0f, 300L, 0L, 112));
                ImageView imageView = sv8VarQ0.b;
                kl7VarL2.add(ngg.e(imageView, property2, 0.0f, fk4.d().getDisplayMetrics().density * (-74.0f), 300L, 0L, 112));
                kl7VarL2.add(ngg.e(imageView, property, 1.0f, 0.0f, 300L, 0L, 112));
                je7 je7Var = sv8VarQ0.s0;
                if (je7Var.a()) {
                    kl7VarL2.add(ngg.e((View) je7Var.getValue(), property, 1.0f, 0.0f, 200L, 0L, 112));
                    kl7VarL2.addAll(ngg.F((View) je7Var.getValue(), 1.0f, 0.0f, 300L, 0L));
                }
                je7 je7Var2 = sv8VarQ0.w0;
                if (je7Var2.a()) {
                    kl7VarL2.add(ngg.e((View) je7Var2.getValue(), property, 1.0f, 0.0f, 200L, 0L, 112));
                    kl7VarL2.addAll(ngg.F((View) je7Var2.getValue(), 1.0f, 0.0f, 300L, 0L));
                }
                kl7 kl7VarD2 = j1e.d(kl7VarL2);
                animatorSet9.addListener(new rv8(sv8VarQ0, 6));
                animatorSet9.playTogether(kl7VarD2);
                animatorSet8 = animatorSet9;
            }
        }
        AnimatorSet animatorSet10 = this.W0;
        if (animatorSet10 != null) {
            animatorSet10.playTogether(animatorSet8);
        }
        AnimatorSet animatorSet11 = this.W0;
        if (animatorSet11 != null) {
            animatorSet11.start();
        }
    }

    public final void M0() {
        vxd vxdVar = this.U0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        this.U0 = null;
        AnimatorSet animatorSet = this.V0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        r0().setScaleX(1.0f);
        r0().setScaleY(1.0f);
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            I0().A();
        } else {
            jac jacVar = (jac) this.b.getValue();
            pnf.o(jacVar.b, fac.a);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        I0().t();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(lga.f);
        float f = 48;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(fk4.d().getDisplayMetrics().density * f)));
        frameLayout.setClipChildren(false);
        frameLayout.setVisibility(4);
        ebc ebcVar = new ebc(this, 0);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setId(lga.p);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams.gravity = 80;
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setVisibility(4);
        linearLayout.setClickable(true);
        linearLayout.setFocusable(true);
        linearLayout.setMinimumHeight(48);
        linearLayout.setOrientation(0);
        linearLayout.setBackgroundColor(0);
        ebcVar.invoke(linearLayout);
        frameLayout.addView(linearLayout);
        ebc ebcVar2 = new ebc(this, 1);
        FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
        frameLayout2.setId(lga.e);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.G(H0() == bac.b ? 96 * fk4.d().getDisplayMetrics().density : fk4.d().getDisplayMetrics().density * f));
        layoutParams2.gravity = 80;
        frameLayout2.setLayoutParams(layoutParams2);
        frameLayout2.setVisibility(4);
        frameLayout2.setClickable(true);
        frameLayout2.setFocusable(true);
        int i = 3;
        v3c.y(new lc8(i, 0 == true ? 1 : 0, 2), frameLayout2);
        ebcVar2.invoke(frameLayout2);
        frameLayout.addView(frameLayout2);
        ebc ebcVar3 = new ebc(this, 2);
        FrameLayout frameLayout3 = new FrameLayout(frameLayout.getContext());
        frameLayout3.setId(lga.d);
        float f2 = 124;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams((int) (tu0.G(fk4.d().getDisplayMetrics().density * f2) * 1.45f), (int) (tu0.G(f2 * fk4.d().getDisplayMetrics().density) * 1.45f));
        layoutParams3.gravity = 85;
        float f3 = -66;
        layoutParams3.setMargins(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        frameLayout3.setLayoutParams(layoutParams3);
        frameLayout3.setVisibility(4);
        ebcVar3.invoke(frameLayout3);
        frameLayout.addView(frameLayout3);
        ImageView imageView = new ImageView(frameLayout.getContext());
        imageView.setId(lga.l);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(tu0.G(40 * fk4.d().getDisplayMetrics().density), tu0.G(52 * fk4.d().getDisplayMetrics().density));
        layoutParams4.gravity = 8388693;
        imageView.setLayoutParams(layoutParams4);
        imageView.setTranslationY((-tu0.G(f * fk4.d().getDisplayMetrics().density)) - (fk4.d().getDisplayMetrics().density * 74.0f));
        float f4 = 6;
        float f5 = 12;
        imageView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(fk4.d().getDisplayMetrics().density * f5), tu0.G(f4 * fk4.d().getDisplayMetrics().density), tu0.G(f5 * fk4.d().getDisplayMetrics().density));
        imageView.setImageResource(woc.Q0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 100.0f);
        imageView.setBackground(gradientDrawable);
        imageView.setVisibility(8);
        v3c.y(new ze2(i, 0 == true ? 1 : 0, 5), imageView);
        frameLayout.addView(imageView);
        ViewParent parent = frameLayout.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
        }
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        this.T0 = null;
        lsf lsfVar = this.E0;
        if (lsfVar != null) {
            lsfVar.setCallback(null);
        }
        this.E0 = null;
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        super.onDetach(view);
        AnimatorSet animatorSet = this.W0;
        if (animatorSet != null) {
            animatorSet.end();
        }
        p0();
        I0().t();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        t03 t03Var = new t03(I0().w0, 11);
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(t03Var, getViewLifecycleOwner().Q(), fg7Var), new lbc(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new m58(new t03(I0().x0, 11), 27), getViewLifecycleOwner().Q(), fg7Var), new mbc(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(I0().A0, getViewLifecycleOwner().Q(), fg7Var), new nbc(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(I0().B0, getViewLifecycleOwner().Q(), fg7Var), new obc(null, this), 5), getViewLifecycleScope());
        lsf lsfVar = this.E0;
        if (lsfVar != null) {
            od2.L(new zn5(tu0.g(I0().z0, getViewLifecycleOwner().Q(), fg7Var), new rbc(null, lsfVar, this), 5), getViewLifecycleScope());
            w7c w7cVar = I0().y0;
            if (w7cVar != null) {
                od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new sbc(null, lsfVar, this), 5), getViewLifecycleScope());
            }
        }
        od2.L(new zn5(tu0.g(((jac) this.b.getValue()).c, getViewLifecycleOwner().Q(), fg7Var), new pbc(null, this), 5), getViewLifecycleScope());
        kwd kwdVar = new kwd(z0(), kwd.p);
        lwd lwdVar = new lwd();
        kwdVar.m = lwdVar;
        lwdVar.b(200.0f);
        kwdVar.m.a(0.75f);
        this.T0 = kwdVar;
    }

    public final void p0() {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.X0;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.Y0;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.Z0;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        lsf lsfVar = this.E0;
        if (lsfVar != null && (animatorSet = lsfVar.c) != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet5 = this.V0;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        AnimatorSet animatorSet6 = this.W0;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        M0();
    }

    public final ImageView q0() {
        return (ImageView) this.C0.T0(this, b1[15]);
    }

    public final View r0() {
        return (View) this.B0.T0(this, b1[14]);
    }

    public final View s0() {
        return (View) this.A0.T0(this, b1[13]);
    }

    public final View t0() {
        return (View) this.z0.T0(this, b1[12]);
    }

    public final View u0() {
        return (View) this.v0.T0(this, b1[8]);
    }

    public final TextView v0() {
        return (TextView) this.u0.T0(this, b1[7]);
    }

    public final View w0() {
        return (View) this.Z.T0(this, b1[4]);
    }

    public final TextView x0() {
        return (TextView) this.s0.T0(this, b1[5]);
    }

    public final PathInterpolator y0() {
        return (PathInterpolator) this.N0.getValue();
    }

    public final View z0() {
        return (View) this.D0.T0(this, b1[16]);
    }

    public RecordControlsWidget(Bundle bundle) {
        ibc ibcVar;
        super(bundle, 0, 2, null);
        fs fsVar = new fs(suc.class, Widget.ARG_SCOPE_ID);
        this.a = new fs(bac.class, "arg_key_type");
        bc7 bc7Var = b1[0];
        this.b = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, jac.class, null);
        this.c = createViewModelLazy(cbc.class, new jp8(23, new gbc(this, 2)));
        this.o = fua.a.b();
        this.X = viewBinding(lga.f);
        this.Y = viewBinding(lga.p);
        this.Z = viewBinding(lga.h);
        this.s0 = viewBinding(lga.i);
        this.t0 = viewBinding(lga.r);
        this.u0 = viewBinding(lga.g);
        this.v0 = viewBinding(lga.e);
        this.w0 = viewBinding(lga.q);
        this.x0 = viewBinding(lga.m);
        this.y0 = viewBinding(lga.o);
        this.z0 = viewBinding(lga.d);
        this.A0 = viewBinding(lga.c);
        this.B0 = viewBinding(lga.b);
        this.C0 = viewBinding(lga.a);
        this.D0 = viewBinding(lga.l);
        int iOrdinal = H0().ordinal();
        if (iOrdinal == 0) {
            int i = woc.b1;
            ibcVar = new ibc(i, woc.j2, i, mga.n);
        } else if (iOrdinal == 1) {
            int i2 = woc.Y0;
            ibcVar = new ibc(i2, woc.I0, i2, mga.h);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.F0 = ibcVar;
        this.G0 = tu0.r(3, new gbc(this, 3));
        this.H0 = tu0.r(3, new gbc(this, 4));
        this.I0 = tu0.r(3, new gbc(this, 5));
        this.J0 = tu0.r(3, new lab(29));
        this.K0 = tu0.r(3, new hbc(0));
        this.L0 = tu0.r(3, new hbc(1));
        this.M0 = tu0.r(3, new hbc(2));
        this.N0 = tu0.r(3, new lab(28));
        this.S0 = 1.0f;
    }
}
