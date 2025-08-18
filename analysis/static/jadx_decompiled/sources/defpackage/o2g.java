package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class o2g implements yxf {
    public static final /* synthetic */ o2g[] X;
    public static final /* synthetic */ v25 Y;
    public static final c32 o;
    public final String a;
    public final String b;
    public final Integer c = null;

    static {
        o2g[] o2gVarArr = {new o2g("READY", 0, "WebAppReady", "ready"), new o2g("CLOSE", 1, "WebAppClose", "close"), new o2g("SETUP_BACK_BUTTON", 2, "WebAppSetupBackButton", "setup_back_button"), new o2g("SETUP_CLOSING_BEHAVIOUR", 3, "WebAppSetupClosingBehavior", "setup_closing_behaviour"), new o2g("ON_CLICK_BACK", 4, "WebAppBackButtonPressed", "back_button_pressed"), new o2g("SETUP_SCREEN_CAPTURE_BEHAVIOR", 5, "WebAppSetupScreenCaptureBehavior", "setup_screen_capture_behavior")};
        X = o2gVarArr;
        Y = new v25(o2gVarArr);
        o = new c32(19, (byte) 0);
    }

    public o2g(String str, int i, String str2, String str3) {
        this.a = str2;
        this.b = str3;
    }

    public static o2g valueOf(String str) {
        return (o2g) Enum.valueOf(o2g.class, str);
    }

    public static o2g[] values() {
        return (o2g[]) X.clone();
    }

    @Override // defpackage.yxf
    public final Integer a() {
        return this.c;
    }

    @Override // defpackage.yxf
    public final String b() {
        return this.a;
    }

    @Override // defpackage.yxf
    public final String c() {
        return this.b;
    }
}
