package defpackage;

/* loaded from: classes2.dex */
public final class l2g extends w97 {
    public final boolean c;

    public l2g(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l2g) && this.c == ((l2g) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }

    public final String toString() {
        return au1.j(new StringBuilder("ScreenCaptureBehavior(isEnabled="), this.c, ")");
    }
}
