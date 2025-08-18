package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class paa {
    public static final paa a;
    public static final paa b;
    public static final paa c;
    public static final /* synthetic */ paa[] o;

    static {
        paa paaVar = new paa("Themed", 0);
        a = paaVar;
        paa paaVar2 = new paa("ContrastPinned", 1);
        paa paaVar3 = new paa("NeutralFade", 2);
        b = paaVar3;
        paa paaVar4 = new paa("AccentRed", 3);
        c = paaVar4;
        o = new paa[]{paaVar, paaVar2, paaVar3, paaVar4};
    }

    public static paa valueOf(String str) {
        return (paa) Enum.valueOf(paa.class, str);
    }

    public static paa[] values() {
        return (paa[]) o.clone();
    }
}
