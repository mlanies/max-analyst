package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ns4 implements c6d, os4 {
    public final /* synthetic */ int a;
    public final c6d b;
    public final int c;

    public ns4(c6d c6dVar, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = c6dVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
            default:
                this.b = c6dVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
    }

    @Override // defpackage.os4
    public final c6d a(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c;
                int i3 = i2 + i;
                return i3 < 0 ? new ns4(this, i, 1) : new rae(this.b, i2, i3);
            default:
                return i >= this.c ? this : new ns4(this.b, i, 1);
        }
    }

    @Override // defpackage.os4
    public final c6d b(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c + i;
                return i2 < 0 ? new ns4(this, i, 0) : new ns4(this.b, i2, 0);
            default:
                int i3 = this.c;
                return i >= i3 ? vz4.a : new rae(this.b, i, i3);
        }
    }

    @Override // defpackage.c6d
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new ms4(this);
            default:
                return new ms4(this, (byte) 0);
        }
    }
}
