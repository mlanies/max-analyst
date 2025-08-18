package defpackage;

/* loaded from: classes.dex */
public final class ure {
    public final boolean a;

    public ure(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ure) && this.a == ((ure) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Selection(isSelected="), this.a, ")");
    }
}
