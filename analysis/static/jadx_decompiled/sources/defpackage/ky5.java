package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final class ky5 implements Collection, qb7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public ky5(ly5 ly5Var) {
        this.b = ly5Var.a;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof l38)) {
                    return false;
                }
                return ((ConcurrentSkipListSet) this.b).contains((l38) obj);
            default:
                return ((qi9) this.b).c(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).containsAll(collection);
            default:
                if (collection.isEmpty()) {
                    return true;
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((qi9) this.b).c(it.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).isEmpty();
            default:
                return ((qi9) this.b).h();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).iterator();
            default:
                return m6d.u(new tsc((qi9) this.b, null));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((ConcurrentSkipListSet) this.b).size();
            default:
                return ((qi9) this.b).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return f46.d0(this);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
        }
        return f46.e0(this, objArr);
    }

    public ky5(qi9 qi9Var) {
        this.b = qi9Var;
    }
}
