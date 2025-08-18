package one.me.keyboardmedia.stickers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ad7;
import defpackage.aod;
import defpackage.ap8;
import defpackage.b6e;
import defpackage.b8e;
import defpackage.bc7;
import defpackage.bod;
import defpackage.br;
import defpackage.c37;
import defpackage.cc8;
import defpackage.d71;
import defpackage.dy7;
import defpackage.e0a;
import defpackage.eh2;
import defpackage.f;
import defpackage.fk4;
import defpackage.g02;
import defpackage.gw7;
import defpackage.hm9;
import defpackage.hob;
import defpackage.iba;
import defpackage.j31;
import defpackage.j47;
import defpackage.jca;
import defpackage.je7;
import defpackage.jy2;
import defpackage.kc7;
import defpackage.kpa;
import defpackage.kq1;
import defpackage.ly4;
import defpackage.m4e;
import defpackage.mc7;
import defpackage.md5;
import defpackage.ml0;
import defpackage.mz9;
import defpackage.nc5;
import defpackage.nc7;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.o2e;
import defpackage.od2;
import defpackage.q7c;
import defpackage.ry0;
import defpackage.s15;
import defpackage.sc5;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.v7e;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w7e;
import defpackage.w9a;
import defpackage.x7e;
import defpackage.xc7;
import defpackage.yc7;
import defpackage.z7;
import defpackage.z84;
import defpackage.zc7;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/keyboardmedia/stickers/KeyboardStickersWidget;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "Lsuc;", "scopeId", "(JLjava/lang/String;Lz84;)V", "keyboard-media_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class KeyboardStickersWidget extends Widget implements ng3 {
    public static final /* synthetic */ bc7[] t0 = {new hob(KeyboardStickersWidget.class, "contentRecyclerView", "getContentRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zr6.e(nec.a, KeyboardStickersWidget.class, "stickersTabsRecyclerView", "getStickersTabsRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0)};
    public final q7c X;
    public final ly4 Y;
    public final m4e Z;
    public final je7 a;
    public final je7 b;
    public gw7 c;
    public final q7c o;
    public final g02 s0;

    public KeyboardStickersWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = createViewModelLazy(b8e.class, new nj4(15, new eh2(bundle, 5)));
        this.b = m41getSharedViewModelcp94BC8(bundle.getString(Widget.ARG_SCOPE_ID), cc8.class, null);
        this.o = viewBinding(jca.n);
        this.X = viewBinding(jca.o);
        kc7 kc7Var = kc7.a;
        this.Y = new ly4(((iba) kc7Var.getAccessor().c(iba.class)).a(), new jy2(24, this), (byte) 0);
        m4e m4eVar = new m4e(((iba) kc7Var.getAccessor().c(iba.class)).a(), new ad7(this, bundle));
        this.Z = m4eVar;
        b8e b8eVarO0 = o0();
        b8eVarO0.getClass();
        hm9.n(b8e.class.getName(), "loadStickers");
        kq1 kq1VarC = c37.c(((o2e) b8eVarO0.c.getValue()).a());
        kq1 kq1VarC2 = c37.c(((md5) b8eVarO0.X.getValue()).a());
        ml0 ml0Var = ((sc5) b8eVarO0.Y.getValue()).s0;
        ml0Var.getClass();
        kq1 kq1VarC3 = c37.c(new e0a(new mz9(ml0Var, 0), new nc5(23), 3));
        bod bodVar = (bod) b8eVarO0.Z.getValue();
        od2.L(od2.F(new zn5(od2.s(kq1VarC, kq1VarC2, kq1VarC3, new j31(new ap8(c37.c(((o2e) bodVar.a.getValue()).l), bodVar, 10), ((b6e) bodVar.b.getValue()).e, aod.s0, 4), new v7e(5, null)), new w7e(b8eVarO0, null), 5), ((w9a) b8eVarO0.b).b()), b8eVarO0.a);
        od2.L(new zn5(o0().u0, new xc7(this, null), 5), getLifecycleScope());
        this.s0 = new g02(m4eVar, new f(1, o0(), b8e.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/sdk/lists/adapter/ListItem;)V", 0, 29));
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == jca.g) {
            b8e b8eVarO0 = o0();
            vxd vxdVarS = j47.S(b8eVarO0.a, ((w9a) b8eVarO0.b).b(), vx3.b, new x7e(b8eVarO0, null));
            b8eVarO0.A0.o1(b8eVarO0, b8e.B0[2], vxdVarS);
        }
    }

    public final EndlessRecyclerView2 m0() {
        return (EndlessRecyclerView2) this.o.T0(this, t0[0]);
    }

    public final RecyclerView n0() {
        return (RecyclerView) this.X.T0(this, t0[1]);
    }

    public final b8e o0() {
        return (b8e) this.a.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(jca.l);
        int iG = tu0.G(44 * fk4.d().getDisplayMetrics().density);
        Continuation continuation = null;
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(jca.o);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, iG));
        int iG2 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        int iG3 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        recyclerView.setPadding(iG3, iG2, iG3, iG2);
        recyclerView.setClipToPadding(false);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        int i = 3;
        v3c.y(new nc7(i, continuation, 2), recyclerView);
        frameLayout.addView(recyclerView);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(jca.n);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iG;
        endlessRecyclerView2.setLayoutParams(layoutParams);
        v3c.y(new br(i, continuation, 8), endlessRecyclerView2);
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int iG4 = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(iG4, endlessRecyclerView2.getPaddingTop(), iG4, tu0.G(48 * fk4.d().getDisplayMetrics().density));
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        m0().setAdapter(null);
        m0().s0(this.s0);
        n0().setAdapter(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        n0().setAdapter(this.Y);
        n0().j(new d71(tu0.G(2 * fk4.d().getDisplayMetrics().density), 3));
        EndlessRecyclerView2 endlessRecyclerView2M0 = m0();
        gw7 gw7Var = this.c;
        m4e m4eVar = this.Z;
        m4eVar.Z = gw7Var;
        int iA = z7.A(endlessRecyclerView2M0.getContext());
        endlessRecyclerView2M0.getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(iA);
        gridLayoutManager.K = new mc7(gridLayoutManager, m4eVar);
        endlessRecyclerView2M0.setLayoutManager(gridLayoutManager);
        endlessRecyclerView2M0.j(new ry0(iA, tu0.G(4 * fk4.d().getDisplayMetrics().density), 8));
        endlessRecyclerView2M0.m(this.s0);
        endlessRecyclerView2M0.m(new s15(2, this));
        endlessRecyclerView2M0.k(new yc7(0, this));
        endlessRecyclerView2M0.setAdapter(m4eVar);
        od2.L(new zn5(o0().x0, new zc7(this, null), 5), getViewLifecycleScope());
    }

    public KeyboardStickersWidget(long j, String str, z84 z84Var) {
        this(dy7.g(new kpa("arg_key_chat_id", Long.valueOf(j)), new kpa(Widget.ARG_SCOPE_ID, str)));
    }
}
