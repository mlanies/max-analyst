package one.me.settings.privacy.ui.pincode;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import defpackage.ajd;
import defpackage.bvc;
import defpackage.fg7;
import defpackage.glc;
import defpackage.je7;
import defpackage.kxb;
import defpackage.m0b;
import defpackage.nhd;
import defpackage.od2;
import defpackage.p1c;
import defpackage.t03;
import defpackage.tu0;
import defpackage.wuc;
import defpackage.x27;
import defpackage.xid;
import defpackage.yid;
import defpackage.zja;
import defpackage.zn5;
import kotlin.Metadata;
import one.me.sdk.arch.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/settings/privacy/ui/pincode/SetupPinCodeScreen;", "Lone/me/sdk/arch/Widget;", "<init>", "()V", "settings-privacy_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
/* loaded from: classes2.dex */
public final class SetupPinCodeScreen extends Widget {
    public static final /* synthetic */ int o = 0;
    public final je7 a;
    public final glc b;
    public final x27 c;

    public SetupPinCodeScreen() {
        super(null, 0, 3, null);
        this.a = createViewModelLazy(ajd.class, new nhd(2, new xid(0)));
        this.b = new glc(wuc.SETTINGS_PRIVACY_NEW_PINCODE);
        this.c = x27.d;
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

    @Override // one.me.sdk.arch.Widget, defpackage.uu3
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m0b m0bVar = new m0b(viewGroup.getContext());
        m0bVar.setId(kxb.oneme_settings_privacy_setup_pin_code_root_view);
        m0bVar.setListener((ajd) this.a.getValue());
        m0bVar.setTitle(p1c.oneme_settings_privacy_onboarding_come_up_pin_code);
        m0bVar.setLocked(false);
        m0bVar.setOnBackPress(new zja(m0bVar, 20, this));
        return m0bVar;
    }

    @Override // one.me.sdk.arch.Widget
    public final void onViewCreated(View view) {
        od2.L(new zn5(tu0.g(new t03(((ajd) this.a.getValue()).X, 11), getViewLifecycleOwner().Q(), fg7.o), new yid(2, null), 5), getViewLifecycleScope());
    }
}
