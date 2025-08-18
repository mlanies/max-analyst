package defpackage;

import java.util.concurrent.TimeUnit;

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
public final class hr7 {
    public static final hr7 X;
    public static final hr7 Y;
    public static final hr7 Z;
    public static final hr7 c;
    public static final hr7 o;
    public static final /* synthetic */ hr7[] s0;
    public final long a;
    public final long b;

    static {
        hr7 hr7Var = new hr7(0, 20L, TimeUnit.MINUTES.toSeconds(20L), "MIN_20");
        c = hr7Var;
        TimeUnit timeUnit = TimeUnit.HOURS;
        hr7 hr7Var2 = new hr7(1, 1L, timeUnit.toSeconds(1L), "HOUR_1");
        o = hr7Var2;
        hr7 hr7Var3 = new hr7(2, 3L, timeUnit.toSeconds(3L), "HOUR_3");
        X = hr7Var3;
        hr7 hr7Var4 = new hr7(3, 24L, timeUnit.toSeconds(24L), "HOUR_24");
        Y = hr7Var4;
        hr7 hr7Var5 = new hr7(4, Long.MAX_VALUE, Long.MAX_VALUE, "NO_LIMIT");
        Z = hr7Var5;
        s0 = new hr7[]{hr7Var, hr7Var2, hr7Var3, hr7Var4, hr7Var5};
    }

    public hr7(int i, long j, long j2, String str) {
        this.a = j;
        this.b = j2;
    }

    public static hr7 valueOf(String str) {
        return (hr7) Enum.valueOf(hr7.class, str);
    }

    public static hr7[] values() {
        return (hr7[]) s0.clone();
    }
}
