package defpackage;

/* loaded from: classes2.dex */
public final class xz extends b00 {
    public final long a;
    public final float b;
    public final jqe c;

    public xz(long j, float f, jqe jqeVar) {
        this.a = j;
        this.b = f;
        this.c = jqeVar;
    }

    @Override // defpackage.b00
    public final long a() {
        return this.a;
    }

    @Override // defpackage.b00
    public final jqe b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz)) {
            return false;
        }
        xz xzVar = (xz) obj;
        return this.a == xzVar.a && Float.compare(this.b, xzVar.b) == 0 && tpa.f(this.c, xzVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Downloading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ")";
    }
}
