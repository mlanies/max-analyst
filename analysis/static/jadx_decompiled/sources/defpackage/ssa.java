package defpackage;

/* loaded from: classes2.dex */
public final class ssa {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;
    public final usa f;
    public final int g;
    public final int h;
    public final String i;

    public ssa(int i, int i2, int i3, int i4, String str, usa usaVar, int i5, int i6, String str2) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
        this.f = usaVar;
        this.g = i5;
        this.h = i6;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !ssa.class.equals(obj.getClass())) {
            return false;
        }
        ssa ssaVar = (ssa) obj;
        if (this.a == ssaVar.a && this.b == ssaVar.b && this.c == ssaVar.c && this.d == ssaVar.d && this.h == ssaVar.h && tpa.f(this.i, ssaVar.i) && tpa.f(this.f, ssaVar.f) && this.g == ssaVar.g) {
            return tpa.f(this.e, ssaVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.h) * 31;
        String str = this.e;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        usa usaVar = this.f;
        int iHashCode2 = (((iHashCode + (usaVar != null ? usaVar.a.hashCode() : 0)) * 31) + this.g) * 31;
        String str2 = this.i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeerVideoSettings{maxDimension=");
        sb.append(this.a);
        sb.append(", initialMaxDimension=");
        sb.append(this.b);
        sb.append(", maxBitrateK=");
        sb.append(this.c);
        sb.append(", maxFrameRate=");
        sb.append(this.d);
        sb.append(", temporalLayersCount=");
        sb.append(this.h);
        sb.append(", degradationPreference='");
        sb.append(this.e);
        sb.append("', bitrateTable=");
        sb.append(this.f);
        sb.append(", mediaAdaptationScale=");
        sb.append(this.g);
        sb.append(", source='");
        return zr6.l(sb, this.i, "'}");
    }
}
