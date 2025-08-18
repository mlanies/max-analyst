package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ylb extends amb {
    public final List a;

    public ylb(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ylb) && tpa.f(this.a, ((ylb) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowPhoneActionsMenu(actions=" + this.a + ")";
    }
}
