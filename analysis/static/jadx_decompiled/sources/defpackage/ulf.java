package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ulf {
    public static final ulf a;
    public static final ulf b;
    public static final /* synthetic */ ulf[] c;

    static {
        ulf ulfVar = new ulf("ASPECT_RATIO", 0);
        a = ulfVar;
        ulf ulfVar2 = new ulf("FILL", 1);
        b = ulfVar2;
        c = new ulf[]{ulfVar, ulfVar2};
    }

    public static ulf valueOf(String str) {
        return (ulf) Enum.valueOf(ulf.class, str);
    }

    public static ulf[] values() {
        return (ulf[]) c.clone();
    }
}
