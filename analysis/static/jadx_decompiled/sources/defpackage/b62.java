package defpackage;

/* loaded from: classes.dex */
public final class b62 {
    public final Boolean a;

    public b62(Boolean bool) {
        this.a = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b62) && tpa.f(this.a, ((b62) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        return "Selection(isSelected=" + this.a + ")";
    }
}
