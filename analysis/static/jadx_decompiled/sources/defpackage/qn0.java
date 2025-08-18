package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class qn0 {
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final qqd e;

    public qn0(int i, int i2) {
        if (!(i > 0)) {
            throw new IllegalArgumentException();
        }
        if (!(i2 > 0)) {
            throw new IllegalArgumentException();
        }
        this.c = i;
        this.d = i2;
        this.e = new qqd(4, this);
    }

    public final synchronized void a(Bitmap bitmap) {
        int iD = qo0.d(bitmap);
        od2.k("No bitmaps registered.", this.a > 0);
        long j = iD;
        od2.l(j <= this.b, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(iD), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public final synchronized int b() {
        return this.d;
    }
}
