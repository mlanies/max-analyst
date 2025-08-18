package defpackage;

import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class q2 {
    public transient Set a;
    public transient p2 b;
    public transient Map c;

    public abstract Map a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q2) {
            return ((y1) this).a().equals(((y1) ((q2) obj)).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
