package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class jce {
    public static final jce X;
    public static final /* synthetic */ jce[] Y;
    public static final jce a;
    public static final jce b;
    public static final jce c;
    public static final jce o;

    static {
        jce jceVar = new jce("TAGS", 0);
        a = jceVar;
        jce jceVar2 = new jce("CONTACT_TAGS", 1);
        b = jceVar2;
        jce jceVar3 = new jce("COMMANDS", 2);
        c = jceVar3;
        jce jceVar4 = new jce("DESCRIPTION", 3);
        o = jceVar4;
        jce jceVar5 = new jce("UNKNOWN", 4);
        X = jceVar5;
        Y = new jce[]{jceVar, jceVar2, jceVar3, jceVar4, jceVar5};
    }

    public static jce valueOf(String str) {
        return (jce) Enum.valueOf(jce.class, str);
    }

    public static jce[] values() {
        return (jce[]) Y.clone();
    }
}
