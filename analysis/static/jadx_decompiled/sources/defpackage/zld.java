package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class zld {
    public static final zld a;
    public static final zld b;
    public static final /* synthetic */ zld[] c;

    static {
        zld zldVar = new zld("NONE", 0);
        a = zldVar;
        zld zldVar2 = new zld("SURFACE", 1);
        b = zldVar2;
        c = new zld[]{zldVar, zldVar2};
    }

    public static zld valueOf(String str) {
        return (zld) Enum.valueOf(zld.class, str);
    }

    public static zld[] values() {
        return (zld[]) c.clone();
    }
}
