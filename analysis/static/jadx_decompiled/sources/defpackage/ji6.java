package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ji6 {
    public static final ji6 X;
    public static final ji6 Y;
    public static final /* synthetic */ ji6[] Z;
    public static final ji6 a;
    public static final ji6 b;
    public static final ji6 c;
    public static final ji6 o;

    static {
        ji6 ji6Var = new ji6("TIMEOUT", 0);
        a = ji6Var;
        ji6 ji6Var2 = new ji6("BUSY", 1);
        b = ji6Var2;
        ji6 ji6Var3 = new ji6("MISSED", 2);
        ji6 ji6Var4 = new ji6("REJECTED", 3);
        c = ji6Var4;
        ji6 ji6Var5 = new ji6("FAILED", 4);
        ji6 ji6Var6 = new ji6("HUNGUP", 5);
        o = ji6Var6;
        ji6 ji6Var7 = new ji6("CANCELED", 6);
        X = ji6Var7;
        ji6 ji6Var8 = new ji6("CALL_TIMEOUT", 7);
        ji6 ji6Var9 = new ji6("REMOVED", 8);
        ji6 ji6Var10 = new ji6("OBSOLETE_CLIENT", 9);
        Y = ji6Var10;
        Z = new ji6[]{ji6Var, ji6Var2, ji6Var3, ji6Var4, ji6Var5, ji6Var6, ji6Var7, ji6Var8, ji6Var9, ji6Var10};
    }

    public static ji6 valueOf(String str) {
        return (ji6) Enum.valueOf(ji6.class, str);
    }

    public static ji6[] values() {
        return (ji6[]) Z.clone();
    }
}
