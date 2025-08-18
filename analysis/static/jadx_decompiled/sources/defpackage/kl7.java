package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class kl7 extends r2 implements RandomAccess, Serializable {
    public static final kl7 o;
    public Object[] a;
    public int b;
    public boolean c;

    static {
        kl7 kl7Var = new kl7(0);
        kl7Var.c = true;
        o = kl7Var;
    }

    public kl7(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        this.a = new Object[i];
    }

    @Override // defpackage.r2
    public final Object a(int i) {
        e();
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        return g(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        e();
        int i = this.b;
        ((AbstractList) this).modCount++;
        f(i, 1);
        this.a[i] = obj;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        e();
        int size = collection.size();
        c(this.b, collection, size);
        return size > 0;
    }

    public final void c(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        f(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.a[i + i3] = it.next();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        e();
        h(0, this.b);
    }

    public final void d(int i, Object obj) {
        ((AbstractList) this).modCount++;
        f(i, 1);
        this.a[i] = obj;
    }

    public final void e() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            if (!j47.b(this.a, 0, this.b, (List) obj)) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i, int i2) {
        int i3 = this.b + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.a;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(objArr, i4);
        }
        Object[] objArr2 = this.a;
        ys.W(i + i2, i, this.b, objArr2, objArr2);
        this.b += i2;
    }

    public final Object g(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        ys.W(i, i + 1, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2 - 1] = null;
        this.b = i2 - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        return this.a[i];
    }

    @Override // defpackage.r2
    public final int getSize() {
        return this.b;
    }

    public final void h(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.a;
        ys.W(i, i + i2, this.b, objArr, objArr);
        Object[] objArr2 = this.a;
        int i3 = this.b;
        j47.b0(i3 - i2, i3, objArr2);
        this.b -= i2;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final int i(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.a[i5]) == z) {
                Object[] objArr = this.a;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.a;
        ys.W(i + i4, i2 + i, this.b, objArr2, objArr2);
        Object[] objArr3 = this.a;
        int i7 = this.b;
        j47.b0(i7 - i6, i7, objArr3);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.b -= i6;
        return i6;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (tpa.f(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        for (int i = this.b - 1; i >= 0; i--) {
            if (tpa.f(this.a[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        e();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            a(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        e();
        return i(0, this.b, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        e();
        return i(0, this.b, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        e();
        int i2 = this.b;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        Object[] objArr = this.a;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        wmd.k(i, i2, this.b);
        return new jl7(this.a, i, i2 - i, null, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.b;
        if (length < i) {
            return Arrays.copyOfRange(this.a, 0, i, objArr.getClass());
        }
        ys.W(0, 0, i, this.a, objArr);
        int i2 = this.b;
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j47.c(this.a, 0, this.b, this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2 = this.b;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        return new il7(this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        e();
        int i2 = this.b;
        if (i >= 0 && i <= i2) {
            int size = collection.size();
            c(i, collection, size);
            return size > 0;
        }
        throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        e();
        int i2 = this.b;
        if (i >= 0 && i <= i2) {
            ((AbstractList) this).modCount++;
            f(i, 1);
            this.a[i] = obj;
            return;
        }
        throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        Object[] objArr = this.a;
        int i = this.b;
        dy7.m(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }
}
