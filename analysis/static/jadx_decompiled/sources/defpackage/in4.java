package defpackage;

/* loaded from: classes.dex */
public final class in4 implements kn4 {
    public final int a;

    public in4(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof in4) && this.a == ((in4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return zr6.j(new StringBuilder("DownloadFailed(textFailRes="), this.a, ")");
    }
}
