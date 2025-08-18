package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class mfc extends ox6 {
    public static final mfc Z;
    public final transient zw6 Y;

    static {
        ls5 ls5Var = zw6.b;
        Z = new mfc(ffc.X, sm9.a);
    }

    public mfc(zw6 zw6Var, Comparator comparator) {
        super(comparator);
        this.Y = zw6Var;
    }

    @Override // defpackage.jx6, defpackage.qw6
    public final zw6 a() {
        return this.Y;
    }

    @Override // defpackage.qw6
    public final int b(int i, Object[] objArr) {
        return this.Y.b(i, objArr);
    }

    @Override // defpackage.qw6
    public final Object[] c() {
        return this.Y.c();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int iR = r(obj, true);
        zw6 zw6Var = this.Y;
        if (iR == zw6Var.size()) {
            return null;
        }
        return zw6Var.get(iR);
    }

    @Override // defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return Collections.binarySearch(this.Y, obj, this.o) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Comparator comparator = this.o;
        if (!ema.t(collection, comparator) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        m5f it = iterator();
        Iterator it2 = collection.iterator();
        o1 o1Var = (o1) it;
        if (!o1Var.hasNext()) {
            return false;
        }
        Object next = it2.next();
        Object next2 = o1Var.next();
        while (true) {
            try {
                int iCompare = comparator.compare(next2, next);
                if (iCompare < 0) {
                    if (!o1Var.hasNext()) {
                        return false;
                    }
                    next2 = o1Var.next();
                } else if (iCompare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iCompare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // defpackage.qw6
    public final int d() {
        return this.Y.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.Y.q().listIterator(0);
    }

    @Override // defpackage.qw6
    public final int e() {
        return this.Y.e();
    }

    @Override // defpackage.jx6, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.Y.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        Comparator comparator = this.o;
        if (!ema.t(set, comparator)) {
            return containsAll(set);
        }
        Iterator it = set.iterator();
        try {
            m5f it2 = iterator();
            do {
                o1 o1Var = (o1) it2;
                if (!o1Var.hasNext()) {
                    return true;
                }
                next = o1Var.next();
                next2 = it.next();
                if (next2 == null) {
                    break;
                }
            } while (comparator.compare(next, next2) == 0);
            return false;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // defpackage.qw6
    public final boolean f() {
        return this.Y.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.Y.get(0);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int iQ = q(obj, true) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.Y.get(iQ);
    }

    @Override // defpackage.qw6
    /* renamed from: g */
    public final m5f iterator() {
        return this.Y.listIterator(0);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int iR = r(obj, false);
        zw6 zw6Var = this.Y;
        if (iR == zw6Var.size()) {
            return null;
        }
        return zw6Var.get(iR);
    }

    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int iBinarySearch = Collections.binarySearch(this.Y, obj, this.o);
            if (iBinarySearch >= 0) {
                return iBinarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.Y.get(r1.size() - 1);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int iQ = q(obj, false) - 1;
        if (iQ == -1) {
            return null;
        }
        return this.Y.get(iQ);
    }

    public final mfc p(int i, int i2) {
        zw6 zw6Var = this.Y;
        if (i == 0 && i2 == zw6Var.size()) {
            return this;
        }
        Comparator comparator = this.o;
        return i < i2 ? new mfc(zw6Var.subList(i, i2), comparator) : ox6.n(comparator);
    }

    public final int q(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.Y, obj, this.o);
        return iBinarySearch >= 0 ? z ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    public final int r(Object obj, boolean z) {
        obj.getClass();
        int iBinarySearch = Collections.binarySearch(this.Y, obj, this.o);
        return iBinarySearch >= 0 ? z ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.Y.size();
    }
}
