package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class bt9 {
    public static final bt9 b = new bt9(null);
    public final Object a;

    public bt9(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bt9) {
            return Objects.equals(this.a, ((bt9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (obj instanceof fv9) {
            return "OnErrorNotification[" + ((fv9) obj).a + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
