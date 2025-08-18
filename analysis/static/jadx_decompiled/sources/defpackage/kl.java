package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kl {
    public static final /* synthetic */ kl[] X;
    public static final kl a;
    public static final kl b;
    public static final kl c;
    public static final kl o;

    static {
        kl klVar = new kl("NONE", 0);
        a = klVar;
        kl klVar2 = new kl("APPLICATION", 1);
        b = klVar2;
        kl klVar3 = new kl("OPT_SESSION", 2);
        c = klVar3;
        kl klVar4 = new kl("SESSION", 3);
        o = klVar4;
        X = new kl[]{klVar, klVar2, klVar3, klVar4};
    }

    public static kl valueOf(String str) {
        return (kl) Enum.valueOf(kl.class, str);
    }

    public static kl[] values() {
        return (kl[]) X.clone();
    }
}
