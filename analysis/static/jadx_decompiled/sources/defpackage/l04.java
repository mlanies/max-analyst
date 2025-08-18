package defpackage;

/* loaded from: classes.dex */
public final class l04 implements m7 {
    public final int a;
    public final jqe b;
    public final int c;

    public l04(int i, int i2, jqe jqeVar) {
        this.a = i;
        this.b = jqeVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l04)) {
            return false;
        }
        l04 l04Var = (l04) obj;
        return this.a == l04Var.a && tpa.f(this.b, l04Var.b) && this.c == l04Var.c;
    }

    @Override // defpackage.m7
    public final int getIcon() {
        return this.a;
    }

    @Override // defpackage.m7
    public final int getId() {
        return this.c;
    }

    @Override // defpackage.m7
    public final jqe getName() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.f(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CustomContextAction(icon=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", id=");
        return zr6.j(sb, this.c, ")");
    }
}
