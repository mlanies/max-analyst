package defpackage;

/* loaded from: classes.dex */
public final class ia0 {
    public final Object a;
    public final kb0 b;

    public ia0(a99 a99Var, kb0 kb0Var) {
        this.a = a99Var;
        this.b = kb0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ia0)) {
            return false;
        }
        ia0 ia0Var = (ia0) obj;
        ia0Var.getClass();
        if (this.a.equals(ia0Var.a)) {
            Object obj2 = z8b.a;
            if (obj2.equals(obj2)) {
                kb0 kb0Var = ia0Var.b;
                kb0 kb0Var2 = this.b;
                if (kb0Var2 == null) {
                    if (kb0Var == null) {
                        return true;
                    }
                } else if (kb0Var2.equals(kb0Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((1000003 * 1000003) ^ this.a.hashCode()) * 1000003) ^ z8b.a.hashCode()) * 1000003;
        kb0 kb0Var = this.b;
        return (kb0Var == null ? 0 : kb0Var.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.a + ", priority=" + z8b.a + ", productData=" + this.b + "}";
    }
}
