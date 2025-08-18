package defpackage;

/* loaded from: classes2.dex */
public final class j19 implements m19 {
    public final long a;
    public final wgf b;
    public final float c;

    public j19(long j, wgf wgfVar, float f) {
        this.a = j;
        this.b = wgfVar;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j19)) {
            return false;
        }
        j19 j19Var = (j19) obj;
        return this.a == j19Var.a && tpa.f(this.b, j19Var.b) && Float.compare(this.c, j19Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
    }

    @Override // defpackage.n19
    public final long j() {
        return this.a;
    }

    public final String toString() {
        return "OnSeek(messageId=" + this.a + ", model=" + this.b + ", progress=" + this.c + ")";
    }
}
