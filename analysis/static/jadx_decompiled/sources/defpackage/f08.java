package defpackage;

/* loaded from: classes.dex */
public final class f08 extends vu4 {
    public final float Z;

    public f08(float f) {
        this.Z = f - 0.001f;
    }

    @Override // defpackage.vu4
    public final void p(float f, float f2, float f3, pjd pjdVar) {
        double d = this.Z;
        float fSqrt = (float) ((Math.sqrt(2.0d) * d) / 2.0d);
        float fSqrt2 = (float) Math.sqrt(Math.pow(d, 2.0d) - Math.pow(fSqrt, 2.0d));
        pjdVar.d(f2 - fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2, 270.0f, 0.0f);
        pjdVar.c(f2, (float) (-((Math.sqrt(2.0d) * d) - d)));
        pjdVar.c(f2 + fSqrt, ((float) (-((Math.sqrt(2.0d) * d) - d))) + fSqrt2);
    }
}
