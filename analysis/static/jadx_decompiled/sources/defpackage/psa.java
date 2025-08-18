package defpackage;

/* loaded from: classes2.dex */
public final class psa {
    public final boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Boolean d;
    public final Integer e;
    public final Integer f;
    public final Integer g;
    public final Integer h;

    public psa(boolean z, Integer num, Integer num2, Boolean bool, Boolean bool2, Boolean bool3, Integer num3, Integer num4) {
        this.a = z;
        this.b = bool;
        this.c = bool2;
        this.d = bool3;
        this.e = num;
        this.f = num2;
        this.g = num3;
        this.h = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psa)) {
            return false;
        }
        psa psaVar = (psa) obj;
        return this.a == psaVar.a && tpa.f(this.b, psaVar.b) && tpa.f(this.c, psaVar.c) && tpa.f(this.d, psaVar.d) && tpa.f(this.e, psaVar.e) && tpa.f(this.f, psaVar.f) && tpa.f(this.g, psaVar.g) && tpa.f(this.h, psaVar.h);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.e;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.g;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.h;
        return iHashCode7 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "DynamicRedundancyParams(isEnabled=" + this.a + ", isNoLaceEnabled=" + this.b + ", isDREDWithFecEnabled=" + this.c + ", isDREDLowBitrateEnabled=" + this.d + ", minAudioBitrateBps=" + this.e + ", dREDSwitchBitrateBps=" + this.f + ", pTimeMinMs=" + this.g + ", pTimeMaxMs=" + this.h + ")";
    }
}
