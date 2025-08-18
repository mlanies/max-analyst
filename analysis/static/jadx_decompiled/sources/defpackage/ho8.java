package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public final class ho8 implements jo8 {
    public final Collection a;

    public ho8(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ho8) && tpa.f(this.a, ((ho8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LocalDeleteMembers(ids=" + this.a + ")";
    }
}
