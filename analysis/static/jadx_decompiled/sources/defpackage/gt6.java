package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class gt6 implements ooc {
    public final Map a;

    public gt6(HashMap map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gt6.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((gt6) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "IdMappingsNotification{mapping=" + this.a + '}';
    }
}
