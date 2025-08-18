package one.me.login.neuroavatars;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ad0;
import defpackage.afc;
import defpackage.an9;
import defpackage.ap9;
import defpackage.b46;
import defpackage.bc7;
import defpackage.bp9;
import defpackage.bvc;
import defpackage.cp9;
import defpackage.cx5;
import defpackage.d80;
import defpackage.d8e;
import defpackage.dp3;
import defpackage.du7;
import defpackage.dy7;
import defpackage.e8b;
import defpackage.em;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fm;
import defpackage.fp9;
import defpackage.fs;
import defpackage.glc;
import defpackage.gld;
import defpackage.gp9;
import defpackage.hm9;
import defpackage.hob;
import defpackage.hp9;
import defpackage.hwb;
import defpackage.iba;
import defpackage.io9;
import defpackage.ip9;
import defpackage.j47;
import defpackage.je7;
import defpackage.jo9;
import defpackage.jp8;
import defpackage.jp9;
import defpackage.jv5;
import defpackage.khe;
import defpackage.ko9;
import defpackage.kp9;
import defpackage.kpa;
import defpackage.lp9;
import defpackage.lt7;
import defpackage.mo9;
import defpackage.mp9;
import defpackage.nec;
import defpackage.ng3;
import defpackage.np9;
import defpackage.od2;
import defpackage.oec;
import defpackage.om8;
import defpackage.q7c;
import defpackage.ro2;
import defpackage.s36;
import defpackage.s5a;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.w7c;
import defpackage.wb5;
import defpackage.wja;
import defpackage.wp9;
import defpackage.x27;
import defpackage.zn5;
import defpackage.zo9;
import defpackage.zr6;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0011B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lone/me/login/neuroavatars/NeuroAvatarsScreen;", "Lone/me/sdk/arch/Widget;", "", "Lng3;", "Lad0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Lafc;", "registrationData", "Le8b;", "presetAvatars", "(Lafc;Le8b;)V", "", "contactId", "(J)V", "dp9", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class NeuroAvatarsScreen extends Widget implements ng3, ad0 {
    public static final /* synthetic */ bc7[] M0;
    public final je7 A0;
    public final cx5 B0;
    public final bp9 C0;
    public final fs D0;
    public final fs E0;
    public final fs F0;
    public final je7 G0;
    public final ExecutorService H0;
    public final jv5 I0;
    public final np9 J0;
    public final b46 K0;
    public final khe L0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final /* synthetic */ dp3 a;
    public final x27 b;
    public final glc c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public final wb5 y0;
    public final je7 z0;

    static {
        hob hobVar = new hob(NeuroAvatarsScreen.class, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0);
        oec oecVar = nec.a;
        M0 = new bc7[]{hobVar, zr6.e(oecVar, NeuroAvatarsScreen.class, "selectedAvatarView", "getSelectedAvatarView()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0), zr6.f(NeuroAvatarsScreen.class, "collapsibleContainer", "getCollapsibleContainer()Landroid/view/ViewGroup;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "appbarLayout", "getAppbarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "buttonBackground", "getButtonBackground()Landroid/view/View;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "continueBtn", "getContinueBtn()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "tabsShimmer", "getTabsShimmer()Lone/me/login/neuroavatars/NeuroAvatarsTabShimmerView;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "registrationData", "getRegistrationData()Lone/me/login/common/RegistrationData;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "presetAvatars", "getPresetAvatars()Lone/me/login/common/avatars/PresetAvatarsModel;", 0, oecVar), zr6.f(NeuroAvatarsScreen.class, "contactId", "getContactId()Ljava/lang/Long;", 0, oecVar)};
    }

    public NeuroAvatarsScreen(afc afcVar, e8b e8bVar) {
        this(dy7.g(new kpa("registration_data_args", afcVar), new kpa("avatars_args", e8bVar)));
    }

    @Override // defpackage.ad0
    public final void a(String str, RectF rectF, Rect rect) {
        mo9 mo9Var = r0().b;
        mo9Var.getClass();
        j47.T(mo9Var.f, null, null, new jo9(str, rect, mo9Var, rectF, 2, null), 3);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getT0() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.c;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == hwb.oneme_login_neuro_avatars_load_from_gallery_action) {
            du7.c.P1().b(":media-picker/select/photo", null);
            return;
        }
        if (i == hwb.oneme_login_neuro_avatars_take_photo_action) {
            r0().q();
        } else if (i == hwb.oneme_login_neuro_avatars_remove_photo_action) {
            wp9 wp9VarR0 = r0();
            wp9VarR0.c.a(null);
            wp9VarR0.b.i.setValue(null);
        }
    }

    public final fm m0() {
        return (fm) this.s0.T0(this, M0[3]);
    }

    public final RecyclerView n0() {
        return (RecyclerView) this.u0.T0(this, M0[5]);
    }

    public final afc o0() {
        bc7 bc7Var = M0[9];
        return (afc) this.D0.a(this);
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 555) {
            if (i2 == -1) {
                wp9 wp9VarR0 = r0();
                Uri data = intent != null ? intent.getData() : null;
                mo9 mo9Var = wp9VarR0.b;
                mo9Var.getClass();
                j47.T(mo9Var.f, null, null, new io9(mo9Var, data, null), 3);
                return;
            }
            return;
        }
        if (i == 666 && i2 == -1) {
            mo9 mo9Var2 = r0().b;
            mo9Var2.getClass();
            if (intent != null) {
                j47.T(mo9Var2.f, null, null, new ko9(intent, mo9Var2, null), 3);
            } else {
                hm9.p(mo9.class.getName(), "data from ActAvatarCrop is null", null);
                mo9Var2.b();
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setId(hwb.oneme_login_neuro_avatars_root_container);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        v3c.y(new ro2(3, null, 4), frameLayout);
        zo9 zo9Var = new zo9(this, 6);
        CoordinatorLayout coordinatorLayout = Build.VERSION.SDK_INT >= 30 ? new CoordinatorLayout(frameLayout.getContext(), null) : new fp9(frameLayout.getContext(), null);
        zo9Var.invoke(coordinatorLayout);
        frameLayout.addView(coordinatorLayout);
        return frameLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        bp9 bp9Var;
        n0().setAdapter(null);
        n0().s0(this.J0);
        q0().l(this.B0);
        ArrayList arrayList = m0().v0;
        if (arrayList == null || (bp9Var = this.C0) == null) {
            return;
        }
        arrayList.remove(bp9Var);
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((eua) this.z0.getValue()).b(strArr)) {
            r0().q();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        w7c w7cVar = r0().u0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(w7cVar, getViewLifecycleOwner().Q(), fg7Var), new jp9(null, this), 5), getViewLifecycleScope());
        gld gldVar = r0().s0;
        if (gldVar != null) {
            od2.L(new zn5(tu0.g(gldVar, getViewLifecycleOwner().Q(), fg7Var), new kp9(null, this), 5), getViewLifecycleScope());
        }
        od2.L(new zn5(tu0.g(r0().Z, getViewLifecycleOwner().Q(), fg7Var), new lp9(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().w0, getViewLifecycleOwner().Q(), fg7Var), new mp9(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().b.h, getViewLifecycleOwner().Q(), fg7Var), new ip9(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().z0, getViewLifecycleOwner().Q(), fg7Var), new hp9(null, this), 5), getViewLifecycleScope());
        final int i = 0;
        tu0.K((OneMeButton) this.w0.T0(this, M0[7]), 300L, new View.OnClickListener(this) { // from class: yo9
            public final /* synthetic */ NeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NeuroAvatarsScreen neuroAvatarsScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
                        neuroAvatarsScreen.getClass();
                        OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.w0.T0(neuroAvatarsScreen, NeuroAvatarsScreen.M0[7]);
                        oneMeButton.setProgressEnabled(true);
                        oneMeButton.setClickable(false);
                        wp9 wp9VarR0 = neuroAvatarsScreen.r0();
                        wp9VarR0.c.b(((k4d) wp9VarR0.u0.a.getValue()).a);
                        break;
                    default:
                        bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
                        if (neuroAvatarsScreen.o0() != null) {
                            mr0.G(neuroAvatarsScreen);
                            wp9 wp9VarR02 = neuroAvatarsScreen.r0();
                            wp9VarR02.getClass();
                            kl7 kl7VarL = j1e.l();
                            kl7VarL.add(new mg3(hwb.oneme_login_neuro_avatars_load_from_gallery_action, new eqe(v0c.oneme_login_neuro_avatars_load_from_gallery_action), 3, false));
                            kl7VarL.add(new mg3(hwb.oneme_login_neuro_avatars_take_photo_action, new eqe(v0c.oneme_login_neuro_avatars_take_photo_action), 3, false));
                            if (((k4d) wp9VarR02.u0.a.getValue()).a != null) {
                                kl7VarL.add(new mg3(hwb.oneme_login_neuro_avatars_remove_photo_action, new eqe(v0c.oneme_login_neuro_avatars_remove_photo_action), 1, false));
                            }
                            kl7VarL.add(new mg3(hwb.oneme_login_neuro_avatars_cancel_action, new eqe(v0c.oneme_login_neuro_avatars_cancel_action), 2, false));
                            kl7 kl7VarD = j1e.d(kl7VarL);
                            lg3 lg3VarE = wg0.e(v0c.oneme_login_neuro_avatars_bottomsheet_title, 6, null);
                            ListIterator listIterator = kl7VarD.listIterator(0);
                            while (true) {
                                il7 il7Var = (il7) listIterator;
                                if (!il7Var.hasNext()) {
                                    bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                                    ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                                    confirmationBottomSheetE.setTargetController(neuroAvatarsScreen);
                                    uu3 parentController = neuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    foc focVar = parentController instanceof foc ? (foc) parentController : null;
                                    znc zncVarT = focVar != null ? focVar.T() : null;
                                    confirmationBottomSheetE.z0(neuroAvatarsScreen);
                                    if (zncVarT != null) {
                                        coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                                        wg0.l(false, cocVar, true, "BottomSheetWidget");
                                        zncVarT.G(cocVar);
                                        break;
                                    }
                                } else {
                                    lg3VarE.a((mg3) il7Var.next());
                                }
                            }
                        }
                        break;
                }
            }
        });
        q0().a(this.B0);
        m0().a(s36.D(this.C0, m0(), getViewLifecycleOwner()));
        final int i2 = 1;
        tu0.K(p0(), 300L, new View.OnClickListener(this) { // from class: yo9
            public final /* synthetic */ NeuroAvatarsScreen b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                NeuroAvatarsScreen neuroAvatarsScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
                        neuroAvatarsScreen.getClass();
                        OneMeButton oneMeButton = (OneMeButton) neuroAvatarsScreen.w0.T0(neuroAvatarsScreen, NeuroAvatarsScreen.M0[7]);
                        oneMeButton.setProgressEnabled(true);
                        oneMeButton.setClickable(false);
                        wp9 wp9VarR0 = neuroAvatarsScreen.r0();
                        wp9VarR0.c.b(((k4d) wp9VarR0.u0.a.getValue()).a);
                        break;
                    default:
                        bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
                        if (neuroAvatarsScreen.o0() != null) {
                            mr0.G(neuroAvatarsScreen);
                            wp9 wp9VarR02 = neuroAvatarsScreen.r0();
                            wp9VarR02.getClass();
                            kl7 kl7VarL = j1e.l();
                            kl7VarL.add(new mg3(hwb.oneme_login_neuro_avatars_load_from_gallery_action, new eqe(v0c.oneme_login_neuro_avatars_load_from_gallery_action), 3, false));
                            kl7VarL.add(new mg3(hwb.oneme_login_neuro_avatars_take_photo_action, new eqe(v0c.oneme_login_neuro_avatars_take_photo_action), 3, false));
                            if (((k4d) wp9VarR02.u0.a.getValue()).a != null) {
                                kl7VarL.add(new mg3(hwb.oneme_login_neuro_avatars_remove_photo_action, new eqe(v0c.oneme_login_neuro_avatars_remove_photo_action), 1, false));
                            }
                            kl7VarL.add(new mg3(hwb.oneme_login_neuro_avatars_cancel_action, new eqe(v0c.oneme_login_neuro_avatars_cancel_action), 2, false));
                            kl7 kl7VarD = j1e.d(kl7VarL);
                            lg3 lg3VarE = wg0.e(v0c.oneme_login_neuro_avatars_bottomsheet_title, 6, null);
                            ListIterator listIterator = kl7VarD.listIterator(0);
                            while (true) {
                                il7 il7Var = (il7) listIterator;
                                if (!il7Var.hasNext()) {
                                    bc7[] bc7VarArr3 = BottomSheetWidget.x0;
                                    ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                                    confirmationBottomSheetE.setTargetController(neuroAvatarsScreen);
                                    uu3 parentController = neuroAvatarsScreen;
                                    while (parentController.getParentController() != null) {
                                        parentController = parentController.getParentController();
                                    }
                                    foc focVar = parentController instanceof foc ? (foc) parentController : null;
                                    znc zncVarT = focVar != null ? focVar.T() : null;
                                    confirmationBottomSheetE.z0(neuroAvatarsScreen);
                                    if (zncVarT != null) {
                                        coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                                        wg0.l(false, cocVar, true, "BottomSheetWidget");
                                        zncVarT.G(cocVar);
                                        break;
                                    }
                                } else {
                                    lg3VarE.a((mg3) il7Var.next());
                                }
                            }
                        }
                        break;
                }
            }
        });
        jv5 jv5Var = this.I0;
        jv5Var.z(new d8e(this, 1, jv5Var));
    }

    public final s5a p0() {
        return (s5a) this.Y.T0(this, M0[1]);
    }

    public final wja q0() {
        return (wja) this.X.T0(this, M0[0]);
    }

    public final wp9 r0() {
        return (wp9) this.G0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [bp9] */
    public NeuroAvatarsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new dp3();
        this.b = new x27(3, null);
        this.c = new glc(new ap9(this, 2), null, 6);
        lt7 lt7Var = lt7.a;
        this.o = lt7Var.getAccessor().d(d80.class);
        this.X = viewBinding(hwb.oneme_login_neuro_avatars_tabs);
        this.Y = viewBinding(hwb.oneme_login_neuro_avatars_avatar);
        this.Z = viewBinding(hwb.oneme_login_neuro_avatars_collapsible);
        this.s0 = viewBinding(hwb.oneme_login_neuro_avatars_appbar);
        this.t0 = viewBinding(hwb.oneme_login_neuro_avatars_toolbar);
        this.u0 = viewBinding(hwb.oneme_login_neuro_avatars_recycler_view);
        this.v0 = viewBinding(hwb.oneme_login_neuro_avatars_button_background);
        this.w0 = viewBinding(hwb.oneme_login_neuro_avatars_continue_btn);
        this.x0 = viewBinding(hwb.oneme_login_neuro_avatars_tabs_shimmer);
        this.y0 = new wb5();
        this.z0 = lt7Var.getAccessor().d(eua.class);
        this.A0 = lt7Var.getAccessor().d(an9.class);
        this.B0 = new cx5(1, this);
        this.C0 = new em() { // from class: bp9
            @Override // defpackage.cm
            public final void V(fm fmVar, int i) {
                bc7[] bc7VarArr = NeuroAvatarsScreen.M0;
                NeuroAvatarsScreen neuroAvatarsScreen = this.a;
                float interpolation = neuroAvatarsScreen.y0.getInterpolation(Math.abs(i) / neuroAvatarsScreen.m0().getTotalScrollRange());
                bc7[] bc7VarArr2 = NeuroAvatarsScreen.M0;
                ((ViewGroup) neuroAvatarsScreen.Z.T0(neuroAvatarsScreen, bc7VarArr2[2])).setAlpha(1.0f - interpolation);
                ((cla) neuroAvatarsScreen.t0.T0(neuroAvatarsScreen, bc7VarArr2[4])).setTitleAlpha(interpolation);
            }
        };
        this.D0 = new fs(afc.class, "registration_data_args");
        this.E0 = new fs(e8b.class, "avatars_args");
        this.F0 = new fs(Long.class, "contact_id_args");
        this.G0 = createViewModelLazy(wp9.class, new jp8(5, new ap9(this, 3)));
        ExecutorService executorServiceA = ((iba) lt7Var.getAccessor().c(iba.class)).a();
        this.H0 = executorServiceA;
        jv5 jv5Var = new jv5(executorServiceA, new gp9(r0()), 9);
        this.I0 = jv5Var;
        this.J0 = new np9(jv5Var, new om8(1, r0(), wp9.class, "onNewItemInFocus", "onNewItemInFocus(Lone/me/login/common/avatars/NeuroAvatarModel;)V", 0, 8));
        this.K0 = new b46();
        this.L0 = new khe(new ap9(this, 4));
        od2.L(new zn5(r0().x0, new cp9(null, this), 5), getLifecycleScope());
    }

    public NeuroAvatarsScreen(long j) {
        this(dy7.g(new kpa("contact_id_args", Long.valueOf(j))));
    }
}
