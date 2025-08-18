package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cpa {
    public static final /* synthetic */ cpa[] X;
    public static final cpa a;
    public static final cpa b;
    public static final cpa c;
    public static final cpa o;

    static {
        cpa cpaVar = new cpa("Loading", 0);
        a = cpaVar;
        cpa cpaVar2 = new cpa("PartialSuccess", 1);
        b = cpaVar2;
        cpa cpaVar3 = new cpa("Success", 2);
        c = cpaVar3;
        cpa cpaVar4 = new cpa("Error", 3);
        o = cpaVar4;
        X = new cpa[]{cpaVar, cpaVar2, cpaVar3, cpaVar4};
    }

    public static cpa valueOf(String str) {
        return (cpa) Enum.valueOf(cpa.class, str);
    }

    public static cpa[] values() {
        return (cpa[]) X.clone();
    }
}
