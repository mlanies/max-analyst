package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class g9g {
    public static final g9g X;
    public static final g9g Y;
    public static final /* synthetic */ g9g[] Z;
    public static final g9g c;
    public static final g9g o;
    public static final /* synthetic */ v25 s0;
    public final char a;
    public final char b;

    static {
        g9g g9gVar = new g9g("OBJ", 0, '{', '}');
        c = g9gVar;
        g9g g9gVar2 = new g9g("LIST", 1, '[', ']');
        o = g9gVar2;
        g9g g9gVar3 = new g9g("MAP", 2, '{', '}');
        X = g9gVar3;
        g9g g9gVar4 = new g9g("POLY_OBJ", 3, '[', ']');
        Y = g9gVar4;
        g9g[] g9gVarArr = {g9gVar, g9gVar2, g9gVar3, g9gVar4};
        Z = g9gVarArr;
        s0 = new v25(g9gVarArr);
    }

    public g9g(String str, int i, char c2, char c3) {
        this.a = c2;
        this.b = c3;
    }

    public static g9g valueOf(String str) {
        return (g9g) Enum.valueOf(g9g.class, str);
    }

    public static g9g[] values() {
        return (g9g[]) Z.clone();
    }
}
