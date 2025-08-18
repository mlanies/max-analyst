package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class gp0 {
    public static final gp0 a;
    public static final /* synthetic */ gp0[] b;

    /* JADX INFO: Fake field, exist only in values array */
    gp0 EF0;

    static {
        gp0 gp0Var = new gp0("CLEAR", 0);
        gp0 gp0Var2 = new gp0("SRC", 1);
        gp0 gp0Var3 = new gp0("DST", 2);
        gp0 gp0Var4 = new gp0("SRC_OVER", 3);
        gp0 gp0Var5 = new gp0("DST_OVER", 4);
        gp0 gp0Var6 = new gp0("SRC_IN", 5);
        gp0 gp0Var7 = new gp0("DST_IN", 6);
        gp0 gp0Var8 = new gp0("SRC_OUT", 7);
        gp0 gp0Var9 = new gp0("DST_OUT", 8);
        gp0 gp0Var10 = new gp0("SRC_ATOP", 9);
        a = gp0Var10;
        b = new gp0[]{gp0Var, gp0Var2, gp0Var3, gp0Var4, gp0Var5, gp0Var6, gp0Var7, gp0Var8, gp0Var9, gp0Var10, new gp0("DST_ATOP", 10), new gp0("XOR", 11), new gp0("PLUS", 12), new gp0("MODULATE", 13), new gp0("SCREEN", 14), new gp0("OVERLAY", 15), new gp0("DARKEN", 16), new gp0("LIGHTEN", 17), new gp0("COLOR_DODGE", 18), new gp0("COLOR_BURN", 19), new gp0("HARD_LIGHT", 20), new gp0("SOFT_LIGHT", 21), new gp0("DIFFERENCE", 22), new gp0("EXCLUSION", 23), new gp0("MULTIPLY", 24), new gp0("HUE", 25), new gp0("SATURATION", 26), new gp0("COLOR", 27), new gp0("LUMINOSITY", 28)};
    }

    public static gp0 valueOf(String str) {
        return (gp0) Enum.valueOf(gp0.class, str);
    }

    public static gp0[] values() {
        return (gp0[]) b.clone();
    }
}
