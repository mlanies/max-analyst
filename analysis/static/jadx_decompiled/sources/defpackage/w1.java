package defpackage;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class w1 extends x1 implements RandomAccess {
    public final x1 a;
    public final int b;
    public final int c;

    public w1(x1 x1Var, int i, int i2) {
        this.a = x1Var;
        this.b = i;
        wmd.k(i, i2, x1Var.getSize());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        return this.a.get(this.b + i);
    }

    @Override // defpackage.x1
    public final int getSize() {
        return this.c;
    }
}
