package defpackage;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class s6g extends r6g {
    public v27 n;
    public v27 o;
    public v27 p;

    public s6g(x6g x6gVar, WindowInsets windowInsets) {
        super(x6gVar, windowInsets);
        this.n = null;
        this.o = null;
        this.p = null;
    }

    @Override // defpackage.v6g
    public v27 g() {
        if (this.o == null) {
            this.o = v27.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    @Override // defpackage.v6g
    public v27 i() {
        if (this.n == null) {
            this.n = v27.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    @Override // defpackage.v6g
    public v27 k() {
        if (this.p == null) {
            this.p = v27.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    @Override // defpackage.v6g
    public x6g l(int i, int i2, int i3, int i4) {
        return x6g.f(null, this.c.inset(i, i2, i3, i4));
    }
}
