package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class bua {
    public static final bua a;
    public static final bua b;
    public static final /* synthetic */ bua[] c;

    static {
        bua buaVar = new bua("GRANTED", 0);
        a = buaVar;
        bua buaVar2 = new bua("DENIED", 1);
        b = buaVar2;
        c = new bua[]{buaVar, buaVar2};
    }

    public static bua valueOf(String str) {
        return (bua) Enum.valueOf(bua.class, str);
    }

    public static bua[] values() {
        return (bua[]) c.clone();
    }
}
