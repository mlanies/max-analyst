package one.me.calllist.ui.callinfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.aof;
import defpackage.b46;
import defpackage.bc7;
import defpackage.bkg;
import defpackage.bt1;
import defpackage.bvc;
import defpackage.da1;
import defpackage.dd1;
import defpackage.fg7;
import defpackage.fm;
import defpackage.glc;
import defpackage.hob;
import defpackage.iba;
import defpackage.je7;
import defpackage.k11;
import defpackage.khe;
import defpackage.kke;
import defpackage.nec;
import defpackage.ng3;
import defpackage.od2;
import defpackage.oec;
import defpackage.q7c;
import defpackage.r7a;
import defpackage.rg1;
import defpackage.s;
import defpackage.s35;
import defpackage.s36;
import defpackage.s71;
import defpackage.tc1;
import defpackage.tu0;
import defpackage.uc1;
import defpackage.vc1;
import defpackage.wb5;
import defpackage.wc1;
import defpackage.x2;
import defpackage.x27;
import defpackage.xc1;
import defpackage.z84;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000fB\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0005\u0010\u000e¨\u0006\u0010"}, d2 = {"Lone/me/calllist/ui/callinfo/CallLinkInfoScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "", "link", "title", "", "isLinkCall", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Z)V", "b46", "call-list_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class CallLinkInfoScreen extends Widget implements ng3 {
    public static final b46 B0;
    public static final /* synthetic */ bc7[] C0;
    public final glc A0;
    public final je7 X;
    public final je7 Y;
    public final q7c Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final khe o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public aof y0;
    public final da1 z0;

    static {
        hob hobVar = new hob(CallLinkInfoScreen.class, "collapsibleContainerLinearLayout", "getCollapsibleContainerLinearLayout()Landroid/widget/LinearLayout;", 0);
        oec oecVar = nec.a;
        C0 = new bc7[]{hobVar, zr6.e(oecVar, CallLinkInfoScreen.class, "appBarLayout", "getAppBarLayout()Lcom/google/android/material/appbar/AppBarLayout;", 0), zr6.f(CallLinkInfoScreen.class, "oneMeToolbar", "getOneMeToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(CallLinkInfoScreen.class, "titleTextView", "getTitleTextView()Landroid/widget/TextView;", 0, oecVar), zr6.f(CallLinkInfoScreen.class, "linkTextView", "getLinkTextView()Landroid/widget/TextView;", 0, oecVar), zr6.f(CallLinkInfoScreen.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(CallLinkInfoScreen.class, "icon", "getIcon()Lone/me/sdk/uikit/common/avatar/OneMeAvatarView;", 0, oecVar)};
        B0 = new b46();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CallLinkInfoScreen() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig */
    public final x27 getA() {
        x27 x27Var = x27.c;
        return x27.d;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.A0;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        ((rg1) this.Y.getValue()).g(i);
    }

    public final bt1 m0() {
        return (bt1) this.b.getValue();
    }

    public final dd1 n0() {
        return (dd1) this.c.getValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        tc1 tc1Var = new tc1(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), null);
        coordinatorLayout.setId(r7a.q);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        tc1Var.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.y0 = null;
    }

    @Override // defpackage.uu3
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        ((rg1) this.Y.getValue()).b(i, strArr, iArr);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        wb5 wb5Var = new wb5();
        bc7[] bc7VarArr = C0;
        bc7 bc7Var = bc7VarArr[1];
        q7c q7cVar = this.s0;
        ((fm) q7cVar.T0(this, bc7Var)).a(s36.D(new vc1(wb5Var, this, 0), (fm) q7cVar.T0(this, bc7VarArr[1]), getViewLifecycleOwner()));
        s35 s35Var = n0().v0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new wc1(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(n0().u0, getViewLifecycleOwner().Q(), fg7Var), new xc1(null, this), 5), getViewLifecycleScope());
    }

    public CallLinkInfoScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        s71 s71Var = s71.a;
        this.a = s71Var.getAccessor().d(kke.class);
        this.b = s71Var.getAccessor().d(bt1.class);
        this.c = createViewModelLazy(dd1.class, new s(16, new x2(bundle, this, 11)));
        this.o = new khe(new uc1(this, 1));
        this.X = tu0.r(3, new uc1(this, 2));
        this.Y = tu0.r(3, new uc1(this, 3));
        this.Z = viewBinding(r7a.p);
        this.s0 = viewBinding(r7a.n);
        this.t0 = viewBinding(r7a.t);
        this.u0 = viewBinding(r7a.u);
        this.v0 = viewBinding(r7a.s);
        this.w0 = viewBinding(r7a.o);
        this.x0 = viewBinding(r7a.r);
        this.z0 = new da1(new bkg(5, this), ((iba) s71Var.getAccessor().c(iba.class)).a());
        this.A0 = new glc(new k11(16), null, 6);
    }

    public /* synthetic */ CallLinkInfoScreen(Bundle bundle, int i, z84 z84Var) {
        this((i & 1) != 0 ? null : bundle);
    }

    public CallLinkInfoScreen(Long l, String str, String str2, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putString("link_param", str);
        bundle.putString("title_param", str2);
        if (l != null) {
            bundle.putLong("id_param", l.longValue());
        }
        bundle.putBoolean("is_link_call", z);
        this(bundle);
    }
}
