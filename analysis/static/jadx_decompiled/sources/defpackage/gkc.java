package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class gkc extends r2 {
    public final List a;

    public gkc(List list) {
        this.a = list;
    }

    @Override // defpackage.r2
    public final Object a(int i) {
        return this.a.remove(x53.a0(i, this));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        this.a.add(x53.b0(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return this.a.get(x53.a0(i, this));
    }

    @Override // defpackage.r2
    public final int getSize() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new fkc(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return new fkc(this, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return this.a.set(x53.a0(i, this), obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new fkc(this, i);
    }
}
