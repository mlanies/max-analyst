package one.me.chatmedia.viewer;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a7g;
import defpackage.av3;
import defpackage.bc7;
import defpackage.br7;
import defpackage.bvc;
import defpackage.ck2;
import defpackage.cla;
import defpackage.dkf;
import defpackage.dmf;
import defpackage.dy7;
import defpackage.ee2;
import defpackage.eia;
import defpackage.ekf;
import defpackage.f;
import defpackage.fg7;
import defpackage.fic;
import defpackage.fk4;
import defpackage.fm9;
import defpackage.fs;
import defpackage.ft4;
import defpackage.g07;
import defpackage.gaa;
import defpackage.glc;
import defpackage.h0c;
import defpackage.hm9;
import defpackage.hob;
import defpackage.iba;
import defpackage.j1e;
import defpackage.j47;
import defpackage.je7;
import defpackage.jrd;
import defpackage.jwa;
import defpackage.k56;
import defpackage.k8a;
import defpackage.ki2;
import defpackage.kia;
import defpackage.kka;
import defpackage.kl7;
import defpackage.kpa;
import defpackage.kt4;
import defpackage.l63;
import defpackage.lh0;
import defpackage.li2;
import defpackage.m52;
import defpackage.m56;
import defpackage.mi2;
import defpackage.mqc;
import defpackage.nec;
import defpackage.ni2;
import defpackage.od2;
import defpackage.oi2;
import defpackage.pge;
import defpackage.pi2;
import defpackage.pka;
import defpackage.pnf;
import defpackage.pq9;
import defpackage.q7c;
import defpackage.qe5;
import defpackage.qi2;
import defpackage.qp4;
import defpackage.rg2;
import defpackage.se5;
import defpackage.sj2;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.u75;
import defpackage.ui2;
import defpackage.uj2;
import defpackage.uka;
import defpackage.vha;
import defpackage.vi2;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wha;
import defpackage.wka;
import defpackage.woc;
import defpackage.x27;
import defpackage.xq9;
import defpackage.xt3;
import defpackage.yfa;
import defpackage.yk8;
import defpackage.yq0;
import defpackage.z7;
import defpackage.z7b;
import defpackage.zn5;
import defpackage.zu3;
import defpackage.zvc;
import kotlin.Metadata;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB1\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\b\u0010\u0012¨\u0006\u0013"}, d2 = {"Lone/me/chatmedia/viewer/ChatMediaViewerScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Ljwa;", "Ldmf;", "Lzvc;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "", "attachId", "msgId", "", "singleMode", "descOrder", "(JLjava/lang/String;JZZ)V", "chat-media-viewer_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes.dex */
public final class ChatMediaViewerScreen extends SwipeWidget implements jwa, dmf, zvc, xt3 {
    public static final /* synthetic */ bc7[] K0 = {new hob(ChatMediaViewerScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), z7b.g(nec.a, ChatMediaViewerScreen.class, "attachId", "getAttachId()Ljava/lang/String;", 0), new hob(ChatMediaViewerScreen.class, "msgId", "getMsgId()J", 0), new hob(ChatMediaViewerScreen.class, "descOrder", "getDescOrder()Z", 0), new hob(ChatMediaViewerScreen.class, "singleMode", "getSingleMode()Z", 0), new hob(ChatMediaViewerScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), new hob(ChatMediaViewerScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new hob(ChatMediaViewerScreen.class, "infoPanel", "getInfoPanel()Lone/me/chatmedia/viewer/InformationPanelView;", 0)};
    public static final x27 L0 = new x27(5, null, 2);
    public static final x27 M0 = new x27(0, new yq0(5, 1, false), 1);
    public yk8 A0;
    public a7g B0;
    public AnimatorSet C0;
    public final rg2 D0;
    public final je7 E0;
    public final je7 F0;
    public float G0;
    public boolean H0;
    public vxd I0;
    public vha J0;
    public final fs X;
    public final fs Y;
    public final fs Z;
    public final fs o;
    public final fs s0;
    public final je7 t0;
    public final glc u0;
    public final boolean v0;
    public final je7 w0;
    public final q7c x0;
    public final q7c y0;
    public final q7c z0;

    public ChatMediaViewerScreen(Bundle bundle) {
        super(bundle);
        this.o = new fs(Long.class, 0L, "chat.media.viewer.chat_id");
        this.X = new fs(String.class, "", "chat.media.viewer.attach_id");
        this.Y = new fs(Long.class, 0L, "chat.media.viewer.message_id");
        Boolean bool = Boolean.FALSE;
        this.Z = new fs(Boolean.class, bool, "chat.media.viewer.desc_order");
        this.s0 = new fs(Boolean.class, bool, "chat.media.viewer.single_mode");
        ee2 ee2Var = ee2.a;
        this.t0 = ee2Var.getAccessor().d(qe5.class);
        this.u0 = new glc(new m52(14), null, 6);
        this.v0 = true;
        final int i = 0;
        this.w0 = createViewModelLazy(ck2.class, new ti2(0, new k56(this) { // from class: ii2
            public final /* synthetic */ ChatMediaViewerScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x005a  */
            @Override // defpackage.k56
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instructions count: 404
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ii2.invoke():java.lang.Object");
            }
        }));
        this.x0 = viewBinding(k8a.e);
        this.y0 = viewBinding(k8a.i);
        this.z0 = viewBinding(k8a.d);
        this.D0 = new rg2(this, ((iba) ee2Var.getAccessor().c(iba.class)).a());
        this.E0 = ee2Var.getAccessor().d(jrd.class);
        final int i2 = 1;
        this.F0 = tu0.r(3, new k56(this) { // from class: ii2
            public final /* synthetic */ ChatMediaViewerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                /*
                    Method dump skipped, instructions count: 404
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ii2.invoke():java.lang.Object");
            }
        });
        this.G0 = -1.0f;
    }

    public static final boolean v0(ChatMediaViewerScreen chatMediaViewerScreen) {
        vxd vxdVar;
        return chatMediaViewerScreen.F0.a() && (vxdVar = chatMediaViewerScreen.I0) != null && vxdVar.isActive();
    }

    public final g07 A0() {
        return (g07) this.z0.T0(this, K0[7]);
    }

    public final dkf B0() {
        return (dkf) this.F0.getValue();
    }

    public final cla C0() {
        return (cla) this.y0.T0(this, K0[6]);
    }

    public final ck2 D0() {
        return (ck2) this.w0.getValue();
    }

    public final void E0(boolean z) {
        vha vhaVar = this.J0;
        if (vhaVar != null) {
            vhaVar.a();
        }
        String string = getContext().getString(z ? h0c.oneme_chatmedia_viewer_load_video_fail : h0c.oneme_chatmedia_viewer_load_photo_fail);
        wha whaVar = new wha(this);
        whaVar.h(string);
        whaVar.c(new eia(0, 0, w0(), 3));
        whaVar.e(new kia(woc.I));
        this.J0 = whaVar.i();
    }

    public final void F0() {
        dkf dkfVarB0 = B0();
        int i = ft4.o;
        this.I0 = od2.L(tu0.g(new zn5(od2.x(new mqc(new ekf(dkfVarB0, z7.R(50, kt4.MILLISECONDS), null))), new ui2(null, this), 5), getViewLifecycleOwner().Q(), fg7.o), getViewLifecycleScope());
    }

    public final void G0(boolean z) {
        AnimatorSet animatorSet = this.C0;
        if ((animatorSet == null || !animatorSet.isRunning()) && getView() != null) {
            float f = (C0().getVisibility() == 0 || A0().getVisibility() == 0) ? 0.0f : 1.0f;
            kl7 kl7VarL = j1e.l();
            cla claVarC0 = C0();
            Property property = View.ALPHA;
            kl7VarL.add(ObjectAnimator.ofFloat(claVarC0, (Property<cla, Float>) property, C0().getAlpha(), f));
            kl7VarL.add(ObjectAnimator.ofFloat(A0(), (Property<g07, Float>) property, A0().getAlpha(), f));
            yk8 yk8Var = this.A0;
            ObjectAnimator objectAnimatorOfFloat = yk8Var != null ? ObjectAnimator.ofFloat(yk8Var.a(), (Property<ImageView, Float>) property, yk8Var.a().getAlpha(), f) : null;
            if (z && objectAnimatorOfFloat != null) {
                kl7VarL.add(objectAnimatorOfFloat);
            }
            kl7 kl7VarD = j1e.d(kl7VarL);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(kl7VarD);
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new vi2(this, z, f));
            animatorSet2.addListener(new vi2(f, this, z));
            animatorSet2.start();
            this.C0 = animatorSet2;
        }
    }

    @Override // defpackage.zvc
    /* renamed from: P, reason: from getter */
    public final boolean getV0() {
        return this.v0;
    }

    @Override // defpackage.nge
    public final boolean S() {
        return ((se5) ((qe5) this.t0.getValue())).u();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks */
    public final String getX() {
        return "chatMediaViewer";
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.u0;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, defpackage.uu3
    public final boolean handleBack() {
        z0();
        vha vhaVar = this.J0;
        if (vhaVar != null) {
            vhaVar.a();
        }
        return super.handleBack();
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void o0() {
        Window window;
        Window window2;
        View view = getView();
        pq9 pq9Var = qp4.u0;
        if (view != null) {
            view.setBackgroundColor(pq9Var.o(getContext()).c.b().j);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            window2.setStatusBarColor(pq9Var.o(getContext()).c.b().j);
        }
        Activity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            window.setNavigationBarColor(pq9Var.o(getContext()).c.b().j);
        }
        y0(true);
        x0(false);
    }

    @Override // defpackage.uu3
    public final void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (getView() == null || A0().getVisibility() != 0) {
            return;
        }
        Window window = activity.getWindow();
        pq9 pq9Var = qp4.u0;
        window.setStatusBarColor(pq9Var.o(getContext()).c.b().j);
        activity.getWindow().setNavigationBarColor(pq9Var.o(getContext()).c.b().j);
        y0(true);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget, one.me.sdk.arch.Widget, defpackage.uu3
    public final void onChangeStarted(zu3 zu3Var, av3 av3Var) {
        super.onChangeStarted(zu3Var, av3Var);
        if (!av3Var.b) {
            z0();
        }
        if (av3Var == av3.POP_EXIT && this.F0.a()) {
            ck2 ck2VarD0 = D0();
            long jF0 = B0().F0();
            ck2VarD0.getClass();
            xq9 xq9Var = xq9.a;
            uj2 uj2Var = new uj2(ck2VarD0, jF0, null);
            j47.S(ck2VarD0.a, xq9Var, vx3.c, uj2Var);
            B0().Y = null;
            fic ficVar = ((jrd) this.E0.getValue()).g;
            if (ficVar.a()) {
                dkf dkfVar = (dkf) ficVar.getValue();
                hm9.n(dkfVar.c, "Player. Release");
                u75 u75Var = dkfVar.o;
                u75Var.w2();
                u75Var.D0.Y.e(dkfVar);
                u75Var.r0(dkfVar);
                u75Var.w2();
                u75Var.p2(null);
                u75Var.k2(0, 0);
                u75Var.release();
                dkfVar.X.k();
                ficVar.reset();
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pge pgeVar = new pge(getContext());
        pgeVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewPager2 viewPager2 = new ViewPager2(pgeVar.getContext());
        viewPager2.setId(k8a.e);
        viewPager2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        viewPager2.setOffscreenPageLimit(1);
        viewPager2.setAdapter(this.D0);
        fm9.z(viewPager2);
        pgeVar.addView(viewPager2);
        cla claVar = new cla(pgeVar.getContext(), 6);
        claVar.setId(k8a.i);
        claVar.setLayoutParams(new FrameLayout.LayoutParams(-1, tu0.G(64 * fk4.d().getDisplayMetrics().density)));
        claVar.setForm(uka.a);
        pq9 pq9Var = qp4.u0;
        claVar.setCustomTheme(pq9Var.p(claVar).c);
        final int i = 0;
        claVar.setLeftActions(new kka(new m56(this) { // from class: ji2
            public final /* synthetic */ ChatMediaViewerScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.m56
            public final Object invoke(Object obj) {
                e5f e5fVar = e5f.a;
                ChatMediaViewerScreen chatMediaViewerScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = ChatMediaViewerScreen.K0;
                        i3a onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                            break;
                        }
                        break;
                    default:
                        bc7[] bc7VarArr2 = ChatMediaViewerScreen.K0;
                        chatMediaViewerScreen.D0().E(k8a.l);
                        break;
                }
                return e5fVar;
            }
        }));
        wka wkaVar = new wka(woc.t0, 0, new f(1, this, ChatMediaViewerScreen.class, "showDropdownMenu", "showDropdownMenu(Landroid/view/View;)V", 0, 13), 14);
        bc7 bc7Var = K0[4];
        if (((Boolean) this.s0.a(this)).booleanValue()) {
            claVar.setRightActions(new pka(null, wkaVar));
        } else {
            final int i2 = 1;
            claVar.setRightActions(new pka(new wka(yfa.e, 0, new m56(this) { // from class: ji2
                public final /* synthetic */ ChatMediaViewerScreen b;

                {
                    this.b = this;
                }

                @Override // defpackage.m56
                public final Object invoke(Object obj) {
                    e5f e5fVar = e5f.a;
                    ChatMediaViewerScreen chatMediaViewerScreen = this.b;
                    switch (i2) {
                        case 0:
                            bc7[] bc7VarArr = ChatMediaViewerScreen.K0;
                            i3a onBackPressedDispatcher = chatMediaViewerScreen.getOnBackPressedDispatcher();
                            if (onBackPressedDispatcher != null) {
                                onBackPressedDispatcher.d();
                                break;
                            }
                            break;
                        default:
                            bc7[] bc7VarArr2 = ChatMediaViewerScreen.K0;
                            chatMediaViewerScreen.D0().E(k8a.l);
                            break;
                    }
                    return e5fVar;
                }
            }, 14), wkaVar));
        }
        claVar.setBackgroundColor(pq9Var.p(claVar).c.b().j);
        br7.d(claVar, L0, null);
        pgeVar.addView(claVar);
        pgeVar.setClipChildren(false);
        pgeVar.setClipToPadding(false);
        g07 g07Var = new g07(pgeVar.getContext());
        g07Var.setId(k8a.d);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 80;
        g07Var.setLayoutParams(layoutParams);
        g07Var.setClipChildren(false);
        g07Var.setClipToPadding(false);
        float f = 9;
        g07Var.setPadding(g07Var.getPaddingLeft(), tu0.G(fk4.d().getDisplayMetrics().density * f), g07Var.getPaddingRight(), tu0.G(f * fk4.d().getDisplayMetrics().density));
        g07Var.setBackgroundColor(pq9Var.p(g07Var).c.b().j);
        br7.d(g07Var, M0, null);
        pgeVar.addView(g07Var);
        Activity activity = getActivity();
        if (activity != null) {
            activity.getWindow().setStatusBarColor(pq9Var.p(pgeVar).c.b().j);
            activity.getWindow().setNavigationBarColor(pq9Var.p(pgeVar).c.b().j);
            a7g a7gVar = new a7g(activity.getWindow(), activity.getWindow().getDecorView());
            a7gVar.a.w();
            this.B0 = a7gVar;
        }
        y0(true);
        pgeVar.setBackgroundColor(pq9Var.p(pgeVar).c.b().j);
        this.A0 = new yk8(pgeVar, new gaa(this));
        return pgeVar;
    }

    @Override // defpackage.uu3
    public final void onDestroy() {
        super.onDestroy();
        je7 je7Var = this.F0;
        if (je7Var.a()) {
            ((jrd) this.E0.getValue()).a((dkf) je7Var.getValue());
        }
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.A0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        w7c w7cVar = D0().Q0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new ki2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().U0, getViewLifecycleOwner().Q(), fg7Var), new li2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().S0, getViewLifecycleOwner().Q(), fg7Var), new mi2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().N0, getViewLifecycleOwner().Q(), fg7Var), new ni2(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(D0().O0, getViewLifecycleOwner().Q(), fg7Var), new oi2(null, this), 5), getViewLifecycleScope());
        ((ViewPager2) this.x0.T0(this, K0[5])).b(new lh0(3, this));
        od2.L(new zn5(tu0.g(A0().getEvents(), getViewLifecycleOwner().Q(), fg7Var), new pi2(null, this), 5), getViewLifecycleScope());
        ck2 ck2VarD0 = D0();
        pnf.n(ck2VarD0, ((w9a) ck2VarD0.t0).b(), null, new sj2(ck2VarD0, null), 2);
        od2.L(new zn5(tu0.g(D0().Y0, getViewLifecycleOwner().Q(), fg7Var), new qi2(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void q0() {
        Window window;
        Window window2;
        View view = getView();
        pq9 pq9Var = qp4.u0;
        if (view != null) {
            pq9Var.o(getContext()).c.b();
            view.setBackgroundColor(0);
        }
        Activity activity = getActivity();
        if (activity != null && (window2 = activity.getWindow()) != null) {
            pq9Var.o(getContext()).c.b();
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 == null || (window = activity2.getWindow()) == null) {
            return;
        }
        pq9Var.o(getContext()).c.b();
        window.setNavigationBarColor(0);
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void r0() {
        if (getView() != null) {
            if (C0().getVisibility() != 0) {
                z0();
                return;
            }
            C0().setVisibility(8);
            A0().setVisibility(8);
            yk8 yk8Var = this.A0;
            if (yk8Var != null) {
                yk8Var.c(false);
            }
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long t0() {
        return 1000L;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer u0() {
        return Integer.valueOf(qp4.u0.o(getContext()).c.b().j);
    }

    public final int w0() {
        Integer numV;
        View view = getView();
        int i = 0;
        int iIntValue = (view == null || (numV = br7.v(view)) == null) ? 0 : numV.intValue();
        int measuredHeight = A0().getMeasuredHeight();
        if (iIntValue == 0) {
            ViewGroup.LayoutParams layoutParams = A0().getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                i = marginLayoutParams.bottomMargin;
            }
        }
        return measuredHeight + i;
    }

    public final void x0(boolean z) {
        if (z) {
            a7g a7gVar = this.B0;
            if (a7gVar != null) {
                a7gVar.a.x(1);
                return;
            }
            return;
        }
        a7g a7gVar2 = this.B0;
        if (a7gVar2 != null) {
            a7gVar2.a.k(1);
        }
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        D0().E(i);
    }

    public final void y0(boolean z) {
        Window window;
        Activity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        boolean z2 = qp4.u0.j(window.getDecorView()).h() == l63.a && !z;
        a7g a7gVar = this.B0;
        if (a7gVar != null) {
            a7gVar.b(z2);
        }
        a7g a7gVar2 = this.B0;
        if (a7gVar2 != null) {
            a7gVar2.a(z2);
        }
    }

    public final void z0() {
        Window window;
        Window window2;
        Activity activity = getActivity();
        pq9 pq9Var = qp4.u0;
        if (activity != null && (window2 = activity.getWindow()) != null) {
            pq9Var.o(getContext()).c.b();
            window2.setStatusBarColor(0);
        }
        Activity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
            pq9Var.o(getContext()).c.b();
            window.setNavigationBarColor(0);
        }
        y0(false);
        x0(true);
    }

    public ChatMediaViewerScreen(long j, String str, long j2, boolean z, boolean z2) {
        this(dy7.g(new kpa("chat.media.viewer.chat_id", Long.valueOf(j)), new kpa("chat.media.viewer.attach_id", str), new kpa("chat.media.viewer.message_id", Long.valueOf(j2)), new kpa("chat.media.viewer.single_mode", Boolean.valueOf(z)), new kpa("chat.media.viewer.desc_order", Boolean.valueOf(z2))));
    }
}
