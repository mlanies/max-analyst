package defpackage;

/* loaded from: classes2.dex */
public final class sxf extends uxf {
    public final String a;

    public sxf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxf) && tpa.f(this.a, ((sxf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("InternalNavigation(deeplink="), this.a, ")");
    }
}
