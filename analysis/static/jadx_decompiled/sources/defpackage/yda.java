package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class yda {
    public static final yda a;
    public static final /* synthetic */ yda[] b;

    /* JADX INFO: Fake field, exist only in values array */
    yda EF0;

    static {
        yda ydaVar = new yda("TITLE", 0);
        yda ydaVar2 = new yda("SUBTITLE", 1);
        yda ydaVar3 = new yda("NONE", 2);
        a = ydaVar3;
        b = new yda[]{ydaVar, ydaVar2, ydaVar3};
    }

    public static yda valueOf(String str) {
        return (yda) Enum.valueOf(yda.class, str);
    }

    public static yda[] values() {
        return (yda[]) b.clone();
    }
}
