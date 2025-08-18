package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class cha {
    public static final /* synthetic */ cha[] X;
    public static final cha a;
    public static final cha b;
    public static final cha c;
    public static final cha o;

    static {
        cha chaVar = new cha("COLLAPSED", 0);
        a = chaVar;
        cha chaVar2 = new cha("ANIMATING_COLLAPSE", 1);
        b = chaVar2;
        cha chaVar3 = new cha("EXPANDED", 2);
        c = chaVar3;
        cha chaVar4 = new cha("ANIMATING_EXPAND", 3);
        o = chaVar4;
        X = new cha[]{chaVar, chaVar2, chaVar3, chaVar4};
    }

    public static cha valueOf(String str) {
        return (cha) Enum.valueOf(cha.class, str);
    }

    public static cha[] values() {
        return (cha[]) X.clone();
    }
}
