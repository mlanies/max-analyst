package one.me.calls.ui.bottomsheet.opponents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.cla;
import defpackage.cn1;
import defpackage.dn1;
import defpackage.en1;
import defpackage.eo1;
import defpackage.fg7;
import defpackage.fm;
import defpackage.glc;
import defpackage.hob;
import defpackage.iq9;
import defpackage.je7;
import defpackage.k11;
import defpackage.khe;
import defpackage.kr1;
import defpackage.mr0;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.of1;
import defpackage.pf1;
import defpackage.q7c;
import defpackage.qf1;
import defpackage.qm0;
import defpackage.qp4;
import defpackage.rw3;
import defpackage.s;
import defpackage.s36;
import defpackage.sf1;
import defpackage.tf1;
import defpackage.tu0;
import defpackage.uf1;
import defpackage.vc1;
import defpackage.w7c;
import defpackage.wb5;
import defpackage.wr1;
import defpackage.x27;
import defpackage.x77;
import defpackage.xt3;
import defpackage.y7a;
import defpackage.yi1;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/calls/ui/bottomsheet/opponents/CallOpponentsListWidget;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Ldn1;", "Liq9;", "<init>", "()V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallOpponentsListWidget extends Widget implements xt3, dn1, iq9 {
    public static final /* synthetic */ bc7[] H0;
    public final qm0 A0;
    public final qm0 B0;
    public final qm0 C0;
    public final khe D0;
    public final je7 E0;
    public final qm0 F0;
    public final glc G0;
    public final je7 X;
    public final je7 Y;
    public final qm0 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final qm0 t0;
    public final qm0 u0;
    public final qm0 v0;
    public final qm0 w0;
    public final qm0 x0;
    public final qm0 y0;
    public final q7c z0;

    static {
        hob hobVar = new hob(CallOpponentsListWidget.class, "collapsibleHeaderContainer", "getCollapsibleHeaderContainer()Landroid/widget/LinearLayout;", 0);
        oec oecVar = nec.a;
        H0 = new bc7[]{hobVar, zr6.e(oecVar, CallOpponentsListWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(CallOpponentsListWidget.class, "oneMeButtonToolStack", "getOneMeButtonToolStack()Lone/me/sdk/uikit/common/buttonstack/OneMeButtonToolStack;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "opponentsListView", "getOpponentsListView()Landroidx/recyclerview/widget/RecyclerView;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "subtitleView", "getSubtitleView()Landroid/widget/TextView;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "titleOpponentListView", "getTitleOpponentListView()Landroid/widget/TextView;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "titleWaitingListView", "getTitleWaitingListView()Landroid/widget/TextView;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "searchView", "getSearchView()Landroid/widget/EditText;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "emptyStateViewStub", "getEmptyStateViewStub()Landroid/view/ViewStub;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "emptyStateView", "getEmptyStateView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, oecVar), zr6.f(CallOpponentsListWidget.class, "appBarLayoutView", "getAppBarLayoutView()Lcom/google/android/material/appbar/AppBarLayout;", 0, oecVar)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallOpponentsListWidget() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = tu0.r(3, new k11(21));
        this.b = yi1.b();
        this.c = tu0.r(3, new pf1(this, 1));
        this.o = tu0.r(3, new k11(20));
        this.X = tu0.r(3, new pf1(this, 2));
        this.Y = createViewModelLazy(of1.class, new s(18, new pf1(this, 3)));
        this.Z = binding(new pf1(this, 4));
        this.s0 = tu0.r(3, new pf1(this, 5));
        this.t0 = binding(new pf1(this, 6));
        this.u0 = binding(new pf1(this, 7));
        this.v0 = binding(new pf1(this, 8));
        this.w0 = binding(new pf1(this, 10));
        this.x0 = binding(new pf1(this, 11));
        this.y0 = binding(new pf1(this, 12));
        this.z0 = viewBinding(y7a.T0);
        this.A0 = binding(new pf1(this, 13));
        this.B0 = binding(new pf1(this, 14));
        this.C0 = binding(new pf1(this, 15));
        this.D0 = new khe(new pf1(this, 16));
        this.E0 = tu0.r(3, new pf1(this, 17));
        this.F0 = binding(new pf1(this, 0));
        this.G0 = new glc(new k11(19), null, 6);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getT0() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.G0;
    }

    public final fm m0() {
        bc7 bc7Var = H0[11];
        return (fm) this.F0.getValue();
    }

    public final LinearLayout n0() {
        bc7 bc7Var = H0[0];
        return (LinearLayout) this.Z.getValue();
    }

    public final ViewStub o0() {
        bc7 bc7Var = H0[9];
        return (ViewStub) this.B0.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        coordinatorLayout.setBackgroundColor(qp4.u0.p(coordinatorLayout).c.b().k);
        qf1 qf1Var = new qf1(this, 2);
        View viewM0 = m0();
        qf1Var.invoke(viewM0);
        coordinatorLayout.addView(viewM0);
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        bc7 bc7Var = H0[3];
        linearLayout.addView((RecyclerView) this.v0.getValue());
        linearLayout.addView(o0());
        rw3 rw3Var = new rw3(-1, -1);
        rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
        linearLayout.setLayoutParams(rw3Var);
        coordinatorLayout.addView(linearLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        mr0.I(p0());
        p0().clearFocus();
        r0().B0.a.remove(this);
        of1 of1VarR0 = r0();
        eo1 eo1Var = of1VarR0.c;
        eo1Var.getClass();
        x77 x77Var = (x77) eo1Var.h.T0(eo1Var, eo1.k[0]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        ((wr1) ((kr1) of1VarR0.u0.getValue())).G.remove(of1VarR0);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        p0().clearFocus();
        m0().requestFocus();
        en1 en1Var = r0().B0;
        en1Var.a.add(this);
        x(en1Var.b);
        m0().a(s36.D(new vc1(new wb5(), this, 1), m0(), getViewLifecycleOwner()));
        w7c w7cVar = r0().D0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new sf1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().A0, getViewLifecycleOwner().Q(), fg7Var), new tf1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().E0, getViewLifecycleOwner().Q(), fg7Var), new uf1(null, this), 5), getViewLifecycleScope());
    }

    public final EditText p0() {
        bc7 bc7Var = H0[8];
        return (EditText) this.A0.getValue();
    }

    public final cla q0() {
        bc7 bc7Var = H0[1];
        return (cla) this.t0.getValue();
    }

    public final of1 r0() {
        return (of1) this.Y.getValue();
    }

    @Override // defpackage.dn1
    public final void x(cn1 cn1Var) {
        bc7 bc7Var = H0[5];
        ((TextView) this.x0.getValue()).setText(cn1Var != null ? cn1Var.c : null);
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        r0().c.b(i, bundle);
    }
}
