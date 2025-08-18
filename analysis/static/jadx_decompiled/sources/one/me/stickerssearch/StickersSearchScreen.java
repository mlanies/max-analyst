package one.me.stickerssearch;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import defpackage.a3g;
import defpackage.av3;
import defpackage.bc7;
import defpackage.dja;
import defpackage.e5e;
import defpackage.eha;
import defpackage.eja;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.gh7;
import defpackage.gw7;
import defpackage.h5e;
import defpackage.hob;
import defpackage.hw7;
import defpackage.i76;
import defpackage.iba;
import defpackage.j81;
import defpackage.je7;
import defpackage.k56;
import defpackage.lc8;
import defpackage.nec;
import defpackage.nhd;
import defpackage.od2;
import defpackage.oec;
import defpackage.pla;
import defpackage.q5e;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.ry0;
import defpackage.shb;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.wmc;
import defpackage.x27;
import defpackage.yc7;
import defpackage.z7;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zu3;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.stickerssearch.StickersSearchScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickerssearch/StickersSearchScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-search_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class StickersSearchScreen extends Widget {
    public static final /* synthetic */ bc7[] u0;
    public final q7c X;
    public final q7c Y;
    public final qm0 Z;
    public final fs a;
    public final je7 b;
    public final je7 c;
    public final gw7 o;
    public final qm0 s0;
    public final a3g t0;

    static {
        hob hobVar = new hob(StickersSearchScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        u0 = new bc7[]{hobVar, zr6.e(oecVar, StickersSearchScreen.class, "stickersRecycler", "getStickersRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zr6.f(StickersSearchScreen.class, "searchView", "getSearchView()Lone/me/sdk/uikit/common/search/OneMeSearchView;", 0, oecVar)};
    }

    public StickersSearchScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(Long.class, "chat_id");
        final int i = 0;
        this.b = createViewModelLazy(q5e.class, new nhd(9, new k56(this) { // from class: g5e
            public final /* synthetic */ StickersSearchScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickersSearchScreen stickersSearchScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = StickersSearchScreen.u0;
                        stickersSearchScreen.getClass();
                        bc7 bc7Var = StickersSearchScreen.u0[0];
                        long jLongValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
                        e5e e5eVar = e5e.a;
                        return new q5e(jLongValue, e5eVar.getAccessor().d(y4e.class), new bod(e5eVar.getAccessor().d(o2e.class), e5eVar.getAccessor().d(b6e.class)), e5eVar.getAccessor().d(s8g.class), e5eVar.getAccessor().d(qe5.class), (kke) e5eVar.getAccessor().c(kke.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickersSearchScreen.u0;
                        nfa nfaVar = new nfa(stickersSearchScreen.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        nfaVar.setLayoutParams(layoutParams);
                        nfaVar.setAppearance(ffa.a);
                        nfaVar.setSize(hfa.a);
                        return nfaVar;
                    default:
                        bc7[] bc7VarArr3 = StickersSearchScreen.u0;
                        aba abaVar = new aba(stickersSearchScreen.getContext(), null);
                        abaVar.setIcon(woc.O0);
                        abaVar.setTitle(new eqe(yoc.d));
                        abaVar.setSubtitle(new eqe(yoc.c));
                        return abaVar;
                }
            }
        }));
        e5e e5eVar = e5e.a;
        this.c = e5eVar.getAccessor().d(hw7.class);
        this.o = new gw7();
        this.X = viewBinding(dja.a);
        this.Y = viewBinding(dja.b);
        final int i2 = 1;
        this.Z = binding(new k56(this) { // from class: g5e
            public final /* synthetic */ StickersSearchScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickersSearchScreen stickersSearchScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = StickersSearchScreen.u0;
                        stickersSearchScreen.getClass();
                        bc7 bc7Var = StickersSearchScreen.u0[0];
                        long jLongValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
                        e5e e5eVar2 = e5e.a;
                        return new q5e(jLongValue, e5eVar2.getAccessor().d(y4e.class), new bod(e5eVar2.getAccessor().d(o2e.class), e5eVar2.getAccessor().d(b6e.class)), e5eVar2.getAccessor().d(s8g.class), e5eVar2.getAccessor().d(qe5.class), (kke) e5eVar2.getAccessor().c(kke.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickersSearchScreen.u0;
                        nfa nfaVar = new nfa(stickersSearchScreen.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        nfaVar.setLayoutParams(layoutParams);
                        nfaVar.setAppearance(ffa.a);
                        nfaVar.setSize(hfa.a);
                        return nfaVar;
                    default:
                        bc7[] bc7VarArr3 = StickersSearchScreen.u0;
                        aba abaVar = new aba(stickersSearchScreen.getContext(), null);
                        abaVar.setIcon(woc.O0);
                        abaVar.setTitle(new eqe(yoc.d));
                        abaVar.setSubtitle(new eqe(yoc.c));
                        return abaVar;
                }
            }
        });
        final int i3 = 2;
        this.s0 = binding(new k56(this) { // from class: g5e
            public final /* synthetic */ StickersSearchScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickersSearchScreen stickersSearchScreen = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = StickersSearchScreen.u0;
                        stickersSearchScreen.getClass();
                        bc7 bc7Var = StickersSearchScreen.u0[0];
                        long jLongValue = ((Number) stickersSearchScreen.a.a(stickersSearchScreen)).longValue();
                        e5e e5eVar2 = e5e.a;
                        return new q5e(jLongValue, e5eVar2.getAccessor().d(y4e.class), new bod(e5eVar2.getAccessor().d(o2e.class), e5eVar2.getAccessor().d(b6e.class)), e5eVar2.getAccessor().d(s8g.class), e5eVar2.getAccessor().d(qe5.class), (kke) e5eVar2.getAccessor().c(kke.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickersSearchScreen.u0;
                        nfa nfaVar = new nfa(stickersSearchScreen.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        nfaVar.setLayoutParams(layoutParams);
                        nfaVar.setAppearance(ffa.a);
                        nfaVar.setSize(hfa.a);
                        return nfaVar;
                    default:
                        bc7[] bc7VarArr3 = StickersSearchScreen.u0;
                        aba abaVar = new aba(stickersSearchScreen.getContext(), null);
                        abaVar.setIcon(woc.O0);
                        abaVar.setTitle(new eqe(yoc.d));
                        abaVar.setSubtitle(new eqe(yoc.c));
                        return abaVar;
                }
            }
        });
        this.t0 = new a3g(((iba) e5eVar.getAccessor().c(iba.class)).a(), new wmc(this, false));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getO() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    public final EndlessRecyclerView2 m0() {
        return (EndlessRecyclerView2) this.X.T0(this, u0[1]);
    }

    public final q5e n0() {
        return (q5e) this.b.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
        ((hw7) this.c.getValue()).a(this.o);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        ((hw7) this.c.getValue()).b(this.o);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        av3 av3Var2 = av3.POP_ENTER;
        je7 je7Var = this.c;
        gw7 gw7Var = this.o;
        if (av3Var == av3Var2 || av3Var == av3.PUSH_ENTER) {
            ((hw7) je7Var.getValue()).b(gw7Var);
        } else if (av3Var == av3.PUSH_EXIT) {
            ((hw7) je7Var.getValue()).a(gw7Var);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        v3c.y(new lc8(3, null, 3), frameLayout);
        eha ehaVar = new eha(frameLayout.getContext());
        ehaVar.setId(dja.b);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        float f = 12;
        layoutParams.rightMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        ehaVar.setLayoutParams(layoutParams);
        ehaVar.setSearchHint(ehaVar.getContext().getString(eja.a));
        ehaVar.c(true);
        ehaVar.setListener(new h5e(this));
        frameLayout.addView(ehaVar);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(dja.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int iG = tu0.G(f * fk4.d().getDisplayMetrics().density);
        endlessRecyclerView2.setPadding(iG, endlessRecyclerView2.getPaddingTop(), iG, endlessRecyclerView2.getPaddingBottom());
        frameLayout.addView(endlessRecyclerView2);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        this.o.b();
        EndlessRecyclerView2 endlessRecyclerView2M0 = m0();
        endlessRecyclerView2M0.setAdapter(null);
        endlessRecyclerView2M0.setPager(null);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        EndlessRecyclerView2 endlessRecyclerView2M0 = m0();
        eha ehaVar = (eha) this.Y.T0(this, u0[2]);
        pla.a(ehaVar, new i76(ehaVar, endlessRecyclerView2M0, this, 22));
        int iA = z7.A(endlessRecyclerView2M0.getContext());
        endlessRecyclerView2M0.getContext();
        endlessRecyclerView2M0.setLayoutManager(new GridLayoutManager(iA));
        endlessRecyclerView2M0.setItemAnimator(null);
        endlessRecyclerView2M0.j(new ry0(iA, tu0.G(4 * fk4.d().getDisplayMetrics().density), 8));
        endlessRecyclerView2M0.k(new yc7(4, this));
        endlessRecyclerView2M0.setPager(new j81(this, 8));
        endlessRecyclerView2M0.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2M0.setAdapter(this.t0);
        w7c w7cVar = n0().s0;
        gh7 gh7VarQ = this.lifecycleOwner.Q();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, gh7VarQ, fg7Var), new shb(2, this, StickersSearchScreen.class, "handleNewState", "handleNewState(Lone/me/stickerssearch/model/SearchState;)V", 4, 12), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(n0().t0, this.lifecycleOwner.Q(), fg7Var), new shb(2, this, StickersSearchScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 13), 5), getLifecycleScope());
    }
}
