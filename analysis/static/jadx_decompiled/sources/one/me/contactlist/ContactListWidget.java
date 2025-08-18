package one.me.contactlist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a3g;
import defpackage.a9a;
import defpackage.aba;
import defpackage.an9;
import defpackage.ap3;
import defpackage.au1;
import defpackage.bc7;
import defpackage.bh0;
import defpackage.bp3;
import defpackage.bt1;
import defpackage.bva;
import defpackage.bvc;
import defpackage.c3;
import defpackage.cla;
import defpackage.dn3;
import defpackage.dy7;
import defpackage.eh2;
import defpackage.em2;
import defpackage.eqe;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fn3;
import defpackage.fs;
import defpackage.fua;
import defpackage.ga;
import defpackage.gca;
import defpackage.gh7;
import defpackage.glc;
import defpackage.h8e;
import defpackage.hca;
import defpackage.hob;
import defpackage.hr3;
import defpackage.hyc;
import defpackage.i3a;
import defpackage.iba;
import defpackage.j31;
import defpackage.j47;
import defpackage.je7;
import defpackage.jn3;
import defpackage.jpc;
import defpackage.jv5;
import defpackage.khe;
import defpackage.kpa;
import defpackage.l5g;
import defpackage.l67;
import defpackage.md3;
import defpackage.mqd;
import defpackage.mr0;
import defpackage.nd3;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nn3;
import defpackage.nr3;
import defpackage.nz4;
import defpackage.od2;
import defpackage.oi9;
import defpackage.oo3;
import defpackage.po3;
import defpackage.pr3;
import defpackage.pua;
import defpackage.pz4;
import defpackage.q33;
import defpackage.q7c;
import defpackage.qd6;
import defpackage.qm0;
import defpackage.qo3;
import defpackage.qp4;
import defpackage.rd6;
import defpackage.rg1;
import defpackage.ro3;
import defpackage.s35;
import defpackage.so3;
import defpackage.t03;
import defpackage.t33;
import defpackage.ti2;
import defpackage.ti3;
import defpackage.to3;
import defpackage.tt3;
import defpackage.tu0;
import defpackage.uo3;
import defpackage.v02;
import defpackage.v3c;
import defpackage.vm9;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w4d;
import defpackage.wha;
import defpackage.wo3;
import defpackage.woc;
import defpackage.wq3;
import defpackage.wuc;
import defpackage.wvb;
import defpackage.x27;
import defpackage.xo3;
import defpackage.xt3;
import defpackage.y53;
import defpackage.y7d;
import defpackage.yo3;
import defpackage.z7b;
import defpackage.z84;
import defpackage.z8a;
import defpackage.zf3;
import defpackage.zn5;
import defpackage.zo3;
import defpackage.zs1;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0013\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/contactlist/ContactListWidget;", "Lone/me/sdk/arch/Widget;", "Lvm9;", "Lfn3;", "Lqd6;", "Lwq3;", "Lnr3;", "Lxt3;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Luo3;", "type", "(Luo3;)V", "contact-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ContactListWidget extends Widget implements vm9, fn3, qd6, wq3, nr3, xt3, ng3 {
    public static final /* synthetic */ bc7[] P0 = {new hob(ContactListWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), z7b.g(nec.a, ContactListWidget.class, "snackBar", "getSnackBar()Lone/me/sdk/snackbar/OneMeSnackbar;", 0), new hob(ContactListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new oi9(ContactListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new oi9(ContactListWidget.class, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new oi9(ContactListWidget.class, "searchQuery", "getSearchQuery()Ljava/lang/CharSequence;"), new oi9(ContactListWidget.class, "isInSearch", "isInSearch()Z"), new oi9(ContactListWidget.class, "isNeedScrollToTop", "isNeedScrollToTop()Z"), new oi9(ContactListWidget.class, "isPermissionChecked", "isPermissionChecked()Z")};
    public final je7 A0;
    public final qm0 B0;
    public final q7c C0;
    public final je7 D0;
    public final List E0;
    public final je7 F0;
    public final je7 G0;
    public final khe H0;
    public final w4d I0;
    public final fs J0;
    public final fs K0;
    public final fs L0;
    public final fs M0;
    public final fs N0;
    public final glc O0;
    public final ExecutorService X;
    public final a3g Y;
    public final a3g Z;
    public final x27 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final a3g s0;
    public final jv5 t0;
    public final a3g u0;
    public final nd3 v0;
    public final je7 w0;
    public final qm0 x0;
    public final je7 y0;
    public final je7 z0;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactListWidget() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // defpackage.qd6
    public final void J(rd6 rd6Var) {
        mr0.G(this);
        j47.T(getViewLifecycleScope(), null, null, new xo3(this, rd6Var, null), 3);
    }

    @Override // defpackage.qd6
    public final void M(rd6 rd6Var, boolean z) {
        ((bt1) this.c.getValue()).e(zs1.CALL_CONTACT, z);
        j47.T(getViewLifecycleScope(), null, null, new wo3(this, rd6Var, z, null), 3);
    }

    @Override // defpackage.fn3
    public final void N() {
        bc7 bc7Var = P0[1];
        wha whaVar = (wha) this.B0.getValue();
        whaVar.h(getContext().getString(a9a.s));
        whaVar.i();
    }

    @Override // defpackage.nr3
    public final void Q() {
        r0();
    }

    @Override // defpackage.fn3
    public final void d(long j) {
        Object next;
        List list = ((dn3) p0().z0.a.getValue()).c;
        pua puaVar = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (((nn3) next).a == j) {
                        break;
                    }
                }
            }
            nn3 nn3Var = (nn3) next;
            if (nn3Var != null) {
                puaVar = nn3Var.w0;
            }
        }
        if (puaVar != null) {
            p0().r();
        }
    }

    @Override // defpackage.fn3
    public final void f(long j, boolean z) {
        ((bt1) this.c.getValue()).e(zs1.CALL_CONTACT, z);
        mr0.G(this);
        ((rg1) this.D0.getValue()).l(j, z, new ro3(j, z));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.O0;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (((rg1) this.D0.getValue()).g(i) || bundle == null) {
            return;
        }
        p0().q(i, bundle.getLong("selected.contactId.Action"));
    }

    @Override // defpackage.fn3
    public final void k(long j, View view) {
        int iOrdinal = p0().b.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            vxd vxdVarT = j47.T(getViewLifecycleScope(), null, vx3.b, new bp3(this, j, view, null), 1);
            this.I0.o1(this, P0[3], vxdVarT);
        }
    }

    public final eua m0() {
        return (eua) this.F0.getValue();
    }

    public final CharSequence n0() {
        bc7 bc7Var = P0[5];
        return (CharSequence) this.K0.a(this);
    }

    @Override // defpackage.vm9
    public final wuc o() {
        return q0() ? wuc.CONTACTS_SEARCH : wuc.CONTACTS_TAB;
    }

    public final cla o0() {
        bc7 bc7Var = P0[0];
        return (cla) this.x0.getValue();
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        bc7[] bc7VarArr = P0;
        bc7 bc7Var = bc7VarArr[8];
        fs fsVar = this.N0;
        if (((Boolean) fsVar.a(this)).booleanValue()) {
            return;
        }
        bc7 bc7Var2 = bc7VarArr[8];
        fsVar.b(this, Boolean.TRUE);
        boolean zB = m0().b(eua.f);
        je7 je7Var = this.G0;
        if (!zB) {
            ((hyc) ((q33) je7Var.getValue())).j("app.writeConctatsRequested", true);
            m0().e(new l5g(this, 1));
            return;
        }
        eua euaVarM0 = m0();
        String[] strArr = eua.g;
        if (euaVarM0.b(strArr)) {
            return;
        }
        hyc hycVar = (hyc) ((q33) je7Var.getValue());
        hycVar.getClass();
        if (((t33) hycVar).g.getBoolean("app.writeConctatsRequested", false)) {
            return;
        }
        ((hyc) ((q33) je7Var.getValue())).j("app.writeConctatsRequested", true);
        m0().f(new l5g(this, 1), strArr, 156);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(z8a.n);
        cla claVarO0 = o0();
        ti3 ti3Var = new ti3(-1, -2);
        ti3Var.i = 0;
        ti3Var.e = 0;
        ti3Var.h = 0;
        constraintLayout.addView(claVarO0, ti3Var);
        aba abaVar = new aba(constraintLayout.getContext(), null);
        abaVar.setIcon(woc.l0);
        abaVar.setTitle(new eqe(a9a.n));
        abaVar.setSubtitle(new eqe(a9a.m));
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(constraintLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(wvb.oneme_contactlist_rv);
        endlessRecyclerView2.setItemAnimator(null);
        nd3 nd3Var = this.v0;
        endlessRecyclerView2.setAdapter(nd3Var);
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setEmptyView(abaVar);
        em2 em2Var = new em2(4, new qo3(this, 0));
        h8e h8eVar = new h8e(endlessRecyclerView2, nd3Var, em2Var);
        endlessRecyclerView2.j(h8eVar);
        endlessRecyclerView2.j(new jn3(em2Var, qp4.u0.j(endlessRecyclerView2), new v02(21, this)));
        h8e h8eVar2 = new h8e(endlessRecyclerView2, nd3Var, new em2(2, new ga(this, 11, endlessRecyclerView2)));
        endlessRecyclerView2.j(h8eVar2);
        v3c.y(new c3(h8eVar, h8eVar2, null, 8), endlessRecyclerView2);
        ti3 ti3Var2 = new ti3(-1, 0);
        ti3Var2.j = o0().getId();
        ti3Var2.e = 0;
        ti3Var2.h = 0;
        ti3Var2.l = 0;
        constraintLayout.addView(endlessRecyclerView2, ti3Var2);
        ti3 ti3Var3 = new ti3(-1, 0);
        ti3Var3.j = o0().getId();
        ti3Var3.e = 0;
        ti3Var3.h = 0;
        ti3Var3.l = 0;
        constraintLayout.addView(abaVar, ti3Var3);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        ((EndlessRecyclerView2) this.C0.T0(this, P0[2])).setAdapter(null);
        ((yo3) this.y0.getValue()).e();
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (((rg1) this.D0.getValue()).b(i, strArr, iArr)) {
            return;
        }
        if (i == 156) {
            eua euaVarM0 = m0();
            l5g l5gVar = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            euaVarM0.getClass();
            eua.k(l5gVar, strArr, iArr, strArr2, i2, i3);
        }
        s0();
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        i3a i3aVarH = getRouter().h();
        if (i3aVarH != null) {
            i3aVarH.b((yo3) this.y0.getValue());
        }
        od2.L(new j31(p0().z0, ((bh0) this.A0.getValue()).s0, new c3(this, null, 9), 4), getViewLifecycleScope());
        od2.L(new zn5(p0().F0, new zo3(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(p0().B0.i, new ap3(this, null), 5), getViewLifecycleScope());
    }

    public final oo3 p0() {
        return (oo3) this.w0.getValue();
    }

    public final boolean q0() {
        bc7 bc7Var = P0[6];
        return ((Boolean) this.L0.a(this)).booleanValue();
    }

    public final void r0() {
        m0().f(new l5g(this, 1), eua.e, 156);
    }

    public final void s0() {
        boolean zB = ((dn3) p0().B0.i.a.getValue()).b();
        jv5 jv5Var = this.t0;
        a3g a3gVar = this.u0;
        if (!zB || !q0()) {
            CharSequence charSequenceN0 = n0();
            a3gVar.E((charSequenceN0 == null || charSequenceN0.length() == 0) ? (List) ((bh0) this.A0.getValue()).s0.a.getValue() : nz4.a);
            jv5Var.E(null);
        } else {
            boolean zB2 = m0().b(eua.f);
            pr3 pr3Var = new pr3(woc.J0, a9a.r, zB2 ? a9a.q : a9a.p, zB2 ? null : Integer.valueOf(a9a.o));
            a3gVar.E(null);
            jv5Var.E(Collections.singletonList(pr3Var));
        }
    }

    @Override // defpackage.wq3
    public final void t() {
        r0();
    }

    @Override // defpackage.fn3
    public final void v(long j) {
        mr0.G(this);
        p0().q(z8a.i, j);
    }

    @Override // defpackage.wq3
    public final void w(int i) {
        int iS = au1.s(i);
        if (iS == 5 || iS == 6) {
            m0().f(new l5g(this, 1), eua.h, 160);
        } else {
            r0();
        }
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        bc7[] bc7VarArr = P0;
        bc7 bc7Var = bc7VarArr[4];
        fs fsVar = this.J0;
        Long l = (Long) fsVar.a(this);
        long jLongValue = l != null ? l.longValue() : 0L;
        bc7 bc7Var2 = bc7VarArr[4];
        fsVar.b(this, null);
        p0().q(i, jLongValue);
    }

    public /* synthetic */ ContactListWidget(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ContactListWidget(Bundle bundle) {
        int i = 3;
        int i2 = 0;
        int i3 = 2;
        super(bundle, i2, i3, null);
        this.a = x27.d;
        hr3 hr3Var = hr3.a;
        this.b = hr3Var.getAccessor().d(an9.class);
        this.c = hr3Var.getAccessor().d(bt1.class);
        this.o = hr3Var.getAccessor().d(l67.class);
        ExecutorService executorServiceA = ((iba) hr3Var.getAccessor().c(iba.class)).a();
        this.X = executorServiceA;
        a3g a3gVar = new a3g(this, executorServiceA, i);
        this.Y = a3gVar;
        a3g a3gVar2 = new a3g(this, executorServiceA, 6);
        this.Z = a3gVar2;
        a3g a3gVar3 = new a3g(this, executorServiceA, i);
        this.s0 = a3gVar3;
        jv5 jv5Var = new jv5(this, executorServiceA, 4);
        this.t0 = jv5Var;
        a3g a3gVar4 = new a3g(this, executorServiceA, i3);
        this.u0 = a3gVar4;
        nd3 nd3Var = new nd3(new md3(false, 1), a3gVar4, a3gVar, a3gVar2, a3gVar3, jv5Var);
        nd3Var.z(new pz4(7, new po3(this, i2)));
        this.v0 = nd3Var;
        this.w0 = createViewModelLazy(oo3.class, new ti2(28, new eh2(bundle, i3)));
        this.x0 = binding(new po3(this, i));
        this.y0 = tu0.r(3, new po3(this, 4));
        this.z0 = tu0.r(3, new eh2(bundle, i));
        this.A0 = createViewModelLazy(bh0.class, new ti2(29, new po3(this, 5)));
        this.B0 = binding(new po3(this, 6));
        this.C0 = viewBinding(wvb.oneme_contactlist_rv);
        this.D0 = tu0.r(3, new po3(this, 7));
        this.E0 = y53.M(new tt3(z8a.q, new eqe(a9a.i), Integer.valueOf(woc.M0), (Integer) null, 20), new tt3(z8a.r, new eqe(jpc.a), Integer.valueOf(woc.f2), (Integer) null, 20), new tt3(gca.d, new eqe(hca.e), Integer.valueOf(woc.f1), (Integer) null, 20), new tt3(gca.k, new eqe(hca.k), Integer.valueOf(woc.N1), (Integer) null, 20), new tt3(gca.e, new eqe(hca.f), Integer.valueOf(woc.c0), (Integer) null, 20));
        this.F0 = fua.a.b();
        this.G0 = hr3Var.getAccessor().d(q33.class);
        hr3Var.getAccessor().d(y7d.class);
        hr3Var.getAccessor().d(bva.class);
        this.H0 = new khe(new zf3(5));
        this.I0 = mqd.D();
        this.J0 = new fs(Long.class, null, "selected.contactId.Action");
        this.K0 = new fs(CharSequence.class, null, "contact_list_widget_search_query");
        Boolean bool = Boolean.FALSE;
        this.L0 = new fs(Boolean.class, bool, "contact_list_widget_is_in_search");
        this.M0 = new fs(Boolean.class, bool, "contact_list_widget_is_need_scroll_to_top");
        this.N0 = new fs(Boolean.class, bool, "contact_list_widget_permission_check");
        this.O0 = new glc(new po3(this, 8), null, 6);
        s35 s35Var = p0().C0;
        gh7 gh7VarQ = this.lifecycleOwner.Q();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, gh7VarQ, fg7Var), new so3(this, null), 5), getLifecycleScope());
        od2.L(new zn5(new t03(tu0.g(p0().D0, this.lifecycleOwner.Q(), fg7Var), 3), new to3(this, null), 5), getLifecycleScope());
    }

    public ContactListWidget(uo3 uo3Var) {
        this(dy7.g(new kpa("contact_screen_open_mode", uo3Var.name())));
    }
}
