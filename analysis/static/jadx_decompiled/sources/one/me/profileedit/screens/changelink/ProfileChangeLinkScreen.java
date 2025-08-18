package one.me.profileedit.screens.changelink;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.a3g;
import defpackage.a42;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.c3;
import defpackage.c7a;
import defpackage.cla;
import defpackage.dy7;
import defpackage.fg7;
import defpackage.fk4;
import defpackage.fs;
import defpackage.glc;
import defpackage.hob;
import defpackage.i76;
import defpackage.iba;
import defpackage.jcb;
import defpackage.je7;
import defpackage.jp8;
import defpackage.kcb;
import defpackage.kka;
import defpackage.kpa;
import defpackage.l22;
import defpackage.lcb;
import defpackage.lka;
import defpackage.lwa;
import defpackage.mcb;
import defpackage.mr0;
import defpackage.ncb;
import defpackage.neb;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nka;
import defpackage.nz7;
import defpackage.od2;
import defpackage.oec;
import defpackage.pla;
import defpackage.pq9;
import defpackage.q1d;
import defpackage.q7c;
import defpackage.qeb;
import defpackage.qka;
import defpackage.qp4;
import defpackage.reb;
import defpackage.sea;
import defpackage.t03;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v3c;
import defpackage.vea;
import defpackage.wz7;
import defpackage.x27;
import defpackage.xt3;
import defpackage.xx5;
import defpackage.yt8;
import defpackage.z6a;
import defpackage.zja;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0007\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/profileedit/screens/changelink/ProfileChangeLinkScreen;", "Lone/me/sdk/arch/Widget;", "Lng3;", "Ljcb;", "Lxt3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "Lreb;", "type", "Lqeb;", "flow", "(JLreb;Lqeb;)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ProfileChangeLinkScreen extends Widget implements ng3, jcb, xt3 {
    public static final /* synthetic */ bc7[] v0;
    public final je7 X;
    public final a3g Y;
    public final q7c Z;
    public final fs a;
    public final fs b;
    public final glc c;
    public final x27 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;

    static {
        hob hobVar = new hob(ProfileChangeLinkScreen.class, "flowType", "getFlowType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$FlowType;", 0);
        oec oecVar = nec.a;
        v0 = new bc7[]{hobVar, zr6.e(oecVar, ProfileChangeLinkScreen.class, "idType", "getIdType()Lone/me/profileedit/deeplink/ProfileEditDeepLinkRoutes$Type;", 0), zr6.f(ProfileChangeLinkScreen.class, "shortLinkMoreButton", "getShortLinkMoreButton()Landroid/widget/ImageView;", 0, oecVar), zr6.f(ProfileChangeLinkScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, oecVar), zr6.f(ProfileChangeLinkScreen.class, "button", "getButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0, oecVar), zr6.f(ProfileChangeLinkScreen.class, "recycler", "getRecycler()Landroidx/recyclerview/widget/RecyclerView;", 0, oecVar)};
    }

    public ProfileChangeLinkScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(qeb.class, "entity:flow_type");
        this.b = new fs(reb.class, "entity:id_type");
        this.c = new glc(new lwa(5, this), null, 6);
        this.o = x27.d;
        this.X = createViewModelLazy(l22.class, new jp8(16, new zja(bundle, 3, this)));
        this.Y = new a3g(((iba) neb.a.getAccessor().c(iba.class)).a(), this, 9);
        this.Z = viewBinding(sea.w0);
        this.s0 = viewBinding(sea.y0);
        this.t0 = viewBinding(sea.D0);
        this.u0 = viewBinding(sea.x0);
        od2.L(new zn5(new t03(p0().o, 11), new kcb(null, this), 5), getLifecycleScope());
        od2.L(new zn5(p0().s0, new lcb(null, this), 5), getLifecycleScope());
    }

    public static final OneMeButton m0(ProfileChangeLinkScreen profileChangeLinkScreen) {
        profileChangeLinkScreen.getClass();
        return (OneMeButton) profileChangeLinkScreen.t0.T0(profileChangeLinkScreen, v0[4]);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.o;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.c;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        p0().b.h(i);
    }

    @Override // defpackage.uu3
    public final boolean handleBack() {
        View view = getView();
        if (view != null) {
            view.clearFocus();
        }
        mr0.G(this);
        return super.handleBack();
    }

    public final qeb n0() {
        bc7 bc7Var = v0[0];
        return (qeb) this.a.a(this);
    }

    public final cla o0() {
        return (cla) this.s0.T0(this, v0[3]);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        qka kkaVar;
        int i;
        Context context = layoutInflater.getContext();
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(layoutParams);
        Continuation continuation = null;
        RecyclerView recyclerView = new RecyclerView(frameLayout.getContext(), null);
        recyclerView.setId(sea.x0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1, 48);
        float f = 16;
        layoutParams2.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(this.Y);
        recyclerView.setItemAnimator(null);
        recyclerView.setClipChildren(false);
        yt8 yt8Var = new yt8(21, this);
        pq9 pq9Var = qp4.u0;
        recyclerView.j(new q1d(pq9Var.j(recyclerView), yt8Var, null, 12));
        recyclerView.j(new nz7(0));
        frameLayout.addView(recyclerView);
        cla claVar = new cla(frameLayout.getContext(), 6);
        claVar.setId(sea.y0);
        wz7 wz7Var = new wz7(23, this);
        int iOrdinal = n0().ordinal();
        if (iOrdinal == 0) {
            kkaVar = new kka(new a42(5, wz7Var));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            kkaVar = new lka(new a42(6, wz7Var));
        }
        claVar.setLeftActions(kkaVar);
        claVar.setRightActions(nka.a);
        claVar.setForm(uka.a);
        claVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -2, 48));
        claVar.setBackgroundColor(pq9Var.j(claVar).b().j);
        frameLayout.addView(claVar);
        OneMeButton oneMeButton = new OneMeButton(frameLayout.getContext(), null);
        oneMeButton.setId(sea.D0);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2, 80);
        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(12 * fk4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams3);
        int iOrdinal2 = n0().ordinal();
        if (iOrdinal2 == 0) {
            i = vea.R1;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = vea.S1;
        }
        oneMeButton.setText(i);
        tu0.K(oneMeButton, 300L, new xx5(27, this));
        frameLayout.addView(oneMeButton);
        v3c.y(new c3(this, continuation, 24), frameLayout);
        return frameLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        cla claVarO0 = o0();
        pla.a(claVarO0, new i76(claVarO0, 15, this));
        od2.L(new zn5(new t03(p0().Y, 11), new ncb(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(p0().Z, getViewLifecycleOwner().Q(), fg7.o), new mcb(null, this), 5), getViewLifecycleScope());
    }

    public final l22 p0() {
        return (l22) this.X.getValue();
    }

    @Override // defpackage.xt3
    public final void y(int i, Bundle bundle) {
        p0().b.i(i);
    }

    public ProfileChangeLinkScreen(long j, reb rebVar, qeb qebVar) {
        this(dy7.g(new kpa("entity:id", Long.valueOf(j)), new kpa("entity:id_type", rebVar), new kpa("entity:flow_type", qebVar)));
    }
}
