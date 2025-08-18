package defpackage;

/* loaded from: classes2.dex */
public final class mm3 implements nm3 {
    public final gi9 a;

    public mm3(gi9 gi9Var) {
        this.a = gi9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm3) && tpa.f(this.a, ((mm3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Update(contactIds=" + this.a + ")";
    }
}
