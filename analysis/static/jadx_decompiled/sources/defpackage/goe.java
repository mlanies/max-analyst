package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class goe {
    public static final goe X;
    public static final /* synthetic */ goe[] Y;
    public static final /* synthetic */ v25 Z;
    public static final crd b;
    public static final goe c;
    public static final goe o;
    public final int a;

    static {
        goe goeVar = new goe("WAITING", 0, 0);
        c = goeVar;
        goe goeVar2 = new goe("PROCESSING", 1, 10);
        o = goeVar2;
        goe goeVar3 = new goe("FAILED", 2, 20);
        X = goeVar3;
        goe[] goeVarArr = {goeVar, goeVar2, goeVar3};
        Y = goeVarArr;
        Z = new v25(goeVarArr);
        b = new crd();
    }

    public goe(String str, int i, int i2) {
        this.a = i2;
    }

    public static goe valueOf(String str) {
        return (goe) Enum.valueOf(goe.class, str);
    }

    public static goe[] values() {
        return (goe[]) Y.clone();
    }
}
