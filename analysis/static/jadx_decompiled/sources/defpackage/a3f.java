package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class a3f implements Serializable {
    public final Object a;
    public final Object b;
    public final Object c;

    public a3f(Object obj, Object obj2, Object obj3) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a3f)) {
            return false;
        }
        a3f a3fVar = (a3f) obj;
        return tpa.f(this.a, a3fVar.a) && tpa.f(this.b, a3fVar.b) && tpa.f(this.c, a3fVar.c);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
