package defpackage;

/* loaded from: classes2.dex */
public final class i19 implements m19 {
    public final long a;
    public final wgf b;

    public i19(long j, wgf wgfVar) {
        this.a = j;
        this.b = wgfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i19)) {
            return false;
        }
        i19 i19Var = (i19) obj;
        return this.a == i19Var.a && tpa.f(this.b, i19Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.n19
    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnPlayRequested(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
