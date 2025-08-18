package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k4b {
    public static final k4b c = new k4b(false, false);
    public static final String d;
    public static final String e;
    public final boolean a;
    public final boolean b;

    static {
        int i = oaf.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public k4b(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4b)) {
            return false;
        }
        k4b k4bVar = (k4b) obj;
        return this.a == k4bVar.a && this.b == k4bVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.b)});
    }
}
