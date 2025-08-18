package defpackage;

/* loaded from: classes2.dex */
public final class m26 {
    public static final m26 d = new m26(null, 7);
    public final gef a;
    public final int b;
    public final int c;

    public /* synthetic */ m26(gef gefVar, int i) {
        this((i & 1) != 0 ? null : gefVar, 0, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m26)) {
            return false;
        }
        m26 m26Var = (m26) obj;
        return tpa.f(this.a, m26Var.a) && this.b == m26Var.b && this.c == m26Var.c;
    }

    public final int hashCode() {
        gef gefVar = this.a;
        return Integer.hashCode(this.c) + k7d.e(this.b, (gefVar == null ? 0 : gefVar.hashCode()) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtractorData(videoContent=");
        sb.append(this.a);
        sb.append(", frameWidth=");
        sb.append(this.b);
        sb.append(", frameHeight=");
        return zr6.j(sb, this.c, ")");
    }

    public m26(gef gefVar, int i, int i2) {
        this.a = gefVar;
        this.b = i;
        this.c = i2;
    }
}
