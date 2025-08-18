package defpackage;

/* loaded from: classes2.dex */
public abstract class t1 implements kb7 {
    public abstract void a(String str);

    @Override // defpackage.kb7
    public void c0() {
        a("null");
    }

    public final void d(double d) {
        if (!Double.isInfinite(d) && !Double.isNaN(d)) {
            a(Double.toString(d));
        } else {
            throw new IllegalArgumentException("Numeric value to be finite but was " + d);
        }
    }
}
