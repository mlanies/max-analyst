package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class uj {
    public static final uj a;
    public static final uj b;
    public static final uj c;
    public static final /* synthetic */ uj[] o;

    static {
        uj ujVar = new uj("EMPTY", 0);
        a = ujVar;
        uj ujVar2 = new uj("STATIC", 1);
        b = ujVar2;
        uj ujVar3 = new uj("RLOTTIE", 2);
        c = ujVar3;
        o = new uj[]{ujVar, ujVar2, ujVar3};
    }

    public static uj valueOf(String str) {
        return (uj) Enum.valueOf(uj.class, str);
    }

    public static uj[] values() {
        return (uj[]) o.clone();
    }
}
