package one.me.chats.list;

import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import defpackage.a3g;
import defpackage.aba;
import defpackage.ac;
import defpackage.au1;
import defpackage.ax7;
import defpackage.b57;
import defpackage.b82;
import defpackage.bc7;
import defpackage.bh0;
import defpackage.bta;
import defpackage.bw5;
import defpackage.cta;
import defpackage.dh0;
import defpackage.dy7;
import defpackage.e52;
import defpackage.em2;
import defpackage.eua;
import defpackage.ey8;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.g8d;
import defpackage.ga;
import defpackage.gh7;
import defpackage.gy2;
import defpackage.hm9;
import defpackage.hn2;
import defpackage.hob;
import defpackage.hpc;
import defpackage.hr3;
import defpackage.ib5;
import defpackage.iga;
import defpackage.in3;
import defpackage.ir6;
import defpackage.j1e;
import defpackage.j47;
import defpackage.j81;
import defpackage.je7;
import defpackage.jn3;
import defpackage.jpc;
import defpackage.khe;
import defpackage.kk1;
import defpackage.kpa;
import defpackage.kq;
import defpackage.l;
import defpackage.l5g;
import defpackage.l67;
import defpackage.ly4;
import defpackage.md3;
import defpackage.mdc;
import defpackage.mn5;
import defpackage.mqd;
import defpackage.mt2;
import defpackage.mw2;
import defpackage.nd3;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nn3;
import defpackage.nw4;
import defpackage.nx2;
import defpackage.od2;
import defpackage.oi9;
import defpackage.oo3;
import defpackage.ox2;
import defpackage.p82;
import defpackage.p8a;
import defpackage.pnf;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.qn5;
import defpackage.qp4;
import defpackage.qt3;
import defpackage.qx2;
import defpackage.rh4;
import defpackage.ro2;
import defpackage.rv5;
import defpackage.rx2;
import defpackage.s35;
import defpackage.s8g;
import defpackage.sx2;
import defpackage.ti2;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.tx2;
import defpackage.ujc;
import defpackage.un8;
import defpackage.us7;
import defpackage.uvb;
import defpackage.ux2;
import defpackage.v02;
import defpackage.v3c;
import defpackage.vx2;
import defpackage.vx3;
import defpackage.w4d;
import defpackage.w9a;
import defpackage.wmd;
import defpackage.wq3;
import defpackage.wx2;
import defpackage.x47;
import defpackage.x77;
import defpackage.xk1;
import defpackage.xt3;
import defpackage.xu2;
import defpackage.xx2;
import defpackage.y51;
import defpackage.yb4;
import defpackage.ys2;
import defpackage.yx2;
import defpackage.z7;
import defpackage.zn5;
import defpackage.zwe;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/chats/list/ChatsListWidget;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lng3;", "Lwq3;", "Lib5;", "Lb57;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class ChatsListWidget extends Widget implements xt3, ng3, wq3, ib5, b57 {
    public static final /* synthetic */ bc7[] M0 = {new oi9(ChatsListWidget.class, "selectedChatIdForAction", "getSelectedChatIdForAction()Ljava/lang/Long;"), rh4.g(nec.a, ChatsListWidget.class, "selectedContactIdForAction", "getSelectedContactIdForAction()Ljava/lang/Long;"), new hob(ChatsListWidget.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), new hob(ChatsListWidget.class, "emptyView", "getEmptyView()Lone/me/sdk/uikit/common/emptyview/OneMeEmptyView;", 0), new oi9(ChatsListWidget.class, "contextMenuJob", "getContextMenuJob()Lkotlinx/coroutines/Job;"), new hob(ChatsListWidget.class, "chatsListRecyclerViewAnalyticsListener", "getChatsListRecyclerViewAnalyticsListener()Lone/me/chats/list/ChatsListRecyclerViewAnalyticsListener;", 0)};
    public final ly4 A0;
    public final a3g B0;
    public final a3g C0;
    public final a3g D0;
    public final a3g E0;
    public final y51 F0;
    public final rv5 G0;
    public final nd3 H0;
    public final w4d I0;
    public final je7 J0;
    public final qm0 K0;
    public final ax7 L0;
    public final khe X;
    public final je7 Y;
    public final je7 Z;
    public final String a;
    public final String b;
    public final fs c;
    public final fs o;
    public final je7 s0;
    public final je7 t0;
    public zwe u0;
    public final ExecutorService v0;
    public final q7c w0;
    public final qm0 x0;
    public final khe y0;
    public b z0;

    public ChatsListWidget(String str) {
        this(dy7.g(new kpa("folder.id.key", str)));
    }

    public static final void m0(ChatsListWidget chatsListWidget, qt3 qt3Var) {
        chatsListWidget.getClass();
        float f = -6;
        qt3Var.w(new Rect(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0), 0.0f);
    }

    @Override // defpackage.b57
    public final void A(x47 x47Var) {
        int iOrdinal = x47Var.ordinal();
        if (iOrdinal == 0) {
            gy2.c.P1().b(":invite/phone", null);
            return;
        }
        je7 je7Var = this.Y;
        if (iOrdinal == 1) {
            ((l67) je7Var.getValue()).a("click_qr", "main", "invite_friends");
            gy2.c.P1().b(":invite/qr", null);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            ((l67) je7Var.getValue()).a("click_link", "main", "invite_friends");
            p0().v();
        }
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        boolean z = false;
        if (i == uvb.oneme_saved_messages_clear_history) {
            nx2 nx2VarP0 = p0();
            p82 p82VarT = nx2VarP0.t();
            p82VarT.getClass();
            e52 e52Var = (e52) p82VarT.e0(null, new b82(p82VarT, 2));
            if (e52Var == null) {
                return;
            }
            ((s8g) nx2VarP0.E0.getValue()).a(new g8d(e52Var.a, false));
            return;
        }
        if (i == hpc.a) {
            return;
        }
        Long lValueOf = bundle != null ? Long.valueOf(bundle.getLong("selected.chatId.Action")) : null;
        boolean z2 = (lValueOf == null || lValueOf.longValue() != 0) && lValueOf != null;
        Long lValueOf2 = bundle != null ? Long.valueOf(bundle.getLong("selected.contactId.Action")) : null;
        if ((lValueOf2 == null || lValueOf2.longValue() != 0) && lValueOf2 != null) {
            z = true;
        }
        if (z2) {
            nx2 nx2VarP02 = p0();
            if (lValueOf == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            pnf.n(nx2VarP02, ((w9a) nx2VarP02.Y).a(), null, new mw2(i, nx2VarP02, lValueOf.longValue(), null), 2);
            return;
        }
        if (z) {
            oo3 oo3Var = (oo3) this.Z.getValue();
            if (lValueOf2 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            oo3Var.q(i, lValueOf2.longValue());
        }
    }

    public final aba n0() {
        bc7 bc7Var = M0[3];
        return (aba) this.x0.getValue();
    }

    public final EndlessRecyclerView2 o0() {
        return (EndlessRecyclerView2) this.w0.T0(this, M0[2]);
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        p0().u();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(layoutInflater.getContext(), null, 6);
        endlessRecyclerView2.setId(p8a.k);
        endlessRecyclerView2.setTag(uvb.oneme_folder_tag, this.b);
        endlessRecyclerView2.setHasFixedSize(true);
        frameLayout.addView(endlessRecyclerView2);
        frameLayout.addView(n0(), -1, -1);
        v3c.y(new ro2(3, null, 2), frameLayout);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | list view destroy. Scope isActive: ", j1e.z(getLifecycleScope())), null);
        }
        EndlessRecyclerView2 endlessRecyclerView2O0 = o0();
        bc7 bc7Var = M0[5];
        endlessRecyclerView2O0.q0((xu2) this.K0.getValue());
        zwe zweVar = this.u0;
        if (zweVar != null) {
            zweVar.B(endlessRecyclerView2O0);
        }
        endlessRecyclerView2O0.setDelegate(null);
        endlessRecyclerView2O0.setPager(null);
        endlessRecyclerView2O0.setAdapter(null);
    }

    @Override // defpackage.xt3
    public final void onDismiss() {
        bc7[] bc7VarArr = M0;
        bc7 bc7Var = bc7VarArr[0];
        this.c.b(this, null);
        bc7 bc7Var2 = bc7VarArr[1];
        this.o.b(this, null);
        x77 x77Var = (x77) this.I0.T0(this, bc7VarArr[4]);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 156) {
            eua euaVar = (eua) this.t0.getValue();
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
        String str = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | list view created. Scope isActive: ", j1e.z(getLifecycleScope())), null);
        }
        EndlessRecyclerView2 endlessRecyclerView2O0 = o0();
        nd3 nd3Var = this.H0;
        if (tpa.f(this.b, "all.chat.folder")) {
            bc7 bc7Var = M0[5];
            endlessRecyclerView2O0.k((xu2) this.K0.getValue());
        }
        endlessRecyclerView2O0.getContext();
        endlessRecyclerView2O0.setLayoutManager(new LinearLayoutManager());
        if (endlessRecyclerView2O0.getAdapter() == null || nd3Var != endlessRecyclerView2O0.getAdapter()) {
            if (!tpa.f(Looper.myLooper(), Looper.getMainLooper())) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i = iga.a;
            Object tag = endlessRecyclerView2O0.getTag(i);
            ujc ujcVar = tag instanceof ujc ? (ujc) tag : null;
            endlessRecyclerView2O0.setTag(i, null);
            if (ujcVar != null) {
                String str2 = ujcVar.i;
                ir6 ir6Var2 = hm9.m;
                if (ir6Var2 != null && ir6Var2.c()) {
                    ir6Var2.d(us7.X, str2, "clear", null);
                }
                RecyclerView recyclerView = (RecyclerView) ujcVar.d.get();
                if (recyclerView != null) {
                    recyclerView.removeOnAttachStateChangeListener(ujcVar.h);
                }
                gh7 gh7Var = ujcVar.e;
                if (gh7Var != null) {
                    gh7Var.f(ujcVar.g);
                }
            }
            if (nd3Var == null) {
                b recycledViewPool = endlessRecyclerView2O0.getRecycledViewPool();
                endlessRecyclerView2O0.setRecycledViewPool(null);
                endlessRecyclerView2O0.setAdapter(null);
                endlessRecyclerView2O0.setRecycledViewPool(recycledViewPool);
            } else {
                endlessRecyclerView2O0.setTag(i, new ujc(nd3Var, endlessRecyclerView2O0));
            }
        }
        this.u0 = z7.m(endlessRecyclerView2O0);
        endlessRecyclerView2O0.setHasFixedSize(true);
        endlessRecyclerView2O0.setPager(new j81(this, 2));
        if (tpa.f(this.b, "all.chat.folder")) {
            endlessRecyclerView2O0.setDelegate(this.F0);
        }
        endlessRecyclerView2O0.setEmptyView(n0());
        endlessRecyclerView2O0.setClipToPadding(false);
        endlessRecyclerView2O0.setClipChildren(false);
        endlessRecyclerView2O0.setClipToOutline(false);
        endlessRecyclerView2O0.setThreshold(10);
        endlessRecyclerView2O0.setIgnoreRefreshingFlagsForScrollEvent(true);
        b bVar = this.z0;
        if (bVar != null) {
            endlessRecyclerView2O0.setRecycledViewPool(bVar);
        }
        mdc itemAnimator = endlessRecyclerView2O0.getItemAnimator();
        yb4 yb4Var = itemAnimator instanceof yb4 ? (yb4) itemAnimator : null;
        if (yb4Var != null) {
            yb4Var.g = false;
        }
        endlessRecyclerView2O0.j(new kq(3));
        pq9 pq9Var = qp4.u0;
        endlessRecyclerView2O0.j(new un8(1, pq9Var.j(endlessRecyclerView2O0)));
        endlessRecyclerView2O0.j(new bw5(new nw4(this, getContext().getString(jpc.Q), endlessRecyclerView2O0, 4)));
        endlessRecyclerView2O0.j(new jn3(new em2(4, new ga(this, 7, new nn3(0L, "", null, null, null, null, null, false, false, "", false, null, 0, false, 31744))), pq9Var.j(endlessRecyclerView2O0), (in3) null));
        if (nd3Var.j() > 0) {
            endlessRecyclerView2O0.measure(View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2O0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(endlessRecyclerView2O0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
        }
        o0().setRefreshingNext(((mt2) p0().H0.a.getValue()).b);
        s35 s35Var = p0().O0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new tx2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new xk1(p0().P0, 28), getViewLifecycleOwner().Q(), fg7Var), new ux2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(p0().N0, getViewLifecycleOwner().Q(), fg7Var), new vx2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((oo3) this.Z.getValue()).C0, getViewLifecycleOwner().Q(), fg7Var), new wx2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new xk1(((oo3) this.Z.getValue()).D0, 29), getViewLifecycleOwner().Q(), fg7Var), new xx2(null, this), 5), getViewLifecycleScope());
        this.A0.Y = new l(29, this);
        od2.L(new zn5(tu0.g(p0().V0, getViewLifecycleOwner().Q(), fg7Var), new yx2(null, this), 5), getViewLifecycleScope());
    }

    public final nx2 p0() {
        return (nx2) this.s0.getValue();
    }

    public final void q0(long j, View view) {
        bc7[] bc7VarArr = M0;
        bc7 bc7Var = bc7VarArr[1];
        if (((Long) this.o.a(this)) == null) {
            bc7 bc7Var2 = bc7VarArr[4];
            w4d w4dVar = this.I0;
            x77 x77Var = (x77) w4dVar.T0(this, bc7Var2);
            if (x77Var == null || !x77Var.isActive()) {
                w4dVar.o1(this, bc7VarArr[4], j47.T(getViewLifecycleScope(), null, vx3.b, new sx2(this, j, view, null), 1));
            }
        }
    }

    @Override // defpackage.wq3
    public final void t() {
        ((eua) this.t0.getValue()).f(new l5g(this, 1), eua.e, 156);
    }

    @Override // defpackage.wq3
    public final void w(int i) {
        if (qx2.$EnumSwitchMapping$0[au1.s(i)] != 1) {
            t();
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            l5g l5gVar = new l5g(this, 1);
            je7 je7Var = this.t0;
            eua euaVar = (eua) je7Var.getValue();
            String[] strArr = eua.k;
            euaVar.getClass();
            if (eua.i(l5gVar, strArr)) {
                ((eua) je7Var.getValue()).f(l5gVar, strArr, 177);
            } else {
                startActivity(new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", getContext().getPackageName(), null)));
            }
        }
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        bc7[] bc7VarArr = M0;
        bc7 bc7Var = bc7VarArr[0];
        fs fsVar = this.c;
        Long l = (Long) fsVar.a(this);
        if (l != null) {
            long jLongValue = l.longValue();
            bc7 bc7Var2 = bc7VarArr[0];
            fsVar.b(this, null);
            nx2 nx2VarP0 = p0();
            pnf.n(nx2VarP0, ((w9a) nx2VarP0.Y).a(), null, new mw2(i, nx2VarP0, jLongValue, null), 2);
            return;
        }
        bc7 bc7Var3 = bc7VarArr[1];
        Long l2 = (Long) this.o.a(this);
        if (l2 != null) {
            ((oo3) this.Z.getValue()).q(i, l2.longValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatsListWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        int i = 6;
        int i2 = 9;
        int i3 = 7;
        int i4 = 4;
        int i5 = 1;
        int i6 = 5;
        int i7 = 0;
        int i8 = 2;
        String name = ChatsListWidget.class.getName();
        this.a = name;
        String string = bundle.getString("folder.id.key");
        if (string != null) {
            this.b = string;
            this.c = new fs(Long.class, null, "selected.chatId.Action");
            this.o = new fs(Long.class, null, "selected.contactId.Action");
            this.X = new khe(new ox2(this, i7));
            this.Y = hr3.a.getAccessor().d(l67.class);
            this.Z = createViewModelLazy(oo3.class, new ti2(19, new hn2(i2)));
            this.s0 = createViewModelLazy(nx2.class, new ti2(20, new ox2(this, i4)));
            je7 je7VarCreateViewModelLazy = createViewModelLazy(bh0.class, new ti2(21, new ox2(this, i6)));
            this.t0 = dh0.a.getAccessor().d(eua.class);
            ys2 ys2Var = ys2.a;
            ExecutorService executorServiceA = ys2Var.c().a();
            this.v0 = executorServiceA;
            this.w0 = viewBinding(p8a.k);
            this.x0 = binding(new ox2(this, i));
            this.y0 = new khe(new hn2(10));
            ly4 ly4Var = new ly4(new rx2(this), executorServiceA);
            this.A0 = ly4Var;
            a3g a3gVar = new a3g(this, executorServiceA, i8);
            this.B0 = a3gVar;
            a3g a3gVar2 = new a3g(this, executorServiceA, i6);
            this.C0 = a3gVar2;
            a3g a3gVar3 = new a3g(this, executorServiceA, i6);
            this.D0 = a3gVar3;
            a3g a3gVar4 = new a3g(this, executorServiceA, i3);
            this.E0 = a3gVar4;
            y51 y51Var = new y51(executorServiceA, i5);
            this.F0 = y51Var;
            rv5 rv5Var = new rv5(executorServiceA, new v02(14, this), new ox2(this, i3));
            this.G0 = rv5Var;
            this.H0 = new nd3(new md3(false, 2), a3gVar, rv5Var, ly4Var, y51Var, a3gVar2, a3gVar4, a3gVar3);
            this.I0 = mqd.D();
            this.J0 = tu0.r(3, new ox2(this, 8));
            this.K0 = binding(new ox2(this, 9));
            ax7 ax7VarB = ys2Var.b();
            this.L0 = ax7VarB;
            ax7VarB.getClass();
            cta ctaVar = cta.CHATS_INIT_TO_RENDER;
            ax7VarB.e.k(ctaVar, new bta(ctaVar, SystemClock.elapsedRealtime()));
            p0().X.e();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.X, name, ey8.j("ONEME-6453|chats_list_lf | list subscribe on new data. Scope isActive: ", j1e.z(getLifecycleScope())), null);
            }
            od2.L(new ac(new mn5[]{p0().H0, ((bh0) je7VarCreateViewModelLazy.getValue()).s0, p0().K0, p0().L0, new qn5(3, wmd.n())}, 22, new kk1(this, null, 1)), getLifecycleScope());
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
