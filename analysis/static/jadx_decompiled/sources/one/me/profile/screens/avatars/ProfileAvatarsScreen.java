package one.me.profile.screens.avatars;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a7g;
import defpackage.bc7;
import defpackage.bcb;
import defpackage.br7;
import defpackage.bvc;
import defpackage.cba;
import defpackage.cbb;
import defpackage.ccb;
import defpackage.cla;
import defpackage.dbb;
import defpackage.dy7;
import defpackage.ebb;
import defpackage.eh2;
import defpackage.ffa;
import defpackage.fg7;
import defpackage.fka;
import defpackage.gbb;
import defpackage.glc;
import defpackage.hdb;
import defpackage.hfa;
import defpackage.hob;
import defpackage.je7;
import defpackage.jp8;
import defpackage.k56;
import defpackage.khe;
import defpackage.kka;
import defpackage.kke;
import defpackage.kpa;
import defpackage.lh0;
import defpackage.nec;
import defpackage.nfa;
import defpackage.nz4;
import defpackage.o45;
import defpackage.od2;
import defpackage.oec;
import defpackage.om8;
import defpackage.pge;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.qbb;
import defpackage.qe5;
import defpackage.qp4;
import defpackage.qwb;
import defpackage.rbb;
import defpackage.rka;
import defpackage.sbb;
import defpackage.se5;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.uab;
import defpackage.uka;
import defpackage.w7c;
import defpackage.w9a;
import defpackage.wab;
import defpackage.wuc;
import defpackage.wz7;
import defpackage.x27;
import defpackage.x53;
import defpackage.xab;
import defpackage.xcb;
import defpackage.xt3;
import defpackage.y20;
import defpackage.zn5;
import defpackage.zr6;
import defpackage.zvc;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.sdk.conductor.changehandlers.swipe.SwipeWidget;
import ru.ok.tamtam.ExceptionHandler$HandledException;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profile/screens/avatars/ProfileAvatarsScreen;", "Lone/me/sdk/conductor/changehandlers/swipe/SwipeWidget;", "Lwab;", "Lxt3;", "Lzvc;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lhdb;", "type", "(JLhdb;)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileAvatarsScreen extends SwipeWidget implements wab, xt3, zvc {
    public static final /* synthetic */ bc7[] z0;
    public final khe X;
    public final x27 Y;
    public final glc Z;
    public final je7 o;
    public final je7 s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final gbb w0;
    public final je7 x0;
    public final je7 y0;

    static {
        hob hobVar = new hob(ProfileAvatarsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0);
        oec oecVar = nec.a;
        z0 = new bc7[]{hobVar, zr6.e(oecVar, ProfileAvatarsScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0), zr6.f(ProfileAvatarsScreen.class, "progressIndication", "getProgressIndication()Landroid/view/View;", 0, oecVar)};
    }

    public ProfileAvatarsScreen(Bundle bundle) {
        super(bundle);
        this.o = xcb.a.g();
        final int i = 0;
        this.X = new khe(new k56(this) { // from class: pbb
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = ProfileAvatarsScreen.z0;
                        return qp4.u0.o(profileAvatarsScreen.getContext()).c;
                    case 1:
                        bc7[] bc7VarArr2 = ProfileAvatarsScreen.z0;
                        im imVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new a7g(imVarRequireActivity.getWindow(), imVarRequireActivity.getWindow().getDecorView());
                    default:
                        bc7[] bc7VarArr3 = ProfileAvatarsScreen.z0;
                        return profileAvatarsScreen.requireResources().getString(c2c.tt_of);
                }
            }
        });
        this.Y = x27.c;
        this.Z = new glc(wuc.AVATAR_VIEWER);
        this.s0 = createViewModelLazy(ccb.class, new jp8(15, new eh2(bundle, 6)));
        this.t0 = viewBinding(qwb.profile_contact_avatars_toolbar);
        this.u0 = viewBinding(qwb.profile_contact_avatars_viewpager);
        this.v0 = viewBinding(qwb.profile_contact_avatars_progress_indicator);
        gbb gbbVar = new gbb(this, 0);
        gbbVar.w0 = nz4.a;
        this.w0 = gbbVar;
        final int i2 = 1;
        this.x0 = tu0.r(3, new k56(this) { // from class: pbb
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = ProfileAvatarsScreen.z0;
                        return qp4.u0.o(profileAvatarsScreen.getContext()).c;
                    case 1:
                        bc7[] bc7VarArr2 = ProfileAvatarsScreen.z0;
                        im imVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new a7g(imVarRequireActivity.getWindow(), imVarRequireActivity.getWindow().getDecorView());
                    default:
                        bc7[] bc7VarArr3 = ProfileAvatarsScreen.z0;
                        return profileAvatarsScreen.requireResources().getString(c2c.tt_of);
                }
            }
        });
        final int i3 = 2;
        this.y0 = tu0.r(3, new k56(this) { // from class: pbb
            public final /* synthetic */ ProfileAvatarsScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ProfileAvatarsScreen profileAvatarsScreen = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = ProfileAvatarsScreen.z0;
                        return qp4.u0.o(profileAvatarsScreen.getContext()).c;
                    case 1:
                        bc7[] bc7VarArr2 = ProfileAvatarsScreen.z0;
                        im imVarRequireActivity = profileAvatarsScreen.requireActivity();
                        return new a7g(imVarRequireActivity.getWindow(), imVarRequireActivity.getWindow().getDecorView());
                    default:
                        bc7[] bc7VarArr3 = ProfileAvatarsScreen.z0;
                        return profileAvatarsScreen.requireResources().getString(c2c.tt_of);
                }
            }
        });
    }

    public static final View v0(ProfileAvatarsScreen profileAvatarsScreen) {
        profileAvatarsScreen.getClass();
        return (View) profileAvatarsScreen.v0.T0(profileAvatarsScreen, z0[2]);
    }

    public static final void w0(ProfileAvatarsScreen profileAvatarsScreen, ebb ebbVar, int i) {
        profileAvatarsScreen.getClass();
        if (ebbVar instanceof dbb) {
            CharSequence charSequenceB = ((dbb) ebbVar).a.b(profileAvatarsScreen.getContext());
            CharSequence charSequence = charSequenceB != null ? charSequenceB : "";
            if (tpa.f(profileAvatarsScreen.A0().getTitle().getText(), charSequence)) {
                return;
            }
            profileAvatarsScreen.A0().setTitle(charSequence);
            return;
        }
        if (!tpa.f(ebbVar, cbb.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int size = profileAvatarsScreen.w0.w0.size();
        if (i < 0 || size <= 0) {
            profileAvatarsScreen.A0().setTitle("");
            return;
        }
        profileAvatarsScreen.A0().setTitle((i + 1) + " " + ((String) profileAvatarsScreen.y0.getValue()) + " " + size);
    }

    public final cla A0() {
        return (cla) this.t0.T0(this, z0[0]);
    }

    public final ccb B0() {
        return (ccb) this.s0.getValue();
    }

    public final ViewPager2 C0() {
        return (ViewPager2) this.u0.T0(this, z0[1]);
    }

    @Override // defpackage.zvc
    /* renamed from: P */
    public final boolean getV0() {
        return true;
    }

    @Override // defpackage.nge
    public final boolean S() {
        return ((se5) ((qe5) this.o.getValue())).u();
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.Y;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.Z;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final boolean n0() {
        return false;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void o0() {
        View view = getView();
        if (view != null) {
            view.setBackgroundColor(((fka) this.X.getValue()).b().j);
        }
        y0(true);
        z0(true);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        je7 je7Var = this.x0;
        ((a7g) je7Var.getValue()).b(false);
        ((a7g) je7Var.getValue()).a(false);
        ((a7g) je7Var.getValue()).a.w();
        pge pgeVar = new pge(getContext());
        pgeVar.setId(-1);
        pgeVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        pgeVar.setBackgroundColor(qp4.u0.o(layoutInflater.getContext()).c.b().j);
        int i = qwb.profile_contact_avatars_viewpager;
        ViewPager2 viewPager2 = new ViewPager2(pgeVar.getContext());
        viewPager2.setId(i);
        viewPager2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        viewPager2.setLayoutDirection(0);
        viewPager2.setOffscreenPageLimit(1);
        pgeVar.addView(viewPager2);
        int i2 = qwb.profile_contact_avatars_toolbar;
        cla claVar = new cla(pgeVar.getContext(), 6);
        claVar.setId(i2);
        khe kheVar = this.X;
        claVar.setCustomTheme((fka) kheVar.getValue());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        claVar.setLayoutParams(layoutParams);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new wz7(22, this)));
        claVar.setRightActions(new rka(new om8(1, this, ProfileAvatarsScreen.class, "showContextActionsMenu", "showContextActionsMenu(Landroid/view/View;)V", 0, 9)));
        br7.e(claVar);
        pgeVar.addView(claVar);
        int i3 = qwb.profile_contact_avatars_progress_indicator;
        FrameLayout frameLayout = new FrameLayout(pgeVar.getContext());
        frameLayout.setId(i3);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(((fka) kheVar.getValue()).b().f);
        nfa nfaVar = new nfa(frameLayout.getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        nfaVar.setLayoutParams(layoutParams2);
        nfaVar.setAppearance(ffa.a);
        nfaVar.setSize(hfa.a);
        frameLayout.addView(nfaVar);
        frameLayout.setOnClickListener(new y20(6));
        frameLayout.setVisibility(8);
        pgeVar.addView(frameLayout);
        return pgeVar;
    }

    @Override // defpackage.uu3
    public final void onDestroy() {
        super.onDestroy();
        y0(true);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        C0().setAdapter(this.w0);
        C0().b(new lh0(9, this));
        w7c w7cVarD = B0().b.d();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVarD, getViewLifecycleOwner().Q(), fg7Var), new rbb(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(B0().Z, getViewLifecycleOwner().Q(), fg7Var), new sbb(null, this), 5), getViewLifecycleScope());
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void q0() {
        View view = getView();
        if (view != null) {
            ((fka) this.X.getValue()).b();
            view.setBackgroundColor(0);
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final void r0() {
        if (getView() != null) {
            A0().setVisibility(8);
            A0().setAlpha(0.0f);
            y0(true);
        }
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Long t0() {
        return 1000L;
    }

    @Override // one.me.sdk.conductor.changehandlers.swipe.SwipeWidget
    public final Integer u0() {
        return Integer.valueOf(((fka) this.X.getValue()).b().j);
    }

    public final void x0(boolean z) {
        if (getView() != null) {
            float f = z ? 1.0f : 0.0f;
            if (v0(this).getAlpha() == f) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimatorAnimate = v0(this).animate();
            viewPropertyAnimatorAnimate.cancel();
            viewPropertyAnimatorAnimate.alpha(f).setDuration(200L).setListener(new qbb(this, z, 0)).start();
        }
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        ccb ccbVarB0 = B0();
        int currentItem = C0().getCurrentItem();
        uab uabVar = (uab) x53.j0(currentItem, (List) ccbVarB0.b.d().a.getValue());
        if (uabVar == null) {
            return;
        }
        try {
            String str = (String) x53.g0(uabVar.b);
            xab xabVar = (xab) x53.j0(i, xab.t0);
            if (xabVar == null) {
                return;
            }
            pnf.n(ccbVarB0, ((w9a) ((kke) ccbVarB0.X.getValue())).b(), null, new bcb(ccbVarB0, xabVar, uabVar, str, currentItem, null), 2);
        } catch (NoSuchElementException e) {
            ((cba) ((o45) ccbVarB0.o.getValue())).c(new ExceptionHandler$HandledException("model.urls.isNotEmpty() == false", e, 4, null), false);
        }
    }

    public final void y0(boolean z) {
        je7 je7Var = this.x0;
        if (z) {
            ((a7g) je7Var.getValue()).a.x(3);
        } else {
            ((a7g) je7Var.getValue()).a.k(3);
        }
    }

    public final void z0(boolean z) {
        if (getView() != null) {
            if ((A0().getVisibility() == 0) == z) {
                return;
            }
            float f = z ? 1.0f : 0.0f;
            ViewPropertyAnimator viewPropertyAnimatorAnimate = A0().animate();
            viewPropertyAnimatorAnimate.cancel();
            viewPropertyAnimatorAnimate.alpha(f).setDuration(200L).setListener(new qbb(this, z, 1)).start();
        }
    }

    public ProfileAvatarsScreen(long j, hdb hdbVar) {
        this(dy7.g(new kpa("EXTRA_ID", Long.valueOf(j)), new kpa("EXTRA_TYPE", hdbVar.a)));
    }
}
