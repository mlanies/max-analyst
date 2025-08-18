package defpackage;

/* loaded from: classes.dex */
public final class rnc extends hm9 {
    @Override // defpackage.hm9
    public final void B(pjd pjdVar, float f, float f2) {
        pjdVar.d(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        ljd ljdVar = new ljd(0.0f, 0.0f, f3, f3);
        ljdVar.f = 180.0f;
        ljdVar.g = 90.0f;
        pjdVar.g.add(ljdVar);
        jjd jjdVar = new jjd(ljdVar);
        pjdVar.a(180.0f);
        pjdVar.h.add(jjdVar);
        pjdVar.e = 270.0f;
        float f4 = (0.0f + f3) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = 270.0f;
        pjdVar.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        pjdVar.d = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
