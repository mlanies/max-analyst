package one.me.profile.screens.addadmins;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.bc7;
import defpackage.bha;
import defpackage.bkg;
import defpackage.bvc;
import defpackage.cla;
import defpackage.dm;
import defpackage.dy7;
import defpackage.e9;
import defpackage.ey8;
import defpackage.f9;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fm9;
import defpackage.fs;
import defpackage.g9;
import defpackage.glc;
import defpackage.h9;
import defpackage.hob;
import defpackage.je7;
import defpackage.khe;
import defpackage.kpa;
import defpackage.l;
import defpackage.lka;
import defpackage.m;
import defpackage.mr0;
import defpackage.nec;
import defpackage.od2;
import defpackage.oec;
import defpackage.pka;
import defpackage.q7c;
import defpackage.qe5;
import defpackage.ro8;
import defpackage.s;
import defpackage.se5;
import defpackage.tu0;
import defpackage.wea;
import defpackage.wja;
import defpackage.x27;
import defpackage.x5;
import defpackage.xcb;
import defpackage.xka;
import defpackage.xu3;
import defpackage.y53;
import defpackage.yea;
import defpackage.zn5;
import defpackage.zr6;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/addadmins/AddChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Lbha;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", ApiProtocol.PARAM_CHAT_ID, "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class AddChatAdminsScreen extends Widget implements bha {
    public static final /* synthetic */ bc7[] x0;
    public final je7 X;
    public final q7c Y;
    public final q7c Z;
    public final glc a;
    public final x27 b;
    public final fs c;
    public final String o;
    public final q7c s0;
    public final boolean t0;
    public final bkg u0;
    public final e9 v0;
    public xu3 w0;

    static {
        hob hobVar = new hob(AddChatAdminsScreen.class, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        oec oecVar = nec.a;
        x0 = new bc7[]{hobVar, zr6.e(oecVar, AddChatAdminsScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), zr6.f(AddChatAdminsScreen.class, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0, oecVar), zr6.f(AddChatAdminsScreen.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, oecVar)};
    }

    public AddChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new glc(new m(1), null, 6);
        this.b = x27.d;
        this.c = new fs(Long.class, "profile:add_admins:chat_id");
        String strI = ey8.i(m0(), "profile:add_admins:{", "}");
        this.o = strI;
        this.X = createViewModelLazy(ro8.class, new s(2, new x5(2, this)));
        this.Y = viewBinding(wea.f);
        this.Z = viewBinding(wea.e);
        this.s0 = viewBinding(wea.g);
        boolean zT = ((se5) ((qe5) ((khe) xcb.a.g()).getValue())).t();
        this.t0 = zT;
        List listSingletonList = zT ? Collections.singletonList(new g9(wea.c, yea.O, 1)) : y53.M(new g9(wea.c, yea.O, 1), new g9(wea.d, yea.P, 2));
        this.u0 = new bkg(1, listSingletonList);
        this.v0 = new e9(m0(), strI, listSingletonList, this);
    }

    @Override // defpackage.bha
    public final void I(CharSequence charSequence) {
        ((ro8) this.X.getValue()).u(String.valueOf(charSequence));
    }

    @Override // defpackage.bha
    public final void U() {
        ((ro8) this.X.getValue()).u(null);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getY() {
        return this.o;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.a;
    }

    public final long m0() {
        bc7 bc7Var = x0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setId(wea.f);
        claVar.setTitle(yea.Q);
        claVar.setLeftActions(new lka(new l(2, this)));
        claVar.setRightActions(new pka(null, new xka(this)));
        linearLayout.addView(claVar);
        wja wjaVar = new wja(linearLayout.getContext(), null);
        wjaVar.setId(wea.e);
        wjaVar.setLayoutParams(new dm(-1, -2));
        wjaVar.setTabMode(1);
        wjaVar.setElevation(fk4.d().getDisplayMetrics().density * 10.0f);
        wjaVar.setVisibility(this.t0 ^ true ? 0 : 8);
        linearLayout.addView(wjaVar);
        ViewPager2 viewPager2 = new ViewPager2(linearLayout.getContext());
        viewPager2.setId(wea.g);
        viewPager2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        fm9.z(viewPager2);
        linearLayout.addView(viewPager2);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        bc7[] bc7VarArr = x0;
        mr0.I((cla) this.Y.T0(this, bc7VarArr[1]));
        if (!requireActivity().isChangingConfigurations()) {
            ((ViewPager2) this.s0.T0(this, bc7VarArr[3])).setAdapter(null);
        }
        xu3 xu3Var = this.w0;
        if (xu3Var != null) {
            xu3Var.c();
        }
        this.w0 = null;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        bc7[] bc7VarArr = x0;
        bc7 bc7Var = bc7VarArr[3];
        q7c q7cVar = this.s0;
        ViewPager2 viewPager2 = (ViewPager2) q7cVar.T0(this, bc7Var);
        viewPager2.setAdapter(this.v0);
        viewPager2.setOffscreenPageLimit(1);
        if (!this.t0) {
            wja wjaVar = (wja) this.Z.T0(this, bc7VarArr[2]);
            ViewPager2 viewPager22 = (ViewPager2) q7cVar.T0(this, bc7VarArr[3]);
            bkg bkgVar = this.u0;
            bkgVar.getClass();
            xu3 xu3Var = new xu3(wjaVar, viewPager22, new f9(bkgVar, 0, wjaVar));
            xu3Var.a();
            this.w0 = xu3Var;
        }
        od2.L(new zn5(tu0.g(((ro8) this.X.getValue()).X, getViewLifecycleOwner().Q(), fg7.o), new h9(null, this), 5), getViewLifecycleScope());
    }

    @Override // defpackage.bha
    public final void p() {
        ((ro8) this.X.getValue()).u(null);
    }

    public AddChatAdminsScreen(long j) {
        this(dy7.g(new kpa("profile:add_admins:chat_id", Long.valueOf(j))));
    }
}
