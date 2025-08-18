package defpackage;

/* loaded from: classes2.dex */
public final class frb implements hrb {
    public final long a;

    public frb(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof frb) && this.a == ((frb) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return zr6.k(new StringBuilder("ModeRecordingVideo(startTimeMs="), this.a, ")");
    }
}
