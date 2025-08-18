package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class mpa {
    public final Object a;
    public final Object b;

    public mpa(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mpa)) {
            return false;
        }
        mpa mpaVar = (mpa) obj;
        return Objects.equals(mpaVar.a, this.a) && Objects.equals(mpaVar.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
