package defpackage;

/* loaded from: classes.dex */
public final class se1 extends ue1 {
    public final String a;

    public se1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof se1) && tpa.f(this.a, ((se1) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("Name(name="), this.a, ")");
    }
}
