package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class t93 implements Iterator {
    public int a;
    public int b;
    public int c;
    public final /* synthetic */ v93 o;

    public t93(v93 v93Var) {
        this.o = v93Var;
        this.a = v93Var.X;
        this.b = v93Var.isEmpty() ? -1 : 0;
        this.c = -1;
    }

    public abstract Object a(int i);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        v93 v93Var = this.o;
        if (v93Var.X != this.a) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        this.c = i;
        Object objA = a(i);
        int i2 = this.b + 1;
        if (i2 >= v93Var.Y) {
            i2 = -1;
        }
        this.b = i2;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        v93 v93Var = this.o;
        int i = v93Var.X;
        int i2 = this.a;
        if (i != i2) {
            throw new ConcurrentModificationException();
        }
        int i3 = this.c;
        if (i3 < 0) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        this.a = i2 + 32;
        v93Var.remove(v93Var.i()[i3]);
        this.b--;
        this.c = -1;
    }
}
