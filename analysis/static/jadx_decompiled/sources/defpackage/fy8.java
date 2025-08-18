package defpackage;

/* loaded from: classes2.dex */
public enum fy8 {
    UNKNOWN("UNKNOWN"),
    USER("USER"),
    GROUP("GROUP"),
    CHANNEL("CHANNEL"),
    CHANNEL_ADMIN("CHANNEL_ADMIN");

    public final String a;

    fy8(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
