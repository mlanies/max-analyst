package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class na {
    public static final na c = new na(jqe.a, nz4.a);
    public final jqe a;
    public final List b;

    public na(jqe jqeVar, List list) {
        this.a = jqeVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na)) {
            return false;
        }
        na naVar = (na) obj;
        return tpa.f(this.a, naVar.a) && tpa.f(this.b, naVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AdminWaitingRoomState(subtitle=" + this.a + ", list=" + this.b + ")";
    }
}
