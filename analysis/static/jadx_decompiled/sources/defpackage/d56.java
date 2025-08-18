package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class d56 {
    public final ConcurrentHashMap a;

    public /* synthetic */ d56(ConcurrentHashMap concurrentHashMap) {
        this.a = concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d56) {
            return tpa.f(this.a, ((d56) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FtsCache(titles=" + this.a + ")";
    }
}
