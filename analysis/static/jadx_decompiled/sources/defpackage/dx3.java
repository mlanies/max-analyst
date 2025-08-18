package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class dx3 implements List, RandomAccess, Cloneable, Serializable {
    public final transient ReentrantLock a = new ReentrantLock();
    public volatile transient Object[] b = new Object[0];

    public static void a(dx3 dx3Var, int i, int i2) {
        ReentrantLock reentrantLock = dx3Var.a;
        reentrantLock.lock();
        try {
            Object[] objArr = dx3Var.b;
            int length = objArr.length;
            if (i < 0 || i2 > length || i2 < i) {
                throw new IndexOutOfBoundsException();
            }
            int i3 = length - (i2 - i);
            int i4 = length - i2;
            if (i4 == 0) {
                dx3Var.b = Arrays.copyOf(objArr, i3);
            } else {
                Object[] objArr2 = new Object[i3];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i2, objArr2, i, i4);
                dx3Var.b = objArr2;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static int b(Object obj, Object[] objArr, int i) {
        int i2 = 0;
        if (obj == null) {
            while (i2 < i) {
                if (objArr[i2] == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i2 < i) {
            if (obj.equals(objArr[i2])) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
            objArrCopyOf[length] = obj;
            this.b = objArrCopyOf;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        Object[] array = collection.toArray();
        if (array.length == 0) {
            return false;
        }
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, array.length + length);
            System.arraycopy(array, 0, objArrCopyOf, length, array.length);
            this.b = objArrCopyOf;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void c(Comparator comparator) {
        synchronized (this.a) {
            int length = this.b.length;
            Object[] objArr = (Object[]) this.b.clone();
            Arrays.sort(objArr, 0, length, comparator);
            this.b = objArr;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b = new Object[0];
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Object clone() {
        try {
            dx3 dx3Var = (dx3) super.clone();
            dx3Var.getClass();
            return dx3Var;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        Object[] objArr = this.b;
        return b(obj, objArr, objArr.length) >= 0;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Object[] objArr = this.b;
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (b(it.next(), objArr, length) < 0) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Iterator it = ((List) obj).iterator();
        Object[] objArr = this.b;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (it.hasNext()) {
                Object obj2 = objArr[i];
                Object next = it.next();
                if (obj2 == null ? next == null : obj2.equals(next)) {
                }
            }
            return false;
        }
        return !it.hasNext();
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.b[i];
    }

    @Override // java.util.List, java.util.Collection
    public final int hashCode() {
        Object[] objArr = this.b;
        int length = objArr.length;
        int iHashCode = 1;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            iHashCode = (iHashCode * 31) + (obj == null ? 0 : obj.hashCode());
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        Object[] objArr = this.b;
        return b(obj, objArr, objArr.length);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.b.length == 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ax3(0, this.b);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        int length = objArr.length - 1;
        if (obj == null) {
            while (length >= 0) {
                if (objArr[length] == null) {
                    return length;
                }
                length--;
            }
        } else {
            while (length >= 0) {
                if (obj.equals(objArr[length])) {
                    return length;
                }
                length--;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.b;
        int length = objArr.length;
        if (i < 0 || i > length) {
            throw new IndexOutOfBoundsException(zr6.h(i, "Index: "));
        }
        return new ax3(i, objArr);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            Object obj = objArr[i];
            int i2 = (length - i) - 1;
            if (i2 == 0) {
                this.b = Arrays.copyOf(objArr, length - 1);
            } else {
                Object[] objArr2 = new Object[length - 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i + 1, objArr2, i, i2);
                this.b = objArr2;
            }
            reentrantLock.unlock();
            return obj;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                int i = 0;
                for (Object obj : objArr) {
                    if (!collection.contains(obj)) {
                        objArr2[i] = obj;
                        i++;
                    }
                }
                if (i != length) {
                    this.b = Arrays.copyOf(objArr2, i);
                    reentrantLock.unlock();
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (length != 0) {
                Object[] objArr2 = new Object[length];
                int i = 0;
                for (Object obj : objArr) {
                    if (collection.contains(obj)) {
                        objArr2[i] = obj;
                        i++;
                    }
                }
                if (i != length) {
                    this.b = Arrays.copyOf(objArr2, i);
                    reentrantLock.unlock();
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            Object obj2 = objArr[i];
            if (obj2 != obj) {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                objArrCopyOf[i] = obj;
                this.b = objArrCopyOf;
            } else {
                this.b = objArr;
            }
            reentrantLock.unlock();
            return obj2;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.b.length;
    }

    @Override // java.util.List
    public final void sort(Comparator comparator) {
        c(comparator);
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            int length = this.b.length;
            if (i < 0 || i2 > length || i > i2) {
                throw new IndexOutOfBoundsException();
            }
            return new bx3(this, i, i2);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.b;
        return Arrays.copyOf(objArr, objArr.length);
    }

    public final String toString() {
        return Arrays.toString(this.b);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2 = this.b;
        int length = objArr2.length;
        if (objArr.length < length) {
            return Arrays.copyOf(objArr2, length, objArr.getClass());
        }
        System.arraycopy(objArr2, 0, objArr, 0, length);
        if (objArr.length > length) {
            objArr[length] = null;
        }
        return objArr;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        Object[] objArrCopyOf;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (i > length || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + length);
            }
            int i2 = length - i;
            if (i2 == 0) {
                objArrCopyOf = Arrays.copyOf(objArr, length + 1);
            } else {
                Object[] objArr2 = new Object[length + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i, objArr2, i + 1, i2);
                objArrCopyOf = objArr2;
            }
            objArrCopyOf[i] = obj;
            this.b = objArrCopyOf;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new ax3(0, this.b);
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        Object[] objArrCopyOf;
        Object[] array = collection.toArray();
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (i > length || i < 0) {
                throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + length);
            }
            if (array.length == 0) {
                reentrantLock.unlock();
                return false;
            }
            int i2 = length - i;
            if (i2 == 0) {
                objArrCopyOf = Arrays.copyOf(objArr, length + array.length);
            } else {
                Object[] objArr2 = new Object[length + array.length];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i, objArr2, array.length + i, i2);
                objArrCopyOf = objArr2;
            }
            System.arraycopy(array, 0, objArrCopyOf, i, array.length);
            this.b = objArrCopyOf;
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            Object[] objArr = this.b;
            int length = objArr.length;
            if (length != 0) {
                int i = length - 1;
                Object[] objArr2 = new Object[i];
                for (int i2 = 0; i2 < i; i2++) {
                    Object obj2 = objArr[i2];
                    if (obj == null) {
                        zEquals2 = obj2 == null;
                    } else {
                        zEquals2 = obj.equals(obj2);
                    }
                    if (zEquals2) {
                        for (int i3 = i2 + 1; i3 < length; i3++) {
                            objArr2[i3 - 1] = objArr[i3];
                        }
                        this.b = objArr2;
                        reentrantLock.unlock();
                        return true;
                    }
                    objArr2[i2] = objArr[i2];
                }
                Object obj3 = objArr[i];
                if (obj == null) {
                    zEquals = obj3 == null;
                } else {
                    zEquals = obj.equals(obj3);
                }
                if (zEquals) {
                    this.b = objArr2;
                    reentrantLock.unlock();
                    return true;
                }
            }
            reentrantLock.unlock();
            return false;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
