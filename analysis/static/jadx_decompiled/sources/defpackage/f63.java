package defpackage;

/* loaded from: classes.dex */
public final class f63 {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ o23 j;

    public f63(o23 o23Var, int i, int i2) {
        this.j = o23Var;
        this.a = i;
        this.b = i2;
        a();
    }

    public final void a() {
        o23 o23Var = this.j;
        int[] iArr = (int[]) o23Var.a;
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MAX_VALUE;
        for (int i8 = this.a; i8 <= this.b; i8++) {
            int i9 = iArr[i8];
            i5 += ((int[]) o23Var.b)[i9];
            int i10 = (i9 >> 10) & 31;
            int i11 = (i9 >> 5) & 31;
            int i12 = i9 & 31;
            if (i10 > i2) {
                i2 = i10;
            }
            if (i10 < i) {
                i = i10;
            }
            if (i11 > i3) {
                i3 = i11;
            }
            if (i11 < i6) {
                i6 = i11;
            }
            if (i12 > i4) {
                i4 = i12;
            }
            if (i12 < i7) {
                i7 = i12;
            }
        }
        this.d = i;
        this.e = i2;
        this.f = i6;
        this.g = i3;
        this.h = i7;
        this.i = i4;
        this.c = i5;
    }

    public final int b() {
        return ((this.i - this.h) + 1) * ((this.g - this.f) + 1) * ((this.e - this.d) + 1);
    }
}
