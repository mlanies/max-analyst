package defpackage;

/* loaded from: classes.dex */
public final class t26 {
    public final i63 a;
    public final int b;
    public final int c;
    public final float d;
    public final long e;

    public t26(i63 i63Var, int i, int i2, float f, long j) {
        fm9.e("width must be positive, but is: " + i, i > 0);
        fm9.e("height must be positive, but is: " + i2, i2 > 0);
        this.a = i63Var;
        this.b = i;
        this.c = i2;
        this.d = f;
        this.e = j;
    }
}
