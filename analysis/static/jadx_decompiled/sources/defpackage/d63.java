package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class d63 extends c63 {
    public static void V(Iterable iterable, AbstractCollection abstractCollection) {
        if (iterable instanceof Collection) {
            abstractCollection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static void W(AbstractList abstractList, c6d c6dVar) {
        Iterator it = c6dVar.iterator();
        while (it.hasNext()) {
            abstractList.add(it.next());
        }
    }

    public static void X(AbstractList abstractList, Object[] objArr) {
        abstractList.addAll(Arrays.asList(objArr));
    }

    public static void Y(ArrayList arrayList, m56 m56Var) {
        int iL;
        int iL2 = y53.L(arrayList);
        int i = 0;
        if (iL2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = arrayList.get(i);
                if (!((Boolean) m56Var.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        arrayList.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iL2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= arrayList.size() || i > (iL = y53.L(arrayList))) {
            return;
        }
        while (true) {
            arrayList.remove(iL);
            if (iL == i) {
                return;
            } else {
                iL--;
            }
        }
    }

    public static void Z(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        arrayList.remove(y53.L(arrayList));
    }
}
