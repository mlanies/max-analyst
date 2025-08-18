package defpackage;

/* loaded from: classes2.dex */
public final class rn4 implements un4 {
    public final boolean a;

    public rn4(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rn4) && this.a == ((rn4) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("FileDownloadInterrupted(shouldRetry="), this.a, ")");
    }
}
