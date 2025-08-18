package defpackage;

/* loaded from: classes2.dex */
public final class cme {
    public final er7 a;
    public final long b;
    public final long c;

    public cme(er7 er7Var, long j, long j2) {
        this.a = er7Var;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cme)) {
            return false;
        }
        cme cmeVar = (cme) obj;
        return tpa.f(this.a, cmeVar.a) && this.b == cmeVar.b && this.c == cmeVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + h4f.m(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "LocationResult(locationData=" + this.a + ", livePeriod=" + this.b + ", zoom=" + this.c + ")";
    }
}
