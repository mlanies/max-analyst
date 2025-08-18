package defpackage;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class cx3 implements ListIterator {
    public final ListIterator a;
    public final int b;
    public final int c;

    public cx3(List list, int i, int i2, int i3) {
        this.b = i2;
        this.c = i3;
        this.a = list.listIterator(i + i2);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return nextIndex() < this.c;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return previousIndex() >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            return this.a.next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.a.nextIndex() - this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            return this.a.previous();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.a.previousIndex() - this.b;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
