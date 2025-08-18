package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class pq4 {
    public static final pq4 A0;
    public static final pq4 B0;
    public static final pq4 C0;
    public static final pq4 D0;
    public static final /* synthetic */ pq4[] E0;
    public static final pq4 X;
    public static final pq4 Y;
    public static final pq4 Z;
    public static final pq4 a;
    public static final pq4 b;
    public static final pq4 c;
    public static final pq4 o;
    public static final pq4 s0;
    public static final pq4 t0;
    public static final pq4 u0;
    public static final pq4 v0;
    public static final pq4 w0;
    public static final pq4 x0;
    public static final pq4 y0;
    public static final pq4 z0;

    static {
        pq4 pq4Var = new pq4("ON_SET_HIERARCHY", 0);
        a = pq4Var;
        pq4 pq4Var2 = new pq4("ON_CLEAR_HIERARCHY", 1);
        b = pq4Var2;
        pq4 pq4Var3 = new pq4("ON_SET_CONTROLLER", 2);
        c = pq4Var3;
        pq4 pq4Var4 = new pq4("ON_CLEAR_OLD_CONTROLLER", 3);
        o = pq4Var4;
        pq4 pq4Var5 = new pq4("ON_CLEAR_CONTROLLER", 4);
        X = pq4Var5;
        pq4 pq4Var6 = new pq4("ON_INIT_CONTROLLER", 5);
        Y = pq4Var6;
        pq4 pq4Var7 = new pq4("ON_ATTACH_CONTROLLER", 6);
        Z = pq4Var7;
        pq4 pq4Var8 = new pq4("ON_DETACH_CONTROLLER", 7);
        s0 = pq4Var8;
        pq4 pq4Var9 = new pq4("ON_RELEASE_CONTROLLER", 8);
        t0 = pq4Var9;
        pq4 pq4Var10 = new pq4("ON_DATASOURCE_SUBMIT", 9);
        u0 = pq4Var10;
        pq4 pq4Var11 = new pq4("ON_DATASOURCE_RESULT", 10);
        v0 = pq4Var11;
        pq4 pq4Var12 = new pq4("ON_DATASOURCE_RESULT_INT", 11);
        w0 = pq4Var12;
        pq4 pq4Var13 = new pq4("ON_DATASOURCE_FAILURE", 12);
        x0 = pq4Var13;
        pq4 pq4Var14 = new pq4("ON_DATASOURCE_FAILURE_INT", 13);
        y0 = pq4Var14;
        pq4 pq4Var15 = new pq4("ON_HOLDER_ATTACH", 14);
        z0 = pq4Var15;
        pq4 pq4Var16 = new pq4("ON_HOLDER_DETACH", 15);
        A0 = pq4Var16;
        pq4 pq4Var17 = new pq4("ON_DRAWABLE_SHOW", 16);
        B0 = pq4Var17;
        pq4 pq4Var18 = new pq4("ON_DRAWABLE_HIDE", 17);
        C0 = pq4Var18;
        pq4 pq4Var19 = new pq4("ON_ACTIVITY_START", 18);
        pq4 pq4Var20 = new pq4("ON_ACTIVITY_STOP", 19);
        pq4 pq4Var21 = new pq4("ON_RUN_CLEAR_CONTROLLER", 20);
        pq4 pq4Var22 = new pq4("ON_SCHEDULE_CLEAR_CONTROLLER", 21);
        pq4 pq4Var23 = new pq4("ON_SAME_CONTROLLER_SKIPPED", 22);
        pq4 pq4Var24 = new pq4("ON_SUBMIT_CACHE_HIT", 23);
        D0 = pq4Var24;
        E0 = new pq4[]{pq4Var, pq4Var2, pq4Var3, pq4Var4, pq4Var5, pq4Var6, pq4Var7, pq4Var8, pq4Var9, pq4Var10, pq4Var11, pq4Var12, pq4Var13, pq4Var14, pq4Var15, pq4Var16, pq4Var17, pq4Var18, pq4Var19, pq4Var20, pq4Var21, pq4Var22, pq4Var23, pq4Var24};
    }

    public static pq4 valueOf(String str) {
        return (pq4) Enum.valueOf(pq4.class, str);
    }

    public static pq4[] values() {
        return (pq4[]) E0.clone();
    }
}
