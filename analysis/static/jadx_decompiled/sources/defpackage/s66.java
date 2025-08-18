package defpackage;

import java.util.HashSet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class s66 implements kde {
    public static final s66 a;
    public static final /* synthetic */ s66[] b;

    static {
        s66 s66Var = new s66("INSTANCE", 0);
        a = s66Var;
        b = new s66[]{s66Var};
    }

    public static s66 valueOf(String str) {
        return (s66) Enum.valueOf(s66.class, str);
    }

    public static s66[] values() {
        return (s66[]) b.clone();
    }

    @Override // defpackage.kde
    public final Object get() {
        return new HashSet();
    }
}
