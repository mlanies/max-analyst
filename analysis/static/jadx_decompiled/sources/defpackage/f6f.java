package defpackage;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class f6f implements roc {
    public final Map a;

    public f6f(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f6f.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((f6f) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "UpdateDisplayLayoutCommandV2Response{participantsToErrorMap=" + this.a + '}';
    }
}
