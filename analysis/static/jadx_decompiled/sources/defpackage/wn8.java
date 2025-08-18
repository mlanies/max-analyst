package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class wn8 implements yn8 {
    public final List a;

    public wn8(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wn8) && tpa.f(this.a, ((wn8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ContactsUpdate(ids=" + this.a + ")";
    }
}
