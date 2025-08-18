package defpackage;

/* loaded from: classes.dex */
public final class qj1 extends wj1 {
    public final String D;

    public qj1(String str) {
        this.D = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qj1) && tpa.f(this.D, ((qj1) obj).D);
    }

    public final int hashCode() {
        return this.D.hashCode();
    }

    public final String toString() {
        return zr6.l(new StringBuilder("ShareLinkToChat(link="), this.D, ")");
    }
}
