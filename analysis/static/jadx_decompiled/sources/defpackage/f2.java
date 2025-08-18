package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class f2 extends i2 implements NavigableSet {
    public final /* synthetic */ y1 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(y1 y1Var, NavigableMap navigableMap) {
        super(y1Var, navigableMap);
        this.o = y1Var;
    }

    @Override // defpackage.i2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.a);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((d2) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new f2(this.o, a().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override // defpackage.i2, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        b2 b2Var = (b2) iterator();
        if (!b2Var.hasNext()) {
            return null;
        }
        Object next = b2Var.next();
        b2Var.remove();
        return next;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override // defpackage.i2, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // defpackage.i2, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new f2(this.o, a().headMap(obj, z));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new f2(this.o, a().subMap(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new f2(this.o, a().tailMap(obj, z));
    }
}
