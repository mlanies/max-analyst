package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s16 {
    public static final s16 X;
    public static final s16 Y;
    public static final s16 Z;
    public static final s16 a;
    public static final s16 b;
    public static final s16 c;
    public static final s16 o;
    public static final /* synthetic */ s16[] s0;

    /* JADX INFO: Fake field, exist only in values array */
    s16 EF0;

    static {
        s16 s16Var = new s16("PENALTY_LOG", 0);
        s16 s16Var2 = new s16("PENALTY_DEATH", 1);
        s16 s16Var3 = new s16("DETECT_FRAGMENT_REUSE", 2);
        a = s16Var3;
        s16 s16Var4 = new s16("DETECT_FRAGMENT_TAG_USAGE", 3);
        b = s16Var4;
        s16 s16Var5 = new s16("DETECT_WRONG_NESTED_HIERARCHY", 4);
        c = s16Var5;
        s16 s16Var6 = new s16("DETECT_RETAIN_INSTANCE_USAGE", 5);
        o = s16Var6;
        s16 s16Var7 = new s16("DETECT_SET_USER_VISIBLE_HINT", 6);
        X = s16Var7;
        s16 s16Var8 = new s16("DETECT_TARGET_FRAGMENT_USAGE", 7);
        Y = s16Var8;
        s16 s16Var9 = new s16("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        Z = s16Var9;
        s0 = new s16[]{s16Var, s16Var2, s16Var3, s16Var4, s16Var5, s16Var6, s16Var7, s16Var8, s16Var9};
    }

    public static s16 valueOf(String str) {
        return (s16) Enum.valueOf(s16.class, str);
    }

    public static s16[] values() {
        return (s16[]) s0.clone();
    }
}
