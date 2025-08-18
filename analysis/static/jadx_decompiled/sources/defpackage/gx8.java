package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gx8 {
    public static final /* synthetic */ v25 X;
    public static final yb9 b;
    public static final gx8 c;
    public static final /* synthetic */ gx8[] o;
    public final int a;

    static {
        gx8 gx8Var = new gx8("EMOJI", 0, 0);
        c = gx8Var;
        gx8[] gx8VarArr = {gx8Var, new gx8("STICKER", 1, 1)};
        o = gx8VarArr;
        X = new v25(gx8VarArr);
        b = new yb9();
    }

    public gx8(String str, int i, int i2) {
        this.a = i2;
    }

    public static gx8 valueOf(String str) {
        return (gx8) Enum.valueOf(gx8.class, str);
    }

    public static gx8[] values() {
        return (gx8[]) o.clone();
    }
}
