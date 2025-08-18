package defpackage;

/* loaded from: classes2.dex */
public final class ab9 implements bb9 {
    public final jqe a;
    public final jqe b;
    public final d3b c;
    public final boolean d;
    public final int e;

    public ab9(jqe jqeVar, jqe jqeVar2, d3b d3bVar, boolean z, int i) {
        this.a = jqeVar;
        this.b = jqeVar2;
        this.c = d3bVar;
        this.d = z;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab9)) {
            return false;
        }
        ab9 ab9Var = (ab9) obj;
        return tpa.f(this.a, ab9Var.a) && tpa.f(this.b, ab9Var.b) && this.c == ab9Var.c && this.d == ab9Var.d && this.e == ab9Var.e;
    }

    public final int hashCode() {
        int iF = k7d.f(this.a.hashCode() * 31, 31, this.b);
        d3b d3bVar = this.c;
        return au1.s(this.e) + ms2.d((iF + (d3bVar == null ? 0 : d3bVar.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", speed=");
        sb.append(this.c);
        sb.append(", isPlaying=");
        sb.append(this.d);
        sb.append(", type=");
        int i = this.e;
        sb.append(i != 1 ? i != 2 ? "null" : "VIDEO_MSG" : "AUDIO");
        sb.append(")");
        return sb.toString();
    }
}
