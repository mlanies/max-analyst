package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class nhb extends phb {
    public final List a;

    public nhb(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nhb) && tpa.f(this.a, ((nhb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowMoreActions(actions=" + this.a + ")";
    }
}
