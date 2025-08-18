package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class bcd extends z7 {
    public static LinkedHashSet X(Object... objArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(objArr.length));
        ys.k0(objArr, linkedHashSet);
        return linkedHashSet;
    }

    public static Set Y(Iterable iterable, Set set) {
        Collection<?> collectionD0 = iterable instanceof Collection ? (Collection) iterable : x53.D0(iterable);
        if (collectionD0.isEmpty()) {
            return x53.H0(set);
        }
        if (!(collectionD0 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionD0);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!collectionD0.contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet Z(Set set, Collection collection) {
        Integer numValueOf = collection instanceof Collection ? Integer.valueOf(collection.size()) : null;
        LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(numValueOf != null ? set.size() + numValueOf.intValue() : set.size() * 2));
        linkedHashSet.addAll(set);
        d63.V(collection, linkedHashSet);
        return linkedHashSet;
    }

    public static Set a0(Object... objArr) {
        int length = objArr.length;
        if (length == 0) {
            return wz4.a;
        }
        if (length == 1) {
            return Collections.singleton(objArr[0]);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(mz7.Z(objArr.length));
        ys.k0(objArr, linkedHashSet);
        return linkedHashSet;
    }
}
