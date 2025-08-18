package defpackage;

/* loaded from: classes2.dex */
public final class lpa {
    public final Object a;
    public final Object b;

    public lpa(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lpa.class != obj.getClass()) {
            return false;
        }
        lpa lpaVar = (lpa) obj;
        Object obj2 = lpaVar.a;
        Object obj3 = this.a;
        if (obj3 == null ? obj2 != null : !obj3.equals(obj2)) {
            return false;
        }
        Object obj4 = lpaVar.b;
        Object obj5 = this.b;
        return obj5 != null ? obj5.equals(obj4) : obj4 == null;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{first=" + this.a + ", second=" + this.b + '}';
    }
}
