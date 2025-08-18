package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ly7 extends t2 {
    public final /* synthetic */ int a;
    public final ky7 b;

    public /* synthetic */ ly7(int i, ky7 ky7Var) {
        this.a = i;
        this.b = ky7Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                ky7 ky7Var = this.b;
                ky7Var.getClass();
                int iG = ky7Var.g(entry.getKey());
                if (iG < 0) {
                    return false;
                }
                return tpa.f(ky7Var.b[iG], entry.getValue());
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                return this.b.e(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // defpackage.t2
    public final int getSize() {
        switch (this.a) {
        }
        return this.b.t0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                ky7 ky7Var = this.b;
                ky7Var.getClass();
                return new hy7(0, ky7Var);
            default:
                ky7 ky7Var2 = this.b;
                ky7Var2.getClass();
                return new hy7(1, ky7Var2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    ky7 ky7Var = this.b;
                    ky7Var.c();
                    int iG = ky7Var.g(entry.getKey());
                    if (iG >= 0 && tpa.f(ky7Var.b[iG], entry.getValue())) {
                        ky7Var.j(iG);
                        break;
                    }
                }
                break;
            default:
                ky7 ky7Var2 = this.b;
                ky7Var2.c();
                int iG2 = ky7Var2.g(obj);
                if (iG2 >= 0) {
                    ky7Var2.j(iG2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                this.b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                this.b.c();
                break;
            default:
                this.b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
