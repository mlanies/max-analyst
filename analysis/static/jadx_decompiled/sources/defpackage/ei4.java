package defpackage;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ei4 {
    public static final AtomicLong b = new AtomicLong(0);
    public final long a;

    public static final boolean a(long j, long j2) {
        return j == j2;
    }

    public static String b(long j) {
        return ey8.i(j, "DevButtonId(value=", ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ei4) {
            return this.a == ((ei4) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
