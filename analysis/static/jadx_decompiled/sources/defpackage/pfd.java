package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pfd {
    public static final pfd a;
    public static final pfd b;
    public static final /* synthetic */ pfd[] c;

    static {
        pfd pfdVar = new pfd("NONE", 0);
        a = pfdVar;
        pfd pfdVar2 = new pfd("DARK", 1);
        b = pfdVar2;
        c = new pfd[]{pfdVar, pfdVar2};
    }

    public static pfd valueOf(String str) {
        return (pfd) Enum.valueOf(pfd.class, str);
    }

    public static pfd[] values() {
        return (pfd[]) c.clone();
    }
}
