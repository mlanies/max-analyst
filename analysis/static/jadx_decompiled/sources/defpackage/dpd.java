package defpackage;

/* loaded from: classes2.dex */
public final class dpd {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public dpd(cpd cpdVar) {
        this.a = cpdVar.a;
        this.b = cpdVar.b;
        this.c = cpdVar.c;
        this.e = cpdVar.e;
        this.d = cpdVar.d;
        this.f = cpdVar.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dpd.class != obj.getClass()) {
            return false;
        }
        dpd dpdVar = (dpd) obj;
        return this.a == dpdVar.a && this.b == dpdVar.b && this.c == dpdVar.c && this.d == dpdVar.d && this.f == dpdVar.f && this.e == dpdVar.e;
    }

    public final int hashCode() {
        return ((((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.f ? 1 : 0);
    }
}
