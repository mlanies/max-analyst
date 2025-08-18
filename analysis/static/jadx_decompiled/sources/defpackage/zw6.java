package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class zw6 extends qw6 implements List, RandomAccess {
    public static final ls5 b = new ls5(ffc.X, 0);

    public static ffc h(int i, Object[] objArr) {
        return i == 0 ? ffc.X : new ffc(i, objArr);
    }

    public static ww6 i() {
        return new ww6(4);
    }

    public static zw6 j(Collection collection) {
        if (!(collection instanceof qw6)) {
            Object[] array = collection.toArray();
            c54.n(array.length, array);
            return h(array.length, array);
        }
        zw6 zw6VarA = ((qw6) collection).a();
        if (!zw6VarA.f()) {
            return zw6VarA;
        }
        Object[] array2 = zw6VarA.toArray(qw6.a);
        return h(array2.length, array2);
    }

    public static ffc k(Object[] objArr) {
        if (objArr.length == 0) {
            return ffc.X;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        c54.n(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static ffc m() {
        return ffc.X;
    }

    public static ffc n(Object obj) {
        Object[] objArr = {obj};
        c54.n(1, objArr);
        return h(1, objArr);
    }

    public static ffc o(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        c54.n(2, objArr);
        return h(2, objArr);
    }

    public static ffc p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        c54.n(5, objArr);
        return h(5, objArr);
    }

    public static ffc r(Comparator comparator, AbstractCollection abstractCollection) {
        comparator.getClass();
        if (!(abstractCollection instanceof Collection)) {
            Iterator it = abstractCollection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            abstractCollection = arrayList;
        }
        Object[] array = abstractCollection.toArray();
        c54.n(array.length, array);
        Arrays.sort(array, comparator);
        return h(array.length, array);
    }

    @Override // defpackage.qw6
    public final zw6 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qw6
    public int b(int i, Object[] objArr) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (f46.B(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && f46.B(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // defpackage.qw6
    /* renamed from: g */
    public final m5f iterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.qw6, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final ls5 listIterator(int i) {
        z04.m(i, size());
        return isEmpty() ? b : new ls5(this, i);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public zw6 q() {
        return size() <= 1 ? this : new xw6(this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public zw6 subList(int i, int i2) {
        z04.n(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? ffc.X : new yw6(this, i, i3);
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
