package defpackage;

/* loaded from: classes2.dex */
public final class e0g {
    public final String a;
    public final boolean b;
    public final a0g c;

    public e0g(String str, boolean z, a0g a0gVar) {
        this.a = str;
        this.b = z;
        this.c = a0gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0g)) {
            return false;
        }
        e0g e0gVar = (e0g) obj;
        return tpa.f(this.a, e0gVar.a) && this.b == e0gVar.b && tpa.f(this.c, e0gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.d(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "WebAppRootViewState(title=" + this.a + ", isVerified=" + this.b + ", loadingState=" + this.c + ")";
    }
}
