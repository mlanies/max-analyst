package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class zbd extends ybd implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.a.iterator();
        it.getClass();
        a7b a7bVar = this.b;
        a7bVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (a7bVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new zbd(((SortedSet) this.a).headSet(obj), this.b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSetHeadSet = (SortedSet) this.a;
        while (true) {
            Object objLast = sortedSetHeadSet.last();
            if (this.b.apply(objLast)) {
                return objLast;
            }
            sortedSetHeadSet = sortedSetHeadSet.headSet(objLast);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new zbd(((SortedSet) this.a).subSet(obj, obj2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new zbd(((SortedSet) this.a).tailSet(obj), this.b);
    }
}
