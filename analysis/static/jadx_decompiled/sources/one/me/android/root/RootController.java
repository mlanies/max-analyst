package one.me.android.root;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Property;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.aa1;
import defpackage.ba1;
import defpackage.bc7;
import defpackage.bk1;
import defpackage.fk4;
import defpackage.foc;
import defpackage.gaa;
import defpackage.haa;
import defpackage.hm9;
import defpackage.hob;
import defpackage.hz1;
import defpackage.i24;
import defpackage.ivc;
import defpackage.j1e;
import defpackage.je7;
import defpackage.k56;
import defpackage.kl7;
import defpackage.kvb;
import defpackage.nec;
import defpackage.no2;
import defpackage.oi9;
import defpackage.pmc;
import defpackage.qm0;
import defpackage.qmc;
import defpackage.qp4;
import defpackage.rmc;
import defpackage.rw3;
import defpackage.s36;
import defpackage.smc;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.tv3;
import defpackage.uu3;
import defpackage.w12;
import defpackage.y7a;
import defpackage.y8a;
import defpackage.z7b;
import defpackage.zi1;
import defpackage.znc;
import kotlin.Metadata;
import one.me.android.root.RootController;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/android/root/RootController;", "Lone/me/sdk/arch/Widget;", "Lfoc;", "<init>", "()V", "oneme_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class RootController extends Widget implements foc {
    public static final /* synthetic */ bc7[] u0 = {new hob(RootController.class, "fullScreenContainer", "getFullScreenContainer()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), z7b.g(nec.a, RootController.class, "topIndicatorView", "getTopIndicatorView()Lcom/bluelinelabs/conductor/ChangeHandlerFrameLayout;", 0), new oi9(RootController.class, "fullScreenRouter", "getFullScreenRouter()Lcom/bluelinelabs/conductor/Router;"), new oi9(RootController.class, "dialogsRouter", "getDialogsRouter()Lcom/bluelinelabs/conductor/Router;"), new oi9(RootController.class, "topIndicatorRouter", "getTopIndicatorRouter()Lcom/bluelinelabs/conductor/Router;")};
    public final hz1 X;
    public final hz1 Y;
    public final hz1 Z;
    public final je7 a;
    public AnimatorSet b;
    public final qm0 c;
    public final qm0 o;
    public boolean s0;
    public final no2 t0;

    /* JADX WARN: Multi-variable type inference failed */
    public RootController() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = zi1.a.c();
        final int i = 0;
        this.c = binding(new k56(this) { // from class: omc
            public final /* synthetic */ RootController b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                RootController rootController = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = RootController.u0;
                        w12 w12VarB = s36.b(rootController.getContext());
                        w12VarB.setId(kvb.root_screen);
                        rw3 rw3Var = new rw3(-1, -1);
                        rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
                        w12VarB.setLayoutParams(rw3Var);
                        return w12VarB;
                    default:
                        bc7[] bc7VarArr2 = RootController.u0;
                        w12 w12VarB2 = s36.b(rootController.getContext());
                        w12VarB2.setId(kvb.root_top_indicator);
                        w12VarB2.setLayoutParams(new rw3(-1, -2));
                        w12VarB2.setTranslationY(-tu0.G(100 * fk4.d().getDisplayMetrics().density));
                        return w12VarB2;
                }
            }
        });
        final int i2 = 1;
        this.o = binding(new k56(this) { // from class: omc
            public final /* synthetic */ RootController b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                RootController rootController = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = RootController.u0;
                        w12 w12VarB = s36.b(rootController.getContext());
                        w12VarB.setId(kvb.root_screen);
                        rw3 rw3Var = new rw3(-1, -1);
                        rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
                        w12VarB.setLayoutParams(rw3Var);
                        return w12VarB;
                    default:
                        bc7[] bc7VarArr2 = RootController.u0;
                        w12 w12VarB2 = s36.b(rootController.getContext());
                        w12VarB2.setId(kvb.root_top_indicator);
                        w12VarB2.setLayoutParams(new rw3(-1, -2));
                        w12VarB2.setTranslationY(-tu0.G(100 * fk4.d().getDisplayMetrics().density));
                        return w12VarB2;
                }
            }
        });
        this.X = new hz1(1);
        this.Y = new hz1(1);
        this.Z = new hz1(1);
        this.t0 = new no2(this, 1);
    }

    public static final boolean m0(RootController rootController, w12 w12Var) {
        rootController.getClass();
        Object tag = w12Var.getTag(y7a.n);
        boolean zF = tpa.f(tag, "SHOW_ANIMATION_TAG");
        boolean zF2 = tpa.f(tag, "HIDE_ANIMATION_TAG");
        if (tag == null) {
            if (w12Var.getVisibility() != 0) {
                return false;
            }
        } else if (!zF && (zF2 || w12Var.getVisibility() != 0)) {
            return false;
        }
        return true;
    }

    public static final void n0(RootController rootController, boolean z) {
        if (z) {
            if (rootController.u0().getTranslationY() == fk4.d().getDisplayMetrics().density * 0.0f) {
                return;
            }
        } else if (rootController.u0().getTranslationY() == (-(fk4.d().getDisplayMetrics().density * 100.0f))) {
            return;
        }
        hm9.n("RootController", "validateStateIsNeeded for isVisible=" + z + ".");
        rootController.r0(z);
    }

    @Override // defpackage.foc
    public final boolean B(boolean z) {
        if (!t0().n()) {
            hm9.n("RootController", "hideTopController call indicator wasn't init");
            return false;
        }
        if (m0(this, u0())) {
            hm9.n("RootController", "hideTopController hide call indicator force=" + z);
            p0(false, z, null);
            return true;
        }
        n0(this, false);
        hm9.n("RootController", "hideTopController call indicator already hidden force=" + z);
        return false;
    }

    @Override // defpackage.foc
    public final znc C() {
        return (znc) this.X.T0(this, u0[2]);
    }

    @Override // defpackage.foc
    public final boolean F() {
        if (!t0().n()) {
            hm9.n("RootController", "hideWithScalingTopController call indicator wasn't init");
            return false;
        }
        if (m0(this, u0())) {
            hm9.n("RootController", "hideWithScalingTopController hide call indicator force=false");
            q0(false, null);
            return true;
        }
        n0(this, false);
        hm9.n("RootController", "hideWithScalingTopController call indicator already hidden force=false");
        return false;
    }

    @Override // defpackage.foc
    public final znc T() {
        return (znc) this.Y.T0(this, u0[3]);
    }

    @Override // defpackage.foc
    public final boolean b(CallIndicatorWidget callIndicatorWidget, boolean z) {
        if (t0().n() && m0(this, u0())) {
            n0(this, true);
            hm9.n("RootController", "showTopController call indicator already shown.");
            return false;
        }
        hm9.n("RootController", "showTopController show call indicator force=" + z + ".");
        p0(true, z, callIndicatorWidget);
        return true;
    }

    @Override // defpackage.foc
    public final boolean l(CallIndicatorWidget callIndicatorWidget) {
        if (t0().n() && m0(this, u0())) {
            n0(this, true);
            hm9.n("RootController", "showWithScalingTopController call indicator already shown.");
            return false;
        }
        hm9.n("RootController", "showWithScalingTopController show call indicator force=false.");
        q0(true, callIndicatorWidget);
        return true;
    }

    public final void o0(boolean z, uu3 uu3Var) {
        String str = z ? "SHOW_ANIMATION_TAG" : "HIDE_ANIMATION_TAG";
        if (z && !t0().n() && uu3Var != null) {
            t0().R(i24.e(uu3Var, null, null));
        }
        u0().setTag(y7a.n, str);
        u0().setVisibility(0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        super.onActivityResumed(activity);
        hm9.n("RootController", "RootController::onActivityResumed was called, dialog router initialized: " + this.s0);
        haa haaVarO = y8a.a.o();
        rmc rmcVar = new rmc(this, 0);
        haaVarO.getClass();
        bc7 bc7Var = haa.f[0];
        gaa gaaVar = haaVarO.d;
        gaaVar.getClass();
        hm9.n(gaa.class.getName(), "set new router");
        gaaVar.a = rmcVar;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        smc smcVar = new smc(viewGroup.getContext(), null);
        smcVar.setId(kvb.root_view_group);
        smcVar.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
        smcVar.addView(s0());
        smcVar.addView(u0());
        w12 w12VarB = s36.b(smcVar.getContext());
        w12VarB.setId(kvb.root_dialogs_container);
        smcVar.addView(w12VarB, new rw3(-1, -1));
        smcVar.onThemeChanged(qp4.u0.b(smcVar.getContext()).i());
        return smcVar;
    }

    @Override // defpackage.uu3
    public final void onRestoreViewState(View view, Bundle bundle) {
        super.onRestoreViewState(view, bundle);
        hm9.n("RootController", "RootController::onRestoreViewState was called, routers initialized: " + this.s0);
        v0(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        v0(view);
        hm9.n("RootController", "RootController::onViewCreated was called: routers initialized");
    }

    public final void p0(boolean z, boolean z2, uu3 uu3Var) {
        AnimatorSet animatorSet;
        int i = 2;
        AnimatorSet animatorSet2 = this.b;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.b) != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        o0(z, uu3Var);
        animatorSet3.setDuration(z2 ? 0L : 250L);
        int i2 = ((ivc) ((ba1) ((aa1) this.a.getValue())).c.getValue()).c;
        kl7 kl7VarL = j1e.l();
        if (z) {
            kl7VarL.add(ObjectAnimator.ofFloat(u0(), (Property<w12, Float>) View.Y, u0().getY(), fk4.d().getDisplayMetrics().density * 0.0f));
            w12 w12VarS0 = s0();
            float y = s0().getY();
            ValueAnimator valueAnimatorOfPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("topMarginProp", y, (s0().getY() + tu0.G(100 * fk4.d().getDisplayMetrics().density)) - i2));
            valueAnimatorOfPropertyValuesHolder.addUpdateListener(new pmc(y, w12VarS0));
            kl7VarL.add(valueAnimatorOfPropertyValuesHolder);
        } else {
            float f = 100;
            kl7VarL.add(ObjectAnimator.ofFloat(u0(), (Property<w12, Float>) View.Y, u0().getY(), -tu0.G(fk4.d().getDisplayMetrics().density * f)));
            w12 w12VarS02 = s0();
            float y2 = s0().getY();
            ValueAnimator valueAnimatorOfPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(PropertyValuesHolder.ofFloat("topMarginProp", y2, (s0().getY() - tu0.G(f * fk4.d().getDisplayMetrics().density)) + i2));
            valueAnimatorOfPropertyValuesHolder2.addUpdateListener(new pmc(y2, w12VarS02));
            kl7VarL.add(valueAnimatorOfPropertyValuesHolder2);
        }
        animatorSet3.playTogether(j1e.d(kl7VarL));
        animatorSet3.addListener(new tv3(this, z, i));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void q0(boolean z, uu3 uu3Var) {
        AnimatorSet animatorSet;
        AnimatorSet animatorSet2 = this.b;
        if (animatorSet2 != null && animatorSet2.isRunning() && (animatorSet = this.b) != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet3 = new AnimatorSet();
        o0(z, uu3Var);
        KeyEvent.Callback callbackFindViewById = u0().findViewById(y7a.O);
        bk1 bk1Var = callbackFindViewById instanceof bk1 ? (bk1) callbackFindViewById : null;
        animatorSet3.setDuration(250L);
        kl7 kl7VarL = j1e.l();
        if (bk1Var != null) {
            bk1Var.h(kl7VarL, z, animatorSet3.getDuration());
        }
        animatorSet3.playTogether(j1e.d(kl7VarL));
        animatorSet3.addListener(new qmc(bk1Var, z, this));
        animatorSet3.start();
        this.b = animatorSet3;
    }

    public final void r0(boolean z) {
        KeyEvent.Callback callbackFindViewById = u0().findViewById(y7a.O);
        bk1 bk1Var = callbackFindViewById instanceof bk1 ? (bk1) callbackFindViewById : null;
        if (bk1Var != null) {
            bk1Var.a(z);
        }
        u0().setTag(y7a.n, null);
        u0().setVisibility(z ? 0 : 8);
        u0().setTranslationY(z ? fk4.d().getDisplayMetrics().density * 0.0f : -(fk4.d().getDisplayMetrics().density * 100.0f));
        w0(z);
        if (z || !t0().n()) {
            return;
        }
        t0().C();
        hm9.n("RootController", "call indicator was destroyed");
    }

    @Override // defpackage.foc
    public final int s() {
        ViewGroup.LayoutParams layoutParams = s0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            return marginLayoutParams.topMargin;
        }
        return 0;
    }

    public final w12 s0() {
        bc7 bc7Var = u0[0];
        return (w12) this.c.getValue();
    }

    public final znc t0() {
        return (znc) this.Z.T0(this, u0[4]);
    }

    public final w12 u0() {
        bc7 bc7Var = u0[1];
        return (w12) this.o.getValue();
    }

    public final void v0(View view) {
        if (this.s0) {
            return;
        }
        hm9.n("RootController", "Initializing routers");
        znc childRouter = getChildRouter((ViewGroup) view.findViewById(kvb.root_dialogs_container), "root:dialog");
        childRouter.e = 3;
        childRouter.Q(true);
        bc7[] bc7VarArr = u0;
        bc7 bc7Var = bc7VarArr[3];
        this.Y.b = childRouter;
        znc childRouter2 = getChildRouter((ViewGroup) view.findViewById(kvb.root_top_indicator), "root:topindicator");
        childRouter2.e = 1;
        childRouter2.Q(false);
        bc7 bc7Var2 = bc7VarArr[4];
        this.Z.b = childRouter2;
        znc childRouter3 = getChildRouter((ViewGroup) view.findViewById(kvb.root_screen), "root:screen");
        childRouter3.e = 1;
        childRouter3.Q(true);
        bc7 bc7Var3 = bc7VarArr[2];
        this.X.b = childRouter3;
        C().a(this.t0);
        haa haaVarO = y8a.a.o();
        rmc rmcVar = new rmc(this, 1);
        haaVarO.getClass();
        bc7 bc7Var4 = haa.f[0];
        gaa gaaVar = haaVarO.d;
        gaaVar.getClass();
        hm9.n(gaa.class.getName(), "set new router");
        gaaVar.a = rmcVar;
        this.s0 = true;
    }

    public final void w0(boolean z) {
        int iG = z ? tu0.G(100 * fk4.d().getDisplayMetrics().density) - ((ivc) ((ba1) ((aa1) this.a.getValue())).c.getValue()).c : tu0.G(0 * fk4.d().getDisplayMetrics().density);
        ViewGroup.LayoutParams layoutParams = s0().getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if ((marginLayoutParams != null ? marginLayoutParams.topMargin : 0) == iG) {
            return;
        }
        w12 w12VarS0 = s0();
        ViewGroup.LayoutParams layoutParams2 = w12VarS0.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.topMargin = iG;
        w12VarS0.setLayoutParams(marginLayoutParams2);
    }
}
