package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class imd {
    public static final imd a;
    public static final imd b;
    public static final /* synthetic */ imd[] c;

    static {
        imd imdVar = new imd("CLOCKWISE", 0);
        a = imdVar;
        imd imdVar2 = new imd("COUNTERCLOCKWISE", 1);
        b = imdVar2;
        c = new imd[]{imdVar, imdVar2};
    }

    public static imd valueOf(String str) {
        return (imd) Enum.valueOf(imd.class, str);
    }

    public static imd[] values() {
        return (imd[]) c.clone();
    }
}
