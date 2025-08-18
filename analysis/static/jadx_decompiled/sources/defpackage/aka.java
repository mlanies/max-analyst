package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class aka {
    public static final aka a;
    public static final aka b;
    public static final /* synthetic */ aka[] c;

    static {
        aka akaVar = new aka("ERROR", 0);
        a = akaVar;
        aka akaVar2 = new aka("HINT", 1);
        b = akaVar2;
        c = new aka[]{akaVar, akaVar2};
    }

    public static aka valueOf(String str) {
        return (aka) Enum.valueOf(aka.class, str);
    }

    public static aka[] values() {
        return (aka[]) c.clone();
    }
}
