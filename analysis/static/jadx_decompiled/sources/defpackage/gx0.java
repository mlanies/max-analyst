package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class gx0 {
    public static final gx0 X;
    public static final gx0 Y;
    public static final gx0 Z;
    public static final gx0 a;
    public static final gx0 b;
    public static final gx0 c;
    public static final gx0 o;
    public static final gx0 s0;
    public static final gx0 t0;
    public static final /* synthetic */ gx0[] u0;

    static {
        gx0 gx0Var = new gx0("ROOT", 0);
        a = gx0Var;
        gx0 gx0Var2 = new gx0("IMAGES", 1);
        b = gx0Var2;
        gx0 gx0Var3 = new gx0("AUDIO", 2);
        c = gx0Var3;
        gx0 gx0Var4 = new gx0("GIF", 3);
        o = gx0Var4;
        gx0 gx0Var5 = new gx0("STICKERS", 4);
        X = gx0Var5;
        gx0 gx0Var6 = new gx0("UPLOAD", 5);
        Y = gx0Var6;
        gx0 gx0Var7 = new gx0("MUSIC", 6);
        Z = gx0Var7;
        gx0 gx0Var8 = new gx0("VIDEO", 7);
        s0 = gx0Var8;
        gx0 gx0Var9 = new gx0("OTHERS", 8);
        t0 = gx0Var9;
        u0 = new gx0[]{gx0Var, gx0Var2, gx0Var3, gx0Var4, gx0Var5, gx0Var6, gx0Var7, gx0Var8, gx0Var9};
    }

    public static gx0 valueOf(String str) {
        return (gx0) Enum.valueOf(gx0.class, str);
    }

    public static gx0[] values() {
        return (gx0[]) u0.clone();
    }
}
