package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class dbd {
    public static final /* synthetic */ dbd[] X;
    public static final dbd a;
    public static final dbd b;
    public static final dbd c;
    public static final dbd o;

    static {
        dbd dbdVar = new dbd("UPDATE", 0);
        a = dbdVar;
        dbd dbdVar2 = new dbd("REMOVE", 1);
        b = dbdVar2;
        dbd dbdVar3 = new dbd("ACTIVATE", 2);
        c = dbdVar3;
        dbd dbdVar4 = new dbd("TIMEOUT", 3);
        o = dbdVar4;
        X = new dbd[]{dbdVar, dbdVar2, dbdVar3, dbdVar4};
    }

    public static dbd valueOf(String str) {
        return (dbd) Enum.valueOf(dbd.class, str);
    }

    public static dbd[] values() {
        return (dbd[]) X.clone();
    }
}
