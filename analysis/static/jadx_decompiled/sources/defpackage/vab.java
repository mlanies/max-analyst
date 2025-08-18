package defpackage;

/* loaded from: classes2.dex */
public final class vab extends pi0 {
    public final long b;
    public final long c;

    public vab(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vab)) {
            return false;
        }
        vab vabVar = (vab) obj;
        return this.b == vabVar.b && this.c == vabVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    @Override // defpackage.pi0
    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileAvatarUpdatedEvent(requestId=");
        sb.append(this.b);
        sb.append(", photoId=");
        return zr6.k(sb, this.c, ")");
    }
}
