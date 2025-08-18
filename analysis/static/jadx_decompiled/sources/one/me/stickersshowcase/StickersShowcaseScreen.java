package one.me.stickersshowcase;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.av3;
import defpackage.bc7;
import defpackage.cla;
import defpackage.fk4;
import defpackage.fs;
import defpackage.gw7;
import defpackage.h76;
import defpackage.hob;
import defpackage.hw7;
import defpackage.i7e;
import defpackage.iba;
import defpackage.ija;
import defpackage.j81;
import defpackage.je7;
import defpackage.jja;
import defpackage.k56;
import defpackage.kka;
import defpackage.lc8;
import defpackage.nec;
import defpackage.nhd;
import defpackage.od2;
import defpackage.oec;
import defpackage.p71;
import defpackage.pka;
import defpackage.pla;
import defpackage.q7c;
import defpackage.qm0;
import defpackage.rpc;
import defpackage.rz5;
import defpackage.sc1;
import defpackage.shb;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.vha;
import defpackage.vka;
import defpackage.w8c;
import defpackage.wd6;
import defpackage.x27;
import defpackage.x6e;
import defpackage.xka;
import defpackage.yfa;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zu3;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;
import one.me.stickersshowcase.StickersShowcaseScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/stickersshowcase/StickersShowcaseScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "stickers-showcase_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class StickersShowcaseScreen extends Widget {
    public static final /* synthetic */ bc7[] v0;
    public final q7c X;
    public final q7c Y;
    public final qm0 Z;
    public final fs a;
    public final je7 b;
    public final je7 c;
    public final gw7 o;
    public final qm0 s0;
    public vha t0;
    public final p71 u0;

    static {
        hob hobVar = new hob(StickersShowcaseScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        v0 = new bc7[]{hobVar, zr6.e(oecVar, StickersShowcaseScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(StickersShowcaseScreen.class, "setsRecycler", "getSetsRecycler()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0, oecVar)};
    }

    public StickersShowcaseScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(Long.class, 0L, "chat_id");
        final int i = 0;
        this.b = createViewModelLazy(i7e.class, new nhd(11, new k56(this) { // from class: z6e
            public final /* synthetic */ StickersShowcaseScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickersShowcaseScreen stickersShowcaseScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = StickersShowcaseScreen.v0;
                        stickersShowcaseScreen.getClass();
                        bc7 bc7Var = StickersShowcaseScreen.v0[0];
                        long jLongValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
                        x6e x6eVar = x6e.a;
                        return new i7e(jLongValue, (b6e) x6eVar.getAccessor().d(b6e.class).getValue(), (kke) x6eVar.getAccessor().c(kke.class), new g6e(x6eVar.getAccessor().d(a4e.class), x6eVar.getAccessor().d(y4e.class), (kke) x6eVar.getAccessor().c(kke.class)), x6eVar.getAccessor().d(sc5.class), x6eVar.getAccessor().d(s8g.class), x6eVar.getAccessor().d(qe5.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickersShowcaseScreen.v0;
                        nfa nfaVar = new nfa(stickersShowcaseScreen.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        nfaVar.setLayoutParams(layoutParams);
                        nfaVar.setAppearance(ffa.a);
                        nfaVar.setSize(ifa.a);
                        return nfaVar;
                    default:
                        bc7[] bc7VarArr3 = StickersShowcaseScreen.v0;
                        aba abaVar = new aba(stickersShowcaseScreen.getContext(), null);
                        abaVar.setIcon(woc.O0);
                        abaVar.setTitle(new eqe(yoc.d));
                        abaVar.setSubtitle(new eqe(yoc.c));
                        return abaVar;
                }
            }
        }));
        x6e x6eVar = x6e.a;
        this.c = x6eVar.getAccessor().d(hw7.class);
        gw7 gw7Var = new gw7();
        this.o = gw7Var;
        this.X = viewBinding(ija.b);
        this.Y = viewBinding(ija.a);
        final int i2 = 1;
        this.Z = binding(new k56(this) { // from class: z6e
            public final /* synthetic */ StickersShowcaseScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickersShowcaseScreen stickersShowcaseScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = StickersShowcaseScreen.v0;
                        stickersShowcaseScreen.getClass();
                        bc7 bc7Var = StickersShowcaseScreen.v0[0];
                        long jLongValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
                        x6e x6eVar2 = x6e.a;
                        return new i7e(jLongValue, (b6e) x6eVar2.getAccessor().d(b6e.class).getValue(), (kke) x6eVar2.getAccessor().c(kke.class), new g6e(x6eVar2.getAccessor().d(a4e.class), x6eVar2.getAccessor().d(y4e.class), (kke) x6eVar2.getAccessor().c(kke.class)), x6eVar2.getAccessor().d(sc5.class), x6eVar2.getAccessor().d(s8g.class), x6eVar2.getAccessor().d(qe5.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickersShowcaseScreen.v0;
                        nfa nfaVar = new nfa(stickersShowcaseScreen.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        nfaVar.setLayoutParams(layoutParams);
                        nfaVar.setAppearance(ffa.a);
                        nfaVar.setSize(ifa.a);
                        return nfaVar;
                    default:
                        bc7[] bc7VarArr3 = StickersShowcaseScreen.v0;
                        aba abaVar = new aba(stickersShowcaseScreen.getContext(), null);
                        abaVar.setIcon(woc.O0);
                        abaVar.setTitle(new eqe(yoc.d));
                        abaVar.setSubtitle(new eqe(yoc.c));
                        return abaVar;
                }
            }
        });
        final int i3 = 2;
        this.s0 = binding(new k56(this) { // from class: z6e
            public final /* synthetic */ StickersShowcaseScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                StickersShowcaseScreen stickersShowcaseScreen = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = StickersShowcaseScreen.v0;
                        stickersShowcaseScreen.getClass();
                        bc7 bc7Var = StickersShowcaseScreen.v0[0];
                        long jLongValue = ((Number) stickersShowcaseScreen.a.a(stickersShowcaseScreen)).longValue();
                        x6e x6eVar2 = x6e.a;
                        return new i7e(jLongValue, (b6e) x6eVar2.getAccessor().d(b6e.class).getValue(), (kke) x6eVar2.getAccessor().c(kke.class), new g6e(x6eVar2.getAccessor().d(a4e.class), x6eVar2.getAccessor().d(y4e.class), (kke) x6eVar2.getAccessor().c(kke.class)), x6eVar2.getAccessor().d(sc5.class), x6eVar2.getAccessor().d(s8g.class), x6eVar2.getAccessor().d(qe5.class));
                    case 1:
                        bc7[] bc7VarArr2 = StickersShowcaseScreen.v0;
                        nfa nfaVar = new nfa(stickersShowcaseScreen.getContext());
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                        layoutParams.gravity = 17;
                        nfaVar.setLayoutParams(layoutParams);
                        nfaVar.setAppearance(ffa.a);
                        nfaVar.setSize(ifa.a);
                        return nfaVar;
                    default:
                        bc7[] bc7VarArr3 = StickersShowcaseScreen.v0;
                        aba abaVar = new aba(stickersShowcaseScreen.getContext(), null);
                        abaVar.setIcon(woc.O0);
                        abaVar.setTitle(new eqe(yoc.d));
                        abaVar.setSubtitle(new eqe(yoc.c));
                        return abaVar;
                }
            }
        });
        this.u0 = new p71(((iba) x6eVar.getAccessor().c(iba.class)).a(), gw7Var, new wd6(29, this));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getA() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    public final EndlessRecyclerView2 m0() {
        return (EndlessRecyclerView2) this.Y.T0(this, v0[2]);
    }

    public final i7e n0() {
        return (i7e) this.b.getValue();
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
        v3c.y(new lc8(3, null, 4), frameLayout);
        cla claVar = new cla(frameLayout.getContext(), 6);
        claVar.setId(ija.b);
        claVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        claVar.setTitle(jja.a);
        claVar.setForm(uka.a);
        claVar.setRightActions(new pka(new xka(new rz5(this, 1)), new vka(yfa.x, new w8c(9))));
        claVar.setLeftActions(new kka(new rpc(10, this)));
        frameLayout.addView(claVar);
        EndlessRecyclerView2 endlessRecyclerView2 = new EndlessRecyclerView2(frameLayout.getContext(), null, 6);
        endlessRecyclerView2.setId(ija.a);
        endlessRecyclerView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        endlessRecyclerView2.setClipToPadding(false);
        endlessRecyclerView2.setClipChildren(false);
        int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
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
        cla claVar = (cla) this.X.T0(this, v0[1]);
        pla.a(claVar, new h76(claVar, endlessRecyclerView2M0, this, 25));
        endlessRecyclerView2M0.getContext();
        endlessRecyclerView2M0.setLayoutManager(new LinearLayoutManager());
        endlessRecyclerView2M0.setItemAnimator(null);
        endlessRecyclerView2M0.j(new sc1(tu0.G(6 * fk4.d().getDisplayMetrics().density), tu0.G(8 * fk4.d().getDisplayMetrics().density), 7));
        endlessRecyclerView2M0.setPager(new j81(this, 9));
        endlessRecyclerView2M0.setIgnoreRefreshingFlagsForScrollEvent(true);
        endlessRecyclerView2M0.setAdapter(this.u0);
        od2.L(new zn5(n0().w0, new shb(2, this, StickersShowcaseScreen.class, "handleNewState", "handleNewState(Lone/me/stickersshowcase/model/ShowcaseState;)V", 4, 17), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().t0, new shb(2, this, StickersShowcaseScreen.class, "handleEvents", "handleEvents(Lone/me/stickersshowcase/ShowcaseEvent;)V", 4, 18), 5), getViewLifecycleScope());
        od2.L(new zn5(n0().u0, new shb(2, this, StickersShowcaseScreen.class, "handleNavEvents", "handleNavEvents(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 19), 5), getViewLifecycleScope());
    }
}
