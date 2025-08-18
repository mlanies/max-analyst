package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class hy7 extends jy7 implements Iterator, qb7 {
    public final /* synthetic */ int X;

    public hy7(int i, ky7 ky7Var) {
        this.X = i;
        this.o = ky7Var;
        this.b = -1;
        this.c = ky7Var.s0;
        f();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.X) {
            case 0:
                b();
                int i = this.a;
                ky7 ky7Var = (ky7) this.o;
                if (i >= ky7Var.Y) {
                    throw new NoSuchElementException();
                }
                this.a = i + 1;
                this.b = i;
                iy7 iy7Var = new iy7(i, ky7Var);
                f();
                return iy7Var;
            case 1:
                b();
                int i2 = this.a;
                ky7 ky7Var2 = (ky7) this.o;
                if (i2 >= ky7Var2.Y) {
                    throw new NoSuchElementException();
                }
                this.a = i2 + 1;
                this.b = i2;
                Object obj = ky7Var2.a[i2];
                f();
                return obj;
            default:
                b();
                int i3 = this.a;
                ky7 ky7Var3 = (ky7) this.o;
                if (i3 >= ky7Var3.Y) {
                    throw new NoSuchElementException();
                }
                this.a = i3 + 1;
                this.b = i3;
                Object obj2 = ky7Var3.b[i3];
                f();
                return obj2;
        }
    }
}
