package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bc7;
import defpackage.bvc;
import defpackage.fg7;
import defpackage.glc;
import defpackage.hob;
import defpackage.je7;
import defpackage.k25;
import defpackage.k56;
import defpackage.kxb;
import defpackage.l25;
import defpackage.m0b;
import defpackage.m25;
import defpackage.mr0;
import defpackage.nec;
import defpackage.nj4;
import defpackage.o25;
import defpackage.od2;
import defpackage.p1c;
import defpackage.q7c;
import defpackage.s35;
import defpackage.tu0;
import defpackage.wuc;
import defpackage.x27;
import defpackage.zf3;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lone/me/settings/privacy/ui/pincode/EnterPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "j25", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class EnterPinCodeScreen extends Widget {
    public static final /* synthetic */ bc7[] X;
    public final x27 a;
    public final glc b;
    public final je7 c;
    public final q7c o;

    static {
        hob hobVar = new hob(EnterPinCodeScreen.class, "pinCodeView", "getPinCodeView()Lone/me/settings/privacy/ui/pincode/PinCodeView;", 0);
        nec.a.getClass();
        X = new bc7[]{hobVar};
    }

    public EnterPinCodeScreen() {
        super(null, 0, 3, null);
        this.a = x27.d;
        this.b = new glc(wuc.SETTINGS_PRIVACY_INSERT_PINCODE);
        this.c = createViewModelLazy(o25.class, new nj4(1, new zf3(26)));
        this.o = viewBinding(kxb.oneme_settings_privacy_enter_pin_code_root);
    }

    @Override // one.me.sdk.arch.Widget
    /* renamed from: getInsetsConfig, reason: from getter */
    public final x27 getA() {
        return this.a;
    }

    @Override // one.me.sdk.arch.Widget
    public final bvc getScreenDelegate() {
        return this.b;
    }

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m0b m0bVar = new m0b(viewGroup.getContext());
        m0bVar.setId(kxb.oneme_settings_privacy_enter_pin_code_root);
        m0bVar.setListener((o25) this.c.getValue());
        m0bVar.setTitle(p1c.oneme_settings_privacy_enter_pin_code_title);
        m0bVar.setDescription(Integer.valueOf(p1c.oneme_settings_privacy_enter_pin_code_description));
        m0bVar.setLocked(true);
        final int i = 0;
        m0bVar.setOnBackPress(new k56(this) { // from class: i25
            public final /* synthetic */ EnterPinCodeScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                e5f e5fVar = e5f.a;
                EnterPinCodeScreen enterPinCodeScreen = this.b;
                switch (i) {
                    case 0:
                        bc7[] bc7VarArr = EnterPinCodeScreen.X;
                        mr0.I(enterPinCodeScreen.getView());
                        i3a onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                            break;
                        }
                        break;
                    default:
                        bc7[] bc7VarArr2 = EnterPinCodeScreen.X;
                        o25 o25Var = (o25) enterPinCodeScreen.c.getValue();
                        if (!o25Var.t0) {
                            pnf.o(o25Var.Z, e5fVar);
                            break;
                        }
                        break;
                }
                return e5fVar;
            }
        });
        final int i2 = 1;
        m0bVar.setForgotPinCodeClickListener(new k56(this) { // from class: i25
            public final /* synthetic */ EnterPinCodeScreen b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                e5f e5fVar = e5f.a;
                EnterPinCodeScreen enterPinCodeScreen = this.b;
                switch (i2) {
                    case 0:
                        bc7[] bc7VarArr = EnterPinCodeScreen.X;
                        mr0.I(enterPinCodeScreen.getView());
                        i3a onBackPressedDispatcher = enterPinCodeScreen.getOnBackPressedDispatcher();
                        if (onBackPressedDispatcher != null) {
                            onBackPressedDispatcher.d();
                            break;
                        }
                        break;
                    default:
                        bc7[] bc7VarArr2 = EnterPinCodeScreen.X;
                        o25 o25Var = (o25) enterPinCodeScreen.c.getValue();
                        if (!o25Var.t0) {
                            pnf.o(o25Var.Z, e5fVar);
                            break;
                        }
                        break;
                }
                return e5fVar;
            }
        });
        return m0bVar;
    }

    @Override // defpackage.uu3
    public final void onDetach(View view) {
        mr0.I(view);
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        je7 je7Var = this.c;
        s35 s35Var = ((o25) je7Var.getValue()).X;
        fg7 fg7Var = fg7.o;
        od2.L(new zn5(tu0.g(s35Var, getViewLifecycleOwner().Q(), fg7Var), new k25(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((o25) je7Var.getValue()).Y, getViewLifecycleOwner().Q(), fg7Var), new l25(null, this), 5), getViewLifecycleScope());
        od2.L(new zn5(tu0.g(((o25) je7Var.getValue()).Z, getViewLifecycleOwner().Q(), fg7Var), new m25(null, this), 5), getViewLifecycleScope());
    }
}
