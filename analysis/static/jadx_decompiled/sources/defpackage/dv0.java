package defpackage;

/* loaded from: classes2.dex */
public enum dv0 {
    DEFAULT("DEFAULT"),
    POSITIVE("POSITIVE"),
    NEGATIVE("NEGATIVE"),
    UNKNOWN("UNKNOWN");

    public static final dv0[] Y = values();
    public final String a;

    dv0(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
