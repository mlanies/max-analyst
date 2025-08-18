package defpackage;

/* loaded from: classes2.dex */
public enum fu7 {
    LOGIN("LOGIN"),
    RECOVERY("RECOVERY"),
    PHONE_BINDING("PHONE_BINDING"),
    PHONE_CONFIRM("PHONE_CONFIRM");

    public final String a;

    fu7(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
