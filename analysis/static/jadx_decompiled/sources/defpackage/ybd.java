package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class ybd extends AbstractCollection implements Set {
    public final Collection a;
    public final a7b b;

    public ybd(Set set, a7b a7bVar) {
        this.a = set;
        this.b = a7bVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        if (this.b.apply(obj)) {
            return this.a.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.b.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.a.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Collection collection = this.a;
        boolean z = collection instanceof RandomAccess;
        a7b a7bVar = this.b;
        if (!z || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            a7bVar.getClass();
            while (it.hasNext()) {
                if (a7bVar.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        a7bVar.getClass();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            Object obj = list.get(i2);
            if (!a7bVar.apply(obj)) {
                if (i2 > i) {
                    try {
                        list.set(i, obj);
                    } catch (IllegalArgumentException unused) {
                        mqd.H(list, a7bVar, i, i2);
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        mqd.H(list, a7bVar, i, i2);
                        return;
                    }
                }
                i++;
            }
        }
        list.subList(i, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        boolean zContains;
        Collection collection = this.a;
        collection.getClass();
        try {
            zContains = collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            zContains = false;
        }
        if (zContains) {
            return this.b.apply(obj);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        return ngg.r(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return ngg.v(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        Iterator it = this.a.iterator();
        a7b a7bVar = this.b;
        z04.l(a7bVar, "predicate");
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (a7bVar.apply(it.next())) {
                break;
            }
            i++;
        }
        return true ^ (i != -1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        a7b a7bVar = this.b;
        a7bVar.getClass();
        return new l77(it, a7bVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        return contains(obj) && this.a.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        Iterator it = this.a.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.b.apply(next) && !collection.contains(next)) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (this.b.apply(it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            p1 p1Var = (p1) it;
            if (!p1Var.hasNext()) {
                return arrayList.toArray();
            }
            arrayList.add(p1Var.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        Iterator it = iterator();
        ArrayList arrayList = new ArrayList();
        while (true) {
            p1 p1Var = (p1) it;
            if (p1Var.hasNext()) {
                arrayList.add(p1Var.next());
            } else {
                return arrayList.toArray(objArr);
            }
        }
    }
}
