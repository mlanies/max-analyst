package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class sm7 extends AbstractList implements RandomAccess, Serializable {
    public final List a;
    public final w56 b;

    public sm7(w56 w56Var, List list) {
        list.getClass();
        this.a = list;
        this.b = w56Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.b.mo131apply(this.a.get(i));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new rm7(this, this.a.listIterator(i), 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        return this.b.mo131apply(this.a.remove(i));
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        this.a.subList(i, i2).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }
}
