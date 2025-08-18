package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class rae implements c6d, os4 {
    public final c6d a;
    public final int b;
    public final int c;

    public rae(c6d c6dVar, int i, int i2) {
        this.a = c6dVar;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "startIndex should be non-negative, but is ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(zr6.h(i2, "endIndex should be non-negative, but is ").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(rh4.h("endIndex should be not less than startIndex, but was ", i2, i, " < ").toString());
        }
    }

    @Override // defpackage.os4
    public final c6d a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return this;
        }
        return new rae(this.a, i3, i + i3);
    }

    @Override // defpackage.os4
    public final c6d b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return vz4.a;
        }
        return new rae(this.a, i3 + i, i2);
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        return new ia6(this);
    }
}
