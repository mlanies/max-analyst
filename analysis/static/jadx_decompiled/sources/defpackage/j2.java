package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class j2 extends AbstractCollection {
    public final /* synthetic */ y1 X;
    public final Object a;
    public Collection b;
    public final j2 c;
    public final Collection o;

    public j2(y1 y1Var, Object obj, Collection collection, j2 j2Var) {
        this.X = y1Var;
        this.a = obj;
        this.b = collection;
        this.c = j2Var;
        this.o = j2Var == null ? null : j2Var.b;
    }

    public final void a() {
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.a();
        } else {
            this.X.o.put(this.a, this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        b();
        boolean zIsEmpty = this.b.isEmpty();
        boolean zAdd = this.b.add(obj);
        if (zAdd) {
            this.X.X++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.b.addAll(collection);
        if (zAddAll) {
            this.X.X += this.b.size() - size;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final void b() {
        Collection collection;
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.b();
            if (j2Var.b != this.o) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.b.isEmpty() || (collection = (Collection) this.X.o.get(this.a)) == null) {
                return;
            }
            this.b = collection;
        }
    }

    public final void c() {
        j2 j2Var = this.c;
        if (j2Var != null) {
            j2Var.c();
        } else if (this.b.isEmpty()) {
            this.X.o.remove(this.a);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        this.X.X -= size;
        c();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        b();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        b();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        b();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        b();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        b();
        return new b2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        b();
        boolean zRemove = this.b.remove(obj);
        if (zRemove) {
            y1 y1Var = this.X;
            y1Var.X--;
            c();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.b.removeAll(collection);
        if (zRemoveAll) {
            this.X.X += this.b.size() - size;
            c();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.b.retainAll(collection);
        if (zRetainAll) {
            this.X.X += this.b.size() - size;
            c();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        b();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        b();
        return this.b.toString();
    }
}
