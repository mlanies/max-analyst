package defpackage;

/* loaded from: classes.dex */
public final class aa0 {
    public final String a;
    public final Class b;
    public final Object c;

    public aa0(Class cls, Object obj, String str) {
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.a = str;
        if (cls == null) {
            throw new NullPointerException("Null valueClass");
        }
        this.b = cls;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aa0)) {
            return false;
        }
        aa0 aa0Var = (aa0) obj;
        if (this.a.equals(aa0Var.a) && this.b.equals(aa0Var.b)) {
            Object obj2 = aa0Var.c;
            Object obj3 = this.c;
            if (obj3 == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj3.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        Object obj = this.c;
        return (obj == null ? 0 : obj.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + this.c + "}";
    }
}
