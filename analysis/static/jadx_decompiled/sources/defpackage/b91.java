package defpackage;

/* loaded from: classes.dex */
public final class b91 implements c91 {
    public final boolean a;

    public b91(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b91) && this.a == ((b91) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("End(isCallAccepted="), this.a, ")");
    }
}
