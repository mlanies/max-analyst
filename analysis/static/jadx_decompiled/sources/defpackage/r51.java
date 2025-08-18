package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class r51 implements t51 {
    public final Set a;

    public r51(Set set) {
        this.a = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r51) && tpa.f(this.a, ((r51) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateContacts(contactIds=" + this.a + ")";
    }
}
