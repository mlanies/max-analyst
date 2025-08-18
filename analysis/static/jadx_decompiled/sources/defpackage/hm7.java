package defpackage;

/* loaded from: classes.dex */
public final class hm7 {
    public final Object a;
    public final String b;

    public hm7(le6 le6Var, String str) {
        this.a = le6Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm7)) {
            return false;
        }
        hm7 hm7Var = (hm7) obj;
        return this.a == hm7Var.a && this.b.equals(hm7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
