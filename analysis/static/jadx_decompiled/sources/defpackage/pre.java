package defpackage;

/* loaded from: classes2.dex */
public final class pre {
    public final kge a;

    public pre(kge kgeVar) {
        this.a = kgeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pre) && tpa.f(this.a, ((pre) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SvgPattern(svgPattern=" + this.a + ")";
    }
}
