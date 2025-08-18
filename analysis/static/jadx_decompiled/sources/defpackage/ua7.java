package defpackage;

/* loaded from: classes.dex */
public abstract class ua7 extends ha6 {
    public static final int[] t0 = w42.h;
    public int[] X;
    public final int Y;
    public x6d Z;
    public final wr6 o;
    public final boolean s0;

    public ua7(wr6 wr6Var, int i) {
        this.a = i;
        this.c = new jb7(0, null, sa7.STRICT_DUPLICATE_DETECTION.a(i) ? new m5d(8, this) : null);
        this.b = sa7.WRITE_NUMBERS_AS_STRINGS.a(i);
        this.X = t0;
        this.Z = ad4.a;
        this.o = wr6Var;
        if (sa7.ESCAPE_NON_ASCII.a(i)) {
            this.Y = 127;
        }
        this.s0 = !sa7.QUOTE_FIELD_NAMES.a(i);
    }
}
