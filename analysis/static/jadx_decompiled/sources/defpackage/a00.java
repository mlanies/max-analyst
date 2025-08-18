package defpackage;

/* loaded from: classes2.dex */
public final class a00 extends b00 {
    public final long a;
    public final float b;
    public final jqe c;

    public a00(long j, float f, iqe iqeVar) {
        this.a = j;
        this.b = f;
        this.c = iqeVar;
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
        if (!(obj instanceof a00)) {
            return false;
        }
        a00 a00Var = (a00) obj;
        return this.a == a00Var.a && Float.compare(this.b, a00Var.b) == 0 && tpa.f(this.c, a00Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.c(Long.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return "Uploading(messageId=" + this.a + ", progress=" + this.b + ", textSize=" + this.c + ")";
    }
}
