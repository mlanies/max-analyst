package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class wbe {
    public static final vbe Companion;
    public static final wbe X;
    public static final wbe Y;
    public static final /* synthetic */ wbe[] Z;
    public static final je7 a;
    public static final wbe b;
    public static final wbe c;
    public static final wbe o;

    static {
        wbe wbeVar = new wbe("UPDATED", 0);
        b = wbeVar;
        wbe wbeVar2 = new wbe("REMOVED", 1);
        c = wbeVar2;
        wbe wbeVar3 = new wbe("CLEARED", 2);
        o = wbeVar3;
        wbe wbeVar4 = new wbe("OPENED", 3);
        X = wbeVar4;
        wbe wbeVar5 = new wbe("AUTHORIZED", 4);
        Y = wbeVar5;
        Z = new wbe[]{wbeVar, wbeVar2, wbeVar3, wbeVar4, wbeVar5};
        Companion = new vbe();
        a = tu0.r(2, new xid(19));
    }

    public static wbe valueOf(String str) {
        return (wbe) Enum.valueOf(wbe.class, str);
    }

    public static wbe[] values() {
        return (wbe[]) Z.clone();
    }
}
