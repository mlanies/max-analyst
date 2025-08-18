package defpackage;

/* loaded from: classes2.dex */
public final class qwd {
    public final int a;
    public final double b = 4.0d;

    public qwd(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwd)) {
            return false;
        }
        qwd qwdVar = (qwd) obj;
        return this.a == qwdVar.a && Double.compare(this.b, qwdVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "SquircleParams(radius=" + this.a + ", curvature=" + this.b + ")";
    }
}
