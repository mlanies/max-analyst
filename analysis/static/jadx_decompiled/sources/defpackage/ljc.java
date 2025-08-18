package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ljc {
    public static final c32 a;
    public static final /* synthetic */ ljc[] b;
    public static final /* synthetic */ v25 c;

    static {
        ljc[] ljcVarArr = {new ljc("LIMITED_TO_REVERSE_CONTACTS", 0)};
        b = ljcVarArr;
        c = new v25(ljcVarArr);
        a = new c32(16, (byte) 0);
    }

    public static ljc valueOf(String str) {
        return (ljc) Enum.valueOf(ljc.class, str);
    }

    public static ljc[] values() {
        return (ljc[]) b.clone();
    }
}
