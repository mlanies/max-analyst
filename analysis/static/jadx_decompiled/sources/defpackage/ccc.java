package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ccc {
    public static final ccc a;
    public static final ccc b;
    public static final /* synthetic */ ccc[] c;

    /* JADX INFO: Fake field, exist only in values array */
    ccc EF0;

    static {
        ccc cccVar = new ccc("UNDEFINE", 0);
        ccc cccVar2 = new ccc("OWNER_EXIT", 1);
        a = cccVar2;
        ccc cccVar3 = new ccc("RECORD_STOP", 2);
        b = cccVar3;
        c = new ccc[]{cccVar, cccVar2, cccVar3};
    }

    public static ccc valueOf(String str) {
        return (ccc) Enum.valueOf(ccc.class, str);
    }

    public static ccc[] values() {
        return (ccc[]) c.clone();
    }
}
