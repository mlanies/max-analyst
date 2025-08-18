package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class v1 extends u1 implements ListIterator {
    public final /* synthetic */ x1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(x1 x1Var, int i) {
        super(0, x1Var);
        this.o = x1Var;
        int size = x1Var.getSize();
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, size, ", size: "));
        }
        this.b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b - 1;
        this.b = i;
        return this.o.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
