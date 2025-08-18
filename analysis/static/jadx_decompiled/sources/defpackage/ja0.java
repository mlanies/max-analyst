package defpackage;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class ja0 {
    public final String a;
    public final Integer b;
    public final i05 c;
    public final long d;
    public final long e;
    public final Map f;

    public ja0(String str, Integer num, i05 i05Var, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = i05Var;
        this.d = j;
        this.e = j2;
        this.f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final ai3 c() {
        ai3 ai3Var = new ai3();
        String str = this.a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        ai3Var.a = str;
        ai3Var.b = this.b;
        i05 i05Var = this.c;
        if (i05Var == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        ai3Var.c = i05Var;
        ai3Var.o = Long.valueOf(this.d);
        ai3Var.X = Long.valueOf(this.e);
        ai3Var.Y = new HashMap(this.f);
        return ai3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ja0)) {
            return false;
        }
        ja0 ja0Var = (ja0) obj;
        if (this.a.equals(ja0Var.a)) {
            Integer num = ja0Var.b;
            Integer num2 = this.b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.c.equals(ja0Var.c) && this.d == ja0Var.d && this.e == ja0Var.e && this.f.equals(ja0Var.f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
