package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class yv5 {
    public final Map a;

    public yv5(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yv5) && tpa.f(this.a, ((yv5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FoldersCounters(counters=" + this.a + ")";
    }
}
