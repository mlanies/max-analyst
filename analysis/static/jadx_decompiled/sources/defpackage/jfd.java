package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jfd {
    public static final jfd X;
    public static final jfd Y;
    public static final /* synthetic */ jfd[] Z;
    public static final jfd a;
    public static final jfd b;
    public static final jfd c;
    public static final jfd o;

    static {
        jfd jfdVar = new jfd("ACTION", 0);
        a = jfdVar;
        jfd jfdVar2 = new jfd("SIMPLE", 1);
        b = jfdVar2;
        jfd jfdVar3 = new jfd("NEGATIVE", 2);
        c = jfdVar3;
        jfd jfdVar4 = new jfd("DISABLE", 3);
        o = jfdVar4;
        jfd jfdVar5 = new jfd("SIMPLE_TEXT_ONLY", 4);
        X = jfdVar5;
        jfd jfdVar6 = new jfd("PROMO", 5);
        Y = jfdVar6;
        Z = new jfd[]{jfdVar, jfdVar2, jfdVar3, jfdVar4, jfdVar5, jfdVar6};
    }

    public static jfd valueOf(String str) {
        return (jfd) Enum.valueOf(jfd.class, str);
    }

    public static jfd[] values() {
        return (jfd[]) Z.clone();
    }
}
