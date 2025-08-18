package defpackage;

/* loaded from: classes2.dex */
public final class gma extends wm9 {
    public final long b;
    public final boolean c;

    public gma(long j, boolean z) {
        super(e5f.a);
        this.b = j;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gma)) {
            return false;
        }
        gma gmaVar = (gma) obj;
        return this.b == gmaVar.b && this.c == gmaVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenOneToOneCall(opponentId=");
        sb.append(this.b);
        sb.append(", isVideo=");
        return au1.j(sb, this.c, ")");
    }
}
