package defpackage;

/* loaded from: classes.dex */
public final class ja1 extends ka1 {
    public final String b;

    public ja1(String str) {
        super(0);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ja1) && tpa.f(this.b, ((ja1) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("StartNewCall(link="), this.b, ")");
    }
}
