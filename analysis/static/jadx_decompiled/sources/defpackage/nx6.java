package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class nx6 extends cx6 implements NavigableMap {
    public static final sm9 s0;
    public static final nx6 t0;
    public final transient mfc X;
    public final transient zw6 Y;
    public final transient nx6 Z;

    static {
        sm9 sm9Var = sm9.a;
        s0 = sm9Var;
        mfc mfcVarN = ox6.n(sm9Var);
        ls5 ls5Var = zw6.b;
        t0 = new nx6(mfcVarN, ffc.X, null);
    }

    public nx6(mfc mfcVar, zw6 zw6Var, nx6 nx6Var) {
        this.X = mfcVar;
        this.Y = zw6Var;
        this.Z = nx6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static nx6 k(TreeMap treeMap) {
        Comparator comparator = treeMap.comparator();
        int i = 1;
        sm9 sm9Var = s0;
        boolean zEquals = comparator == null ? true : sm9Var.equals(comparator);
        Set setEntrySet = treeMap.entrySet();
        Map.Entry[] entryArr = cx6.o;
        if (!(setEntrySet instanceof Collection)) {
            Iterator it = setEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            setEntrySet = arrayList;
        }
        Map.Entry[] entryArr2 = (Map.Entry[]) setEntrySet.toArray(entryArr);
        int length = entryArr2.length;
        if (length == 0) {
            return l(sm9Var);
        }
        if (length == 1) {
            Map.Entry entry = entryArr2[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            ffc ffcVarN = zw6.n(key);
            sm9Var.getClass();
            return new nx6(new mfc(ffcVarN, sm9Var), zw6.n(value), null);
        }
        Object[] objArr = new Object[length];
        Object[] objArr2 = new Object[length];
        if (zEquals) {
            for (int i2 = 0; i2 < length; i2++) {
                Map.Entry entry2 = entryArr2[i2];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                wmd.g(key2, value2);
                objArr[i2] = key2;
                objArr2[i2] = value2;
            }
        } else {
            Arrays.sort(entryArr2, 0, length, new ba3(sm9Var, 1));
            Map.Entry entry3 = entryArr2[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr[0] = key3;
            Object value3 = entry3.getValue();
            objArr2[0] = value3;
            wmd.g(objArr[0], value3);
            while (i < length) {
                Map.Entry entry4 = entryArr2[i - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr2[i];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                wmd.g(key4, value4);
                objArr[i] = key4;
                objArr2[i] = value4;
                if (sm9Var.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + entry4 + " and " + entry5);
                }
                i++;
                key3 = key4;
            }
        }
        return new nx6(new mfc(zw6.h(length, objArr), sm9Var), zw6.h(length, objArr2), null);
    }

    public static nx6 l(Comparator comparator) {
        return sm9.a.equals(comparator) ? t0 : new nx6(ox6.n(comparator), ffc.X, null);
    }

    public static nx6 o() {
        return t0;
    }

    @Override // defpackage.cx6
    public final jx6 c() {
        if (!isEmpty()) {
            return new mx6(this);
        }
        int i = jx6.c;
        return lfc.u0;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return this.X.o;
    }

    @Override // defpackage.cx6
    public final jx6 d() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return this.X.descendingSet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        nx6 nx6Var = this.Z;
        if (nx6Var != null) {
            return nx6Var;
        }
        boolean zIsEmpty = isEmpty();
        mfc mfcVar = this.X;
        return zIsEmpty ? l(zma.a(mfcVar.o).b()) : new nx6((mfc) mfcVar.descendingSet(), this.Y.q(), this);
    }

    @Override // defpackage.cx6
    public final qw6 e() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.cx6, java.util.Map
    public final Set entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().a().get(0);
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return this.X.first();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override // defpackage.cx6
    public final boolean g() {
        return this.X.Y.f() || this.Y.f();
    }

    @Override // defpackage.cx6, java.util.Map
    public final Object get(Object obj) {
        int iIndexOf = this.X.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.Y.get(iIndexOf);
    }

    @Override // defpackage.cx6
    /* renamed from: h */
    public final jx6 keySet() {
        return this.X;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override // defpackage.cx6
    /* renamed from: i */
    public final qw6 values() {
        return this.Y;
    }

    @Override // defpackage.cx6, java.util.Map
    public final Set keySet() {
        return this.X;
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) super.entrySet().a().get(this.Y.size() - 1);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return this.X.last();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    public final nx6 m(int i, int i2) {
        zw6 zw6Var = this.Y;
        if (i == 0 && i2 == zw6Var.size()) {
            return this;
        }
        mfc mfcVar = this.X;
        return i == i2 ? l(mfcVar.o) : new nx6(mfcVar.p(i, i2), zw6Var.subList(i, i2), null);
    }

    @Override // java.util.NavigableMap
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final nx6 headMap(Object obj, boolean z) {
        obj.getClass();
        return m(0, this.X.q(obj, z));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return this.X;
    }

    @Override // java.util.NavigableMap
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final nx6 subMap(Object obj, boolean z, Object obj2, boolean z2) {
        obj.getClass();
        obj2.getClass();
        if (this.X.o.compare(obj, obj2) <= 0) {
            return headMap(obj2, z2).tailMap(obj, z);
        }
        throw new IllegalArgumentException(i24.t("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final nx6 tailMap(Object obj, boolean z) {
        obj.getClass();
        return m(this.X.r(obj, z), this.Y.size());
    }

    @Override // java.util.Map
    public final int size() {
        return this.Y.size();
    }

    @Override // defpackage.cx6, java.util.Map
    public final Collection values() {
        return this.Y;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
