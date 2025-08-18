package defpackage;

/* loaded from: classes2.dex */
public final class l19 implements m19 {
    public final long a;
    public final wgf b;

    public l19(long j, wgf wgfVar) {
        this.a = j;
        this.b = wgfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l19)) {
            return false;
        }
        l19 l19Var = (l19) obj;
        return this.a == l19Var.a && tpa.f(this.b, l19Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    @Override // defpackage.n19
    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnVideoEnded(messageId=" + this.a + ", model=" + this.b + ")";
    }
}
