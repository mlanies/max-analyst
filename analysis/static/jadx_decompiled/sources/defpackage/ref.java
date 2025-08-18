package defpackage;

/* loaded from: classes2.dex */
public final class ref {
    public final mqb a;
    public final float b;
    public final float c;
    public final boolean d;

    public ref(i20 i20Var) {
        this.a = i20Var.a;
        this.b = i20Var.b;
        this.c = i20Var.c;
        this.d = i20Var.d;
    }

    public final i20 a() {
        i20 i20Var = new i20(1);
        i20Var.a = this.a;
        i20Var.b = this.b;
        i20Var.c = this.c;
        i20Var.d = this.d;
        return i20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ref.class != obj.getClass()) {
            return false;
        }
        ref refVar = (ref) obj;
        return Float.compare(refVar.b, this.b) == 0 && Float.compare(refVar.c, this.c) == 0 && this.d == refVar.d && this.a == refVar.a;
    }

    public final int hashCode() {
        mqb mqbVar = this.a;
        int iHashCode = (mqbVar != null ? mqbVar.hashCode() : 0) * 31;
        float f = this.b;
        int iFloatToIntBits = (iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.c;
        return ((iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + (this.d ? 1 : 0);
    }

    public final String toString() {
        return "VideoConvertOptions{quality=" + this.a + ", startTrimPosition=" + this.b + ", endTrimPosition=" + this.c + ", mute=" + this.d + '}';
    }
}
