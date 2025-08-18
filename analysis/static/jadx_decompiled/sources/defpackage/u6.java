package defpackage;

/* loaded from: classes.dex */
public final class u6 extends v6 {
    public final jqe b;
    public final int c;
    public final int d;

    public u6() {
        eqe eqeVar = new eqe(b8a.G);
        int i = x7a.A;
        int i2 = y7a.A;
        this.b = eqeVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6)) {
            return false;
        }
        u6 u6Var = (u6) obj;
        return tpa.f(this.b, u6Var.b) && this.c == u6Var.c && this.d == u6Var.d;
    }

    @Override // defpackage.m7
    public final int getIcon() {
        return this.c;
    }

    @Override // defpackage.m7
    public final int getId() {
        return this.d;
    }

    @Override // defpackage.m7
    public final jqe getName() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeakerMode(name=");
        sb.append(this.b);
        sb.append(", icon=");
        sb.append(this.c);
        sb.append(", id=");
        return zr6.j(sb, this.d, ")");
    }
}
