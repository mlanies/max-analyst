package defpackage;

/* loaded from: classes.dex */
public final class mv5 implements nv5 {
    public final String a;

    public mv5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mv5) && tpa.f(this.a, ((mv5) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("OpenUrl(url="), this.a, ")");
    }
}
