package defpackage;

/* loaded from: classes2.dex */
public final class uy3 implements ol7 {
    public final int a;
    public final int b;
    public final jqe c;

    public uy3(int i, int i2, eqe eqeVar) {
        this.a = i;
        this.b = i2;
        this.c = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uy3)) {
            return false;
        }
        uy3 uy3Var = (uy3) obj;
        return this.a == uy3Var.a && this.b == uy3Var.b && tpa.f(this.c, uy3Var.c);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.e(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return zia.n;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateButton(id=");
        sb.append(this.a);
        sb.append(", icon=");
        sb.append(this.b);
        sb.append(", text=");
        return rh4.l(sb, this.c, ")");
    }
}
