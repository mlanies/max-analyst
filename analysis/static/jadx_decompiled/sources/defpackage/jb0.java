package defpackage;

/* loaded from: classes.dex */
public final class jb0 {
    public final x9b a;
    public final ov6 b;

    public jb0(x9b x9bVar, ov6 ov6Var) {
        if (x9bVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.a = x9bVar;
        this.b = ov6Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jb0)) {
            return false;
        }
        jb0 jb0Var = (jb0) obj;
        return this.a.equals(jb0Var.a) && this.b.equals(jb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
