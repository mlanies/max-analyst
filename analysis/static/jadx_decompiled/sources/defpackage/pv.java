package defpackage;

/* loaded from: classes2.dex */
public final class pv extends qv {
    public final long a;
    public final boolean b;

    public pv(long j, boolean z) {
        this.a = j;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv)) {
            return false;
        }
        pv pvVar = (pv) obj;
        return this.a == pvVar.a && this.b == pvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingPrev(time=");
        sb.append(this.a);
        sb.append(", isRemoteCaused=");
        return au1.j(sb, this.b, ")");
    }
}
