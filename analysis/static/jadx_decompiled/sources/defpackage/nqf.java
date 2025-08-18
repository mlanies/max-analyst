package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nqf {
    public static final nqf a;
    public static final nqf b;
    public static final nqf c;
    public static final /* synthetic */ nqf[] o;

    static {
        nqf nqfVar = new nqf("UNKNOWN", 0);
        a = nqfVar;
        nqf nqfVar2 = new nqf("VISIBLE", 1);
        b = nqfVar2;
        nqf nqfVar3 = new nqf("INVISIBLE", 2);
        c = nqfVar3;
        o = new nqf[]{nqfVar, nqfVar2, nqfVar3};
        values();
    }

    public static nqf valueOf(String str) {
        return (nqf) Enum.valueOf(nqf.class, str);
    }

    public static nqf[] values() {
        return (nqf[]) o.clone();
    }
}
