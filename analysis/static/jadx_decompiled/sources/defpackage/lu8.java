package defpackage;

import java.io.Serializable;
import java.util.Map;

/* loaded from: classes2.dex */
public final class lu8 implements Serializable {
    public static final ku8 Z = new ku8();
    public final short X;
    public final Map Y;
    public final long a;
    public final String b;
    public final pu8 c;
    public final short o;

    public lu8(long j, String str, pu8 pu8Var, short s, short s2, Map map) {
        this.a = j;
        this.b = str;
        this.c = pu8Var;
        this.o = s;
        this.X = s2;
        this.Y = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu8)) {
            return false;
        }
        lu8 lu8Var = (lu8) obj;
        return this.a == lu8Var.a && tpa.f(this.b, lu8Var.b) && this.c == lu8Var.c && this.o == lu8Var.o && this.X == lu8Var.X && tpa.f(this.Y, lu8Var.Y);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iHashCode2 = (Short.hashCode(this.X) + ((Short.hashCode(this.o) + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31)) * 31;
        Map map = this.Y;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MessageElement(entityId=" + this.a + ", entityName=" + this.b + ", type=" + this.c + ", from=" + ((int) this.o) + ", length=" + ((int) this.X) + ", attributes=" + this.Y + ")";
    }
}
