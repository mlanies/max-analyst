package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class fs8 implements Serializable, dt7 {
    public final long A0;
    public final e92 B0;
    public final List C0;
    public final ng4 D0;
    public final fx8 E0;
    public final wx8 X;
    public final long Y;
    public final String Z;
    public final long a;
    public final long b;
    public final long c;
    public final long o;
    public final wz s0;
    public final aw8 t0;
    public final fy8 u0;
    public final ux8 v0;
    public final int w0;
    public final long x0;
    public final int y0;
    public final int z0;

    public fs8(long j, long j2, long j3, long j4, wx8 wx8Var, long j5, String str, wz wzVar, aw8 aw8Var, fy8 fy8Var, ux8 ux8Var, int i, long j6, int i2, int i3, long j7, e92 e92Var, List list, ng4 ng4Var, fx8 fx8Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.o = j4;
        this.X = wx8Var;
        this.Y = j5;
        this.Z = str;
        this.s0 = wzVar;
        this.t0 = aw8Var;
        this.u0 = fy8Var;
        this.v0 = ux8Var;
        this.w0 = i;
        this.x0 = j6;
        this.y0 = i2;
        this.z0 = i3;
        this.A0 = j7;
        this.B0 = e92Var;
        this.C0 = list;
        this.D0 = ng4Var;
        this.E0 = fx8Var;
    }

    @Override // defpackage.dt7
    public final String a(boolean z, boolean z2) {
        String str = this.Z;
        if (str == null) {
            str = null;
        } else if (!z2) {
            str = "***";
        }
        String strG = nu0.G(Long.valueOf(this.b));
        String strX = wmd.x(this.C0, z, z2);
        StringBuilder sb = new StringBuilder("Message{id=");
        ms2.j(this.a, ", text=", str, sb);
        sb.append(", delayedAttrs=");
        sb.append(this.D0);
        sb.append(", time=");
        sb.append(strG);
        sb.append(", status=");
        sb.append(this.X);
        sb.append(", sender=");
        sb.append(this.o);
        sb.append(", cid=");
        sb.append(this.Y);
        sb.append(", attaches=");
        sb.append(this.s0);
        sb.append(", type=");
        sb.append(this.u0);
        sb.append(", elements=");
        sb.append(strX);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs8)) {
            return false;
        }
        fs8 fs8Var = (fs8) obj;
        return this.a == fs8Var.a && this.b == fs8Var.b && this.c == fs8Var.c && this.o == fs8Var.o && this.X == fs8Var.X && this.Y == fs8Var.Y && tpa.f(this.Z, fs8Var.Z) && tpa.f(this.s0, fs8Var.s0) && tpa.f(this.t0, fs8Var.t0) && this.u0 == fs8Var.u0 && tpa.f(this.v0, fs8Var.v0) && this.w0 == fs8Var.w0 && this.x0 == fs8Var.x0 && this.y0 == fs8Var.y0 && this.z0 == fs8Var.z0 && this.A0 == fs8Var.A0 && tpa.f(this.B0, fs8Var.B0) && tpa.f(this.C0, fs8Var.C0) && tpa.f(this.D0, fs8Var.D0) && tpa.f(this.E0, fs8Var.E0);
    }

    public final int hashCode() {
        int iM = h4f.m(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.o);
        wx8 wx8Var = this.X;
        int iM2 = h4f.m((iM + (wx8Var == null ? 0 : wx8Var.hashCode())) * 31, 31, this.Y);
        String str = this.Z;
        int iHashCode = (this.s0.hashCode() + ((iM2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        aw8 aw8Var = this.t0;
        int iHashCode2 = (this.u0.hashCode() + ((iHashCode + (aw8Var == null ? 0 : aw8Var.hashCode())) * 31)) * 31;
        ux8 ux8Var = this.v0;
        int iM3 = h4f.m(k7d.e(this.z0, k7d.e(this.y0, h4f.m(k7d.e(this.w0, (iHashCode2 + (ux8Var == null ? 0 : ux8Var.hashCode())) * 31, 31), 31, this.x0), 31), 31), 31, this.A0);
        e92 e92Var = this.B0;
        int iG = k7d.g(this.C0, (iM3 + (e92Var == null ? 0 : e92Var.hashCode())) * 31, 31);
        ng4 ng4Var = this.D0;
        int iHashCode3 = (iG + (ng4Var == null ? 0 : ng4Var.hashCode())) * 31;
        fx8 fx8Var = this.E0;
        return iHashCode3 + (fx8Var != null ? fx8Var.hashCode() : 0);
    }

    public final String toString() {
        return a(false, false);
    }
}
