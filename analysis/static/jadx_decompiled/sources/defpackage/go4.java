package defpackage;

/* loaded from: classes2.dex */
public final class go4 implements io4 {
    public final boolean a;

    public go4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof go4) && this.a == ((go4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("FileDownloadInterrupted(shouldRetry="), this.a, ")");
    }
}
