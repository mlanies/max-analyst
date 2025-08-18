package defpackage;

/* loaded from: classes2.dex */
public final class k19 implements m19 {
    public final long a;
    public final wgf b;

    public k19(long j, wgf wgfVar) {
        this.a = j;
        this.b = wgfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k19)) {
            return false;
        }
        k19 k19Var = (k19) obj;
        return this.a == k19Var.a && tpa.f(this.b, k19Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.n19
    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnSurfaceClick(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
