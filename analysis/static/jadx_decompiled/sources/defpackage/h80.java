package defpackage;

/* loaded from: classes2.dex */
public final class h80 extends gle {
    public final long X;
    public final long Y;
    public final int Z;
    public final String c;
    public final int o;

    public h80(String str, int i, long j, long j2, int i2) {
        this.c = str;
        this.o = i;
        this.X = j;
        this.Y = j2;
        this.Z = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h80)) {
            return false;
        }
        h80 h80Var = (h80) obj;
        return tpa.f(this.c, h80Var.c) && this.o == h80Var.o && this.X == h80Var.X && this.Y == h80Var.Y && this.Z == h80Var.Z;
    }

    public final int hashCode() {
        return Integer.hashCode(this.Z) + h4f.m(h4f.m(k7d.e(this.o, this.c.hashCode() * 31, 31), 31, this.X), 31, this.Y);
    }

    @Override // defpackage.zje
    public final String toString() {
        StringBuilder sbM = au1.m("Response(verifyToken='", oag.x(this.c), "', altActionDuration=");
        sbM.append(this.X);
        sbM.append(", codeLength=");
        sbM.append(this.o);
        sbM.append(", requestMaxDuration=");
        sbM.append(this.Y);
        sbM.append(", requestCountLeft=");
        return zr6.j(sbM, this.Z, ")");
    }
}
