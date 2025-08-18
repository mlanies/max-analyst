package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class uka {
    public static final uka a;
    public static final uka b;
    public static final uka c;
    public static final /* synthetic */ uka[] o;

    static {
        uka ukaVar = new uka("Compact", 0);
        a = ukaVar;
        uka ukaVar2 = new uka("Main", 1);
        b = ukaVar2;
        uka ukaVar3 = new uka("Chat", 2);
        c = ukaVar3;
        o = new uka[]{ukaVar, ukaVar2, ukaVar3};
    }

    public static uka valueOf(String str) {
        return (uka) Enum.valueOf(uka.class, str);
    }

    public static uka[] values() {
        return (uka[]) o.clone();
    }
}
