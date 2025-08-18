package defpackage;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class hs extends r2 {
    public static final Object[] o = new Object[0];
    public int a;
    public Object[] b = o;
    public int c;

    @Override // defpackage.r2
    public final Object a(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        if (i == y53.L(this)) {
            return k();
        }
        if (i == 0) {
            return j();
        }
        i();
        int iH = h(this.a + i);
        Object[] objArr = this.b;
        Object obj = objArr[iH];
        if (i < (this.c >> 1)) {
            int i3 = this.a;
            if (iH >= i3) {
                ys.W(i3 + 1, i3, iH, objArr, objArr);
            } else {
                ys.W(1, 0, iH, objArr, objArr);
                Object[] objArr2 = this.b;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.a;
                ys.W(i4 + 1, i4, objArr2.length - 1, objArr2, objArr2);
            }
            Object[] objArr3 = this.b;
            int i5 = this.a;
            objArr3[i5] = null;
            this.a = e(i5);
        } else {
            int iH2 = h(y53.L(this) + this.a);
            if (iH <= iH2) {
                Object[] objArr4 = this.b;
                ys.W(iH, iH + 1, iH2 + 1, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                ys.W(iH, iH + 1, objArr5.length, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[objArr6.length - 1] = objArr6[0];
                ys.W(0, 1, iH2 + 1, objArr6, objArr6);
            }
            this.b[iH2] = null;
        }
        this.c--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        if (i == i2) {
            b(obj);
            return;
        }
        if (i == 0) {
            i();
            d(this.c + 1);
            int length = this.a;
            if (length == 0) {
                length = this.b.length;
            }
            int i3 = length - 1;
            this.a = i3;
            this.b[i3] = obj;
            this.c++;
            return;
        }
        i();
        d(this.c + 1);
        int iH = h(this.a + i);
        int i4 = this.c;
        if (i < ((i4 + 1) >> 1)) {
            int length2 = iH == 0 ? this.b.length - 1 : iH - 1;
            int i5 = this.a;
            int length3 = i5 == 0 ? this.b.length - 1 : i5 - 1;
            if (length2 >= i5) {
                Object[] objArr = this.b;
                objArr[length3] = objArr[i5];
                ys.W(i5, i5 + 1, length2 + 1, objArr, objArr);
            } else {
                Object[] objArr2 = this.b;
                ys.W(i5 - 1, i5, objArr2.length, objArr2, objArr2);
                Object[] objArr3 = this.b;
                objArr3[objArr3.length - 1] = objArr3[0];
                ys.W(0, 1, length2 + 1, objArr3, objArr3);
            }
            this.b[length2] = obj;
            this.a = length3;
        } else {
            int iH2 = h(i4 + this.a);
            if (iH < iH2) {
                Object[] objArr4 = this.b;
                ys.W(iH + 1, iH, iH2, objArr4, objArr4);
            } else {
                Object[] objArr5 = this.b;
                ys.W(1, 0, iH2, objArr5, objArr5);
                Object[] objArr6 = this.b;
                objArr6[0] = objArr6[objArr6.length - 1];
                ys.W(iH + 1, iH, objArr6.length - 1, objArr6, objArr6);
            }
            this.b[iH] = obj;
        }
        this.c++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, i2, ", size: "));
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i == this.c) {
            return addAll(collection);
        }
        i();
        d(collection.size() + this.c);
        int iH = h(this.c + this.a);
        int iH2 = h(this.a + i);
        int size = collection.size();
        if (i < ((this.c + 1) >> 1)) {
            int i3 = this.a;
            int length = i3 - size;
            if (iH2 < i3) {
                Object[] objArr = this.b;
                ys.W(length, i3, objArr.length, objArr, objArr);
                if (size >= iH2) {
                    Object[] objArr2 = this.b;
                    ys.W(objArr2.length - size, 0, iH2, objArr2, objArr2);
                } else {
                    Object[] objArr3 = this.b;
                    ys.W(objArr3.length - size, 0, size, objArr3, objArr3);
                    Object[] objArr4 = this.b;
                    ys.W(0, size, iH2, objArr4, objArr4);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.b;
                ys.W(length, i3, iH2, objArr5, objArr5);
            } else {
                Object[] objArr6 = this.b;
                length += objArr6.length;
                int i4 = iH2 - i3;
                int length2 = objArr6.length - length;
                if (length2 >= i4) {
                    ys.W(length, i3, iH2, objArr6, objArr6);
                } else {
                    ys.W(length, i3, i3 + length2, objArr6, objArr6);
                    Object[] objArr7 = this.b;
                    ys.W(0, this.a + length2, iH2, objArr7, objArr7);
                }
            }
            this.a = length;
            c(f(iH2 - size), collection);
        } else {
            int i5 = iH2 + size;
            if (iH2 < iH) {
                int i6 = size + iH;
                Object[] objArr8 = this.b;
                if (i6 <= objArr8.length) {
                    ys.W(i5, iH2, iH, objArr8, objArr8);
                } else if (i5 >= objArr8.length) {
                    ys.W(i5 - objArr8.length, iH2, iH, objArr8, objArr8);
                } else {
                    int length3 = iH - (i6 - objArr8.length);
                    ys.W(0, length3, iH, objArr8, objArr8);
                    Object[] objArr9 = this.b;
                    ys.W(i5, iH2, length3, objArr9, objArr9);
                }
            } else {
                Object[] objArr10 = this.b;
                ys.W(size, 0, iH, objArr10, objArr10);
                Object[] objArr11 = this.b;
                if (i5 >= objArr11.length) {
                    ys.W(i5 - objArr11.length, iH2, objArr11.length, objArr11, objArr11);
                } else {
                    ys.W(0, objArr11.length - size, objArr11.length, objArr11, objArr11);
                    Object[] objArr12 = this.b;
                    ys.W(i5, iH2, objArr12.length - size, objArr12, objArr12);
                }
            }
            c(iH2, collection);
        }
        return true;
    }

    public final void b(Object obj) {
        i();
        d(getSize() + 1);
        this.b[h(getSize() + this.a)] = obj;
        this.c = getSize() + 1;
    }

    public final void c(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.b.length;
        while (i < length && it.hasNext()) {
            this.b[i] = it.next();
            i++;
        }
        int i2 = this.a;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.b[i3] = it.next();
        }
        this.c = collection.size() + getSize();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            i();
            g(this.a, h(getSize() + this.a));
        }
        this.a = 0;
        this.c = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.b;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == o) {
            if (i < 10) {
                i = 10;
            }
            this.b = new Object[i];
            return;
        }
        int length = objArr.length;
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        ys.W(0, this.a, objArr.length, objArr, objArr2);
        Object[] objArr3 = this.b;
        int length2 = objArr3.length;
        int i3 = this.a;
        ys.W(length2 - i3, 0, i3, objArr3, objArr2);
        this.a = 0;
        this.b = objArr2;
    }

    public final int e(int i) {
        if (i == this.b.length - 1) {
            return 0;
        }
        return i + 1;
    }

    public final int f(int i) {
        return i < 0 ? i + this.b.length : i;
    }

    public final void g(int i, int i2) {
        if (i < i2) {
            Arrays.fill(this.b, i, i2, (Object) null);
            return;
        }
        Object[] objArr = this.b;
        Arrays.fill(objArr, i, objArr.length, (Object) null);
        Arrays.fill(this.b, 0, i2, (Object) null);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int size = getSize();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, size, ", size: "));
        }
        return this.b[h(this.a + i)];
    }

    @Override // defpackage.r2
    public final int getSize() {
        return this.c;
    }

    public final int h(int i) {
        Object[] objArr = this.b;
        return i >= objArr.length ? i - objArr.length : i;
    }

    public final void i() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iH = h(getSize() + this.a);
        int length = this.a;
        if (length < iH) {
            while (length < iH) {
                if (tpa.f(obj, this.b[length])) {
                    i = this.a;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iH) {
            return -1;
        }
        int length2 = this.b.length;
        while (true) {
            if (length >= length2) {
                for (int i2 = 0; i2 < iH; i2++) {
                    if (tpa.f(obj, this.b[i2])) {
                        length = i2 + this.b.length;
                        i = this.a;
                    }
                }
                return -1;
            }
            if (tpa.f(obj, this.b[length])) {
                i = this.a;
                break;
            }
            length++;
        }
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final Object j() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        Object[] objArr = this.b;
        int i = this.a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.a = e(i);
        this.c = getSize() - 1;
        return obj;
    }

    public final Object k() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        i();
        int iH = h(y53.L(this) + this.a);
        Object[] objArr = this.b;
        Object obj = objArr[iH];
        objArr[iH] = null;
        this.c = getSize() - 1;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iH = h(getSize() + this.a);
        int i2 = this.a;
        if (i2 < iH) {
            length = iH - 1;
            if (i2 <= length) {
                while (!tpa.f(obj, this.b[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.a;
                return length - i;
            }
            return -1;
        }
        if (i2 > iH) {
            int i3 = iH - 1;
            while (true) {
                if (-1 >= i3) {
                    length = this.b.length - 1;
                    int i4 = this.a;
                    if (i4 <= length) {
                        while (!tpa.f(obj, this.b[length])) {
                            if (length != i4) {
                                length--;
                            }
                        }
                        i = this.a;
                    }
                } else {
                    if (tpa.f(obj, this.b[i3])) {
                        length = i3 + this.b.length;
                        i = this.a;
                        break;
                    }
                    i3--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        a(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iH;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iH2 = h(getSize() + this.a);
            int i = this.a;
            if (i < iH2) {
                iH = i;
                while (i < iH2) {
                    Object obj = this.b[i];
                    if (!collection.contains(obj)) {
                        this.b[iH] = obj;
                        iH++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.b, iH, iH2, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (!collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iH = h(i2);
                for (int i3 = 0; i3 < iH2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (!collection.contains(obj3)) {
                        this.b[iH] = obj3;
                        iH = e(iH);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.c = f(iH - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        wmd.k(i, i2, this.c);
        int i3 = i2 - i;
        if (i3 == 0) {
            return;
        }
        if (i3 == this.c) {
            clear();
            return;
        }
        if (i3 == 1) {
            a(i);
            return;
        }
        i();
        if (i < this.c - i2) {
            int iH = h((i - 1) + this.a);
            int iH2 = h((i2 - 1) + this.a);
            while (i > 0) {
                int i4 = iH + 1;
                int iMin = Math.min(i, Math.min(i4, iH2 + 1));
                Object[] objArr = this.b;
                int i5 = iH2 - iMin;
                int i6 = iH - iMin;
                ys.W(i5 + 1, i6 + 1, i4, objArr, objArr);
                iH = f(i6);
                iH2 = f(i5);
                i -= iMin;
            }
            int iH3 = h(this.a + i3);
            g(this.a, iH3);
            this.a = iH3;
        } else {
            int iH4 = h(this.a + i2);
            int iH5 = h(this.a + i);
            int i7 = this.c;
            while (true) {
                i7 -= i2;
                if (i7 <= 0) {
                    break;
                }
                Object[] objArr2 = this.b;
                i2 = Math.min(i7, Math.min(objArr2.length - iH4, objArr2.length - iH5));
                Object[] objArr3 = this.b;
                int i8 = iH4 + i2;
                ys.W(iH5, iH4, i8, objArr3, objArr3);
                iH4 = h(i8);
                iH5 = h(iH5 + i2);
            }
            int iH6 = h(this.c + this.a);
            g(f(iH6 - i3), iH6);
        }
        this.c -= i3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iH;
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.b.length != 0) {
            int iH2 = h(getSize() + this.a);
            int i = this.a;
            if (i < iH2) {
                iH = i;
                while (i < iH2) {
                    Object obj = this.b[i];
                    if (collection.contains(obj)) {
                        this.b[iH] = obj;
                        iH++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                Arrays.fill(this.b, iH, iH2, (Object) null);
            } else {
                int length = this.b.length;
                boolean z2 = false;
                int i2 = i;
                while (i < length) {
                    Object[] objArr = this.b;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.b[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iH = h(i2);
                for (int i3 = 0; i3 < iH2; i3++) {
                    Object[] objArr2 = this.b;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.b[iH] = obj3;
                        iH = e(iH);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                i();
                this.c = f(iH - this.a);
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int size = getSize();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, size, ", size: "));
        }
        int iH = h(this.a + i);
        Object[] objArr = this.b;
        Object obj2 = objArr[iH];
        objArr[iH] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.c;
        if (length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        int iH = h(this.c + this.a);
        int i2 = this.a;
        if (i2 < iH) {
            ys.X(i2, iH, 2, this.b, objArr);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.b;
            ys.W(0, this.a, objArr2.length, objArr2, objArr);
            Object[] objArr3 = this.b;
            ys.W(objArr3.length - this.a, 0, iH, objArr3, objArr);
        }
        int i3 = this.c;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        i();
        d(collection.size() + getSize());
        c(h(getSize() + this.a), collection);
        return true;
    }
}
