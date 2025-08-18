package defpackage;

/* loaded from: classes.dex */
public final class k04 extends ez1 {
    public final float X;
    public final rxd o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k04(rxd rxdVar, float f) {
        super(3, rxdVar, Float.valueOf(f));
        fp3.o(rxdVar, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.o = rxdVar;
        this.X = f;
    }

    @Override // defpackage.ez1
    public final String toString() {
        StringBuilder sbM = au1.m("[CustomCap: bitmapDescriptor=", String.valueOf(this.o), " refWidth=");
        sbM.append(this.X);
        sbM.append("]");
        return sbM.toString();
    }
}
