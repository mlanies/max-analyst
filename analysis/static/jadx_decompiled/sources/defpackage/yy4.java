package defpackage;

/* loaded from: classes2.dex */
public final class yy4 {
    public final int a;
    public final int b;
    public final int c;

    public yy4(int i, int i2, int i3, int i4) {
        i = (i4 & 1) != 0 ? Integer.MIN_VALUE : i;
        i2 = (i4 & 2) != 0 ? -1 : i2;
        i3 = (i4 & 4) != 0 ? -1 : i3;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }
}
