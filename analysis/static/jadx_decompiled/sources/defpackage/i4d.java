package defpackage;

/* loaded from: classes2.dex */
public final class i4d extends j4d {
    public final String b;
    public final String c;
    public final a20 d;
    public final int e;

    public i4d(String str, String str2, a20 a20Var, int i) {
        super(str);
        this.b = str;
        this.c = str2;
        this.d = a20Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i4d)) {
            return false;
        }
        i4d i4dVar = (i4d) obj;
        return tpa.f(this.b, i4dVar.b) && tpa.f(this.c, i4dVar.c) && tpa.f(this.d, i4dVar.d) && this.e == i4dVar.e;
    }

    public final int hashCode() {
        return au1.s(this.e) + ((this.d.hashCode() + rh4.d(this.b.hashCode() * 31, 31, this.c)) * 31);
    }

    public final String toString() {
        return "Photo(localCroppedUri=" + this.b + ", originalUri=" + this.c + ", relativeCrop=" + this.d + ", source=" + au1.u(this.e) + ")";
    }
}
