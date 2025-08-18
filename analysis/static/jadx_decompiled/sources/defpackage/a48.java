package defpackage;

/* loaded from: classes.dex */
public final class a48 implements j48 {
    public final boolean a;

    public a48(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a48) && this.a == ((a48) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return au1.j(new StringBuilder("Close(withClear="), this.a, ")");
    }
}
