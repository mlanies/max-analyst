package defpackage;

/* loaded from: classes2.dex */
public final class i86 implements k86 {
    public final b86 a;

    public i86(b86 b86Var) {
        this.a = b86Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i86) && tpa.f(this.a, ((i86) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnSelectAlbum(album=" + this.a + ")";
    }
}
