package one.me.login.inputphone;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.a27;
import defpackage.ad;
import defpackage.b27;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.br7;
import defpackage.bvc;
import defpackage.c27;
import defpackage.c3;
import defpackage.c7a;
import defpackage.cla;
import defpackage.d27;
import defpackage.d74;
import defpackage.d80;
import defpackage.dp3;
import defpackage.du4;
import defpackage.e5f;
import defpackage.eaa;
import defpackage.f27;
import defpackage.f47;
import defpackage.fg7;
import defpackage.fh5;
import defpackage.fk4;
import defpackage.fka;
import defpackage.fs;
import defpackage.fua;
import defpackage.ga;
import defpackage.glc;
import defpackage.hm9;
import defpackage.hob;
import defpackage.hwb;
import defpackage.i4f;
import defpackage.ib9;
import defpackage.je7;
import defpackage.jpc;
import defpackage.lea;
import defpackage.lt7;
import defpackage.mb5;
import defpackage.mn5;
import defpackage.nec;
import defpackage.nj4;
import defpackage.od2;
import defpackage.oi9;
import defpackage.oy3;
import defpackage.pka;
import defpackage.pnf;
import defpackage.q27;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v0c;
import defpackage.v3c;
import defpackage.v9;
import defpackage.vf1;
import defpackage.vf7;
import defpackage.w9e;
import defpackage.wfa;
import defpackage.wha;
import defpackage.wka;
import defpackage.x27;
import defpackage.x6a;
import defpackage.xx5;
import defpackage.y17;
import defpackage.yfa;
import defpackage.yq0;
import defpackage.z17;
import defpackage.z6a;
import defpackage.z7b;
import defpackage.zn5;
import defpackage.zua;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lone/me/login/inputphone/InputPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Loy3;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class InputPhoneScreen extends Widget implements oy3 {
    public static final /* synthetic */ bc7[] E0 = {new oi9(InputPhoneScreen.class, "phone", "getPhone()Ljava/lang/String;"), z7b.g(nec.a, InputPhoneScreen.class, "containerView", "getContainerView()Landroidx/constraintlayout/widget/ConstraintLayout;", 0), new hob(InputPhoneScreen.class, "gradientBgView", "getGradientBgView()Landroid/view/View;", 0), new hob(InputPhoneScreen.class, "continueButton", "getContinueButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new hob(InputPhoneScreen.class, "phoneNumberInput", "getPhoneNumberInput()Lone/me/sdk/phoneutils/OneMePhoneNumberInput;", 0), new hob(InputPhoneScreen.class, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    public final je7 A0;
    public final je7 B0;
    public final je7 C0;
    public final vf1 D0;
    public final fs X;
    public final String Y;
    public final je7 Z;
    public final /* synthetic */ dp3 a;
    public final x27 b;
    public final glc c;
    public final je7 o;
    public final q7c s0;
    public final q7c t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public AppCompatTextView x0;
    public final je7 y0;
    public f47 z0;

    public InputPhoneScreen() {
        super(null, 0, 3, null);
        this.a = new dp3();
        this.b = new x27(0, new yq0(3, 3, false), 1);
        this.c = new glc(new fh5(21), null, 6);
        this.o = createViewModelLazy(q27.class, new nj4(9, new fh5(22)));
        this.X = new fs(String.class, "", "screen:input_phone:phone");
        this.Y = "LoginScope";
        lt7 lt7Var = lt7.a;
        this.Z = lt7Var.getAccessor().d(ad.class);
        this.s0 = viewBinding(hwb.oneme_login_input_constraint_layout);
        this.t0 = viewBinding(hwb.oneme_login_input_gradient_bg);
        this.u0 = viewBinding(hwb.oneme_login_input_continue_button);
        this.v0 = viewBinding(hwb.oneme_login_input_phone_number_input);
        this.w0 = viewBinding(hwb.oneme_login_input_help_button);
        this.y0 = lt7Var.getAccessor().d(zua.class);
        this.A0 = tu0.r(3, new y17(this, 0));
        fua.a.b();
        this.B0 = lt7Var.getAccessor().d(d80.class);
        this.C0 = lt7Var.getAccessor().d(x6a.class);
        this.D0 = new vf1(this, 4);
    }

    public static final void m0(InputPhoneScreen inputPhoneScreen, String str) {
        inputPhoneScreen.getClass();
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            inputPhoneScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            hm9.p("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", null);
            wha whaVar = new wha(inputPhoneScreen);
            whaVar.h(inputPhoneScreen.getContext().getString(jpc.F1));
            whaVar.i();
        }
    }

    public static final void n0(InputPhoneScreen inputPhoneScreen, CharSequence charSequence) {
        if (inputPhoneScreen.x0 == null && charSequence != null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(inputPhoneScreen.getContext(), null);
            i4f.p.b(appCompatTextView, du4.b);
            ti3 ti3Var = new ti3(0, -2);
            float f = 24;
            ti3Var.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(4 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
            ti3Var.j = hwb.oneme_login_input_phone_number_input;
            ti3Var.t = 0;
            ti3Var.v = 0;
            appCompatTextView.setGravity(8388611);
            appCompatTextView.setLayoutParams(ti3Var);
            v3c.y(new mb5(3, null, 1), appCompatTextView);
            ((ConstraintLayout) inputPhoneScreen.s0.T0(inputPhoneScreen, E0[1])).addView(appCompatTextView);
            inputPhoneScreen.x0 = appCompatTextView;
        }
        AppCompatTextView appCompatTextView2 = inputPhoneScreen.x0;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(charSequence);
        }
        AppCompatTextView appCompatTextView3 = inputPhoneScreen.x0;
        if (appCompatTextView3 != null) {
            appCompatTextView3.setVisibility((charSequence == null || charSequence.length() == 0) ^ true ? 0 : 8);
        }
    }

    public static void r0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan, fka fkaVar) {
        int iA0 = w9e.A0(str, str2, 0, false, 6);
        int length = str2.length() + iA0;
        spannableString.setSpan(clickableSpan, iA0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(fkaVar.getText().e), iA0, length, 33);
    }

    @Override // defpackage.oy3
    public final void K(eaa eaaVar) {
        q0().w0.m(null, eaaVar);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScopeId-IluPPks, reason: from getter */
    public final String getY() {
        return this.Y;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.c;
    }

    public final OneMeButton o0() {
        return (OneMeButton) this.u0.T0(this, E0[3]);
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        requireActivity().getWindow().setStatusBarColor(0);
        q27 q27VarQ0 = q0();
        pnf.o(q27VarQ0.s0, e5f.a);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ScrollView scrollView = new ScrollView(getContext());
        scrollView.setFillViewport(true);
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        ConstraintLayout constraintLayout = new ConstraintLayout(scrollView.getContext());
        constraintLayout.setId(hwb.oneme_login_input_constraint_layout);
        constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        v3c.y(new a27(this, null, 0), constraintLayout);
        View view = new View(constraintLayout.getContext());
        view.setId(hwb.oneme_login_input_gradient_bg);
        ti3 ti3Var = new ti3(-1, tu0.G(283 * fk4.d().getDisplayMetrics().density));
        ti3Var.i = 0;
        ti3Var.t = 0;
        ti3Var.v = 0;
        view.setLayoutParams(ti3Var);
        Drawable ib9Var = new ib9();
        ib9Var.setAlpha(127);
        view.setBackground(ib9Var);
        v3c.y(new a27(this, null, 1), view);
        constraintLayout.addView(view);
        cla claVar = new cla(constraintLayout.getContext(), 6);
        claVar.setId(hwb.oneme_login_input_toolbar);
        ti3 ti3Var2 = new ti3(-1, -2);
        ti3Var2.i = 0;
        ti3Var2.t = 0;
        ti3Var2.v = 0;
        claVar.setLayoutParams(ti3Var2);
        claVar.setForm(uka.a);
        claVar.setRightActions(new pka(null, new wka(yfa.z, wfa.Q, new ga(claVar, 16, this), 6)));
        ((x6a) this.C0.getValue()).getClass();
        br7.d(claVar, new x27(3, null, 2), null);
        constraintLayout.addView(claVar);
        View vf7Var = new vf7(constraintLayout.getContext());
        vf7Var.setId(hwb.oneme_login_input_logo);
        ti3 ti3Var3 = new ti3(-1, 0);
        ti3Var3.i = 0;
        ti3Var3.t = 0;
        ti3Var3.v = 0;
        ti3Var3.l = hwb.oneme_login_input_toolbar;
        vf7Var.setLayoutParams(ti3Var3);
        br7.d(vf7Var, new x27(3, null, 2), null);
        constraintLayout.addView(vf7Var);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(hwb.oneme_login_input_title);
        i4f.c.b(textView, du4.b);
        textView.setText(v0c.oneme_login_input_title);
        ti3 ti3Var4 = new ti3(0, -2);
        float f = 28;
        float f2 = 24;
        ti3Var4.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti3Var4.j = hwb.oneme_login_input_toolbar;
        ti3Var4.t = 0;
        ti3Var4.v = 0;
        textView.setGravity(17);
        textView.setLayoutParams(ti3Var4);
        v3c.y(new v9(3, null, 15), textView);
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(hwb.oneme_login_input_description);
        i4f.m.b(textView2, du4.b);
        textView2.setText(v0c.oneme_login_input_description);
        ti3 ti3Var5 = new ti3(0, -2);
        float f3 = 12;
        ti3Var5.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        ti3Var5.j = hwb.oneme_login_input_title;
        ti3Var5.t = 0;
        ti3Var5.v = 0;
        textView2.setGravity(17);
        textView2.setLayoutParams(ti3Var5);
        v3c.y(new v9(3, null, 14), textView2);
        constraintLayout.addView(textView2);
        lea leaVar = new lea(constraintLayout.getContext());
        leaVar.setId(hwb.oneme_login_input_phone_number_input);
        ti3 ti3Var6 = new ti3(0, -2);
        ti3Var6.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(40 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        ti3Var6.j = hwb.oneme_login_input_description;
        ti3Var6.t = 0;
        ti3Var6.v = 0;
        leaVar.setLayoutParams(ti3Var6);
        leaVar.setPhoneFormatterProvider(new d74(this, 16, leaVar));
        leaVar.setOnCountryViewClickListener(new y17(this, 1));
        constraintLayout.addView(leaVar);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(hwb.oneme_login_input_continue_button);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setAppearance(z6a.o);
        ti3 ti3Var7 = new ti3(0, -2);
        float f4 = 16;
        ti3Var7.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4));
        ti3Var7.j = hwb.oneme_login_input_phone_number_input;
        ti3Var7.k = hwb.oneme_login_input_help_button;
        ti3Var7.t = 0;
        ti3Var7.v = 0;
        ti3Var7.F = 1.0f;
        oneMeButton.setLayoutParams(ti3Var7);
        oneMeButton.setText(v0c.oneme_login_input_continue);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(hwb.oneme_login_input_help_button);
        textView3.setGravity(1);
        ti3 ti3Var8 = new ti3(-1, -2);
        ti3Var8.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f3), 0, tu0.G(f4 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        ti3Var8.l = 0;
        ti3Var8.t = 0;
        ti3Var8.v = 0;
        textView3.setLayoutParams(ti3Var8);
        i4f.p.b(textView3, du4.b);
        v3c.y(new c3(this, null, 13), textView3);
        constraintLayout.addView(textView3);
        scrollView.addView(constraintLayout);
        return scrollView;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        super.onDestroyView(view);
        this.x0 = null;
        lea leaVarP0 = p0();
        leaVarP0.w0.removeTextChangedListener(this.z0);
        this.z0 = null;
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        Window window = requireActivity().getWindow();
        qp4.u0.b(view.getContext()).i().b();
        window.setStatusBarColor(0);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        bc7[] bc7VarArr = E0;
        Drawable background = ((View) this.t0.T0(this, bc7VarArr[2])).getBackground();
        ib9 ib9Var = background instanceof ib9 ? (ib9) background : null;
        if (ib9Var != null) {
            ib9Var.start();
        }
        ((TextView) this.w0.T0(this, bc7VarArr[5])).setMovementMethod(LinkMovementMethod.getInstance());
        lea leaVarP0 = p0();
        bc7 bc7Var = bc7VarArr[0];
        fs fsVar = this.X;
        leaVarP0.setText((String) fsVar.a(this));
        OneMeButton oneMeButtonO0 = o0();
        bc7 bc7Var2 = bc7VarArr[0];
        oneMeButtonO0.setEnabled(((String) fsVar.a(this)).length() > 0);
        tu0.K(o0(), 300L, new xx5(4, this));
        p0().w0.addTextChangedListener(this.D0);
        od2.L(new zn5(q0().Y, new z17(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(q0().t0, new d27(null, this), 5), getViewLifecycleScope());
        mn5 mn5Var = q0().z0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(mn5Var, getViewLifecycleOwner().Q(), fg7Var), new b27(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().s0, getViewLifecycleOwner().Q(), fg7Var), new c27(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(q0().x0, getViewLifecycleOwner().Q(), fg7Var), new f27(null, this), 5), getViewLifecycleScope());
    }

    public final lea p0() {
        return (lea) this.v0.T0(this, E0[4]);
    }

    public final q27 q0() {
        return (q27) this.o.getValue();
    }
}
