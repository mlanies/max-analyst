package defpackage;

/* loaded from: classes2.dex */
public final class xib extends bjb {
    public final long a;

    public xib(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xib) && this.a == ((xib) obj).a;
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return 4096;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    @Override // defpackage.ol7
    public final int l() {
        return 4096;
    }

    public final String toString() {
        return zr6.k(new StringBuilder("DebugProfileInfo(id="), this.a, ")");
    }
}
