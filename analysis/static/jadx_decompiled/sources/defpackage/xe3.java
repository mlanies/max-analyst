package defpackage;

/* loaded from: classes2.dex */
public final class xe3 extends ka1 {
    public final String b;
    public final e8b c;

    public xe3(String str, e8b e8bVar) {
        super(3);
        this.b = str;
        this.c = e8bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe3)) {
            return false;
        }
        xe3 xe3Var = (xe3) obj;
        return tpa.f(this.b, xe3Var.b) && tpa.f(this.c, xe3Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "NameInputScreen(token=" + this.b + ", presetAvatars=" + this.c + ")";
    }
}
