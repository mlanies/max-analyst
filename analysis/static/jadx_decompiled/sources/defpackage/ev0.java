package defpackage;

/* loaded from: classes2.dex */
public enum ev0 {
    /* JADX INFO: Fake field, exist only in values array */
    CALLBACK("CALLBACK"),
    /* JADX INFO: Fake field, exist only in values array */
    LINK("LINK"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_CONTACT("REQUEST_CONTACT"),
    /* JADX INFO: Fake field, exist only in values array */
    REQUEST_GEO_LOCATION("REQUEST_GEO_LOCATION"),
    /* JADX INFO: Fake field, exist only in values array */
    CHAT("CHAT"),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE("MESSAGE"),
    /* JADX INFO: Fake field, exist only in values array */
    OPEN_APP("OPEN_APP"),
    UNKNOWN("UNKNOWN");

    public static final ev0[] c = values();
    public final String a;

    ev0(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
