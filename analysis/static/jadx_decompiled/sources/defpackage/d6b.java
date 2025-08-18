package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d6b {
    public static final /* synthetic */ v25 X;
    public static final d6b a;
    public static final d6b b;
    public static final d6b c;
    public static final /* synthetic */ d6b[] o;

    static {
        d6b d6bVar = new d6b("INVISIBLE", 0);
        a = d6bVar;
        d6b d6bVar2 = new d6b("HALF_SCREEN", 1);
        b = d6bVar2;
        d6b d6bVar3 = new d6b("FULL_SCREEN", 2);
        c = d6bVar3;
        d6b[] d6bVarArr = {d6bVar, d6bVar2, d6bVar3};
        o = d6bVarArr;
        X = new v25(d6bVarArr);
    }

    public static d6b valueOf(String str) {
        return (d6b) Enum.valueOf(d6b.class, str);
    }

    public static d6b[] values() {
        return (d6b[]) o.clone();
    }
}
