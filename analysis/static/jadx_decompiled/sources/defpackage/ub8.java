package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ub8 {
    public static final ub8 X;
    public static final /* synthetic */ ub8[] Y;
    public static final /* synthetic */ v25 Z;
    public static final kj6 a;
    public static final ub8 b;
    public static final ub8 c;
    public static final ub8 o;

    static {
        ub8 ub8Var = new ub8("UNKNOWN", 0);
        b = ub8Var;
        ub8 ub8Var2 = new ub8("AUDIO_MESSAGE", 1);
        c = ub8Var2;
        ub8 ub8Var3 = new ub8("AUDIO_DRAFT", 2);
        ub8 ub8Var4 = new ub8("AUDIO_RECORD", 3);
        o = ub8Var4;
        ub8 ub8Var5 = new ub8("MUSIC_FILE", 4);
        X = ub8Var5;
        ub8[] ub8VarArr = {ub8Var, ub8Var2, ub8Var3, ub8Var4, ub8Var5};
        Y = ub8VarArr;
        Z = new v25(ub8VarArr);
        a = new kj6(13);
    }

    public static ub8 valueOf(String str) {
        return (ub8) Enum.valueOf(ub8.class, str);
    }

    public static ub8[] values() {
        return (ub8[]) Y.clone();
    }
}
