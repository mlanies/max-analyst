package one.me.inviteactions.invitebyphone;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import defpackage.a67;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.c57;
import defpackage.c67;
import defpackage.c7a;
import defpackage.cla;
import defpackage.d74;
import defpackage.daa;
import defpackage.dp3;
import defpackage.du4;
import defpackage.eaa;
import defpackage.es3;
import defpackage.f47;
import defpackage.fg7;
import defpackage.fh5;
import defpackage.fk4;
import defpackage.fs;
import defpackage.gca;
import defpackage.gh7;
import defpackage.glc;
import defpackage.hca;
import defpackage.hob;
import defpackage.i4f;
import defpackage.je7;
import defpackage.jy2;
import defpackage.khe;
import defpackage.kka;
import defpackage.kke;
import defpackage.kre;
import defpackage.lea;
import defpackage.m57;
import defpackage.mr0;
import defpackage.n57;
import defpackage.nec;
import defpackage.ng3;
import defpackage.nj4;
import defpackage.o57;
import defpackage.od2;
import defpackage.oi9;
import defpackage.oy3;
import defpackage.p57;
import defpackage.pnf;
import defpackage.q57;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.r57;
import defpackage.s35;
import defpackage.s57;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.ufa;
import defpackage.uka;
import defpackage.vf1;
import defpackage.w4d;
import defpackage.w9a;
import defpackage.x27;
import defpackage.x77;
import defpackage.xx5;
import defpackage.z6a;
import defpackage.z7b;
import defpackage.zn5;
import defpackage.zua;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lone/me/inviteactions/invitebyphone/InviteByPhoneScreen;", "Lone/me/sdk/arch/Widget;", "Loy3;", "", "Lng3;", "<init>", "()V", "invite-actions_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class InviteByPhoneScreen extends Widget implements oy3, ng3 {
    public static final /* synthetic */ bc7[] B0 = {new oi9(InviteByPhoneScreen.class, "phone", "getPhone()Ljava/lang/String;"), z7b.g(nec.a, InviteByPhoneScreen.class, "titleView", "getTitleView()Landroid/widget/TextView;", 0), new hob(InviteByPhoneScreen.class, "descriptionView", "getDescriptionView()Landroid/widget/TextView;", 0), new hob(InviteByPhoneScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new hob(InviteByPhoneScreen.class, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new hob(InviteByPhoneScreen.class, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), new oi9(InviteByPhoneScreen.class, "selectedCountry", "getSelectedCountry()Lone/me/sdk/phoneutils/OneMeCountryModel;")};
    public final vf1 A0;
    public final fs X;
    public final q7c Y;
    public final q7c Z;
    public final /* synthetic */ dp3 a;
    public final glc b;
    public final x27 c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public AppCompatTextView v0;
    public final khe w0;
    public final je7 x0;
    public f47 y0;
    public final fs z0;

    /* JADX WARN: Multi-variable type inference failed */
    public InviteByPhoneScreen() {
        super(null, 0, 3, 0 == true ? 1 : 0);
        this.a = new dp3();
        this.b = new glc(new fh5(28), null, 6);
        this.c = x27.d;
        this.o = createViewModelLazy(c67.class, new nj4(10, new fh5(29)));
        this.X = new fs(String.class, "", "screen:input_phone:phone");
        this.Y = viewBinding(gca.i);
        this.Z = viewBinding(gca.g);
        this.s0 = viewBinding(gca.f);
        this.t0 = viewBinding(gca.h);
        this.u0 = viewBinding(gca.j);
        this.w0 = new khe(new m57(0));
        this.x0 = c57.a.getAccessor().d(zua.class);
        this.z0 = new fs(eaa.class, daa.b, "screen:input_phone:country_model");
        this.A0 = new vf1(this, 5);
    }

    public static final void m0(InviteByPhoneScreen inviteByPhoneScreen, CharSequence charSequence) {
        if (inviteByPhoneScreen.v0 == null && charSequence != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(inviteByPhoneScreen.getContext(), null);
            i4f.p.b(appCompatTextView, du4.b);
            appCompatTextView.setTextColor(qp4.u0.j(appCompatTextView).getText().b);
            ti3 ti3Var = new ti3(0, -2);
            float f = 24;
            ti3Var.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
            ti3Var.j = gca.h;
            ti3Var.t = 0;
            ti3Var.v = 0;
            appCompatTextView.setGravity(8388611);
            appCompatTextView.setLayoutParams(ti3Var);
            View view = inviteByPhoneScreen.getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(appCompatTextView);
            }
            inviteByPhoneScreen.v0 = appCompatTextView;
        }
        AppCompatTextView appCompatTextView2 = inviteByPhoneScreen.v0;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(charSequence);
        }
        AppCompatTextView appCompatTextView3 = inviteByPhoneScreen.v0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setVisibility((charSequence == null || charSequence.length() == 0) ^ true ? 0 : 8);
        }
    }

    @Override // defpackage.oy3
    public final void K(eaa eaaVar) {
        p0().x0.m(null, eaaVar);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.b;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == ufa.d) {
            getRouter().C();
            return;
        }
        if (i == gca.b) {
            c67 c67VarP0 = p0();
            c67VarP0.getClass();
            bc7[] bc7VarArr = c67.F0;
            bc7 bc7Var = bc7VarArr[2];
            w4d w4dVar = c67VarP0.B0;
            x77 x77Var = (x77) w4dVar.T0(c67VarP0, bc7Var);
            if (x77Var == null || !x77Var.isActive()) {
                w4dVar.o1(c67VarP0, bc7VarArr[2], pnf.n(c67VarP0, ((w9a) ((kke) c67VarP0.Z.getValue())).c(), null, new a67(c67VarP0, null), 2));
            }
        }
    }

    public final OneMeButton n0() {
        return (OneMeButton) this.s0.T0(this, B0[3]);
    }

    public final lea o0() {
        return (lea) this.t0.T0(this, B0[4]);
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        o0().postDelayed(new q57(0, this), 200L);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        r57 r57Var = new r57(this, getContext());
        cla claVar = new cla(r57Var.getContext(), 6);
        int i = gca.j;
        claVar.setId(i);
        ti3 ti3Var = new ti3(-1, -2);
        ti3Var.i = 0;
        ti3Var.t = 0;
        ti3Var.v = 0;
        claVar.setLayoutParams(ti3Var);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new jy2(21, this)));
        r57Var.addView(claVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(r57Var.getContext(), null);
        int i2 = gca.i;
        appCompatTextView.setId(i2);
        i4f.c.b(appCompatTextView, du4.b);
        appCompatTextView.setText(hca.j);
        ti3 ti3Var2 = new ti3(0, -2);
        float f = 28;
        float f2 = 24;
        ti3Var2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti3Var2.j = i;
        ti3Var2.t = 0;
        ti3Var2.v = 0;
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(ti3Var2);
        r57Var.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(r57Var.getContext(), null);
        int i3 = gca.g;
        appCompatTextView2.setId(i3);
        i4f.m.b(appCompatTextView2, du4.b);
        appCompatTextView2.setText(hca.h);
        ti3 ti3Var3 = new ti3(0, -2);
        float f3 = 12;
        ti3Var3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        ti3Var3.j = i2;
        ti3Var3.t = 0;
        ti3Var3.v = 0;
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(ti3Var3);
        r57Var.addView(appCompatTextView2);
        lea leaVar = new lea(r57Var.getContext());
        leaVar.setId(gca.h);
        ti3 ti3Var4 = new ti3(0, -2);
        ti3Var4.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), 0);
        ti3Var4.j = i3;
        ti3Var4.t = 0;
        ti3Var4.v = 0;
        leaVar.setLayoutParams(ti3Var4);
        leaVar.setPhoneFormatterProvider(new d74(this, 18, leaVar));
        leaVar.setOnCountryViewClickListener(new es3(27, this));
        r57Var.addView(leaVar);
        OneMeButton oneMeButton = new OneMeButton(r57Var.getContext(), null);
        oneMeButton.setId(gca.f);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        ti3 ti3Var5 = new ti3(0, -2);
        ti3Var5.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(16 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        ti3Var5.l = 0;
        ti3Var5.t = 0;
        ti3Var5.v = 0;
        oneMeButton.setLayoutParams(ti3Var5);
        oneMeButton.setText(hca.g);
        r57Var.addView(oneMeButton);
        return r57Var;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.v0 = null;
        lea leaVarO0 = o0();
        leaVarO0.w0.removeTextChangedListener(this.y0);
        this.y0 = null;
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        super.onDetach(view);
        mr0.I(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        kre kreVar = view instanceof kre ? (kre) view : null;
        if (kreVar != null) {
            kreVar.onThemeChanged(qp4.u0.j(view));
        }
        lea leaVarO0 = o0();
        bc7[] bc7VarArr = B0;
        bc7 bc7Var = bc7VarArr[0];
        fs fsVar = this.X;
        leaVarO0.setText((String) fsVar.a(this));
        OneMeButton oneMeButtonN0 = n0();
        bc7 bc7Var2 = bc7VarArr[0];
        oneMeButtonN0.setEnabled(((String) fsVar.a(this)).length() > 0);
        tu0.K(n0(), 300L, new xx5(5, this));
        bc7 bc7Var3 = bc7VarArr[6];
        K((eaa) this.z0.a(this));
        o0().w0.addTextChangedListener(this.A0);
        s35 s35Var = p0().u0;
        gh7 gh7VarQ = this.lifecycleOwner.Q();
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, gh7VarQ, fg7Var), new p57(null, this), 5), getLifecycleScope());
        od2.L(new zn5(tu0.g(p0().t0, getViewLifecycleOwner().Q(), fg7Var), new o57(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(p0().w0, this.lifecycleOwner.Q(), fg7Var), new s57(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(p0().y0, getViewLifecycleOwner().Q(), fg7Var), new n57(null, this), 5), getViewLifecycleScope());
    }

    public final c67 p0() {
        return (c67) this.o.getValue();
    }
}
