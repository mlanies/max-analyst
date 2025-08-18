package defpackage;

import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class fhd implements k64, m66 {
    public final /* synthetic */ int a;
    public static final fhd b = new fhd(0);
    public static final fhd c = new fhd(1);
    public static final fhd o = new fhd(2);
    public static final fhd X = new fhd(3);

    public /* synthetic */ fhd(int i) {
        this.a = i;
    }

    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                return new SettingsPrivacyScreen();
            case 1:
                return new SettingsBlacklistScreen();
            case 2:
                return new SafeModeOnboardingScreen();
            default:
                return new SetupPinCodeScreen();
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof k64) && (obj instanceof m66)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof k64) && (obj instanceof m66)) {
                    break;
                }
                break;
            case 2:
                if ((obj instanceof k64) && (obj instanceof m66)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof k64) && (obj instanceof m66)) {
                    break;
                }
                break;
        }
        return tpa.f(getFunctionDelegate(), ((m66) obj).getFunctionDelegate());
    }

    @Override // defpackage.m66
    public final f66 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new p66(0, SettingsPrivacyScreen.class, "<init>", "<init>()V", 0);
            case 1:
                return new p66(0, SettingsBlacklistScreen.class, "<init>", "<init>()V", 0);
            case 2:
                return new p66(0, SafeModeOnboardingScreen.class, "<init>", "<init>()V", 0);
            default:
                return new p66(0, SetupPinCodeScreen.class, "<init>", "<init>()V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
