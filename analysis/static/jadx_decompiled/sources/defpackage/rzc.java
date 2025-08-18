package defpackage;

/* loaded from: classes.dex */
public final class rzc implements tzc {
    public final boolean a;

    public rzc(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rzc) && this.a == ((rzc) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Show(openWithAnimation="), this.a, ")");
    }
}
