package defpackage;

/* loaded from: classes.dex */
public final class i2d {
    public final long a;
    public final long b;
    public final int c;
    public final int d;

    public i2d(gtd gtdVar, int i, int i2) {
        this.a = oaf.S(gtdVar.a);
        this.b = oaf.S(gtdVar.b);
        int i3 = gtdVar.c;
        this.c = i3;
        int i4 = i3;
        while (true) {
            if (i4 <= 0) {
                break;
            }
            if ((i4 & 1) == 1) {
                fm9.j("Invalid speed divisor: " + i3, (i4 >> 1) == 0);
            } else {
                i2++;
                i4 >>= 1;
            }
        }
        this.d = Math.min(i2, i);
    }
}
