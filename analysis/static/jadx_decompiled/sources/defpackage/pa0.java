package defpackage;

/* loaded from: classes.dex */
public final class pa0 {
    public final Object a;

    public pa0(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pa0)) {
            return false;
        }
        return this.a.equals(((pa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "Identifier{value=" + this.a + "}";
    }
}
