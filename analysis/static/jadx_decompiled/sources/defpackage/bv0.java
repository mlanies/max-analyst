package defpackage;

/* loaded from: classes.dex */
public final class bv0 extends ez1 {
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv0(int i, rxd rxdVar, Float f, int i2) {
        super(i, rxdVar, f);
        this.o = i2;
    }

    @Override // defpackage.ez1
    public final String toString() {
        switch (this.o) {
            case 0:
                return "[ButtCap]";
            case 1:
                return "[RoundCap]";
            default:
                return "[SquareCap]";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv0() {
        super(0, null, null);
        this.o = 0;
    }
}
