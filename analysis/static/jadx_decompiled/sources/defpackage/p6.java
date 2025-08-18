package defpackage;

/* loaded from: classes.dex */
public final class p6 extends s6 {
    public final jqe a;
    public final int b;
    public final int c;

    public p6() {
        eqe eqeVar = new eqe(b8a.O);
        int i = x7a.r0;
        int i2 = y7a.x;
        this.a = eqeVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return tpa.f(this.a, p6Var.a) && this.b == p6Var.b && this.c == p6Var.c;
    }

    @Override // defpackage.m7
    public final int getIcon() {
        return this.b;
    }

    @Override // defpackage.m7
    public final int getId() {
        return this.c;
    }

    @Override // defpackage.m7
    public final jqe getName() {
        return this.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShareScreen(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return zr6.j(sb, this.c, ")");
    }
}
