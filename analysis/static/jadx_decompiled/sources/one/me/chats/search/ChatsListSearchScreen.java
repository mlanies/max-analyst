package one.me.chats.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.a33;
import defpackage.a3g;
import defpackage.an9;
import defpackage.au1;
import defpackage.av3;
import defpackage.bc7;
import defpackage.bh0;
import defpackage.bvc;
import defpackage.cla;
import defpackage.cv2;
import defpackage.cw2;
import defpackage.dv2;
import defpackage.e11;
import defpackage.eha;
import defpackage.em2;
import defpackage.eua;
import defpackage.ev2;
import defpackage.ew2;
import defpackage.fg7;
import defpackage.fs;
import defpackage.fw2;
import defpackage.ga;
import defpackage.gd1;
import defpackage.glc;
import defpackage.gm2;
import defpackage.gv2;
import defpackage.gw2;
import defpackage.gy2;
import defpackage.h8e;
import defpackage.hn2;
import defpackage.hob;
import defpackage.hv2;
import defpackage.imc;
import defpackage.iv2;
import defpackage.izc;
import defpackage.j31;
import defpackage.j47;
import defpackage.j81;
import defpackage.je7;
import defpackage.jpc;
import defpackage.jv2;
import defpackage.kv2;
import defpackage.l5g;
import defpackage.md3;
import defpackage.mqd;
import defpackage.mr0;
import defpackage.mx8;
import defpackage.nd3;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nz4;
import defpackage.o;
import defpackage.od2;
import defpackage.oi9;
import defpackage.ov2;
import defpackage.p8a;
import defpackage.pka;
import defpackage.pnf;
import defpackage.pz4;
import defpackage.q7c;
import defpackage.r8a;
import defpackage.rh4;
import defpackage.td6;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.tyc;
import defpackage.uka;
import defpackage.uvb;
import defpackage.v3c;
import defpackage.vha;
import defpackage.vka;
import defpackage.vq2;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w4d;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.we1;
import defpackage.wq3;
import defpackage.x27;
import defpackage.x77;
import defpackage.xk1;
import defpackage.xka;
import defpackage.xq3;
import defpackage.xt3;
import defpackage.y16;
import defpackage.y51;
import defpackage.yfa;
import defpackage.ys2;
import defpackage.zn5;
import defpackage.zu2;
import defpackage.zu3;
import defpackage.zv2;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/search/ChatsListSearchScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "La33;", "Lng3;", "Ltyc;", "Lwq3;", "Ly16;", "<init>", "()V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ChatsListSearchScreen extends Widget implements xt3, a33, ng3, tyc, wq3, y16 {
    public static final /* synthetic */ bc7[] J0 = {new oi9(ChatsListSearchScreen.class, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), rh4.g(nec.a, ChatsListSearchScreen.class, "shouldRestoreFocus", "getShouldRestoreFocus()Z"), new hob(ChatsListSearchScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(ChatsListSearchScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new oi9(ChatsListSearchScreen.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;")};
    public final xq3 A0;
    public final y51 B0;
    public final y51 C0;
    public final a3g D0;
    public final y51 E0;
    public final nd3 F0;
    public final q7c G0;
    public final w4d H0;
    public vha I0;
    public final fs X;
    public final q7c Y;
    public final je7 Z;
    public final glc a;
    public final je7 b;
    public final x27 c;
    public final fs o;
    public final je7 s0;
    public final ExecutorService t0;
    public final je7 u0;
    public final xq3 v0;
    public final a3g w0;
    public final xq3 x0;
    public final a3g y0;
    public final pz4 z0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public ChatsListSearchScreen() {
        int i = 1;
        int i2 = 3;
        super(null, 0, i2, 0 == true ? 1 : 0);
        this.a = new glc(new e11(0, this, ChatsListSearchScreen.class, "getCurrentScreen", "getCurrentScreen()Lone/me/sdk/statistics/screen/Screen;", 0, 7), null, 6);
        ys2 ys2Var = ys2.a;
        this.b = ys2Var.getAccessor().d(an9.class);
        this.c = x27.d;
        this.o = new fs(Long.class, null, "selected.chatId.Action");
        this.X = new fs(Boolean.class, Boolean.TRUE, "should.restore.focus");
        this.Y = viewBinding(uvb.chats_list_search_toolbar);
        this.Z = createViewModelLazy(gw2.class, new ti2(17, new hn2(6)));
        this.s0 = createViewModelLazy(bh0.class, new ti2(18, new hn2(7)));
        ExecutorService executorServiceA = ys2Var.c().a();
        this.t0 = executorServiceA;
        this.u0 = ys2Var.getAccessor().d(eua.class);
        xq3 xq3Var = new xq3(new zu2(this), executorServiceA);
        this.v0 = xq3Var;
        a3g a3gVar = new a3g(new jv2(this), executorServiceA, 11);
        this.w0 = a3gVar;
        xq3 xq3Var2 = new xq3(this, executorServiceA);
        this.x0 = xq3Var2;
        a3g a3gVar2 = new a3g(new gd1(i2, this), executorServiceA, i2);
        this.y0 = a3gVar2;
        this.z0 = new pz4(i, this);
        xq3 xq3Var3 = new xq3(this, executorServiceA);
        this.A0 = xq3Var3;
        y51 y51Var = new y51(executorServiceA, 4);
        this.B0 = y51Var;
        y51 y51Var2 = new y51(executorServiceA, i2);
        this.C0 = y51Var2;
        a3g a3gVar3 = new a3g(this, executorServiceA, 2);
        this.D0 = a3gVar3;
        y51 y51Var3 = new y51(executorServiceA, i);
        this.E0 = y51Var3;
        this.F0 = new nd3(new md3(false, 1), xq3Var, a3gVar3, a3gVar, xq3Var2, a3gVar2, xq3Var3, y51Var3, y51Var, y51Var2);
        this.G0 = viewBinding(p8a.g);
        this.H0 = mqd.D();
    }

    @Override // defpackage.y16
    public final void R(int i, int i2, Intent intent) {
        if (i == 101 && i2 == -1) {
            bc7 bc7Var = J0[1];
            this.X.b(this, Boolean.FALSE);
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.a;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (bundle != null) {
            long j = bundle.getLong("selected.chatId.Action");
            gw2 gw2VarN0 = n0();
            pnf.n(gw2VarN0, ((w9a) gw2VarN0.Z).a(), null, new zv2(i, gw2VarN0, j, null), 2);
        }
    }

    public final void m0() {
        this.v0.E(null);
        nz4 nz4Var = nz4.a;
        this.w0.E(nz4Var);
        this.x0.E(nz4Var);
        this.y0.E(nz4Var);
    }

    public final gw2 n0() {
        return (gw2) this.Z.getValue();
    }

    public final void o0(izc izcVar) {
        mr0.G(this);
        int iS = au1.s(izcVar.a);
        if (iS == 0) {
            gw2 gw2VarN0 = n0();
            pnf.n(gw2VarN0, ((w9a) gw2VarN0.Z).b(), null, new fw2(gw2VarN0, izcVar.getItemId(), null), 2);
            gy2.b2(gy2.c, izcVar.getItemId(), "local", null, null, null, null, 124);
            return;
        }
        if (iS == 1) {
            gy2.b2(gy2.c, izcVar.getItemId(), "server", null, null, null, null, 124);
            return;
        }
        if (iS == 2) {
            gw2 gw2VarN02 = n0();
            j47.T(gw2VarN02.a, ((w9a) gw2VarN02.Z).a(), null, new cw2(gw2VarN02, izcVar.getItemId(), null), 2);
        } else if (iS == 3) {
            gw2 gw2VarN03 = n0();
            j47.T(gw2VarN03.a, ((w9a) gw2VarN03.Z).a(), null, new ew2(gw2VarN03, (td6) izcVar, null), 2);
        } else {
            if (iS != 4) {
                throw new NoWhenBranchMatchedException();
            }
            mx8 mx8Var = (mx8) izcVar;
            if (mx8Var.Y == null) {
                return;
            }
            j47.T(getViewLifecycleScope(), null, null, new cv2(this, mx8Var, null), 3);
        }
    }

    @Override // defpackage.uu3
    public final void onChangeEnded(zu3 zu3Var, av3 av3Var) {
        super.onChangeEnded(zu3Var, av3Var);
        if (av3Var == av3.POP_ENTER) {
            gw2 gw2VarN0 = n0();
            gw2VarN0.o.i = gw2VarN0;
        }
        bc7[] bc7VarArr = J0;
        bc7 bc7Var = bc7VarArr[1];
        fs fsVar = this.X;
        boolean zBooleanValue = ((Boolean) fsVar.a(this)).booleanValue();
        bc7 bc7Var2 = bc7VarArr[1];
        fsVar.b(this, Boolean.TRUE);
        if (av3Var.b && zBooleanValue) {
            eha searchView = ((cla) this.Y.T0(this, bc7VarArr[2])).getSearchView();
            if (searchView != null) {
                mr0.V((View) searchView.C0.getValue());
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setId(p8a.h);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        Continuation continuation = null;
        v3c.y(new o(3, continuation, 2), linearLayout);
        cla claVar = new cla(getContext(), 6);
        claVar.setId(p8a.i);
        claVar.setTransitionName(claVar.getContext().getString(r8a.q));
        claVar.setForm(uka.b);
        claVar.setRightActions(new pka(new xka(new imc(this, claVar, false, 11)), new vka(yfa.i, new we1(26))));
        claVar.setTitle(r8a.p);
        eha searchView = claVar.getSearchView();
        if (searchView != null) {
            searchView.setSearchHint(searchView.getResources().getString(r8a.y));
            searchView.setCollapsible(false);
            searchView.setSearchText(((ov2) n0().F0.a.getValue()).b);
            if (bundle != null) {
                searchView.setExpandWithAnimation(false);
                searchView.c(false);
            }
        }
        linearLayout.addView(claVar);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(getContext(), null, 6);
        endlessRecyclerView2.setId(p8a.g);
        endlessRecyclerView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.getContext();
        endlessRecyclerView2.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2.setItemAnimator(null);
        nd3 nd3Var = this.F0;
        endlessRecyclerView2.setAdapter(nd3Var);
        endlessRecyclerView2.setHasFixedSize(true);
        endlessRecyclerView2.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2.setPager(new j81(this, 1));
        endlessRecyclerView2.setDelegate(this.E0);
        h8e h8eVar = new h8e(endlessRecyclerView2, nd3Var, new em2(1, new ga(this, 5, endlessRecyclerView2)));
        endlessRecyclerView2.j(h8eVar);
        v3c.y(new gm2(h8eVar, continuation, 1), endlessRecyclerView2);
        linearLayout.addView(endlessRecyclerView2);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        this.I0 = null;
        this.A0.B(this.z0);
        super.onDestroyView(view);
    }

    @Override // defpackage.xt3
    public final void onDismiss() {
        bc7[] bc7VarArr = J0;
        bc7 bc7Var = bc7VarArr[0];
        this.o.b(this, null);
        x77 x77Var = (x77) this.H0.T0(this, bc7VarArr[4]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eua euaVar = (eua) this.u0.getValue();
            l5g l5gVar = new l5g(this, 1);
            String[] strArr2 = eua.e;
            int i2 = jpc.Q1;
            int i3 = jpc.W1;
            euaVar.getClass();
            eua.k(l5gVar, strArr, iArr, strArr2, i2, i3);
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        this.A0.z(this.z0);
        w7c w7cVar = n0().F0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new dv2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new j31(((bh0) this.s0.getValue()).s0, n0().F0, new gv2(3, 4, ChatsListSearchScreen.class, this, "combineSearchAndBanners", "combineSearchAndBanners(Ljava/util/List;Lone/me/chats/search/ChatsListSearchState;)Ljava/util/List;"), 4), getViewLifecycleOwner().Q(), fg7Var), new ev2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().H0, getViewLifecycleOwner().Q(), fg7Var), new hv2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(new xk1(tu0.g(n0().I0, getViewLifecycleOwner().Q(), fg7Var), 22), new iv2(null, this), 5), getViewLifecycleScope());
    }

    public final void p0(izc izcVar, View view) {
        if (izcVar instanceof vq2) {
            mr0.G(this);
            vxd vxdVarT = j47.T(getViewLifecycleScope(), null, vx3.b, new kv2(this, ((vq2) izcVar).H0, view, null), 1);
            this.H0.o1(this, J0[4], vxdVarT);
        }
    }

    public final void q0() {
        if (getView() != null) {
            ((EndlessRecyclerView2) this.G0.T0(this, J0[3])).x0(0);
        }
    }

    @Override // defpackage.wq3
    public final void w(int i) {
        ((eua) this.u0.getValue()).f(new l5g(this, 1), eua.e, 156);
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        bc7[] bc7VarArr = J0;
        bc7 bc7Var = bc7VarArr[0];
        fs fsVar = this.o;
        Long l = (Long) fsVar.a(this);
        if (l != null) {
            long jLongValue = l.longValue();
            bc7 bc7Var2 = bc7VarArr[0];
            fsVar.b(this, null);
            gw2 gw2VarN0 = n0();
            pnf.n(gw2VarN0, ((w9a) gw2VarN0.Z).a(), null, new zv2(i, gw2VarN0, jLongValue, null), 2);
        }
    }
}
