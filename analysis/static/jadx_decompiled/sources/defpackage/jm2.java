package defpackage;

/* loaded from: classes2.dex */
public enum jm2 {
    SOUND("SOUND"),
    VIBRATION("VIBR"),
    LED("LED");

    public static final int X = values().length;
    public final String a;

    jm2(String str) {
        this.a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return zr6.l(new StringBuilder("{value='"), this.a, "'}");
    }
}
