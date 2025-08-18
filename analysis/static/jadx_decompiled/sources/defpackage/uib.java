package defpackage;

/* loaded from: classes2.dex */
public final class uib extends vib {
    public final ycb a;
    public final int b;

    public uib(ycb ycbVar, int i) {
        this.a = ycbVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uib)) {
            return false;
        }
        uib uibVar = (uib) obj;
        return tpa.f(this.a, uibVar.a) && lz7.i(this.b, uibVar.b);
    }

    @Override // defpackage.ol7
    public final long getItemId() {
        return this.a.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + ey8.g(1, this.a.hashCode() * 31, 31);
    }

    @Override // defpackage.ol7
    /* renamed from: l */
    public final int getI0() {
        return this.b;
    }

    public final String toString() {
        String strU = lz7.U(this.b);
        StringBuilder sb = new StringBuilder("Result(cellModel=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append("CHAT");
        sb.append(", itemViewType=");
        return zr6.l(sb, strU, ")");
    }
}
