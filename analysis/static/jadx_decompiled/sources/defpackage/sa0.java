package defpackage;

/* loaded from: classes.dex */
public final class sa0 implements gag {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public sa0(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public static sa0 e(gag gagVar) {
        return new sa0(gagVar.c(), gagVar.a(), gagVar.b(), gagVar.d());
    }

    @Override // defpackage.gag
    public final float a() {
        return this.b;
    }

    @Override // defpackage.gag
    public final float b() {
        return this.c;
    }

    @Override // defpackage.gag
    public final float c() {
        return this.a;
    }

    @Override // defpackage.gag
    public final float d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sa0)) {
            return false;
        }
        sa0 sa0Var = (sa0) obj;
        return Float.floatToIntBits(this.a) == Float.floatToIntBits(sa0Var.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(sa0Var.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(sa0Var.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(sa0Var.d);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.d) ^ ((((((Float.floatToIntBits(this.a) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.b)) * 1000003) ^ Float.floatToIntBits(this.c)) * 1000003);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.a + ", maxZoomRatio=" + this.b + ", minZoomRatio=" + this.c + ", linearZoom=" + this.d + "}";
    }
}
