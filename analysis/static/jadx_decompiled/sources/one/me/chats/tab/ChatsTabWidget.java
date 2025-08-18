package one.me.chats.tab;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.an9;
import defpackage.ax7;
import defpackage.bc7;
import defpackage.bta;
import defpackage.ck;
import defpackage.cla;
import defpackage.coc;
import defpackage.cta;
import defpackage.dh0;
import defpackage.dy7;
import defpackage.e57;
import defpackage.eha;
import defpackage.eua;
import defpackage.ey8;
import defpackage.fg7;
import defpackage.fm9;
import defpackage.ft4;
import defpackage.gca;
import defpackage.hdc;
import defpackage.hm9;
import defpackage.hn2;
import defpackage.hob;
import defpackage.hyc;
import defpackage.i24;
import defpackage.ir6;
import defpackage.j1e;
import defpackage.j47;
import defpackage.je7;
import defpackage.jx5;
import defpackage.jy2;
import defpackage.k67;
import defpackage.kpa;
import defpackage.kt4;
import defpackage.kw5;
import defpackage.l67;
import defpackage.lh0;
import defpackage.ms2;
import defpackage.nec;
import defpackage.nz4;
import defpackage.od2;
import defpackage.oec;
import defpackage.oq9;
import defpackage.p8a;
import defpackage.pka;
import defpackage.pz2;
import defpackage.q33;
import defpackage.q7c;
import defpackage.qyc;
import defpackage.qz2;
import defpackage.r8a;
import defpackage.rz2;
import defpackage.s04;
import defpackage.s36;
import defpackage.spa;
import defpackage.sz2;
import defpackage.t33;
import defpackage.ti2;
import defpackage.ti3;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.uka;
import defpackage.um9;
import defpackage.us7;
import defpackage.uu3;
import defpackage.vs2;
import defpackage.vw;
import defpackage.wja;
import defpackage.wka;
import defpackage.woc;
import defpackage.wv7;
import defpackage.x27;
import defpackage.x30;
import defpackage.x53;
import defpackage.x77;
import defpackage.xka;
import defpackage.y7d;
import defpackage.ys2;
import defpackage.z7;
import defpackage.zn5;
import defpackage.znc;
import defpackage.zr6;
import defpackage.zsa;
import defpackage.zu5;
import defpackage.zud;
import defpackage.zw7;
import kotlin.Metadata;
import one.me.chats.list.ChatsListWidget;
import one.me.pinbars.PinBarsWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import ru.ok.tamtam.android.prefs.PmsKey;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/chats/tab/ChatsTabWidget;", "Lone/me/sdk/arch/Widget;", "Lum9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "folderId", "(Ljava/lang/String;)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ChatsTabWidget extends Widget implements um9 {
    public static final /* synthetic */ bc7[] C0;
    public final kw5 A0;
    public x77 B0;
    public final je7 X;
    public final je7 Y;
    public final q7c Z;
    public final x27 a;
    public final String b;
    public zu5 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final je7 v0;
    public final je7 w0;
    public s04 x0;
    public final x30 y0;
    public final int z0;

    static {
        hob hobVar = new hob(ChatsTabWidget.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oecVar = nec.a;
        C0 = new bc7[]{hobVar, zr6.e(oecVar, ChatsTabWidget.class, "foldersTabs", "getFoldersTabs()Lone/me/common/tablayout/OneMeTabLayout;", 0), zr6.f(ChatsTabWidget.class, "foldersViewPager", "getFoldersViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oecVar), zr6.f(ChatsTabWidget.class, "pinbarsContainer", "getPinbarsContainer()Landroid/view/ViewGroup;", 0, oecVar)};
    }

    public ChatsTabWidget(String str) {
        this(dy7.g(new kpa("folder_id", str)));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.a;
    }

    public final wja m0() {
        return (wja) this.s0.T0(this, C0[1]);
    }

    public final ViewPager2 n0() {
        return (ViewPager2) this.t0.T0(this, C0[2]);
    }

    public final cla o0() {
        return (cla) this.Z.T0(this, C0[0]);
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        int i;
        super.onAttach(view);
        k67 k67Var = (k67) this.Y.getValue();
        if (((t33) ((hyc) k67Var.a())).g.getBoolean("app.already.invited.friends", false)) {
            return;
        }
        qyc qycVar = (qyc) ((y7d) k67Var.a.getValue());
        qycVar.getClass();
        int[] iArrC0 = x53.C0(qycVar.o(PmsKey.f50invitefriendssheetfrequency, nz4.a));
        int i2 = ((hyc) k67Var.a()).g.getInt("app.invite.friends.times.shown", 0);
        long j = ((hyc) k67Var.a()).g.getLong("app.first.invite.friends.time", -1L);
        long j2 = ((hyc) k67Var.a()).g.getLong("app.first.login.time", 0L);
        if (j < 0) {
            j = j2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (iArrC0.length > i2 && (i = iArrC0[i2]) >= 0) {
            int i3 = ft4.o;
            if (ft4.e(z7.R(i, kt4.DAYS)) + j >= jCurrentTimeMillis) {
                return;
            }
            ((hyc) k67Var.a()).k(i2 + 1, "app.invite.friends.times.shown");
            ((hyc) k67Var.a()).l("app.first.invite.friends.time", Long.valueOf(jCurrentTimeMillis));
            ((l67) k67Var.c.getValue()).a("show", "main", "trigger_max");
            e57.c.P1().b(":invite/friends_to_max_bottom_sheet", null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    @Override // defpackage.uu3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onChangeEnded(defpackage.zu3 r12, defpackage.av3 r13) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.chats.tab.ChatsTabWidget.onChangeEnded(zu3, av3):void");
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        constraintLayout.setId(p8a.c);
        cla claVar = new cla(constraintLayout.getContext(), 6);
        int i = p8a.j;
        claVar.setId(i);
        claVar.setTransitionName(claVar.getContext().getString(r8a.q));
        claVar.setForm(uka.b);
        ti3 ti3Var = new ti3(-1, -2);
        ti3Var.i = 0;
        int i2 = p8a.e;
        ti3Var.k = i2;
        ti3Var.e = 0;
        ti3Var.h = 0;
        claVar.setLayoutParams(ti3Var);
        claVar.setTitle(r8a.p);
        claVar.setRightActions(new pka(new xka(new oq9(8)), new wka(woc.M0, 0, new pz2(0), 14)));
        eha searchView = claVar.getSearchView();
        if (searchView != null) {
            searchView.setExpandable(false);
        }
        constraintLayout.addView(claVar);
        wja wjaVar = new wja(constraintLayout.getContext(), null);
        wjaVar.setId(i2);
        wjaVar.setTabMode(0);
        ti3 ti3Var2 = new ti3(0, -2);
        ti3Var2.j = i;
        int i3 = p8a.f;
        ti3Var2.k = i3;
        ti3Var2.e = 0;
        ti3Var2.h = 0;
        wjaVar.setLayoutParams(ti3Var2);
        constraintLayout.addView(wjaVar);
        View viewB = s36.b(constraintLayout.getContext());
        viewB.setId(i3);
        ti3 ti3Var3 = new ti3(0, -2);
        ti3Var3.j = i2;
        int i4 = p8a.d;
        ti3Var3.k = i4;
        ti3Var3.e = 0;
        ti3Var3.h = 0;
        constraintLayout.addView(viewB, ti3Var3);
        ViewPager2 viewPager2 = new ViewPager2(constraintLayout.getContext());
        viewPager2.setId(i4);
        ti3 ti3Var4 = new ti3(0, 0);
        ti3Var4.I = 1.0f;
        ti3Var4.j = i3;
        ti3Var4.l = 0;
        ti3Var4.e = 0;
        ti3Var4.h = 0;
        viewPager2.setLayoutParams(ti3Var4);
        fm9.z(viewPager2);
        constraintLayout.addView(viewPager2);
        return constraintLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        String str = this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | tabs view destroy. Scope isActive: ", j1e.z(getLifecycleScope())), null);
        }
        s04 s04Var = this.x0;
        if (s04Var != null) {
            s04Var.c();
        }
        this.x0 = null;
        this.c = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onUpdateArgs(Bundle bundle, Bundle bundle2) {
        super.onUpdateArgs(bundle, bundle2);
        p0().q(bundle2.getString("folder_id"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        String str = this.b;
        ir6 ir6Var = hm9.m;
        Bundle bundle = null;
        Object[] objArr = 0;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, ey8.j("ONEME-6453|chats_list_lf | tabs view created. Scope isActive: ", j1e.z(getLifecycleScope())), null);
        }
        n0().setAdapter(this.A0);
        kw5 kw5Var = this.A0;
        kw5Var.Z = 0;
        while (((wv7) kw5Var.u0).h() > kw5Var.Z) {
            ((wv7) kw5Var.u0).g(((Number) kw5Var.Y.remove(0)).longValue());
        }
        n0().setOffscreenPageLimit(this.z0);
        s04 s04VarB = this.y0.b(m0(), n0(), new jy2(3, this), new vw(2, this, ChatsTabWidget.class, "handleLongClickOnFolderTab", "handleLongClickOnFolderTab(Landroid/view/View;Lone/me/common/tablayout/model/OneMeBaseTabItemModel;)V", 0, 12));
        s04VarB.a();
        this.x0 = s04VarB;
        od2.L(new zn5(tu0.g(p0().t0, getViewLifecycleOwner().Q(), fg7.o), new sz2(null, this), 5), getViewLifecycleScope());
        ViewPager2 viewPager2N0 = n0();
        View childAt = viewPager2N0.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        int i = 1;
        if (recyclerView != null) {
            recyclerView.setItemAnimator(null);
            recyclerView.setHasFixedSize(true);
        }
        viewPager2N0.b(new lh0(4, this));
        if (this.A0.z0.size() > 0) {
            viewPager2N0.measure(View.MeasureSpec.makeMeasureSpec(viewPager2N0.getContext().getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(viewPager2N0.getContext().getResources().getDisplayMetrics().heightPixels, 1073741824));
            if (this.A0.z0.size() > 1) {
                q0(1);
            }
        }
        znc childRouter = getChildRouter((ViewGroup) this.u0.T0(this, C0[3]));
        childRouter.e = 1;
        childRouter.Q(false);
        if (!childRouter.n()) {
            PinBarsWidget pinBarsWidget = new PinBarsWidget(bundle, i, objArr == true ? 1 : 0);
            pinBarsWidget.setRetainViewMode(getRetainViewMode());
            childRouter.R(i24.e(pinBarsWidget, null, null));
        }
        view.addOnAttachStateChangeListener(new ck(2, this));
        p0().q(getArgs().getString("folder_id"));
        od2.L(new zn5(tu0.g(p0().v0, getViewLifecycleOwner().Q(), fg7.X), new rz2(null, this), 5), getViewLifecycleScope());
    }

    public final jx5 p0() {
        return (jx5) this.v0.getValue();
    }

    public final void q0(int i) {
        coc cocVar;
        znc zncVar = (znc) this.A0.s0.get(i);
        uu3 uu3Var = (zncVar == null || (cocVar = (coc) x53.i0(zncVar.e())) == null) ? null : cocVar.a;
        ChatsListWidget chatsListWidget = uu3Var instanceof ChatsListWidget ? (ChatsListWidget) uu3Var : null;
        if (chatsListWidget == null) {
            return;
        }
        String str = this.b;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            us7 us7Var = us7.X;
            View view = chatsListWidget.getView();
            Integer numValueOf = view != null ? Integer.valueOf(view.getMeasuredWidth()) : null;
            View view2 = chatsListWidget.getView();
            ir6Var.d(us7Var, str, "ONEME-6873|chats_list_page_state | root width:" + numValueOf + ", root height:" + (view2 != null ? Integer.valueOf(view2.getMeasuredHeight()) : null), null);
        }
        if (chatsListWidget.getView() == null || tpa.f(chatsListWidget.b, "all.chat.folder")) {
            return;
        }
        int measuredWidth = chatsListWidget.o0().getMeasuredWidth();
        int measuredHeight = chatsListWidget.o0().getMeasuredHeight();
        hdc adapter = chatsListWidget.o0().getAdapter();
        Integer numValueOf2 = adapter != null ? Integer.valueOf(adapter.j()) : null;
        int childCount = chatsListWidget.o0().getChildCount();
        EndlessRecyclerView2 endlessRecyclerView2O0 = chatsListWidget.o0();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= endlessRecyclerView2O0.getChildCount()) {
                break;
            }
            int i3 = i2 + 1;
            View childAt = endlessRecyclerView2O0.getChildAt(i2);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            if (childAt.isAttachedToWindow()) {
                z = true;
                break;
            }
            i2 = i3;
        }
        String str2 = chatsListWidget.a;
        ir6 ir6Var2 = hm9.m;
        if (ir6Var2 != null && ir6Var2.c()) {
            us7 us7Var2 = us7.X;
            String str3 = chatsListWidget.b;
            StringBuilder sb = new StringBuilder("ONEME-6873|chats_list_page_state | chats list state. folderId:");
            sb.append(str3);
            sb.append(" | width:");
            sb.append(measuredWidth);
            sb.append("|height:");
            ms2.k(sb, measuredHeight, " | child:", childCount, "|childAttached:");
            sb.append(z);
            sb.append("|adapterCount:");
            sb.append(numValueOf2);
            ir6Var2.d(us7Var2, str2, sb.toString(), null);
        }
    }

    public final spa r0() {
        return new spa(null, 0, zud.Y, Long.valueOf(n0().getCurrentItem() == 0 ? 1L : 2L), null, 19);
    }

    public ChatsTabWidget(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = x27.d;
        String name = ChatsTabWidget.class.getName();
        this.b = name;
        this.o = dh0.a.getAccessor().d(eua.class);
        ys2 ys2Var = ys2.a;
        this.X = ys2Var.getAccessor().d(q33.class);
        this.Y = ys2Var.getAccessor().d(k67.class);
        this.Z = viewBinding(p8a.j);
        this.s0 = viewBinding(p8a.e);
        this.t0 = viewBinding(p8a.d);
        this.u0 = viewBinding(p8a.f);
        this.v0 = createViewModelLazy(jx5.class, new ti2(22, new hn2(13)));
        this.w0 = ys2Var.getAccessor().d(an9.class);
        this.y0 = new x30(ys2Var.c().a(), 5);
        this.z0 = 3;
        b bVar = new b();
        bVar.setMaxRecycledViews(vs2.a, 30);
        bVar.setMaxRecycledViews(vs2.b, 15);
        double d = 10 * 1.5d;
        bVar.setMaxRecycledViews(p8a.u, tu0.F(d));
        bVar.setMaxRecycledViews(p8a.v, tu0.F(d));
        bVar.setMaxRecycledViews(gca.c, 3);
        this.A0 = new kw5(this, bVar, kw5.A0);
        ax7 ax7VarB = ys2Var.b();
        ax7VarB.getClass();
        cta ctaVar = cta.FOLDERS_INIT_TO_RENDER;
        ax7VarB.e.k(ctaVar, new bta(ctaVar, SystemClock.elapsedRealtime()));
        ax7VarB.f.put(zsa.EVENT_OPEN_CHATS, j47.T(ax7VarB.d, null, null, new zw7(ax7VarB, null), 3));
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, ey8.j("ONEME-6453|chats_list_lf | tabs subscribe on new data. Scope isActive: ", j1e.z(getLifecycleScope())), null);
        }
        od2.L(new zn5(p0().t0, new qz2(null, this), 5), getLifecycleScope());
    }
}
