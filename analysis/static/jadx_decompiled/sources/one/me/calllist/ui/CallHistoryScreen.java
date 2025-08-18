package one.me.calllist.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import defpackage.bc7;
import defpackage.c0c;
import defpackage.cla;
import defpackage.dm;
import defpackage.eua;
import defpackage.f81;
import defpackage.f9;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fm;
import defpackage.fm9;
import defpackage.fua;
import defpackage.hob;
import defpackage.iyc;
import defpackage.je7;
import defpackage.kt3;
import defpackage.l5g;
import defpackage.ls1;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nz4;
import defpackage.o81;
import defpackage.od2;
import defpackage.oec;
import defpackage.p81;
import defpackage.pvb;
import defpackage.q0e;
import defpackage.q7a;
import defpackage.q7c;
import defpackage.q81;
import defpackage.qy0;
import defpackage.r7a;
import defpackage.rg1;
import defpackage.rw3;
import defpackage.s;
import defpackage.s81;
import defpackage.t53;
import defpackage.t7a;
import defpackage.tu0;
import defpackage.u81;
import defpackage.uka;
import defpackage.w53;
import defpackage.wja;
import defpackage.woc;
import defpackage.x27;
import defpackage.x8a;
import defpackage.xu3;
import defpackage.y20;
import defpackage.y8;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lone/me/calllist/ui/CallHistoryScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "<init>", "()V", "call-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallHistoryScreen extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] C0;
    public static final int[] D0;
    public final x27 A0;
    public final String B0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final y8 x0;
    public final f81 y0;
    public xu3 z0;

    static {
        hob hobVar = new hob(CallHistoryScreen.class, "container", "getContainer()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", 0);
        oec oecVar = nec.a;
        C0 = new bc7[]{hobVar, zr6.e(oecVar, CallHistoryScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(CallHistoryScreen.class, "callTabLayout", "getCallTabLayout()Lone/me/common/tablayout/OneMeTabLayout;", 0, oecVar), zr6.f(CallHistoryScreen.class, "callHistoryPager", "getCallHistoryPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oecVar), zr6.f(CallHistoryScreen.class, "createGroupCallButton", "getCreateGroupCallButton()Lone/me/calllist/view/CallActionItemView;", 0, oecVar), zr6.f(CallHistoryScreen.class, "callToContactButton", "getCallToContactButton()Lone/me/calllist/view/CallActionItemView;", 0, oecVar), zr6.f(CallHistoryScreen.class, "micPermissionBanner", "getMicPermissionBanner()Lone/me/sdk/uikit/common/banner/OneMeCompactBannerView;", 0, oecVar), zr6.f(CallHistoryScreen.class, "callEmptyHistoryView", "getCallEmptyHistoryView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0, oecVar)};
        D0 = new int[]{-11664148, -7436801};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallHistoryScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = iyc.l;
        this.b = fua.a.b();
        this.c = createViewModelLazy(u81.class, new s(12, new o81(this, 1)));
        this.o = tu0.r(3, new o81(this, 2));
        this.X = viewBinding(r7a.i);
        this.Y = viewBinding(r7a.k);
        this.Z = viewBinding(pvb.call_history_tabs);
        this.s0 = viewBinding(pvb.call_history_pager);
        this.t0 = viewBinding(r7a.j);
        this.u0 = viewBinding(r7a.h);
        this.v0 = viewBinding(r7a.g);
        this.w0 = viewBinding(pvb.call_history_empty);
        y8 y8Var = new y8();
        y8Var.a = nz4.a;
        this.x0 = y8Var;
        this.y0 = new f81(this);
        this.A0 = x27.d;
        this.B0 = "call_history_scope_id";
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.A0;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: not valid java name and from getter */
    public final String getL0() {
        return this.B0;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        ((rg1) this.o.getValue()).g(i);
    }

    public final ViewPager2 m0() {
        return (ViewPager2) this.s0.T0(this, C0[3]);
    }

    public final u81 n0() {
        return (u81) this.c.getValue();
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        Object value;
        super.onAttach(view);
        q0e q0eVar = n0().t0;
        do {
            value = q0eVar.getValue();
        } while (!q0eVar.c(value, ls1.a((ls1) value, null, false, !((eua) r6.X.getValue()).b(eua.h), 3)));
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(layoutInflater.getContext());
        final int i = 1;
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(r7a.k);
        claVar.setForm(uka.b);
        claVar.setTitle(c0c.call_history_call_title);
        claVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.addView(claVar);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(linearLayout.getContext(), null);
        coordinatorLayout.setId(r7a.i);
        coordinatorLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        fm fmVar = new fm(coordinatorLayout.getContext());
        fmVar.setElevation(fk4.d().getDisplayMetrics().density * 0.0f);
        fmVar.setLayoutParams(new rw3(-1, -2));
        fmVar.setBackground(null);
        w53 w53Var = new w53(fmVar.getContext());
        w53Var.setTitleEnabled(false);
        dm dmVar = new dm(-1, -2);
        dmVar.a = 3;
        w53Var.setLayoutParams(dmVar);
        LinearLayout linearLayout2 = new LinearLayout(w53Var.getContext());
        linearLayout2.setOrientation(1);
        x8a x8aVar = new x8a(linearLayout2.getContext(), null);
        x8aVar.setId(r7a.g);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        x8aVar.setLayoutParams(layoutParams);
        x8aVar.setTitle(x8aVar.getContext().getString(t7a.d));
        x8aVar.setSubtitle(x8aVar.getContext().getString(t7a.c));
        float f2 = 24;
        x8aVar.x(kt3.b(x8aVar.getContext(), woc.X0), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        x8aVar.R0.setColors(D0, new float[]{0.0f, 1.0f});
        tu0.K(x8aVar, 300L, new View.OnClickListener(this) { // from class: n81
            public final /* synthetic */ CallHistoryScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallHistoryScreen callHistoryScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = CallHistoryScreen.C0;
                        u81 u81VarN0 = callHistoryScreen.n0();
                        k11 k11Var = new k11(11);
                        rg1 rg1Var = u81VarN0.o;
                        rg1Var.c();
                        rg1Var.j = true;
                        eua euaVarE = rg1Var.e();
                        l5g l5gVar = rg1Var.a;
                        if (!euaVarE.a(false, l5gVar)) {
                            rg1Var.l = k11Var;
                            rg1Var.h = null;
                            rg1Var.i = false;
                            break;
                        } else if (!((gh3) rg1Var.d.getValue()).f()) {
                            l5gVar.b();
                            break;
                        } else {
                            k11Var.invoke();
                            break;
                        }
                    default:
                        ((eua) callHistoryScreen.b.getValue()).f(new l5g(callHistoryScreen, 0), eua.h, 160);
                        break;
                }
            }
        });
        linearLayout2.addView(x8aVar);
        qy0 qy0Var = new qy0(linearLayout2.getContext(), null);
        float f3 = 16;
        float f4 = 0;
        qy0Var.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4));
        qy0Var.setId(r7a.h);
        qy0Var.setActionIcon(q7a.b);
        qy0Var.setActionText(c0c.call_history_call_contact_action);
        tu0.K(qy0Var, 300L, new y20(2));
        float f5 = 52;
        qy0Var.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(fk4.d().getDisplayMetrics().density * f5)));
        linearLayout2.addView(qy0Var);
        qy0 qy0Var2 = new qy0(linearLayout2.getContext(), null);
        qy0Var2.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        qy0Var2.setId(r7a.j);
        qy0Var2.setActionIcon(q7a.f);
        qy0Var2.setActionText(c0c.call_history_call_create_group_call_by_link);
        final int i2 = 0;
        tu0.K(qy0Var2, 300L, new View.OnClickListener(this) { // from class: n81
            public final /* synthetic */ CallHistoryScreen b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CallHistoryScreen callHistoryScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = CallHistoryScreen.C0;
                        u81 u81VarN0 = callHistoryScreen.n0();
                        k11 k11Var = new k11(11);
                        rg1 rg1Var = u81VarN0.o;
                        rg1Var.c();
                        rg1Var.j = true;
                        eua euaVarE = rg1Var.e();
                        l5g l5gVar = rg1Var.a;
                        if (!euaVarE.a(false, l5gVar)) {
                            rg1Var.l = k11Var;
                            rg1Var.h = null;
                            rg1Var.i = false;
                            break;
                        } else if (!((gh3) rg1Var.d.getValue()).f()) {
                            l5gVar.b();
                            break;
                        } else {
                            k11Var.invoke();
                            break;
                        }
                    default:
                        ((eua) callHistoryScreen.b.getValue()).f(new l5g(callHistoryScreen, 0), eua.h, 160);
                        break;
                }
            }
        });
        qy0Var2.setVisibility(8);
        qy0Var2.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(f5 * fk4.d().getDisplayMetrics().density)));
        linearLayout2.addView(qy0Var2);
        linearLayout2.setLayoutParams(new t53(-1, -2));
        w53Var.addView(linearLayout2);
        fmVar.addView(w53Var);
        wja wjaVar = new wja(fmVar.getContext(), null);
        wjaVar.setId(pvb.call_history_tabs);
        wjaVar.setTabMode(0);
        wjaVar.setLayoutParams(new dm(-1, -2));
        fmVar.addView(wjaVar);
        fmVar.setStateListAnimator(null);
        coordinatorLayout.addView(fmVar);
        ViewPager2 viewPager2 = new ViewPager2(coordinatorLayout.getContext());
        viewPager2.setId(pvb.call_history_pager);
        rw3 rw3Var = new rw3(-1, -1);
        rw3Var.b(new AppBarLayout$ScrollingViewBehavior());
        viewPager2.setLayoutParams(rw3Var);
        fm9.z(viewPager2);
        coordinatorLayout.addView(viewPager2);
        linearLayout.addView(coordinatorLayout);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        q0e q0eVar;
        Object value;
        super.onDestroyView(view);
        if (!requireActivity().isChangingConfigurations()) {
            m0().setAdapter(null);
            u81 u81VarN0 = n0();
            do {
                q0eVar = u81VarN0.Z;
                value = q0eVar.getValue();
            } while (!q0eVar.c(value, new s81()));
        }
        xu3 xu3Var = this.z0;
        if (xu3Var != null) {
            xu3Var.c();
        }
        this.z0 = null;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (((rg1) this.o.getValue()).b(i, strArr, iArr)) {
            return;
        }
        if (i == 160 && ((eua) this.b.getValue()).b(strArr)) {
            ((x8a) this.v0.T0(this, C0[6])).setVisibility(8);
            return;
        }
        for (int i2 : iArr) {
            if (i2 == -1) {
                new l5g(this, 0).g(t7a.b, t7a.a);
                return;
            }
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        q0e q0eVar = n0().u0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(q0eVar, getViewLifecycleOwner().Q(), fg7Var), new p81(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().s0, getViewLifecycleOwner().Q(), fg7Var), new q81(null, this), 5), getViewLifecycleScope());
        m0().setAdapter(this.y0);
        m0().setOffscreenPageLimit(1);
        wja wjaVar = (wja) this.Z.T0(this, C0[2]);
        ViewPager2 viewPager2M0 = m0();
        y8 y8Var = this.x0;
        y8Var.getClass();
        xu3 xu3Var = new xu3(wjaVar, viewPager2M0, new f9(y8Var, 7, wjaVar));
        xu3Var.a();
        this.z0 = xu3Var;
    }
}
