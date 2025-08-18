package defpackage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class xs implements Collection, Set, rb7 {
    public int[] a;
    public Object[] b;
    public int c;

    public xs(int i) {
        this.a = j47.b;
        this.b = j47.o;
        if (i > 0) {
            this.a = new int[i];
            this.b = new Object[i];
        }
    }

    public final void a(xs xsVar) {
        int i = xsVar.c;
        b(this.c + i);
        if (this.c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(xsVar.b[i2]);
            }
        } else if (i > 0) {
            System.arraycopy(xsVar.a, 0, this.a, 0, i);
            ys.X(0, i, 6, xsVar.b, this.b);
            if (this.c != 0) {
                throw new ConcurrentModificationException();
            }
            this.c = i;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i;
        int iW;
        int i2 = this.c;
        if (obj == null) {
            iW = ay7.w(this, null, 0);
            i = 0;
        } else {
            int iHashCode = obj.hashCode();
            i = iHashCode;
            iW = ay7.w(this, obj, iHashCode);
        }
        if (iW >= 0) {
            return false;
        }
        int i3 = ~iW;
        int[] iArr = this.a;
        if (i2 >= iArr.length) {
            int i4 = 8;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i4 = 4;
            }
            Object[] objArr = this.b;
            int[] iArr2 = new int[i4];
            this.a = iArr2;
            this.b = new Object[i4];
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
            if (!(iArr2.length == 0)) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                ys.X(0, objArr.length, 6, objArr, this.b);
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.a;
            int i5 = i3 + 1;
            ys.V(i5, i3, i2, iArr3, iArr3);
            Object[] objArr2 = this.b;
            ys.W(i5, i3, i2, objArr2, objArr2);
        }
        int i6 = this.c;
        if (i2 == i6) {
            int[] iArr4 = this.a;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.b[i3] = obj;
                this.c = i6 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        b(collection.size() + this.c);
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final void b(int i) {
        int i2 = this.c;
        int[] iArr = this.a;
        if (iArr.length < i) {
            Object[] objArr = this.b;
            int[] iArr2 = new int[i];
            this.a = iArr2;
            this.b = new Object[i];
            if (i2 > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                ys.X(0, this.c, 6, objArr, this.b);
            }
        }
        if (this.c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public final void c(xs xsVar) {
        int i = xsVar.c;
        for (int i2 = 0; i2 < i; i2++) {
            remove(xsVar.b[i2]);
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.c != 0) {
            this.a = j47.b;
            this.b = j47.o;
            this.c = 0;
        }
        if (this.c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? ay7.w(this, null, 0) : ay7.w(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Object d(int i) {
        int i2 = this.c;
        Object[] objArr = this.b;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
        } else {
            int i3 = i2 - 1;
            int[] iArr = this.a;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                if (i < i3) {
                    int i4 = i + 1;
                    ys.V(i, i4, i2, iArr, iArr);
                    Object[] objArr2 = this.b;
                    ys.W(i, i4, i2, objArr2, objArr2);
                }
                this.b[i3] = null;
            } else {
                int i5 = i2 > 8 ? i2 + (i2 >> 1) : 8;
                int[] iArr2 = new int[i5];
                this.a = iArr2;
                this.b = new Object[i5];
                if (i > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, i);
                    ys.X(0, i, 6, objArr, this.b);
                }
                if (i < i3) {
                    int i6 = i + 1;
                    ys.V(i, i6, i2, iArr, this.a);
                    ys.W(i, i6, i2, objArr, this.b);
                }
            }
            if (i2 != this.c) {
                throw new ConcurrentModificationException();
            }
            this.c = i3;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.c == ((Set) obj).size()) {
            try {
                int i = this.c;
                for (int i2 = 0; i2 < i; i2++) {
                    if (((Set) obj).contains(this.b[i2])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new qs(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iW = obj == null ? ay7.w(this, null, 0) : ay7.w(this, obj, obj.hashCode());
        if (iW < 0) {
            return false;
        }
        d(iW);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        boolean z = false;
        for (int i = this.c - 1; -1 < i; i--) {
            if (!x53.c0(collection, this.b[i])) {
                d(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.b;
        int i = this.c;
        dy7.m(i, objArr.length);
        return Arrays.copyOfRange(objArr, 0, i);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.c * 14);
        sb.append('{');
        int i = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.b[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        int i = this.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        } else if (objArr.length > i) {
            objArr[i] = null;
        }
        ys.W(0, 0, this.c, this.b, objArr);
        return objArr;
    }

    public /* synthetic */ xs(Object obj) {
        this(0);
    }

    public xs(xs xsVar) {
        this(0);
        if (xsVar != null) {
            a(xsVar);
        }
    }

    public xs(Collection collection) {
        this(0);
        if (collection != null) {
            addAll(collection);
        }
    }
}
