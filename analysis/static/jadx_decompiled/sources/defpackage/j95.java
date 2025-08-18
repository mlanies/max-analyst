package defpackage;

/* loaded from: classes2.dex */
public final class j95 extends wm9 {
    public final String b;

    public j95(String str) {
        super(e5f.a);
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j95) && tpa.f(this.b, ((j95) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ExternalCallback(params="), this.b, ")");
    }
}
