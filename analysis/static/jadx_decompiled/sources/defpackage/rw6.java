package defpackage;

/* loaded from: classes2.dex */
public final class rw6 extends n1 implements fy9 {
    public final double a;

    public rw6(double d) {
        this.a = d;
    }

    @Override // defpackage.uaf
    public final String a() {
        double d = this.a;
        return (Double.isNaN(d) || Double.isInfinite(d)) ? "null" : Double.toString(d);
    }

    @Override // defpackage.uaf
    public final int e() {
        return 4;
    }

    @Override // defpackage.uaf
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uaf)) {
            return false;
        }
        uaf uafVar = (uaf) obj;
        int iE = ((n1) uafVar).e();
        if (iE == 0) {
            throw null;
        }
        if (iE == 4) {
            return this.a == uafVar.l().a;
        }
        return false;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // defpackage.n1, defpackage.uaf
    public final rw6 l() {
        return this;
    }

    public final String toString() {
        return Double.toString(this.a);
    }

    @Override // defpackage.n1
    /* renamed from: v */
    public final rw6 l() {
        return this;
    }
}
