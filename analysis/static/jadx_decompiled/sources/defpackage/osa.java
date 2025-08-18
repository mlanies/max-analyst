package defpackage;

/* loaded from: classes2.dex */
public final class osa {
    public final Integer a;
    public final Integer b;
    public final Boolean c;

    public osa(Integer num, Integer num2, Boolean bool, Integer num3, Integer num4, Double d) {
        this.a = num;
        this.b = num2;
        this.c = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osa)) {
            return false;
        }
        osa osaVar = (osa) obj;
        return tpa.f(this.a, osaVar.a) && tpa.f(this.b, osaVar.b) && tpa.f(this.c, osaVar.c) && tpa.f(null, null) && tpa.f(null, null) && tpa.f(null, null);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.c;
        return (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 29791;
    }

    public final String toString() {
        return "AudioAdaptationParams(minEncoderBitrateKBps=" + this.a + ", minPayloadBitrateKBps=" + this.b + ", useSlowAdaptation=" + this.c + ", minBitrateConstraintBps=null, maxBitrateConstraintBps=null, bitratePriority=null)";
    }
}
