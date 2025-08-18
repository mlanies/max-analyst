package one.me.profileedit;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.a3g;
import defpackage.ad0;
import defpackage.an9;
import defpackage.bc7;
import defpackage.bgb;
import defpackage.bvc;
import defpackage.cgb;
import defpackage.cla;
import defpackage.dgb;
import defpackage.dy7;
import defpackage.egb;
import defpackage.eqe;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fgb;
import defpackage.fm;
import defpackage.g43;
import defpackage.gfb;
import defpackage.glc;
import defpackage.gv4;
import defpackage.hm9;
import defpackage.hob;
import defpackage.iba;
import defpackage.igb;
import defpackage.j47;
import defpackage.je7;
import defpackage.jp8;
import defpackage.jv4;
import defpackage.k56;
import defpackage.kpa;
import defpackage.mg3;
import defpackage.mr0;
import defpackage.neb;
import defpackage.nec;
import defpackage.ng3;
import defpackage.od2;
import defpackage.oec;
import defpackage.ofb;
import defpackage.ogb;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.qfb;
import defpackage.qgb;
import defpackage.qm0;
import defpackage.reb;
import defpackage.rfb;
import defpackage.rgb;
import defpackage.s35;
import defpackage.s36;
import defpackage.sea;
import defpackage.t03;
import defpackage.tu0;
import defpackage.v3c;
import defpackage.vc1;
import defpackage.vea;
import defpackage.vgb;
import defpackage.w9a;
import defpackage.wb5;
import defpackage.wg0;
import defpackage.x27;
import defpackage.y53;
import defpackage.zfb;
import defpackage.zja;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/profileedit/ProfileEditScreen;", "Lone/me/sdk/arch/Widget;", "Ligb;", "Lng3;", "Lad0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lreb;", "type", "(JLreb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileEditScreen extends Widget implements igb, ng3, ad0 {
    public static final /* synthetic */ bc7[] y0;
    public final a3g X;
    public final q7c Y;
    public final q7c Z;
    public final long a;
    public final glc b;
    public final x27 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final je7 v0;
    public final je7 w0;
    public final qm0 x0;

    static {
        hob hobVar = new hob(ProfileEditScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0);
        oec oecVar = nec.a;
        y0 = new bc7[]{hobVar, zr6.e(oecVar, ProfileEditScreen.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0), zr6.f(ProfileEditScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(ProfileEditScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0, oecVar), zr6.f(ProfileEditScreen.class, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, oecVar)};
    }

    public ProfileEditScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = bundle.getLong("profile:id");
        final int i = 0;
        this.b = new glc(new k56(this) { // from class: yfb
            public final /* synthetic */ ProfileEditScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ProfileEditScreen profileEditScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = ProfileEditScreen.y0;
                        return profileEditScreen.a == ((hyc) ((q33) neb.a.getAccessor().d(q33.class).getValue())).t() ? wuc.SETTINGS_PROFILE_EDITING : wuc.CHAT_INFO_EDITING;
                    default:
                        bc7[] bc7VarArr2 = ProfileEditScreen.y0;
                        OneMeButton oneMeButton = new OneMeButton(profileEditScreen.getContext(), null);
                        oneMeButton.setId(sea.d0);
                        oneMeButton.setSize(c7a.c);
                        oneMeButton.setMode(b7a.a);
                        oneMeButton.setAppearance(z6a.o);
                        rw3 rw3Var = new rw3(-1, -2);
                        rw3Var.c = 80;
                        float f = 16;
                        rw3Var.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(12 * fk4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(rw3Var);
                        oneMeButton.setText(vea.V);
                        tu0.K(oneMeButton, 300L, new agb(profileEditScreen, 1));
                        return oneMeButton;
                }
            }
        }, null, 6);
        this.c = x27.d;
        this.o = createViewModelLazy(vgb.class, new jp8(18, new zja(this, 5, bundle)));
        neb nebVar = neb.a;
        this.X = new a3g(((iba) nebVar.getAccessor().c(iba.class)).a(), this, 10);
        this.Y = viewBinding(sea.U);
        this.Z = viewBinding(sea.r0);
        this.s0 = viewBinding(sea.q0);
        this.t0 = viewBinding(sea.b0);
        this.u0 = viewBinding(sea.V);
        this.v0 = nebVar.getAccessor().d(eua.class);
        this.w0 = nebVar.getAccessor().d(an9.class);
        od2.L(new zn5(new t03(n0().t0, 11), new bgb(this, null), 5), getLifecycleScope());
        od2.L(tu0.g(new zn5(new t03(n0().w0, 11), new cgb(this, null), 5), this.lifecycleOwner.Q(), fg7.X), getLifecycleScope());
        od2.L(new zn5(n0().x0, new dgb(this, null), 5), getLifecycleScope());
        final int i2 = 1;
        this.x0 = binding(new k56(this) { // from class: yfb
            public final /* synthetic */ ProfileEditScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ProfileEditScreen profileEditScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = ProfileEditScreen.y0;
                        return profileEditScreen.a == ((hyc) ((q33) neb.a.getAccessor().d(q33.class).getValue())).t() ? wuc.SETTINGS_PROFILE_EDITING : wuc.CHAT_INFO_EDITING;
                    default:
                        bc7[] bc7VarArr2 = ProfileEditScreen.y0;
                        OneMeButton oneMeButton = new OneMeButton(profileEditScreen.getContext(), null);
                        oneMeButton.setId(sea.d0);
                        oneMeButton.setSize(c7a.c);
                        oneMeButton.setMode(b7a.a);
                        oneMeButton.setAppearance(z6a.o);
                        rw3 rw3Var = new rw3(-1, -2);
                        rw3Var.c = 80;
                        float f = 16;
                        rw3Var.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(12 * fk4.d().getDisplayMetrics().density));
                        oneMeButton.setLayoutParams(rw3Var);
                        oneMeButton.setText(vea.V);
                        tu0.K(oneMeButton, 300L, new agb(profileEditScreen, 1));
                        return oneMeButton;
                }
            }
        });
    }

    @Override // defpackage.ad0
    public final void a(String str, RectF rectF, Rect rect) {
        vgb vgbVarN0 = n0();
        j47.T(vgbVarN0.a, ((w9a) vgbVarN0.q()).b(), null, new qgb(vgbVarN0, str, rectF, null), 2);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getC() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.b;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        vgb vgbVarN0 = n0();
        vgbVarN0.getClass();
        int i2 = sea.d0;
        s35 s35Var = vgbVarN0.w0;
        if (i == i2) {
            pnf.o(s35Var, ofb.b);
            return;
        }
        if (i == sea.c0) {
            pnf.o(s35Var, g43.b);
            return;
        }
        if (i == sea.a0) {
            pnf.o(s35Var, qfb.b);
            return;
        }
        int i3 = sea.Y;
        gv4 gv4Var = vgbVarN0.b;
        if (i == i3) {
            gfb gfbVar = gfb.c;
            long jE = gv4Var.e();
            gfbVar.getClass();
            wg0.k(":neuro-avatars?id=" + jE, s35Var);
            return;
        }
        if (i == sea.Z) {
            vgbVarN0.r();
            return;
        }
        if (i == sea.X) {
            gv4Var.j();
        } else {
            if (i == sea.e || i == sea.g0 || i == sea.W) {
                return;
            }
            gv4Var.g(i);
        }
    }

    @Override // defpackage.uu3
    public final boolean handleBack() {
        mr0.G(this);
        vgb vgbVarN0 = n0();
        gv4 gv4Var = vgbVarN0.b;
        jv4 jv4Var = (jv4) gv4Var.i.getValue();
        Boolean bool = null;
        if (jv4Var != null && jv4Var.a((jv4) gv4Var.j.getValue())) {
            pnf.o(vgbVarN0.w0, new rfb(new eqe(vea.U), null, y53.M(new mg3(sea.d0, new eqe(vea.V), 3, false), new mg3(sea.c0, new eqe(vea.T), 2, false))));
            bool = Boolean.TRUE;
        }
        return bool != null ? bool.booleanValue() : super.handleBack();
    }

    public final cla m0() {
        return (cla) this.s0.T0(this, y0[2]);
    }

    public final vgb n0() {
        return (vgb) this.o.getValue();
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333) {
            if (i2 == -1) {
                vgb vgbVarN0 = n0();
                j47.T(vgbVarN0.a, ((w9a) vgbVarN0.q()).b(), null, new ogb(vgbVarN0, intent != null ? intent.getData() : null, null), 2);
                return;
            }
            return;
        }
        if (i == 666 && i2 == -1) {
            if (intent == null) {
                hm9.p(ProfileEditScreen.class.getName(), "data from ActAvatarCrop is null", null);
                n0().t();
            } else {
                vgb vgbVarN02 = n0();
                j47.T(vgbVarN02.a, ((w9a) vgbVarN02.q()).b(), null, new rgb(intent, vgbVarN02, null), 2);
            }
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        zfb zfbVar = new zfb(this, 1);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(sea.a);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        v3c.y(new egb(3, null, 0), coordinatorLayout);
        zfbVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((eua) this.v0.getValue()).b(strArr)) {
            n0().r();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        wb5 wb5Var = new wb5();
        bc7[] bc7VarArr = y0;
        bc7 bc7Var = bc7VarArr[0];
        q7c q7cVar = this.Y;
        ((fm) q7cVar.T0(this, bc7Var)).a(s36.D(new vc1(wb5Var, this, 2), (fm) q7cVar.T0(this, bc7VarArr[0]), getViewLifecycleOwner()));
        od2.L(new zn5(new t03(n0().v0, 11), new fgb(this, view, null), 5), getViewLifecycleScope());
    }

    public ProfileEditScreen(long j, reb rebVar) {
        this(dy7.g(new kpa("profile:id", Long.valueOf(j)), new kpa("profile:type", rebVar)));
    }
}
