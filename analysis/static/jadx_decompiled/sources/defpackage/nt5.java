package defpackage;

/* loaded from: classes.dex */
public final class nt5 implements qt5 {
    public final boolean a;

    public nt5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nt5) && this.a == ((nt5) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Close(afterCreate="), this.a, ")");
    }
}
