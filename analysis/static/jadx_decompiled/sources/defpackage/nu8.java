package defpackage;

import java.util.EnumSet;
import java.util.Map;

/* loaded from: classes2.dex */
public final class nu8 {
    public static final EnumSet g = EnumSet.of(mu8.c, mu8.o, mu8.X, mu8.Y, mu8.Z, mu8.t0, mu8.u0, mu8.s0);
    public final long a;
    public final String b;
    public final mu8 c;
    public final int d;
    public final int e;
    public final Map f;

    public nu8(long j, String str, mu8 mu8Var, int i, int i2, Map map) {
        this.a = j;
        this.b = str;
        this.c = mu8Var;
        this.d = i;
        this.e = i2;
        this.f = map;
    }

    public static nu8 a(nu8 nu8Var, int i, int i2, int i3) {
        long j = nu8Var.a;
        String str = nu8Var.b;
        mu8 mu8Var = nu8Var.c;
        if ((i3 & 8) != 0) {
            i = nu8Var.d;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = nu8Var.e;
        }
        Map map = nu8Var.f;
        nu8Var.getClass();
        return new nu8(j, str, mu8Var, i4, i2, map);
    }

    public final nu8 b() {
        if (this.e <= 0 || this.d < 0) {
            return null;
        }
        return this;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu8)) {
            return false;
        }
        nu8 nu8Var = (nu8) obj;
        return this.a == nu8Var.a && tpa.f(this.b, nu8Var.b) && this.c == nu8Var.c && this.d == nu8Var.d && this.e == nu8Var.e && tpa.f(this.f, nu8Var.f);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iE = k7d.e(this.e, k7d.e(this.d, (this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31), 31);
        Map map = this.f;
        return iE + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MessageElementData(entityId=" + this.a + ", entityName=" + this.b + ", type=" + this.c + ", from=" + this.d + ", length=" + this.e + ", attributes=" + this.f + ")";
    }
}
