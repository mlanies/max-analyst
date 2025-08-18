package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class kpa implements Serializable {
    public final Object a;
    public final Object b;

    public kpa(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kpa)) {
            return false;
        }
        kpa kpaVar = (kpa) obj;
        return tpa.f(this.a, kpaVar.a) && tpa.f(this.b, kpaVar.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ')';
    }
}
