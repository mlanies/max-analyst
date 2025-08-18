package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class cuc {
    public static final cuc a;
    public static final cuc b;
    public static final cuc c;
    public static final /* synthetic */ cuc[] o;

    static {
        cuc cucVar = new cuc("NETWORK_UNMETERED", 0);
        a = cucVar;
        cuc cucVar2 = new cuc("DEVICE_IDLE", 1);
        b = cucVar2;
        cuc cucVar3 = new cuc("DEVICE_CHARGING", 2);
        c = cucVar3;
        o = new cuc[]{cucVar, cucVar2, cucVar3};
    }

    public static cuc valueOf(String str) {
        return (cuc) Enum.valueOf(cuc.class, str);
    }

    public static cuc[] values() {
        return (cuc[]) o.clone();
    }
}
