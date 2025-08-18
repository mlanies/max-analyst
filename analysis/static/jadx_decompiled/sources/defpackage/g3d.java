package defpackage;

/* loaded from: classes2.dex */
public final class g3d implements i3d {
    public final b86 a;

    public g3d(b86 b86Var) {
        this.a = b86Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g3d) && tpa.f(this.a, ((g3d) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnAlbumSelected(album=" + this.a + ")";
    }
}
