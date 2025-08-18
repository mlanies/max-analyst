package defpackage;

/* loaded from: classes.dex */
public final class el6 extends hl6 {
    public final boolean a;

    public el6(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof el6) && this.a == ((el6) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Missing(isMissing="), this.a, ")");
    }
}
