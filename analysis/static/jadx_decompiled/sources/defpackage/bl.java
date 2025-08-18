package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class bl {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final Map f;

    public bl(long j, long j2, long j3, String str, String str2, Map map) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = str2;
        this.f = map;
        if ((map != null ? map.size() : 0) <= 10) {
            return;
        }
        throw new IllegalStateException(("counters size can't be greater than limit = 10, current=" + (map != null ? Integer.valueOf(map.size()) : null) + ", event=" + str2).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl)) {
            return false;
        }
        bl blVar = (bl) obj;
        return this.a == blVar.a && this.b == blVar.b && this.c == blVar.c && tpa.f(this.d, blVar.d) && tpa.f(this.e, blVar.e) && tpa.f(this.f, blVar.f);
    }

    public final int hashCode() {
        int iD = rh4.d(rh4.d(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        Map map = this.f;
        return iD + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "ApiLogEntry(time=" + this.a + ", userId=" + this.b + ", sessionId=" + this.c + ", type=" + this.d + ", event=" + this.e + ", params=" + this.f + ")";
    }
}
