package defpackage;

/* loaded from: classes2.dex */
public final class yz extends b00 {
    public final long a;
    public final jqe b;

    public yz(long j, iqe iqeVar) {
        this.a = j;
        this.b = iqeVar;
    }

    @Override // defpackage.b00
    public final long a() {
        return this.a;
    }

    @Override // defpackage.b00
    public final jqe b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz)) {
            return false;
        }
        yz yzVar = (yz) obj;
        return this.a == yzVar.a && tpa.f(this.b, yzVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "NeedDownload(messageId=" + this.a + ", textSize=" + this.b + ")";
    }
}
