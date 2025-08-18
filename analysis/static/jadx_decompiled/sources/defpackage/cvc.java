package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cvc {
    public static final cvc a;
    public static final cvc b;
    public static final /* synthetic */ cvc[] c;

    static {
        cvc cvcVar = new cvc("PREVIEW_VIEW", 0);
        a = cvcVar;
        cvc cvcVar2 = new cvc("SCREEN_FLASH_VIEW", 1);
        b = cvcVar2;
        c = new cvc[]{cvcVar, cvcVar2};
    }

    public static cvc valueOf(String str) {
        return (cvc) Enum.valueOf(cvc.class, str);
    }

    public static cvc[] values() {
        return (cvc[]) c.clone();
    }
}
