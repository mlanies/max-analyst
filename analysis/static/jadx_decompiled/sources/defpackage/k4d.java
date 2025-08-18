package defpackage;

/* loaded from: classes2.dex */
public final class k4d {
    public final j4d a;
    public final l2b b;

    public k4d(j4d j4dVar, l2b l2bVar) {
        this.a = j4dVar;
        this.b = l2bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4d)) {
            return false;
        }
        k4d k4dVar = (k4d) obj;
        return tpa.f(this.a, k4dVar.a) && tpa.f(this.b, k4dVar.b);
    }

    public final int hashCode() {
        j4d j4dVar = this.a;
        return this.b.hashCode() + ((j4dVar == null ? 0 : j4dVar.hashCode()) * 31);
    }

    public final String toString() {
        return "SelectedAvatarInfo(avatar=" + this.a + ", placeholder=" + this.b + ")";
    }
}
