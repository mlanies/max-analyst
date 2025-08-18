package defpackage;

/* loaded from: classes2.dex */
public final class wgb {
    public final long a;
    public final long b;
    public final bdb c;

    public wgb(long j, long j2, bdb bdbVar) {
        this.a = j;
        this.b = j2;
        this.c = bdbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgb)) {
            return false;
        }
        wgb wgbVar = (wgb) obj;
        return this.a == wgbVar.a && this.b == wgbVar.b && tpa.f(this.c, wgbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h4f.m(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "ProfileEntity(id=" + this.a + ", serverId=" + this.b + ", profileData=" + this.c + ")";
    }
}
