package defpackage;

/* loaded from: classes2.dex */
public final class fd0 {
    public final String a;
    public final String b;
    public final a20 c;
    public final int d;

    public fd0(String str, String str2, a20 a20Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = a20Var;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd0)) {
            return false;
        }
        fd0 fd0Var = (fd0) obj;
        return tpa.f(this.a, fd0Var.a) && tpa.f(this.b, fd0Var.b) && tpa.f(this.c, fd0Var.c) && this.d == fd0Var.d;
    }

    public final int hashCode() {
        return au1.s(this.d) + ((this.c.hashCode() + rh4.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "PhotoAvatar(localCroppedUri=" + this.a + ", originalUri=" + this.b + ", relativeCrop=" + this.c + ", source=" + au1.u(this.d) + ")";
    }
}
