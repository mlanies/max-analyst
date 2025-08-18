package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class iaf {
    public static final /* synthetic */ iaf[] X;
    public static final iaf a;
    public static final iaf b;
    public static final iaf c;
    public static final iaf o;

    static {
        iaf iafVar = new iaf("MORE", 0);
        a = iafVar;
        iaf iafVar2 = new iaf("ROTATION", 1);
        b = iafVar2;
        iaf iafVar3 = new iaf("PIN", 2);
        c = iafVar3;
        iaf iafVar4 = new iaf("NONE", 3);
        o = iafVar4;
        X = new iaf[]{iafVar, iafVar2, iafVar3, iafVar4};
    }

    public static iaf valueOf(String str) {
        return (iaf) Enum.valueOf(iaf.class, str);
    }

    public static iaf[] values() {
        return (iaf[]) X.clone();
    }
}
