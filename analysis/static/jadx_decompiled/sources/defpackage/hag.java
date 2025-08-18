package defpackage;

/* loaded from: classes.dex */
public final class hag implements gag {
    public float a;
    public final float b;
    public final float c;
    public float d;

    public hag(float f, float f2) {
        this.b = f;
        this.c = f2;
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

    public final void e(float f) {
        if (f > 1.0f || f < 0.0f) {
            throw new IllegalArgumentException("Requested linearZoom " + f + " is not within valid range [0..1]");
        }
        this.d = f;
        float f2 = this.b;
        if (f != 1.0f) {
            float f3 = this.c;
            if (f == 0.0f) {
                f2 = f3;
            } else {
                double d = 1.0f / f3;
                double d2 = 1.0d / ((((1.0f / f2) - d) * f) + d);
                double d3 = f3;
                double d4 = f2;
                if (d2 < d3) {
                    d2 = d3;
                } else if (d2 > d4) {
                    d2 = d4;
                }
                f2 = (float) d2;
            }
        }
        this.a = f2;
    }

    public final void f(float f) {
        float f2 = this.b;
        float f3 = this.c;
        if (f > f2 || f < f3) {
            throw new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + f3 + " , " + f2 + "]");
        }
        this.a = f;
        float f4 = 0.0f;
        if (f2 != f3) {
            if (f == f2) {
                f4 = 1.0f;
            } else if (f != f3) {
                float f5 = 1.0f / f3;
                f4 = ((1.0f / f) - f5) / ((1.0f / f2) - f5);
            }
        }
        this.d = f4;
    }
}
