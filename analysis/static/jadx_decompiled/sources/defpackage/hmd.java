package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class hmd {
    public static final /* synthetic */ hmd[] X;
    public static final hmd a;
    public static final hmd b;
    public static final hmd c;
    public static final hmd o;

    static {
        hmd hmdVar = new hmd("DEFAULT", 0);
        a = hmdVar;
        hmd hmdVar2 = new hmd("INCOMING", 1);
        b = hmdVar2;
        hmd hmdVar3 = new hmd("ACTIVE", 2);
        c = hmdVar3;
        hmd hmdVar4 = new hmd("NO_CONNECTION", 3);
        o = hmdVar4;
        X = new hmd[]{hmdVar, hmdVar2, hmdVar3, hmdVar4};
    }

    public static hmd valueOf(String str) {
        return (hmd) Enum.valueOf(hmd.class, str);
    }

    public static hmd[] values() {
        return (hmd[]) X.clone();
    }
}
