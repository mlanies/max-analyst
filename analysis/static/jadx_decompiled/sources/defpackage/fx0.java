package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class fx0 {
    public final long a;
    public final List b;

    public fx0(long j, ArrayList arrayList) {
        this.a = j;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fx0)) {
            return false;
        }
        fx0 fx0Var = (fx0) obj;
        return this.a == fx0Var.a && tpa.f(this.b, fx0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CacheState(totalSizeBytes=" + this.a + ", items=" + this.b + ")";
    }
}
