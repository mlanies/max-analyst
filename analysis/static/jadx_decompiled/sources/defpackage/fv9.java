package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class fv9 implements Serializable {
    public final Throwable a;

    public fv9(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fv9) {
            return Objects.equals(this.a, ((fv9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.a + "]";
    }
}
