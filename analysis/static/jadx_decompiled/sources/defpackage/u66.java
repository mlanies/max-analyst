package defpackage;

import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class u66 implements Comparator {
    public static final u66 a;
    public static final /* synthetic */ u66[] b;

    static {
        u66 u66Var = new u66("INSTANCE", 0);
        a = u66Var;
        b = new u66[]{u66Var};
    }

    public static u66 valueOf(String str) {
        return (u66) Enum.valueOf(u66.class, str);
    }

    public static u66[] values() {
        return (u66[]) b.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo(obj2);
    }
}
