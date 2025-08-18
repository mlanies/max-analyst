package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class szd {
    public static final szd a;
    public static final szd b;
    public static final /* synthetic */ szd[] c;

    static {
        szd szdVar = new szd("EXPANDED", 0);
        a = szdVar;
        szd szdVar2 = new szd("COLLAPSED", 1);
        b = szdVar2;
        c = new szd[]{szdVar, szdVar2};
    }

    public static szd valueOf(String str) {
        return (szd) Enum.valueOf(szd.class, str);
    }

    public static szd[] values() {
        return (szd[]) c.clone();
    }
}
