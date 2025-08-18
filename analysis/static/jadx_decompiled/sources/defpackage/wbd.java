package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wbd extends t2 implements Serializable {
    public static final wbd b;
    public final ky7 a;

    static {
        ky7 ky7Var = ky7.y0;
        b = new wbd(ky7.y0);
    }

    public wbd(ky7 ky7Var) {
        this.a = ky7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        return this.a.a(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        this.a.c();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.t2
    public final int getSize() {
        return this.a.t0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        ky7 ky7Var = this.a;
        ky7Var.getClass();
        return new hy7(1, ky7Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        ky7 ky7Var = this.a;
        ky7Var.c();
        int iG = ky7Var.g(obj);
        if (iG < 0) {
            return false;
        }
        ky7Var.j(iG);
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        this.a.c();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        this.a.c();
        return super.retainAll(collection);
    }

    public wbd() {
        this(new ky7());
    }
}
