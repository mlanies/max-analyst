package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class zcc {
    public static final zcc X;
    public static final zcc Y;
    public static final zcc Z;
    public static final zcc a;
    public static final zcc b;
    public static final zcc c;
    public static final zcc o;
    public static final zcc s0;
    public static final zcc t0;
    public static final /* synthetic */ zcc[] u0;

    static {
        zcc zccVar = new zcc("CONFIGURING", 0);
        a = zccVar;
        zcc zccVar2 = new zcc("PENDING_RECORDING", 1);
        b = zccVar2;
        zcc zccVar3 = new zcc("PENDING_PAUSED", 2);
        c = zccVar3;
        zcc zccVar4 = new zcc("IDLING", 3);
        o = zccVar4;
        zcc zccVar5 = new zcc("RECORDING", 4);
        X = zccVar5;
        zcc zccVar6 = new zcc("PAUSED", 5);
        Y = zccVar6;
        zcc zccVar7 = new zcc("STOPPING", 6);
        Z = zccVar7;
        zcc zccVar8 = new zcc("RESETTING", 7);
        s0 = zccVar8;
        zcc zccVar9 = new zcc("ERROR", 8);
        t0 = zccVar9;
        u0 = new zcc[]{zccVar, zccVar2, zccVar3, zccVar4, zccVar5, zccVar6, zccVar7, zccVar8, zccVar9};
    }

    public static zcc valueOf(String str) {
        return (zcc) Enum.valueOf(zcc.class, str);
    }

    public static zcc[] values() {
        return (zcc[]) u0.clone();
    }
}
