package defpackage;

/* loaded from: classes.dex */
public final class w04 extends hm9 {
    @Override // defpackage.hm9
    public final void B(pjd pjdVar, float f, float f2) {
        pjdVar.d(0.0f, f2 * f, 180.0f, 90.0f);
        double d = f2;
        double d2 = f;
        pjdVar.c((float) (Math.sin(Math.toRadians(90.0f)) * d * d2), (float) (Math.sin(Math.toRadians(0.0f)) * d * d2));
    }
}
