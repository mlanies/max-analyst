package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class x53 extends d63 {
    public static final void A0(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static HashSet B0(Iterable iterable) {
        HashSet hashSet = new HashSet(mz7.Z(z53.S(iterable, 12)));
        A0(iterable, hashSet);
        return hashSet;
    }

    public static int[] C0(List list) {
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List D0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return y53.O(F0(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return nz4.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static long[] E0(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static final List F0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        A0(iterable, arrayList);
        return arrayList;
    }

    public static Set G0(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        A0(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set H0(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        wz4 wz4Var = wz4.a;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            A0(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            return size != 0 ? size != 1 ? linkedHashSet : Collections.singleton(linkedHashSet.iterator().next()) : wz4Var;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return wz4Var;
        }
        if (size2 == 1) {
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(mz7.Z(collection.size()));
        A0(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static ArrayList I0(Iterable iterable, int i, int i2) {
        np8.h(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itQ = np8.Q(iterable.iterator(), i, i2, false);
            while (itQ.hasNext()) {
                arrayList.add((List) itQ.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static ArrayList J0(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(z53.S(iterable, 10), z53.S(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new kpa(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final int a0(int i, List list) {
        if (i >= 0 && i <= y53.L(list)) {
            return y53.L(list) - i;
        }
        StringBuilder sbN = rh4.n(i, "Element index ", " must be in range [");
        sbN.append(new j37(0, y53.L(list), 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public static final int b0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbN = rh4.n(i, "Position index ", " must be in range [");
        sbN.append(new j37(0, list.size(), 1));
        sbN.append("].");
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public static boolean c0(Iterable iterable, Object obj) {
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : k0(iterable, obj) >= 0;
    }

    public static List d0(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " is less than zero.").toString());
        }
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return y0(list, size);
    }

    public static List e0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object f0(Iterable iterable) {
        if (iterable instanceof List) {
            return g0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object g0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object h0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object i0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object j0(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static int k0(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                y53.R();
                throw null;
            }
            if (tpa.f(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static final void l0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, m56 m56Var) {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                c54.b(appendable, obj, m56Var);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static /* synthetic */ void m0(Collection collection, Appendable appendable, int i, m56 m56Var, int i2) {
        if ((i2 & 16) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 64) != 0) {
            m56Var = null;
        }
        l0(collection, appendable, "\n", "", "", i3, "...", m56Var);
    }

    public static String n0(Iterable iterable, String str, String str2, String str3, m56 m56Var, int i) {
        if ((i & 1) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 2) != 0 ? "" : str2;
        String str6 = (i & 4) != 0 ? "" : str3;
        if ((i & 32) != 0) {
            m56Var = null;
        }
        StringBuilder sb = new StringBuilder();
        l0(iterable, sb, str4, str5, str6, -1, "...", m56Var);
        return sb.toString();
    }

    public static Object o0(Iterable iterable) {
        if (iterable instanceof List) {
            return p0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object p0(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(y53.L(list));
    }

    public static Object q0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable r0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static List s0(Iterable iterable, Set set) {
        if (set.isEmpty()) {
            return D0(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!set.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList t0(Collection collection, Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            d63.V(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList u0(Collection collection, Object obj) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static List v0(Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return D0(iterable);
        }
        List listF0 = F0(iterable);
        Collections.reverse(listF0);
        return listF0;
    }

    public static List w0(List list) {
        if (!(list instanceof Collection)) {
            List listF0 = F0(list);
            if (((ArrayList) listF0).size() > 1) {
                Collections.sort(listF0);
            }
            return listF0;
        }
        if (list.size() <= 1) {
            return D0(list);
        }
        Object[] array = list.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return Arrays.asList(array);
    }

    public static List x0(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listF0 = F0(iterable);
            c63.U(listF0, comparator);
            return listF0;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return D0(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return Arrays.asList(array);
    }

    public static List y0(Iterable iterable, int i) {
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return nz4.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return D0(iterable);
            }
            if (i == 1) {
                return Collections.singletonList(f0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return y53.O(arrayList);
    }

    public static List z0(int i, List list) {
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Requested element count ", " is less than zero.").toString());
        }
        if (i == 0) {
            return nz4.a;
        }
        int size = list.size();
        if (i >= size) {
            return D0(list);
        }
        if (i == 1) {
            return Collections.singletonList(p0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }
}
