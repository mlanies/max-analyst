package one.me.profile;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ad0;
import defpackage.amb;
import defpackage.an9;
import defpackage.au1;
import defpackage.bc7;
import defpackage.bt1;
import defpackage.bvc;
import defpackage.c3;
import defpackage.cla;
import defpackage.clb;
import defpackage.cnb;
import defpackage.cpc;
import defpackage.d74;
import defpackage.dlb;
import defpackage.dpc;
import defpackage.dy7;
import defpackage.elb;
import defpackage.eqe;
import defpackage.eua;
import defpackage.fg7;
import defpackage.fkb;
import defpackage.flb;
import defpackage.fm;
import defpackage.glb;
import defpackage.glc;
import defpackage.hdb;
import defpackage.hlb;
import defpackage.hob;
import defpackage.ilb;
import defpackage.j31;
import defpackage.j47;
import defpackage.je7;
import defpackage.jlb;
import defpackage.jp8;
import defpackage.ju0;
import defpackage.kia;
import defpackage.kpa;
import defpackage.lab;
import defpackage.lk7;
import defpackage.m58;
import defpackage.mmf;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nmb;
import defpackage.o50;
import defpackage.od2;
import defpackage.oec;
import defpackage.omf;
import defpackage.plb;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.qq0;
import defpackage.qqe;
import defpackage.rg1;
import defpackage.s36;
import defpackage.t03;
import defpackage.tmb;
import defpackage.tpa;
import defpackage.tu0;
import defpackage.umb;
import defpackage.v3c;
import defpackage.vc1;
import defpackage.vq0;
import defpackage.w9a;
import defpackage.w9e;
import defpackage.wb5;
import defpackage.wea;
import defpackage.wha;
import defpackage.woc;
import defpackage.wu7;
import defpackage.x27;
import defpackage.x53;
import defpackage.xcb;
import defpackage.xt3;
import defpackage.yea;
import defpackage.zja;
import defpackage.zlb;
import defpackage.zmf;
import defpackage.zn5;
import defpackage.zr6;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\b\u0010\u0010¨\u0006\u0011"}, d2 = {"Lone/me/profile/ProfileScreen;", "Lone/me/sdk/arch/Widget;", "Lplb;", "Lxt3;", "Lng3;", "Lad0;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lhdb;", "type", "", "isOpenedFromDialog", "(JLhdb;Z)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileScreen extends Widget implements plb, xt3, ng3, ad0 {
    public static final /* synthetic */ bc7[] D0;
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final q7c X;
    public final q7c Y;
    public final q7c Z;
    public final glc a;
    public final x27 b;
    public final je7 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public final q7c y0;
    public final q7c z0;

    static {
        hob hobVar = new hob(ProfileScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0);
        oec oecVar = nec.a;
        D0 = new bc7[]{hobVar, zr6.e(oecVar, ProfileScreen.class, "recyclerView", "getRecyclerView()Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", 0), zr6.f(ProfileScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(ProfileScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0, oecVar), zr6.f(ProfileScreen.class, "avatar", "getAvatar()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, oecVar), zr6.f(ProfileScreen.class, "expandedTitle", "getExpandedTitle()Landroid/widget/TextView;", 0, oecVar), zr6.f(ProfileScreen.class, "expandedSubtitle", "getExpandedSubtitle()Landroid/widget/TextView;", 0, oecVar), zr6.f(ProfileScreen.class, "linkView", "getLinkView()Landroidx/appcompat/widget/AppCompatTextView;", 0, oecVar), zr6.f(ProfileScreen.class, "dotDivider", "getDotDivider()Landroidx/appcompat/widget/AppCompatTextView;", 0, oecVar), zr6.f(ProfileScreen.class, "phoneNumberView", "getPhoneNumberView()Lone/me/sdk/sections/ui/recyclerview/settingsitem/SettingsItemContent;", 0, oecVar), zr6.f(ProfileScreen.class, "linkButtonView", "getLinkButtonView()Landroid/widget/TextView;", 0, oecVar), zr6.f(ProfileScreen.class, "membersListRouter", "getMembersListRouter()Lone/me/sdk/arch/navigation/ChildSlotRouter;", 0, oecVar)};
    }

    public ProfileScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new glc(new lab(20), null, 6);
        this.b = x27.d;
        this.c = createViewModelLazy(cnb.class, new jp8(21, new zja(bundle, 8, this)));
        this.o = tu0.r(3, new clb(this, 1));
        this.X = viewBinding(wea.d1);
        this.Y = viewBinding(wea.l1);
        this.Z = viewBinding(wea.k1);
        this.s0 = viewBinding(wea.f1);
        this.t0 = viewBinding(wea.e1);
        this.u0 = viewBinding(wea.i1);
        this.v0 = viewBinding(wea.h1);
        this.w0 = viewBinding(wea.U);
        this.x0 = viewBinding(wea.E);
        this.y0 = viewBinding(wea.c1);
        viewBinding(wea.T);
        this.z0 = childSlotRouter(wea.j1);
        xcb xcbVar = xcb.a;
        this.A0 = xcbVar.getAccessor().d(eua.class);
        this.B0 = xcbVar.getAccessor().d(an9.class);
        this.C0 = xcbVar.getAccessor().d(bt1.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m0(one.me.profile.ProfileScreen r3, defpackage.cla r4, boolean r5) {
        /*
            r3.getClass()
            android.widget.TextView r3 = r4.getTitle()
            float r3 = defpackage.qqe.e(r3)
            int r3 = defpackage.i24.I(r3)
            r0 = 0
            if (r5 == 0) goto L23
            android.widget.TextView r1 = r4.getTitle()
            ecf r1 = defpackage.qqe.a(r1)
            if (r1 == 0) goto L1f
            int r1 = r1.a
            goto L20
        L1f:
            r1 = r0
        L20:
            if (r1 != r3) goto L23
            goto L4c
        L23:
            if (r5 == 0) goto L44
            android.widget.TextView r5 = r4.getTitle()
            ecf r5 = defpackage.qqe.a(r5)
            if (r5 == 0) goto L31
            int r0 = r5.a
        L31:
            if (r0 == r3) goto L44
            ecf r5 = new ecf
            android.content.Context r0 = r4.getContext()
            ww9 r1 = new ww9
            r2 = 27
            r1.<init>(r2)
            r5.<init>(r0, r3, r1)
            goto L45
        L44:
            r5 = 0
        L45:
            android.widget.TextView r3 = r4.getTitle()
            defpackage.qqe.d(r3, r5)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.ProfileScreen.m0(one.me.profile.ProfileScreen, cla, boolean):void");
    }

    @Override // defpackage.ad0
    public final void a(String str, RectF rectF, Rect rect) {
        cnb cnbVarR0 = r0();
        j47.T(cnbVarR0.a, ((w9a) cnbVarR0.u()).b(), null, new tmb(cnbVarR0, str, rectF, null), 2);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getT0() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb  */
    @Override // defpackage.ng3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(int r6, android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.profile.ProfileScreen.h(int, android.os.Bundle):void");
    }

    public final rg1 n0() {
        return (rg1) this.o.getValue();
    }

    public final TextView o0() {
        return (TextView) this.u0.T0(this, D0[5]);
    }

    @Override // defpackage.uu3
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 333) {
            if (i2 == -1) {
                cnb cnbVarR0 = r0();
                j47.T(cnbVarR0.a, ((w9a) cnbVarR0.u()).b(), null, new nmb(cnbVarR0, intent != null ? intent.getData() : null, null), 2);
                return;
            }
            return;
        }
        if (i == 666 && i2 == -1) {
            if (intent == null) {
                r0().D();
            } else {
                cnb cnbVarR02 = r0();
                j47.T(cnbVarR02.a, ((w9a) cnbVarR02.u()).b(), null, new umb(intent, cnbVarR02, null), 2);
            }
        }
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new qq0(10, this));
        } else if (qqe.c(p0().getTitle())) {
            m0(this, p0(), true);
        }
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dlb dlbVar = new dlb(this, 2);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(wea.g1);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        dlbVar.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (!n0().b(i, strArr, iArr) && i == 158 && ((eua) this.A0.getValue()).b(strArr)) {
            r0().y();
        }
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        int i = 0;
        int i2 = 4;
        int i3 = 3;
        Continuation continuation = null;
        j47.T(getViewLifecycleScope(), null, null, new flb(null, this), 3);
        v3c.y(new c3(this, continuation, 26), view);
        EndlessRecyclerView2 endlessRecyclerView2Q0 = q0();
        d74 d74Var = new d74(new vq0(i2, this), 17, new Rect(endlessRecyclerView2Q0.getPaddingLeft(), endlessRecyclerView2Q0.getPaddingTop(), endlessRecyclerView2Q0.getPaddingRight(), endlessRecyclerView2Q0.getPaddingBottom()));
        WeakHashMap weakHashMap = zmf.a;
        omf.u(endlessRecyclerView2Q0, d74Var);
        if (endlessRecyclerView2Q0.G0) {
            mmf.c(endlessRecyclerView2Q0);
        } else {
            endlessRecyclerView2Q0.addOnAttachStateChangeListener(new o50(endlessRecyclerView2Q0, i2, endlessRecyclerView2Q0));
        }
        wb5 wb5Var = new wb5();
        bc7[] bc7VarArr = D0;
        bc7 bc7Var = bc7VarArr[0];
        q7c q7cVar = this.X;
        ((fm) q7cVar.T0(this, bc7Var)).a(s36.D(new vc1(wb5Var, this, i3), (fm) q7cVar.T0(this, bc7VarArr[0]), getViewLifecycleOwner()));
        ((AppCompatTextView) this.w0.T0(this, bc7VarArr[7])).setOnClickListener(new elb(i, this));
        t03 t03Var = new t03(r0().N0, 11);
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(t03Var, getViewLifecycleOwner().Q(), fg7Var), new glb(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(od2.x(new j31(r0().J0, r0().L0, new wu7(i3, continuation, i3), 4)), getViewLifecycleOwner().Q(), fg7Var), new hlb(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(new m58(r0().z0, 25), getViewLifecycleOwner().Q(), fg7Var), new ilb(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(r0().A0, getViewLifecycleOwner().Q(), fg7Var), new jlb(null, this), 5), getViewLifecycleScope());
    }

    public final cla p0() {
        return (cla) this.Z.T0(this, D0[2]);
    }

    public final EndlessRecyclerView2 q0() {
        return (EndlessRecyclerView2) this.Y.T0(this, D0[1]);
    }

    public final cnb r0() {
        return (cnb) this.c.getValue();
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        String string;
        lk7 lk7Var;
        String string2;
        lk7 lk7Var2;
        eqe eqeVar;
        if (i == wea.Y0) {
            Context context = getContext();
            cnb cnbVarR0 = r0();
            String strO = cnbVarR0.O0.o();
            if (strO == null) {
                strO = "";
            }
            pnf.o(cnbVarR0.z0, new zlb(new eqe(yea.H0), Integer.valueOf(woc.u)));
            tpa.o(context, "+" + ((Object) strO));
            return;
        }
        if (i == wea.b1) {
            cnb cnbVarR02 = r0();
            String strO2 = cnbVarR02.O0.o();
            if (strO2 == null) {
                return;
            }
            pnf.o(cnbVarR02.A0, new fkb("+".concat(strO2)));
            return;
        }
        if (i == wea.a1) {
            r0().w(false);
            return;
        }
        if (i == wea.Z0) {
            r0().w(true);
            return;
        }
        if (i == wea.S) {
            tpa.o(getContext(), r0().r());
            return;
        }
        if (i == wea.s0) {
            if (bundle != null) {
                long j = bundle.getLong("profile:participant_id_for_action");
                cnb cnbVarR03 = r0();
                amb ambVarZ = cnbVarR03.O0.z(j);
                if (ambVarZ == null) {
                    return;
                }
                pnf.o(cnbVarR03.z0, ambVarZ);
                return;
            }
            return;
        }
        if (i == cpc.f || i == cpc.e || i == cpc.g || i == cpc.h) {
            if (bundle == null || (string = bundle.getString("profile:contextmenu:link")) == null || (lk7Var = (lk7) x53.j0(bundle.getInt("profile:contextmenu:link_type", -1), lk7.s0)) == null) {
                return;
            }
            r0().x(4, string, lk7Var);
            r0().v(string);
            return;
        }
        if ((i != cpc.b && i != cpc.a && i != cpc.c && i != cpc.d) || bundle == null || (string2 = bundle.getString("profile:contextmenu:link")) == null || (lk7Var2 = (lk7) x53.j0(bundle.getInt("profile:contextmenu:link_type", -1), lk7.s0)) == null) {
            return;
        }
        r0().x(3, string2, lk7Var2);
        tpa.o(getContext(), ju0.B(string2) ? w9e.K0(string2, "mailto:") : ju0.C(string2) ? w9e.K0(string2, "tel:") : string2);
        if (tpa.s()) {
            int iS = au1.s(ju0.B(string2) ? 3 : ju0.C(string2) ? 2 : 1);
            if (iS == 0) {
                eqeVar = lk7Var2 == lk7.X ? new eqe(yea.t1) : new eqe(dpc.k);
            } else if (iS == 1) {
                eqeVar = new eqe(dpc.n);
            } else {
                if (iS != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                eqeVar = new eqe(dpc.l);
            }
            wha whaVar = new wha(this);
            whaVar.g(eqeVar);
            whaVar.e(new kia(woc.s));
            whaVar.i();
        }
    }

    public ProfileScreen(long j, hdb hdbVar, boolean z) {
        this(dy7.g(new kpa("profile:id", Long.valueOf(j)), new kpa("profile:id_type", hdbVar), new kpa("profile:opened_from_dialog", Boolean.valueOf(z))));
    }
}
