package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class my7 extends AbstractCollection implements Collection, rb7 {
    public final ky7 a;

    public my7(ky7 ky7Var) {
        this.a = ky7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ky7 ky7Var = this.a;
        ky7Var.getClass();
        return new hy7(2, ky7Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        ky7 ky7Var = this.a;
        ky7Var.c();
        int i2 = ky7Var.Y;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (ky7Var.c[i2] >= 0 && tpa.f(ky7Var.b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        if (i < 0) {
            return false;
        }
        ky7Var.j(i);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        this.a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        this.a.c();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.t0;
    }
}
