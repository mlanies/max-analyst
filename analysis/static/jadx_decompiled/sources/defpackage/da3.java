package defpackage;

/* loaded from: classes2.dex */
public enum da3 {
    SPAM("SPAM"),
    PORNO("PORNO"),
    EXTREMISM("EXTREMISM"),
    FAKE("FAKE"),
    THREAT("THREAT"),
    OTHER("OTHER");

    public final String a;

    da3(String str) {
        this.a = str;
    }

    public static da3 a(String str) {
        str.getClass();
        switch (str) {
            case "THREAT":
                return THREAT;
            case "EXTREMISM":
                return EXTREMISM;
            case "FAKE":
                return FAKE;
            case "SPAM":
                return SPAM;
            case "OTHER":
                return OTHER;
            case "PORNO":
                return PORNO;
            default:
                throw new IllegalArgumentException(zr6.i("No such value ", str, " for Complaint"));
        }
    }

    @Override // java.lang.Enum
    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
