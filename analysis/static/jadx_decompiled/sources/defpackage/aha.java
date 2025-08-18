package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class aha {
    public static final aha a;
    public static final aha b;
    public static final /* synthetic */ aha[] c;

    static {
        aha ahaVar = new aha("BUTTON", 0);
        a = ahaVar;
        aha ahaVar2 = new aha("ICON", 1);
        b = ahaVar2;
        c = new aha[]{ahaVar, ahaVar2};
    }

    public static aha valueOf(String str) {
        return (aha) Enum.valueOf(aha.class, str);
    }

    public static aha[] values() {
        return (aha[]) c.clone();
    }
}
