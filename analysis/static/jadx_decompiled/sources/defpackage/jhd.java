package defpackage;

import one.me.settings.privacy.ui.SettingsPrivacyScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class jhd implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SettingsPrivacyScreen b;

    public /* synthetic */ jhd(SettingsPrivacyScreen settingsPrivacyScreen, int i) {
        this.a = i;
        this.b = settingsPrivacyScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        SettingsPrivacyScreen settingsPrivacyScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = SettingsPrivacyScreen.Z;
                ehd ehdVar = ehd.a;
                return new cid(new rdd(ehdVar.getAccessor().d(av0.class), (kke) ((khe) ehdVar.b()).getValue()), new l7b(ehdVar.getAccessor().d(q33.class), 10, new jhd(settingsPrivacyScreen, 1)), (kke) ((khe) ehdVar.b()).getValue(), ehdVar.getAccessor().d(kxc.class), ehdVar.getAccessor().d(y7d.class), ehdVar.getAccessor().d(q33.class), ehdVar.getAccessor().d(qe5.class), ehdVar.getAccessor().d(pk.class), ehdVar.getAccessor().d(xie.class), (ie3) ehdVar.getAccessor().c(ie3.class));
            default:
                bc7[] bc7VarArr2 = SettingsPrivacyScreen.Z;
                return settingsPrivacyScreen.getContext();
        }
    }
}
