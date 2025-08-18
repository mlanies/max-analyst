package one.me.login.welcome;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.br7;
import defpackage.bse;
import defpackage.bvc;
import defpackage.c7a;
import defpackage.djd;
import defpackage.du4;
import defpackage.elb;
import defpackage.eub;
import defpackage.fk4;
import defpackage.fka;
import defpackage.glc;
import defpackage.hm9;
import defpackage.hob;
import defpackage.hwb;
import defpackage.i4f;
import defpackage.iu7;
import defpackage.iyc;
import defpackage.je7;
import defpackage.jpc;
import defpackage.kt3;
import defpackage.ld6;
import defpackage.nec;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.rzd;
import defpackage.ti3;
import defpackage.tu0;
import defpackage.v0c;
import defpackage.w9e;
import defpackage.wha;
import defpackage.x27;
import defpackage.x4g;
import defpackage.x6a;
import defpackage.yq0;
import defpackage.z6a;
import defpackage.z7;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/login/welcome/WelcomeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class WelcomeScreen extends Widget {
    public static final /* synthetic */ bc7[] s0 = {new hob(WelcomeScreen.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), zr6.e(nec.a, WelcomeScreen.class, "termsTextView", "getTermsTextView()Landroid/widget/TextView;", 0)};
    public final je7 X;
    public final je7 Y;
    public final fka Z;
    public final x27 a;
    public final glc b;
    public final je7 c;
    public final q7c o;

    public WelcomeScreen() {
        super(null, 0, 3, null);
        this.a = new x27(0, new yq0(3, 1, false), 1);
        this.b = new glc(new bse(25), null, 6);
        m41getSharedViewModelcp94BC8("LoginScope", iu7.class, null);
        this.c = iyc.m;
        viewBinding(hwb.oneme_login_welcome_placeholder);
        this.o = viewBinding(hwb.oneme_login_welcome_terms);
        this.X = tu0.r(3, new rzd(16, this));
        this.Y = tu0.r(3, new bse(26));
        this.Z = qp4.u0.o(getContext()).c;
    }

    public static final void m0(WelcomeScreen welcomeScreen, String str) {
        welcomeScreen.getClass();
        Uri uri = Uri.parse(str);
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        try {
            welcomeScreen.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            hm9.p("WelcomeScreen", "open web link with tamtam terms is failed, no activity found", null);
            wha whaVar = new wha(welcomeScreen);
            whaVar.h(welcomeScreen.getContext().getString(jpc.F1));
            whaVar.i();
        }
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getScreenDelegate */
    public final bvc getF0() {
        return this.b;
    }

    public final void n0(String str, String str2, SpannableString spannableString, ClickableSpan clickableSpan) {
        int iA0 = w9e.A0(str, str2, 0, false, 6);
        int length = str2.length() + iA0;
        spannableString.setSpan(clickableSpan, iA0, length, 33);
        spannableString.setSpan(new ForegroundColorSpan(this.Z.getText().e), iA0, length, 33);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ConstraintLayout constraintLayout = new ConstraintLayout(layoutInflater.getContext());
        View djdVar = new djd(constraintLayout.getContext());
        ti3 ti3Var = new ti3(-1, -1);
        ti3Var.i = 0;
        ti3Var.t = 0;
        ti3Var.v = 0;
        ti3Var.l = 0;
        djdVar.setLayoutParams(ti3Var);
        constraintLayout.addView(djdVar);
        View view = new View(constraintLayout.getContext());
        view.setId(hwb.oneme_login_welcome_toolbar);
        ti3 ti3Var2 = new ti3(0, tu0.G(52 * fk4.d().getDisplayMetrics().density));
        ti3Var2.i = 0;
        ti3Var2.t = 0;
        ti3Var2.v = 0;
        view.setLayoutParams(ti3Var2);
        br7.e(view);
        constraintLayout.addView(view);
        TextView textView = new TextView(constraintLayout.getContext());
        textView.setId(hwb.oneme_login_welcome_title);
        ti3 ti3Var3 = new ti3(-2, -2);
        float f = 16;
        ti3Var3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti3Var3.j = hwb.oneme_login_welcome_toolbar;
        ti3Var3.t = 0;
        ti3Var3.v = 0;
        ti3Var3.k = hwb.oneme_login_welcome_description;
        ti3Var3.K = 2;
        textView.setLayoutParams(ti3Var3);
        textView.setGravity(17);
        fka fkaVar = this.Z;
        textView.setTextColor(fkaVar.getText().e);
        i4f.x.b(textView, du4.b);
        textView.setText(v0c.oneme_login_welcome_title);
        je7 je7Var = this.Y;
        ((x6a) je7Var.getValue()).getClass();
        constraintLayout.addView(textView);
        TextView textView2 = new TextView(constraintLayout.getContext());
        textView2.setId(hwb.oneme_login_welcome_description);
        ti3 ti3Var4 = new ti3(-2, -2);
        float f2 = 12;
        ti3Var4.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti3Var4.j = hwb.oneme_login_welcome_title;
        ti3Var4.t = 0;
        ti3Var4.v = 0;
        ti3Var4.k = hwb.oneme_login_welcome_placeholder;
        textView2.setLayoutParams(ti3Var4);
        textView2.setTextColor(fkaVar.getText().h);
        i4f.m.b(textView2, du4.b);
        textView2.setText(v0c.oneme_login_welcome_description);
        ((x6a) je7Var.getValue()).getClass();
        constraintLayout.addView(textView2);
        ld6 ld6Var = new ld6(constraintLayout.getContext());
        ld6Var.setId(hwb.oneme_login_welcome_placeholder);
        float f3 = 234;
        ti3 ti3Var5 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        ti3Var5.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        ti3Var5.j = hwb.oneme_login_welcome_title;
        ti3Var5.k = hwb.oneme_login_welcome_continue_btn;
        ti3Var5.t = 0;
        ti3Var5.v = 0;
        ld6Var.setLayoutParams(ti3Var5);
        ld6Var.setImageDrawable(kt3.b(getContext(), eub.welcome_logo));
        ((x6a) je7Var.getValue()).getClass();
        constraintLayout.addView(ld6Var);
        OneMeButton oneMeButton = new OneMeButton(constraintLayout.getContext(), null);
        oneMeButton.setId(hwb.oneme_login_welcome_continue_btn);
        oneMeButton.setAppearance(z6a.o);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setText(v0c.oneme_login_welcome_continue_btn);
        ti3 ti3Var6 = new ti3(0, -2);
        ti3Var6.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti3Var6.k = hwb.oneme_login_welcome_terms;
        ti3Var6.t = 0;
        ti3Var6.v = 0;
        oneMeButton.setLayoutParams(ti3Var6);
        tu0.K(oneMeButton, 300L, new elb(18, this));
        oneMeButton.setCustomTheme(fkaVar);
        constraintLayout.addView(oneMeButton);
        TextView textView3 = new TextView(constraintLayout.getContext());
        textView3.setId(hwb.oneme_login_welcome_terms);
        textView3.setGravity(1);
        ti3 ti3Var7 = new ti3(-1, -2);
        ti3Var7.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        ti3Var7.l = 0;
        ti3Var7.t = 0;
        ti3Var7.v = 0;
        textView3.setLayoutParams(ti3Var7);
        i4f.p.b(textView3, du4.b);
        textView3.setTextColor(fkaVar.getText().g);
        constraintLayout.addView(textView3);
        return constraintLayout;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        bc7[] bc7VarArr = s0;
        bc7 bc7Var = bc7VarArr[1];
        q7c q7cVar = this.o;
        TextView textView = (TextView) q7cVar.T0(this, bc7Var);
        String strB = z7.B(getContext(), v0c.oneme_login_welcome_terms);
        String strB2 = z7.B(getContext(), v0c.oneme_login_welcome_privacy_policy_clickable_part);
        String strB3 = z7.B(getContext(), v0c.oneme_login_welcome_user_agreement_clickable_part);
        SpannableString spannableString = new SpannableString(strB);
        n0(strB, strB2, spannableString, new x4g(this, 0));
        n0(strB, strB3, spannableString, new x4g(this, 1));
        textView.setText(spannableString);
        ((TextView) q7cVar.T0(this, bc7VarArr[1])).setMovementMethod(LinkMovementMethod.getInstance());
    }
}
