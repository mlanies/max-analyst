package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class enc {
    public static final enc a;
    public static final enc b;
    public static final /* synthetic */ enc[] c;

    static {
        enc encVar = new enc("OVAL", 0);
        a = encVar;
        enc encVar2 = new enc("RECT", 1);
        b = encVar2;
        c = new enc[]{encVar, encVar2};
    }

    public static enc valueOf(String str) {
        return (enc) Enum.valueOf(enc.class, str);
    }

    public static enc[] values() {
        return (enc[]) c.clone();
    }
}
