package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class anc {
    public static final anc b = new anc(false);
    public static final anc c = new anc(true);
    public final boolean a;

    public anc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof anc)) {
            return false;
        }
        anc ancVar = (anc) obj;
        ancVar.getClass();
        return this.a == ancVar.a;
    }

    public final int hashCode() {
        Integer num = -1;
        Boolean boolValueOf = Boolean.valueOf(this.a);
        return ((num.hashCode() + 31) * 31) + boolValueOf.hashCode();
    }

    public final String toString() {
        return String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{-1, Boolean.valueOf(this.a)}, 2));
    }
}
