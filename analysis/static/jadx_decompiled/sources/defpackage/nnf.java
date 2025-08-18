package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class nnf {
    public static final nnf a;
    public static final nnf b;
    public static final nnf c;
    public static final /* synthetic */ nnf[] o;

    static {
        nnf nnfVar = new nnf("SPEAKER", 0);
        a = nnfVar;
        nnf nnfVar2 = new nnf("SHARING", 1);
        b = nnfVar2;
        nnf nnfVar3 = new nnf("GRID", 2);
        c = nnfVar3;
        o = new nnf[]{nnfVar, nnfVar2, nnfVar3};
    }

    public static nnf valueOf(String str) {
        return (nnf) Enum.valueOf(nnf.class, str);
    }

    public static nnf[] values() {
        return (nnf[]) o.clone();
    }
}
