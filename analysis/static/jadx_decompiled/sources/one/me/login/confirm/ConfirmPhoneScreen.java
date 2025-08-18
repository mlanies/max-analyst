package one.me.login.confirm;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import defpackage.b7a;
import defpackage.bc7;
import defpackage.bf3;
import defpackage.bvc;
import defpackage.c5;
import defpackage.c7a;
import defpackage.cf3;
import defpackage.cla;
import defpackage.cud;
import defpackage.d80;
import defpackage.df3;
import defpackage.dp3;
import defpackage.du4;
import defpackage.dy7;
import defpackage.ef3;
import defpackage.fg3;
import defpackage.fk4;
import defpackage.fs;
import defpackage.glc;
import defpackage.hm9;
import defpackage.hn2;
import defpackage.hob;
import defpackage.hwb;
import defpackage.i4f;
import defpackage.je7;
import defpackage.jf3;
import defpackage.jg3;
import defpackage.jqe;
import defpackage.k56;
import defpackage.kka;
import defpackage.kke;
import defpackage.kpa;
import defpackage.kre;
import defpackage.lt7;
import defpackage.mqd;
import defpackage.nec;
import defpackage.nf3;
import defpackage.ng3;
import defpackage.od2;
import defpackage.of3;
import defpackage.oi9;
import defpackage.pla;
import defpackage.pnf;
import defpackage.q7c;
import defpackage.qp4;
import defpackage.t03;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.uka;
import defpackage.v0c;
import defpackage.v3c;
import defpackage.v9;
import defpackage.vw;
import defpackage.vx3;
import defpackage.vxd;
import defpackage.w4d;
import defpackage.w9a;
import defpackage.we6;
import defpackage.x27;
import defpackage.x77;
import defpackage.ye3;
import defpackage.z6a;
import defpackage.z7b;
import defpackage.zn5;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB!\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0007\u0010\u000e¨\u0006\u000f"}, d2 = {"Lone/me/login/confirm/ConfirmPhoneScreen;", "Lone/me/sdk/arch/Widget;", "", "Lfg3;", "Lng3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "verifyToken", "phone", "", "codeLength", "(Ljava/lang/String;Ljava/lang/String;I)V", "login_playGoogleRelease"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ConfirmPhoneScreen extends Widget implements fg3, ng3 {
    public static final /* synthetic */ bc7[] C0 = {new hob(ConfirmPhoneScreen.class, "verifyToken", "getVerifyToken()Ljava/lang/String;", 0), z7b.g(nec.a, ConfirmPhoneScreen.class, "phone", "getPhone()Ljava/lang/String;", 0), new hob(ConfirmPhoneScreen.class, "codeLength", "getCodeLength()I", 0), new hob(ConfirmPhoneScreen.class, "phoneDescTextView", "getPhoneDescTextView()Landroid/widget/TextView;", 0), new hob(ConfirmPhoneScreen.class, "timerTextView", "getTimerTextView()Landroid/widget/TextView;", 0), new hob(ConfirmPhoneScreen.class, "resendButton", "getResendButton()Lone/me/sdk/uikit/common/button/OneMeButton;", 0), new hob(ConfirmPhoneScreen.class, "smsInputView", "getSmsInputView()Lone/me/sdk/codeinput/ConfirmSmsInputView;", 0), new oi9(ConfirmPhoneScreen.class, "loginAnimationJob", "getLoginAnimationJob()Lkotlinx/coroutines/Job;")};
    public TextView A0;
    public final w4d B0;
    public final fs X;
    public final glc Y;
    public final je7 Z;
    public final /* synthetic */ dp3 a;
    public final x27 b;
    public final fs c;
    public final fs o;
    public final je7 s0;
    public final je7 t0;
    public final q7c u0;
    public final q7c v0;
    public final q7c w0;
    public final q7c x0;
    public TextView y0;
    public final je7 z0;

    public ConfirmPhoneScreen(String str, String str2, int i) {
        this(dy7.g(new kpa("screen:confirm_phone:verify_token", str), new kpa("screen:confirm_phone:phone", str2), new kpa("screen:confirm_phone:code_length", Integer.valueOf(i))));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m0(one.me.login.confirm.ConfirmPhoneScreen r9, defpackage.ttd r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.m0(one.me.login.confirm.ConfirmPhoneScreen, ttd, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.fg3
    public final void e(String str) {
        of3 of3VarR0 = r0();
        of3VarR0.getClass();
        String str2 = of3.G0;
        hm9.n(str2, "onCodeEntered");
        if (str.length() == 0) {
            hm9.m0(str2, "empty sms", new Object[0]);
            return;
        }
        if (str.equals(of3VarR0.C0)) {
            return;
        }
        of3VarR0.C0 = str;
        vxd vxdVar = (vxd) of3VarR0.b.a(of3VarR0.a, ((w9a) ((kke) of3VarR0.t0.getValue())).b(), vx3.b, new jf3(of3VarR0, str, null));
        of3VarR0.E0.o1(of3VarR0, of3.F0[0], vxdVar);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getB() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.Y;
    }

    @Override // defpackage.ng3
    public final void h(int i, Bundle bundle) {
        if (i == hwb.oneme_login_sms_code_exceeded_ok_btn) {
            getRouter().C();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n0(android.widget.TextView r11, int r12, boolean r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.af3
            if (r0 == 0) goto L13
            r0 = r14
            af3 r0 = (defpackage.af3) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            af3 r0 = new af3
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r10 = r0.Y
            tx3 r14 = defpackage.tx3.a
            int r1 = r0.s0
            e5f r2 = defpackage.e5f.a
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 800(0x320, double:3.953E-321)
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L37
            if (r1 != r4) goto L2f
            defpackage.od2.a0(r10)
            goto L85
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            boolean r13 = r0.X
            android.widget.TextView r11 = r0.o
            defpackage.od2.a0(r10)
            goto L68
        L3f:
            defpackage.od2.a0(r10)
            r11.setText(r12)
            r11.setAlpha(r3)
            android.view.ViewPropertyAnimator r10 = r11.animate()
            r12 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r10 = r10.alpha(r12)
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r6)
            r10.start()
            r0.o = r11
            r0.X = r13
            r0.s0 = r5
            r8 = 2800(0xaf0, double:1.3834E-320)
            java.lang.Object r10 = defpackage.j47.x(r8, r0)
            if (r10 != r14) goto L68
            return r14
        L68:
            if (r13 != 0) goto L85
            android.view.ViewPropertyAnimator r10 = r11.animate()
            android.view.ViewPropertyAnimator r10 = r10.alpha(r3)
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r6)
            r10.start()
            r10 = 0
            r0.o = r10
            r0.s0 = r4
            java.lang.Object r10 = defpackage.j47.x(r6, r0)
            if (r10 != r14) goto L85
            return r14
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.login.confirm.ConfirmPhoneScreen.n0(android.widget.TextView, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final OneMeButton o0() {
        return (OneMeButton) this.w0.T0(this, C0[5]);
    }

    @Override // defpackage.uu3
    public final void onAttach(View view) {
        super.onAttach(view);
        p0().requestFocus();
        of3 of3VarR0 = r0();
        vxd vxdVar = of3VarR0.D0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
        of3VarR0.D0 = pnf.n(of3VarR0, null, null, new nf3(of3VarR0, null), 3);
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        cla claVar = new cla(linearLayout.getContext(), 6);
        claVar.setForm(uka.a);
        claVar.setLeftActions(new kka(new ye3(this, 0)));
        linearLayout.setGravity(17);
        linearLayout.addView(claVar);
        TextView textView = new TextView(linearLayout.getContext());
        textView.setId(hwb.oneme_login_confirm_title);
        textView.setText(v0c.oneme_login_confirm_title);
        i4f.c.b(textView, du4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(24 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        textView.setLayoutParams(layoutParams);
        int i = 3;
        Continuation continuation = null;
        v3c.y(new v9(i, continuation, 8), textView);
        textView.setGravity(17);
        linearLayout.addView(textView);
        TextView textView2 = new TextView(linearLayout.getContext());
        textView2.setId(hwb.oneme_login_confirm_description);
        i4f.m.b(textView2, du4.b);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        textView2.setLayoutParams(layoutParams2);
        v3c.y(new v9(i, continuation, 9), textView2);
        textView2.setGravity(17);
        linearLayout.addView(textView2);
        jg3 jg3Var = new jg3(linearLayout.getContext(), null);
        jg3Var.setId(hwb.oneme_login_confirm_sms_input);
        jg3Var.setListener(this);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0);
        jg3Var.setLayoutParams(layoutParams3);
        pla.a(jg3Var, new bf3(jg3Var, jg3Var, 0));
        jg3Var.setKeyboardOpen(new hn2(28));
        bc7 bc7Var = C0[2];
        jg3Var.setCountCells(((Number) this.X.a(this)).intValue());
        linearLayout.setGravity(17);
        linearLayout.addView(jg3Var);
        View space = new Space(linearLayout.getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, 0);
        layoutParams4.weight = 1.0f;
        space.setLayoutParams(layoutParams4);
        linearLayout.addView(space);
        TextView textView3 = new TextView(linearLayout.getContext());
        textView3.setId(hwb.oneme_login_confirm_timer);
        i4f.p.b(textView3, du4.b);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        float f2 = 16;
        layoutParams5.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        textView3.setLayoutParams(layoutParams5);
        v3c.y(new v9(i, continuation, 7), textView3);
        textView3.setGravity(17);
        linearLayout.addView(textView3);
        OneMeButton oneMeButton = new OneMeButton(linearLayout.getContext(), null);
        oneMeButton.setId(hwb.oneme_login_confirm_resend_code);
        oneMeButton.setText(v0c.oneme_login_confirm_resend);
        oneMeButton.setMode(b7a.o);
        oneMeButton.setAppearance(z6a.a);
        oneMeButton.setSize(c7a.a);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(layoutParams6);
        linearLayout.addView(oneMeButton);
        return linearLayout;
    }

    @Override // defpackage.uu3
    public final void onDestroyView(View view) {
        t0();
        this.y0 = null;
        p0().setListener(null);
        super.onDestroyView(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        kre kreVar = view instanceof kre ? (kre) view : null;
        if (kreVar != null) {
            kreVar.onThemeChanged(qp4.u0.j(view));
        }
        bc7[] bc7VarArr = C0;
        TextView textView = (TextView) this.u0.T0(this, bc7VarArr[3]);
        Context context = getContext();
        int i = v0c.oneme_login_confirm_description;
        bc7 bc7Var = bc7VarArr[1];
        textView.setText(context.getString(i, (String) this.o.a(this)));
        tu0.K(o0(), 300L, new c5(21, this));
        p0().setOnAnimationEnded(new ye3(this, 1));
        od2.L(new zn5(r0().x0, new cf3(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(r0().z0, new df3(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(new t03(r0().A0, 11), new ef3(this, null), 5), getViewLifecycleScope());
        od2.L(new zn5(r0().w0, new vw(2, this, ConfirmPhoneScreen.class, "processSmsEvent", "processSmsEvent(Lone/me/login/confirm/SmsCodeResultEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 14), 5), getViewLifecycleScope());
        of3 of3VarR0 = r0();
        we6 we6Var = (we6) ((cud) of3VarR0.u0.getValue());
        we6Var.g = of3VarR0.c;
        we6Var.b();
    }

    public final jg3 p0() {
        return (jg3) this.x0.T0(this, C0[6]);
    }

    public final TextView q0() {
        return (TextView) this.v0.T0(this, C0[4]);
    }

    public final of3 r0() {
        return (of3) this.Z.getValue();
    }

    public final void s0(String str) {
        boolean z = str != null;
        o0().setVisibility(z ^ true ? 0 : 8);
        q0().setVisibility(z ? 0 : 8);
        o0().setAlpha(z ? 0.0f : 1.0f);
        q0().setAlpha(z ? 1.0f : 0.0f);
        if (str != null) {
            q0().setText(((String) this.z0.getValue()) + " " + str);
        }
    }

    public final void t0() {
        bc7[] bc7VarArr = C0;
        bc7 bc7Var = bc7VarArr[7];
        w4d w4dVar = this.B0;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[7], null);
        View view = getView();
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            viewGroup.removeView(this.A0);
        }
        this.A0 = null;
        s0((String) r0().z0.a.getValue());
    }

    public final void u0(jqe jqeVar) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator duration;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        if (this.y0 == null && jqeVar != null) {
            int iIndexOfChild = ((ViewGroup) getView()).indexOfChild(p0());
            TextView textView = new TextView(getContext());
            i4f.p.b(textView, du4.b);
            textView.setTextColor(qp4.u0.j(textView).getText().b);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f = 12;
            layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(16 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
            textView.setLayoutParams(layoutParams);
            textView.setGravity(17);
            textView.setAlpha(0.0f);
            View view = getView();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            if (viewGroup != null) {
                viewGroup.addView(textView, iIndexOfChild + 1);
            }
            this.y0 = textView;
        }
        float f2 = jqeVar != null ? 1.0f : 0.0f;
        TextView textView2 = this.y0;
        if (textView2 != null) {
            textView2.setText(jqeVar != null ? jqeVar.b(getContext()) : null);
        }
        TextView textView3 = this.y0;
        if (textView3 == null || (viewPropertyAnimatorAnimate = textView3.animate()) == null || (duration = viewPropertyAnimatorAnimate.setDuration(200L)) == null || (viewPropertyAnimatorAlpha = duration.alpha(f2)) == null) {
            return;
        }
        viewPropertyAnimatorAlpha.start();
    }

    public ConfirmPhoneScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new dp3();
        this.b = x27.d;
        Class<String> cls = String.class;
        this.c = new fs(cls, "screen:confirm_phone:verify_token");
        this.o = new fs(cls, "screen:confirm_phone:phone");
        this.X = new fs(Integer.class, "screen:confirm_phone:code_length");
        this.Y = new glc(new hn2(29), null, 6);
        final int i = 0;
        this.Z = createViewModelLazy(of3.class, new ti2(25, new k56(this) { // from class: ze3
            public final /* synthetic */ ConfirmPhoneScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ConfirmPhoneScreen confirmPhoneScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = ConfirmPhoneScreen.C0;
                        confirmPhoneScreen.getClass();
                        bc7[] bc7VarArr2 = ConfirmPhoneScreen.C0;
                        bc7 bc7Var = bc7VarArr2[2];
                        int iIntValue = ((Number) confirmPhoneScreen.X.a(confirmPhoneScreen)).intValue();
                        bc7 bc7Var2 = bc7VarArr2[0];
                        String str = (String) confirmPhoneScreen.c.a(confirmPhoneScreen);
                        bc7 bc7Var3 = bc7VarArr2[1];
                        String str2 = (String) confirmPhoneScreen.o.a(confirmPhoneScreen);
                        lt7 lt7Var = lt7.a;
                        lt7Var.getClass();
                        return new of3(iIntValue, str, str2, new khe(new m57(16)), new khe(new m57(18)), new khe(new m57(17)), lt7Var.getAccessor().d(kke.class), lt7Var.getAccessor().d(gh3.class));
                    case 1:
                        bc7[] bc7VarArr3 = ConfirmPhoneScreen.C0;
                        return new x37(confirmPhoneScreen.getRouter());
                    default:
                        bc7[] bc7VarArr4 = ConfirmPhoneScreen.C0;
                        return z7.B(confirmPhoneScreen.getContext(), v0c.oneme_login_confirm_timer);
                }
            }
        }));
        final int i2 = 1;
        this.s0 = tu0.r(3, new k56(this) { // from class: ze3
            public final /* synthetic */ ConfirmPhoneScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ConfirmPhoneScreen confirmPhoneScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = ConfirmPhoneScreen.C0;
                        confirmPhoneScreen.getClass();
                        bc7[] bc7VarArr2 = ConfirmPhoneScreen.C0;
                        bc7 bc7Var = bc7VarArr2[2];
                        int iIntValue = ((Number) confirmPhoneScreen.X.a(confirmPhoneScreen)).intValue();
                        bc7 bc7Var2 = bc7VarArr2[0];
                        String str = (String) confirmPhoneScreen.c.a(confirmPhoneScreen);
                        bc7 bc7Var3 = bc7VarArr2[1];
                        String str2 = (String) confirmPhoneScreen.o.a(confirmPhoneScreen);
                        lt7 lt7Var = lt7.a;
                        lt7Var.getClass();
                        return new of3(iIntValue, str, str2, new khe(new m57(16)), new khe(new m57(18)), new khe(new m57(17)), lt7Var.getAccessor().d(kke.class), lt7Var.getAccessor().d(gh3.class));
                    case 1:
                        bc7[] bc7VarArr3 = ConfirmPhoneScreen.C0;
                        return new x37(confirmPhoneScreen.getRouter());
                    default:
                        bc7[] bc7VarArr4 = ConfirmPhoneScreen.C0;
                        return z7.B(confirmPhoneScreen.getContext(), v0c.oneme_login_confirm_timer);
                }
            }
        });
        this.t0 = lt7.a.getAccessor().d(d80.class);
        this.u0 = viewBinding(hwb.oneme_login_confirm_description);
        this.v0 = viewBinding(hwb.oneme_login_confirm_timer);
        this.w0 = viewBinding(hwb.oneme_login_confirm_resend_code);
        this.x0 = viewBinding(hwb.oneme_login_confirm_sms_input);
        final int i3 = 2;
        this.z0 = tu0.r(3, new k56(this) { // from class: ze3
            public final /* synthetic */ ConfirmPhoneScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                ConfirmPhoneScreen confirmPhoneScreen = this.b;
                switch (i3) {
                    case 0:
                        bc7[] bc7VarArr = ConfirmPhoneScreen.C0;
                        confirmPhoneScreen.getClass();
                        bc7[] bc7VarArr2 = ConfirmPhoneScreen.C0;
                        bc7 bc7Var = bc7VarArr2[2];
                        int iIntValue = ((Number) confirmPhoneScreen.X.a(confirmPhoneScreen)).intValue();
                        bc7 bc7Var2 = bc7VarArr2[0];
                        String str = (String) confirmPhoneScreen.c.a(confirmPhoneScreen);
                        bc7 bc7Var3 = bc7VarArr2[1];
                        String str2 = (String) confirmPhoneScreen.o.a(confirmPhoneScreen);
                        lt7 lt7Var = lt7.a;
                        lt7Var.getClass();
                        return new of3(iIntValue, str, str2, new khe(new m57(16)), new khe(new m57(18)), new khe(new m57(17)), lt7Var.getAccessor().d(kke.class), lt7Var.getAccessor().d(gh3.class));
                    case 1:
                        bc7[] bc7VarArr3 = ConfirmPhoneScreen.C0;
                        return new x37(confirmPhoneScreen.getRouter());
                    default:
                        bc7[] bc7VarArr4 = ConfirmPhoneScreen.C0;
                        return z7.B(confirmPhoneScreen.getContext(), v0c.oneme_login_confirm_timer);
                }
            }
        });
        this.B0 = mqd.D();
    }
}
