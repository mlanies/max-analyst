package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.dy7;
import defpackage.fg7;
import defpackage.fs;
import defpackage.glc;
import defpackage.hob;
import defpackage.je7;
import defpackage.kpa;
import defpackage.kxb;
import defpackage.m0b;
import defpackage.nec;
import defpackage.od2;
import defpackage.p1c;
import defpackage.pf3;
import defpackage.q7c;
import defpackage.qf3;
import defpackage.rf3;
import defpackage.sf3;
import defpackage.t03;
import defpackage.ti2;
import defpackage.tu0;
import defpackage.wf3;
import defpackage.wuc;
import defpackage.x27;
import defpackage.zn5;
import defpackage.zr6;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"Lone/me/settings/privacy/ui/pincode/ConfirmPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "hash", "(Ljava/lang/String;)V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class ConfirmPinCodeScreen extends Widget {
    public static final /* synthetic */ bc7[] Y = {new hob(ConfirmPinCodeScreen.class, "hash", "getHash()Ljava/lang/String;", 0), zr6.e(nec.a, ConfirmPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0)};
    public final q7c X;
    public final fs a;
    public final je7 b;
    public final glc c;
    public final x27 o;

    public ConfirmPinCodeScreen(Bundle bundle) {
        super(bundle, 0, 2, null);
        this.a = new fs(String.class, "confirm_pin_code:hash");
        this.b = createViewModelLazy(wf3.class, new ti2(26, new pf3(this, 1)));
        this.c = new glc(wuc.SETTINGS_PRIVACY_ACCEPT_PINCODE);
        this.o = x27.d;
        this.X = viewBinding(kxb.oneme_settings_privacy_setup_pin_code_root_view);
    }

    public static final m0b m0(ConfirmPinCodeScreen confirmPinCodeScreen) {
        confirmPinCodeScreen.getClass();
        return (m0b) confirmPinCodeScreen.X.T0(confirmPinCodeScreen, Y[1]);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getO() {
        return this.o;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.c;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m0b m0bVar = new m0b(viewGroup.getContext());
        m0bVar.setId(kxb.oneme_settings_privacy_setup_pin_code_root_view);
        m0bVar.setListener((wf3) this.b.getValue());
        m0bVar.setTitle(p1c.oneme_settings_privacy_onboarding_re_enter_pin_code);
        m0bVar.setLocked(true);
        m0bVar.setOnBackPress(new pf3(this, 0));
        return m0bVar;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        je7 je7Var = this.b;
        t03 t03Var = ((wf3) je7Var.getValue()).s0;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(t03Var, getViewLifecycleOwner().Q(), fg7Var), new qf3(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((wf3) je7Var.getValue()).v0, getViewLifecycleOwner().Q(), fg7Var), new rf3(2, null), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((wf3) je7Var.getValue()).u0, getViewLifecycleOwner().Q(), fg7Var), new sf3(null, this), 5), getViewLifecycleScope());
    }

    public ConfirmPinCodeScreen(String str) {
        this(dy7.g(new kpa("confirm_pin_code:hash", str)));
    }
}
