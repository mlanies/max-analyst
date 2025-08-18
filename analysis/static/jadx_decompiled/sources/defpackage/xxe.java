package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class xxe {
    public static final xxe a;
    public static final xxe b;
    public static final xxe c;
    public static final /* synthetic */ xxe[] o;

    static {
        xxe xxeVar = new xxe("DUMMY", 0);
        a = xxeVar;
        xxe xxeVar2 = new xxe("DIRECT", 1);
        b = xxeVar2;
        xxe xxeVar3 = new xxe("SERVER", 2);
        c = xxeVar3;
        o = new xxe[]{xxeVar, xxeVar2, xxeVar3};
    }

    public static final xxe a(String str) {
        return str.equals("DIRECT") ? b : str.equals("SERVER") ? c : a;
    }

    public static xxe valueOf(String str) {
        return (xxe) Enum.valueOf(xxe.class, str);
    }

    public static xxe[] values() {
        return (xxe[]) o.clone();
    }
}
