package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d3b {
    public static final d3b X;
    public static final /* synthetic */ d3b[] Y;
    public static final /* synthetic */ v25 Z;
    public static final xxc b;
    public static final d3b c;
    public static final d3b o;
    public final float a;

    static {
        d3b d3bVar = new d3b(1.0f, 0, "X1");
        c = d3bVar;
        d3b d3bVar2 = new d3b(1.5f, 1, "X1_5");
        o = d3bVar2;
        d3b d3bVar3 = new d3b(2.0f, 2, "X2");
        X = d3bVar3;
        d3b[] d3bVarArr = {d3bVar, d3bVar2, d3bVar3};
        Y = d3bVarArr;
        Z = new v25(d3bVarArr);
        b = new xxc();
    }

    public d3b(float f, int i, String str) {
        this.a = f;
    }

    public static d3b valueOf(String str) {
        return (d3b) Enum.valueOf(d3b.class, str);
    }

    public static d3b[] values() {
        return (d3b[]) Y.clone();
    }
}
