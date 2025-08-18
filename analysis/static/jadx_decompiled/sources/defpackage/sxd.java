package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class sxd implements ooc {
    public List a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || sxd.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((sxd) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "StalledParticipantsNotification{participantIds=" + this.a + '}';
    }
}
