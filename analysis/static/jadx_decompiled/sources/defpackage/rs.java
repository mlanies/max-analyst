package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class rs implements Set {
    public final /* synthetic */ us a;

    public rs(us usVar) {
        this.a = usVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        us usVar = this.a;
        int iHashCode = 0;
        for (int i = usVar.c - 1; i >= 0; i--) {
            Object objF = usVar.f(i);
            iHashCode += objF == null ? 0 : objF.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new qs(this.a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        us usVar = this.a;
        int iD = usVar.d(obj);
        if (iD < 0) {
            return false;
        }
        usVar.g(iD);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.a.k(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.a.l(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        us usVar = this.a;
        int i = usVar.c;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = usVar.f(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        us usVar = this.a;
        int i = usVar.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = usVar.f(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }
}
