package one.me.calls.ui.ui.call.panels;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.au1;
import defpackage.bc7;
import defpackage.cn1;
import defpackage.dy7;
import defpackage.el1;
import defpackage.fg7;
import defpackage.fs;
import defpackage.hj1;
import defpackage.hob;
import defpackage.ij1;
import defpackage.je7;
import defpackage.kpa;
import defpackage.md1;
import defpackage.nec;
import defpackage.o9g;
import defpackage.od2;
import defpackage.on1;
import defpackage.pn1;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.rvb;
import defpackage.s;
import defpackage.sn1;
import defpackage.suc;
import defpackage.tn1;
import defpackage.tu0;
import defpackage.un1;
import defpackage.vn1;
import defpackage.xt3;
import defpackage.y7a;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/calls/ui/ui/call/panels/CallTopPanelWidget;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lpn1;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lsuc;", "scopeId", "(Ljava/lang/String;Lz84;)V", "calls-ui_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class CallTopPanelWidget extends Widget implements xt3, pn1 {
    public static final /* synthetic */ bc7[] o = {new hob(CallTopPanelWidget.class, "parentScopeId", "getParentScopeId-IluPPks()Ljava/lang/String;", 0), zr6.e(nec.a, CallTopPanelWidget.class, "callTopPanel", "getCallTopPanel()Lone/me/calls/ui/view/controls/CallTopControlViewWrapper;", 0)};
    public final je7 a;
    public final je7 b;
    public final q7c c;

    public CallTopPanelWidget(String str, z84 z84Var) {
        this(dy7.g(new kpa(Widget.ARG_SCOPE_ID, new suc(str))));
    }

    public final on1 m0() {
        return (on1) this.c.T0(this, o[1]);
    }

    public final sn1 n0() {
        return (sn1) this.b.getValue();
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        od2.L(new zn5(tu0.g(n0().X, getViewLifecycleOwner().Q(), fg7.o), new un1(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        on1 on1Var = new on1(getContext());
        on1Var.setId(rvb.call_top_control);
        return on1Var;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        m0().a();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        m0().setClickListener(new o9g(6, this));
        od2.L(new zn5(tu0.g(n0().o, getViewLifecycleOwner().Q(), fg7.o), new vn1(null, this), 5), getViewLifecycleScope());
    }

    @Override // defpackage.dn1
    public final void x(cn1 cn1Var) {
        if (!((el1) this.a.getValue()).u() || getView() == null) {
            return;
        }
        int i = cn1Var != null ? cn1Var.a : 0;
        int i2 = i == 0 ? -1 : tn1.$EnumSwitchMapping$0[au1.s(i)];
        if (i2 != -1) {
            if (i2 == 1) {
                m0().setTitle(cn1Var.b);
                m0().setStatus(cn1Var.c);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                m0().setTitle(null);
                m0().setStatus(null);
            }
        }
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        if (i == y7a.G) {
            pnf.o(n0().b.M0, hj1.D);
        } else if (i == y7a.r) {
            pnf.o(n0().b.M0, ij1.D);
        }
    }

    public CallTopPanelWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        fs fsVar = new fs(suc.class, new suc("default"), Widget.ARG_SCOPE_ID);
        bc7 bc7Var = o[0];
        this.a = m41getSharedViewModelcp94BC8(((suc) fsVar.a(this)).a, el1.class, null);
        this.b = createViewModelLazy(sn1.class, new s(21, new md1(3, this)));
        this.c = viewBinding(rvb.call_top_control);
    }
}
