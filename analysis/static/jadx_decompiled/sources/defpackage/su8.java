package defpackage;

import java.util.Collection;
import java.util.Set;

/* loaded from: classes2.dex */
public final class su8 implements yu8 {
    public final Collection a;
    public final boolean b;

    public su8(Set set, boolean z) {
        this.a = set;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su8)) {
            return false;
        }
        su8 su8Var = (su8) obj;
        return tpa.f(this.a, su8Var.a) && this.b == su8Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Add(messageIds=");
        sb.append(this.a);
        sb.append(", isSelf=");
        return au1.j(sb, this.b, ")");
    }
}
