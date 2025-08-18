package one.me.stickerssettings.stickersscreen;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3g;
import defpackage.a5e;
import defpackage.a8e;
import defpackage.av3;
import defpackage.b5e;
import defpackage.bc7;
import defpackage.bkg;
import defpackage.c5e;
import defpackage.cla;
import defpackage.d5e;
import defpackage.dg9;
import defpackage.dp3;
import defpackage.dy7;
import defpackage.eqe;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.gja;
import defpackage.gw7;
import defpackage.hja;
import defpackage.hob;
import defpackage.hw7;
import defpackage.i76;
import defpackage.iba;
import defpackage.ieb;
import defpackage.j47;
import defpackage.je7;
import defpackage.jg9;
import defpackage.k56;
import defpackage.k6e;
import defpackage.kka;
import defpackage.kke;
import defpackage.kpa;
import defpackage.lq0;
import defpackage.m7e;
import defpackage.mg3;
import defpackage.n7e;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nhd;
import defpackage.o7e;
import defpackage.od2;
import defpackage.oec;
import defpackage.p7e;
import defpackage.pla;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.q7e;
import defpackage.qm0;
import defpackage.rpc;
import defpackage.ry0;
import defpackage.s35;
import defpackage.sed;
import defpackage.t03;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.u1;
import defpackage.ued;
import defpackage.uka;
import defpackage.v3c;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w4d;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.woc;
import defpackage.x27;
import defpackage.xf9;
import defpackage.xt3;
import defpackage.y53;
import defpackage.yc7;
import defpackage.z7;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zu3;
import java.util.Iterator;
import kotlin.Metadata;
import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.stickerssettings.stickersscreen.StickersScreen;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\bB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001b\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lone/me/stickerssettings/stickersscreen/StickersScreen;", "Lone/me/sdk/arch/Widget;", "Lxt3;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "La5e;", "mode", "", "setId", "(La5e;J)V", "stickers-settings_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class StickersScreen extends Widget implements xt3, ng3 {
    public static final /* synthetic */ bc7[] v0;
    public final q7c X;
    public final qm0 Y;
    public final qm0 Z;
    public final a5e a;
    public final fs b;
    public final je7 c;
    public final q7c o;
    public final je7 s0;
    public final gw7 t0;
    public final a3g u0;

    static {
        hob hobVar = new hob(StickersScreen.class, "stickersSetId", "getStickersSetId()J", 0);
        oec oecVar = nec.a;
        v0 = new bc7[]{hobVar, zr6.e(oecVar, StickersScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(StickersScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, oecVar)};
    }

    public StickersScreen(a5e a5eVar, long j) {
        this(dy7.g(new kpa("mode", a5eVar.a), new kpa("set_id", Long.valueOf(j))));
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getB() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        a8e a8eVarO0 = o0();
        a8eVarO0.getClass();
        int i2 = gja.e;
        vx3 vx3Var = vx3.b;
        w4d w4dVar = a8eVarO0.u0;
        ContextScope contextScope = a8eVarO0.a;
        kke kkeVar = a8eVarO0.X;
        if (i == i2) {
            w4dVar.o1(a8eVarO0, a8e.C0[0], j47.S(contextScope, ((w9a) kkeVar).b(), vx3Var, new o7e(a8eVarO0, null)));
            return;
        }
        if (i == gja.d) {
            w4dVar.o1(a8eVarO0, a8e.C0[0], j47.S(contextScope, ((w9a) kkeVar).b(), vx3Var, new n7e(a8eVarO0, null)));
            return;
        }
        int i3 = gja.c;
        bc7[] bc7VarArr = a8e.C0;
        if (i == i3) {
            vxd vxdVarS = j47.S(contextScope, ((w9a) kkeVar).b(), vx3Var, new q7e(a8eVarO0, ((xf9) a8eVarO0.r().e.a.getValue()).b, null));
            a8eVarO0.v0.o1(a8eVarO0, bc7VarArr[1], vxdVarS);
            a8eVarO0.r().a();
            return;
        }
        if (i == gja.b) {
            vxd vxdVarS2 = j47.S(contextScope, ((w9a) kkeVar).b(), vx3Var, new p7e(a8eVarO0, a8eVarO0.c, null));
            a8eVarO0.w0.o1(a8eVarO0, bc7VarArr[2], vxdVarS2);
        }
    }

    public final RecyclerView m0() {
        return (RecyclerView) this.X.T0(this, v0[2]);
    }

    public final cla n0() {
        return (cla) this.o.T0(this, v0[1]);
    }

    public final a8e o0() {
        return (a8e) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityPaused(Activity activity) {
        ((hw7) this.s0.getValue()).a(this.t0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onActivityResumed(Activity activity) {
        ((hw7) this.s0.getValue()).b(this.t0);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        av3 av3Var2 = av3.POP_ENTER;
        je7 je7Var = this.s0;
        gw7 gw7Var = this.t0;
        if (av3Var == av3Var2 || av3Var == av3.PUSH_ENTER) {
            ((hw7) je7Var.getValue()).b(gw7Var);
        } else if (av3Var == av3.PUSH_EXIT) {
            ((hw7) je7Var.getValue()).a(gw7Var);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(gja.f);
        recyclerView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 48));
        float f = 12;
        recyclerView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), recyclerView.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingBottom());
        recyclerView.setAdapter(this.u0);
        int iA = z7.A(recyclerView.getContext());
        recyclerView.getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(iA));
        recyclerView.j(new ry0(iA, tu0.G(4 * fk4.d().getDisplayMetrics().density), 8));
        recyclerView.k(new yc7(3, this));
        frameLayout.addView(recyclerView);
        cla claVar = new cla(frameLayout.getContext(), 6);
        claVar.setId(gja.x);
        claVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new rpc(9, this)));
        v3c.y(new ieb(3, null, 1), claVar);
        frameLayout.addView(claVar);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        this.t0.b();
        m0().setAdapter(null);
        super.onDestroyView(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        cla claVarN0 = n0();
        pla.a(claVarN0, new i76(claVarN0, 21, this));
        w7c w7cVar = o0().y0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new b5e(null, this, view), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new t03(o0().z0, 11), getViewLifecycleOwner().Q(), fg7Var), new c5e(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(o0().A0, getViewLifecycleOwner().Q(), fg7Var), new d5e(null, this), 5), getViewLifecycleScope());
        RecyclerView recyclerViewM0 = m0();
        dg9 dg9VarR = o0().r();
        jg9 jg9Var = new jg9(recyclerViewM0, this.u0, dg9VarR, n0());
        od2.L(new zn5(dg9VarR.e, new lq0(2, jg9Var, jg9.class, "handleNewSelectedMessages", "handleNewSelectedMessages(Lone/me/stickerssettings/stickersscreen/multiselection/MultiSelectionLogic$Data;)V", 4, 24), 5), getViewLifecycleScope());
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        a8e a8eVarO0 = o0();
        a8eVarO0.getClass();
        if (i == gja.u) {
            a8eVarO0.r().d.m(null, new xf9(true, 6));
            return;
        }
        int i2 = gja.w;
        s35 s35Var = a8eVarO0.A0;
        if (i == i2) {
            pnf.o(s35Var, new sed(new eqe(hja.B), new eqe(hja.A), y53.M(new mg3(gja.e, new eqe(hja.D), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
            return;
        }
        if (i == gja.t) {
            pnf.o(s35Var, new sed(new eqe(hja.w), new eqe(hja.v), y53.M(new mg3(gja.d, new eqe(hja.D), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
            return;
        }
        if (i != gja.i) {
            if (i == gja.j) {
                pnf.o(s35Var, new sed(new eqe(hja.k), new eqe(hja.j), y53.M(new mg3(gja.b, new eqe(hja.h), 1, false), new mg3(gja.a, new eqe(hja.i), 2, false))));
                return;
            }
            return;
        }
        m7e m7eVar = (m7e) a8eVarO0.z0.a.getValue();
        String str = m7eVar != null ? m7eVar.c : null;
        if (str == null || str.length() == 0) {
            return;
        }
        tpa.o(a8eVarO0.o, str);
        ued uedVar = tpa.s() ? new ued(woc.t, new eqe(hja.g)) : null;
        if (uedVar != null) {
            pnf.o(s35Var, uedVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StickersScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        Object obj = null;
        dp3 dp3Var = a5e.b;
        String string = bundle.getString("mode");
        if (string != null) {
            dp3Var.getClass();
            Iterator it = a5e.Z.iterator();
            while (true) {
                u1 u1Var = (u1) it;
                if (!u1Var.hasNext()) {
                    break;
                }
                Object next = u1Var.next();
                if (tpa.f(((a5e) next).a, string)) {
                    obj = next;
                    break;
                }
            }
            if (obj != null) {
                this.a = (a5e) obj;
                this.b = new fs(Long.class, -1L, "set_id");
                final int i = 0;
                this.c = createViewModelLazy(a8e.class, new nhd(8, new k56(this) { // from class: z4e
                    public final /* synthetic */ StickersScreen b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        StickersScreen stickersScreen = this.b;
                        switch (i) {
                            case 0:
                                bc7[] bc7VarArr = StickersScreen.v0;
                                bc7 bc7Var = StickersScreen.v0[0];
                                long jLongValue = ((Number) stickersScreen.b.a(stickersScreen)).longValue();
                                k6e k6eVar = k6e.a;
                                return new a8e(stickersScreen.a, jLongValue, (Context) k6eVar.getAccessor().c(Context.class), (kke) k6eVar.getAccessor().c(kke.class), k6eVar.getAccessor().d(o2e.class), k6eVar.getAccessor().d(x9c.class), k6eVar.getAccessor().d(md5.class), k6eVar.getAccessor().d(sc5.class), k6eVar.getAccessor().d(a4e.class), k6eVar.getAccessor().d(qe5.class));
                            case 1:
                                bc7[] bc7VarArr2 = StickersScreen.v0;
                                return new o4e(stickersScreen.getContext());
                            default:
                                bc7[] bc7VarArr3 = StickersScreen.v0;
                                OneMeButton oneMeButton = new OneMeButton(stickersScreen.getContext(), null);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                                int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                                layoutParams.leftMargin = iG;
                                layoutParams.rightMargin = iG;
                                layoutParams.topMargin = iG;
                                layoutParams.bottomMargin = iG;
                                oneMeButton.setLayoutParams(layoutParams);
                                oneMeButton.setSize(c7a.c);
                                oneMeButton.setMode(b7a.b);
                                oneMeButton.setAppearance(z6a.c);
                                oneMeButton.setText(hja.n);
                                tu0.K(oneMeButton, 300L, new elb(8, stickersScreen));
                                return oneMeButton;
                        }
                    }
                }));
                this.o = viewBinding(gja.x);
                this.X = viewBinding(gja.f);
                final int i2 = 1;
                this.Y = binding(new k56(this) { // from class: z4e
                    public final /* synthetic */ StickersScreen b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        StickersScreen stickersScreen = this.b;
                        switch (i2) {
                            case 0:
                                bc7[] bc7VarArr = StickersScreen.v0;
                                bc7 bc7Var = StickersScreen.v0[0];
                                long jLongValue = ((Number) stickersScreen.b.a(stickersScreen)).longValue();
                                k6e k6eVar = k6e.a;
                                return new a8e(stickersScreen.a, jLongValue, (Context) k6eVar.getAccessor().c(Context.class), (kke) k6eVar.getAccessor().c(kke.class), k6eVar.getAccessor().d(o2e.class), k6eVar.getAccessor().d(x9c.class), k6eVar.getAccessor().d(md5.class), k6eVar.getAccessor().d(sc5.class), k6eVar.getAccessor().d(a4e.class), k6eVar.getAccessor().d(qe5.class));
                            case 1:
                                bc7[] bc7VarArr2 = StickersScreen.v0;
                                return new o4e(stickersScreen.getContext());
                            default:
                                bc7[] bc7VarArr3 = StickersScreen.v0;
                                OneMeButton oneMeButton = new OneMeButton(stickersScreen.getContext(), null);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                                int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                                layoutParams.leftMargin = iG;
                                layoutParams.rightMargin = iG;
                                layoutParams.topMargin = iG;
                                layoutParams.bottomMargin = iG;
                                oneMeButton.setLayoutParams(layoutParams);
                                oneMeButton.setSize(c7a.c);
                                oneMeButton.setMode(b7a.b);
                                oneMeButton.setAppearance(z6a.c);
                                oneMeButton.setText(hja.n);
                                tu0.K(oneMeButton, 300L, new elb(8, stickersScreen));
                                return oneMeButton;
                        }
                    }
                });
                final int i3 = 2;
                this.Z = binding(new k56(this) { // from class: z4e
                    public final /* synthetic */ StickersScreen b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.k56
                    public final Object invoke() {
                        StickersScreen stickersScreen = this.b;
                        switch (i3) {
                            case 0:
                                bc7[] bc7VarArr = StickersScreen.v0;
                                bc7 bc7Var = StickersScreen.v0[0];
                                long jLongValue = ((Number) stickersScreen.b.a(stickersScreen)).longValue();
                                k6e k6eVar = k6e.a;
                                return new a8e(stickersScreen.a, jLongValue, (Context) k6eVar.getAccessor().c(Context.class), (kke) k6eVar.getAccessor().c(kke.class), k6eVar.getAccessor().d(o2e.class), k6eVar.getAccessor().d(x9c.class), k6eVar.getAccessor().d(md5.class), k6eVar.getAccessor().d(sc5.class), k6eVar.getAccessor().d(a4e.class), k6eVar.getAccessor().d(qe5.class));
                            case 1:
                                bc7[] bc7VarArr2 = StickersScreen.v0;
                                return new o4e(stickersScreen.getContext());
                            default:
                                bc7[] bc7VarArr3 = StickersScreen.v0;
                                OneMeButton oneMeButton = new OneMeButton(stickersScreen.getContext(), null);
                                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
                                int iG = tu0.G(12 * fk4.d().getDisplayMetrics().density);
                                layoutParams.leftMargin = iG;
                                layoutParams.rightMargin = iG;
                                layoutParams.topMargin = iG;
                                layoutParams.bottomMargin = iG;
                                oneMeButton.setLayoutParams(layoutParams);
                                oneMeButton.setSize(c7a.c);
                                oneMeButton.setMode(b7a.b);
                                oneMeButton.setAppearance(z6a.c);
                                oneMeButton.setText(hja.n);
                                tu0.K(oneMeButton, 300L, new elb(8, stickersScreen));
                                return oneMeButton;
                        }
                    }
                });
                k6e k6eVar = k6e.a;
                this.s0 = k6eVar.getAccessor().d(hw7.class);
                this.t0 = new gw7();
                this.u0 = new a3g(((iba) k6eVar.getAccessor().c(iba.class)).a(), new bkg(26, this));
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public /* synthetic */ StickersScreen(a5e a5eVar, long j, int i, z84 z84Var) {
        this(a5eVar, (i & 2) != 0 ? -1L : j);
    }
}
