package one.me.calls.ui.ui.waitingroom.event;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.work.WorkRequest;
import defpackage.b;
import defpackage.bc7;
import defpackage.dk1;
import defpackage.dy7;
import defpackage.f9;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.hob;
import defpackage.imc;
import defpackage.j1e;
import defpackage.je7;
import defpackage.kl7;
import defpackage.kpa;
import defpackage.md1;
import defpackage.mf;
import defpackage.nec;
import defpackage.nv3;
import defpackage.od2;
import defpackage.oec;
import defpackage.ov3;
import defpackage.pla;
import defpackage.pv3;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.qv3;
import defpackage.s;
import defpackage.sf9;
import defpackage.suc;
import defpackage.tu0;
import defpackage.uge;
import defpackage.up1;
import defpackage.uv3;
import defpackage.wp1;
import defpackage.xp1;
import defpackage.y7a;
import defpackage.yp1;
import defpackage.yxc;
import defpackage.z7;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import java.util.List;
import kotlin.Metadata;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/waitingroom/event/CallWaitingRoomEventsWidget;", "Lone/me/sdk/arch/Widget;", "Lpv3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "f9", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallWaitingRoomEventsWidget extends Widget implements pv3 {
    public static final /* synthetic */ bc7[] v0;
    public final b X;
    public final je7 Y;
    public f9 Z;
    public qv3 a;
    public final je7 b;
    public ObjectAnimator c;
    public final Handler o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;

    static {
        hob hobVar = new hob(CallWaitingRoomEventsWidget.class, "contactCellView", "getContactCellView()Lone/me/common/contact/ContactCellView;", 0);
        oec oecVar = nec.a;
        v0 = new bc7[]{hobVar, zr6.e(oecVar, CallWaitingRoomEventsWidget.class, "multiContactCellView", "getMultiContactCellView()Lone/me/calls/ui/view/event/MultiContactCellView;", 0), zr6.f(CallWaitingRoomEventsWidget.class, "eventContainerView", "getEventContainerView()Landroid/widget/FrameLayout;", 0, oecVar)};
    }

    public CallWaitingRoomEventsWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public static void p0(CallWaitingRoomEventsWidget callWaitingRoomEventsWidget) {
        callWaitingRoomEventsWidget.o0(((up1) ((wp1) callWaitingRoomEventsWidget.b.getValue()).o.a.getValue()).a());
    }

    @Override // defpackage.pv3
    public final List H(nv3 nv3Var, nv3 nv3Var2) {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.pause();
        }
        kl7 kl7VarL = j1e.l();
        View view = getView();
        ViewParent parent = view != null ? view.getParent() : null;
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            kl7VarL.add(z7.C(view2, (Math.abs(nv3Var.d) - nv3Var.f) * nv3Var.c));
        }
        return j1e.d(kl7VarL);
    }

    @Override // defpackage.pv3
    public final void L() {
        q0();
    }

    public final FrameLayout m0() {
        return (FrameLayout) this.u0.T0(this, v0[2]);
    }

    public final sf9 n0() {
        return (sf9) this.t0.T0(this, v0[1]);
    }

    public final void o0(long j) {
        getRouter().B(this);
        f9 f9Var = this.Z;
        if (f9Var != null) {
            yxc yxcVar = CallScreen.R0;
            CallScreen callScreen = (CallScreen) f9Var.b;
            callScreen.D0().c.h(j);
            callScreen.z0().a.remove((CallWaitingRoomEventsWidget) f9Var.c);
            callScreen.x0().a();
        }
        this.Z = null;
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        q0();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        uge ugeVar = new uge(layoutInflater.getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        ugeVar.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(ugeVar.getContext());
        frameLayout.setId(y7a.Q1);
        dy7.H(frameLayout, fk4.d().getDisplayMetrics().density * 40.0f);
        frameLayout.setBackgroundColor(qp4.u0.p(frameLayout).c.b().g);
        ugeVar.setClipToPadding(false);
        ugeVar.setClipChildren(false);
        ugeVar.setClipToOutline(false);
        ugeVar.addView(frameLayout);
        ugeVar.setCallback(new imc(this, frameLayout, false, 8));
        pla.a(ugeVar, new xp1(ugeVar, ugeVar, 0));
        return ugeVar;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.c = null;
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        super.onDetach(view);
        this.o.removeCallbacks(this.X);
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        od2.L(new zn5(tu0.g(((wp1) this.b.getValue()).o, getViewLifecycleOwner().Q(), fg7.o), new yp1(null, this), 5), getViewLifecycleScope());
    }

    public final void q0() {
        float f;
        ObjectAnimator objectAnimatorOfFloat = this.c;
        if (objectAnimatorOfFloat == null) {
            View view = getView();
            Object parent = view != null ? view.getParent() : null;
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                qv3 qv3Var = this.a;
                if (qv3Var != null) {
                    ov3 ov3Var = ((uv3) qv3Var).j;
                    f = ov3Var.c ? 0 : -(ov3Var.b() + ov3Var.b);
                } else {
                    f = 0.0f;
                }
                view2.setTranslationY(f);
                float f2 = fk4.d().getDisplayMetrics().density * 4.0f;
                float f3 = -f2;
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f, f3, f2, f3, f2, f3, f2, 0.0f);
                objectAnimatorOfFloat.setStartDelay(WorkRequest.MIN_BACKOFF_MILLIS);
                objectAnimatorOfFloat.setRepeatMode(1);
                objectAnimatorOfFloat.setDuration(500L);
                objectAnimatorOfFloat.addListener(new mf(2, this));
                this.c = objectAnimatorOfFloat;
            } else {
                objectAnimatorOfFloat = null;
            }
        }
        if (objectAnimatorOfFloat != null) {
            if (objectAnimatorOfFloat.isPaused()) {
                objectAnimatorOfFloat.resume();
            } else {
                if (objectAnimatorOfFloat.isRunning() || objectAnimatorOfFloat.isStarted()) {
                    return;
                }
                this.o.post(this.X);
            }
        }
    }

    public CallWaitingRoomEventsWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.b = createViewModelLazy(wp1.class, new s(22, new dk1(16)));
        this.o = new Handler(Looper.getMainLooper());
        this.X = new b(25, this);
        this.Y = tu0.r(3, new md1(6, this));
        this.s0 = viewBinding(y7a.X1);
        this.t0 = viewBinding(y7a.R1);
        this.u0 = viewBinding(y7a.Q1);
    }
}
