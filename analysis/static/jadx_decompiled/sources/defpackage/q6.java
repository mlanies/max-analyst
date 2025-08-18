package defpackage;

/* loaded from: classes.dex */
public final class q6 extends s6 {
    public final jqe a;
    public final int b;
    public final int c;

    public q6() {
        eqe eqeVar = new eqe(b8a.S);
        int i = x7a.r0;
        int i2 = y7a.z;
        this.a = eqeVar;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return tpa.f(this.a, q6Var.a) && this.b == q6Var.b && this.c == q6Var.c;
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
        StringBuilder sb = new StringBuilder("ShareScreenUnavailable(name=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", id=");
        return zr6.j(sb, this.c, ")");
    }
}
