package defpackage;

/* loaded from: classes2.dex */
public final class o87 {
    public final String a;
    public final x77 b;

    public o87(String str, vxd vxdVar) {
        this.a = str;
        this.b = vxdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o87)) {
            return false;
        }
        o87 o87Var = (o87) obj;
        return tpa.f(this.a, o87Var.a) && tpa.f(this.b, o87Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "JobWrapper(name=" + this.a + ", job=" + this.b + ")";
    }
}
