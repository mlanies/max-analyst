package defpackage;

/* loaded from: classes2.dex */
public final class of {
    public final Number a;
    public final Number b;

    public of(Float f, Float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of)) {
            return false;
        }
        of ofVar = (of) obj;
        return tpa.f(this.a, ofVar.a) && tpa.f(this.b, ofVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedValues(start=" + this.a + ", finish=" + this.b + ")";
    }
}
