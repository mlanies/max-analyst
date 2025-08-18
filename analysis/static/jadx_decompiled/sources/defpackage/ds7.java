package defpackage;

import java.util.Locale;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'o' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public final class ds7 {
    public static final ds7 X;
    public static final ds7 Y;
    public static final ds7 Z;
    public static final ds7 c;
    public static final ds7 o;
    public static final ds7 s0;
    public static final ds7 t0;
    public static final /* synthetic */ ds7[] u0;
    public final us7 a;
    public final String b;

    static {
        ds7 ds7Var = new ds7("SEND", 0);
        c = ds7Var;
        us7 us7Var = us7.s0;
        ds7 ds7Var2 = new ds7("EXCEPTION", 1, us7Var);
        o = ds7Var2;
        ds7 ds7Var3 = new ds7("SEND_ACK", 2);
        X = ds7Var3;
        ds7 ds7Var4 = new ds7("QUEUE", 3);
        Y = ds7Var4;
        ds7 ds7Var5 = new ds7("ERROR", 4, us7Var);
        Z = ds7Var5;
        ds7 ds7Var6 = new ds7("RECEIVE", 5);
        s0 = ds7Var6;
        ds7 ds7Var7 = new ds7("NOTIF", 6);
        t0 = ds7Var7;
        u0 = new ds7[]{ds7Var, ds7Var2, ds7Var3, ds7Var4, ds7Var5, ds7Var6, ds7Var7};
    }

    public /* synthetic */ ds7(String str, int i) {
        this(str, i, us7.X);
    }

    public static ds7 valueOf(String str) {
        return (ds7) Enum.valueOf(ds7.class, str);
    }

    public static ds7[] values() {
        return (ds7[]) u0.clone();
    }

    public ds7(String str, int i, us7 us7Var) {
        this.a = us7Var;
        this.b = name().toLowerCase(Locale.ROOT);
    }
}
