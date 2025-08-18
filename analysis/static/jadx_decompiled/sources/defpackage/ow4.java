package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ow4 {
    public static final ow4 X;
    public static final ow4 Y;
    public static final ow4 Z;
    public static final ob6 o;
    public static final /* synthetic */ ow4[] s0;
    public static final /* synthetic */ v25 t0;
    public final int a;
    public final jqe b;
    public final int c;

    static {
        ow4 ow4Var = new ow4("RECENT", 0, -1, new eqe(kca.l), woc.d2);
        X = ow4Var;
        ow4 ow4Var2 = new ow4("CLASSIC", 1, 0, new eqe(kca.b), woc.Z0);
        Y = ow4Var2;
        ow4 ow4Var3 = new ow4("GESTURES_AND_PEOPLE", 2, 1, new eqe(kca.e), woc.S);
        ow4 ow4Var4 = new ow4("ANIMALS_AND_PLANTS", 3, 2, new eqe(kca.a), ica.h);
        ow4 ow4Var5 = new ow4("FOOD_AND_DRINK", 4, 3, new eqe(kca.d), ica.b);
        ow4 ow4Var6 = new ow4("SPORT_AND_ACTIVITY", 5, 4, new eqe(kca.g), ica.c);
        ow4 ow4Var7 = new ow4("TRAVELS_AND_TRANSPORT", 6, 5, new eqe(kca.i), ica.d);
        ow4 ow4Var8 = new ow4("OBJECTS", 7, 6, new eqe(kca.f), ica.g);
        ow4 ow4Var9 = new ow4("SYMBOLS", 8, 7, new eqe(kca.h), ica.j);
        ow4 ow4Var10 = new ow4("FLAGS", 9, 8, new eqe(kca.c), ica.f);
        ow4 ow4Var11 = new ow4("ANIMOJI", 10, 9, jqe.a, 0);
        Z = ow4Var11;
        ow4[] ow4VarArr = {ow4Var, ow4Var2, ow4Var3, ow4Var4, ow4Var5, ow4Var6, ow4Var7, ow4Var8, ow4Var9, ow4Var10, ow4Var11};
        s0 = ow4VarArr;
        t0 = new v25(ow4VarArr);
        o = new ob6();
    }

    public ow4(String str, int i, int i2, jqe jqeVar, int i3) {
        this.a = i2;
        this.b = jqeVar;
        this.c = i3;
    }

    public static ow4 valueOf(String str) {
        return (ow4) Enum.valueOf(ow4.class, str);
    }

    public static ow4[] values() {
        return (ow4[]) s0.clone();
    }
}
