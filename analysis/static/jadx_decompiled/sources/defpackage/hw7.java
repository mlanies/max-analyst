package defpackage;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hw7 {
    public LinkedList a;
    public WeakReference b;

    public final void a(gw7 gw7Var) {
        Iterator itDescendingIterator;
        Iterator itDescendingIterator2;
        Set set;
        LinkedList linkedList = this.a;
        if (linkedList == null || (itDescendingIterator = linkedList.descendingIterator()) == null) {
            return;
        }
        gw7 gw7Var2 = null;
        gw7 gw7Var3 = null;
        while (itDescendingIterator.hasNext()) {
            gw7 gw7Var4 = (gw7) ((WeakReference) itDescendingIterator.next()).get();
            if (gw7Var4 == null) {
                itDescendingIterator.remove();
            } else {
                if (gw7Var3 == null) {
                    gw7Var3 = gw7Var4;
                }
                if (gw7Var4 == gw7Var) {
                    if (gw7Var3 == gw7Var && (set = gw7Var.a) != null) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            ((ew7) it.next()).d();
                        }
                    }
                    itDescendingIterator.remove();
                }
            }
        }
        WeakReference weakReference = this.b;
        gw7 gw7Var5 = weakReference != null ? (gw7) weakReference.get() : null;
        if (gw7Var5 != null) {
            gw7Var2 = gw7Var5;
        } else {
            LinkedList linkedList2 = this.a;
            if (linkedList2 != null && (itDescendingIterator2 = linkedList2.descendingIterator()) != null) {
                while (itDescendingIterator2.hasNext() && (gw7Var2 = (gw7) ((WeakReference) itDescendingIterator2.next()).get()) == null) {
                    itDescendingIterator2.remove();
                }
            }
        }
        if (gw7Var2 != null) {
            gw7Var2.a();
        }
    }

    public final void b(gw7 gw7Var) {
        WeakReference weakReference;
        Set set;
        LinkedList linkedList = this.a;
        if (linkedList == null) {
            this.a = new LinkedList();
            weakReference = null;
        } else {
            Iterator itDescendingIterator = linkedList.descendingIterator();
            if (itDescendingIterator == null) {
                return;
            }
            weakReference = null;
            gw7 gw7Var2 = null;
            while (itDescendingIterator.hasNext()) {
                WeakReference weakReference2 = (WeakReference) itDescendingIterator.next();
                gw7 gw7Var3 = (gw7) weakReference2.get();
                if (gw7Var3 == null) {
                    itDescendingIterator.remove();
                } else {
                    if (gw7Var2 == null) {
                        if (gw7Var3 != gw7Var && (set = gw7Var3.a) != null) {
                            Iterator it = set.iterator();
                            while (it.hasNext()) {
                                ((ew7) it.next()).d();
                            }
                        }
                        gw7Var2 = gw7Var3;
                    }
                    if (gw7Var3 == gw7Var) {
                        itDescendingIterator.remove();
                        weakReference = weakReference2;
                    }
                }
            }
        }
        if (weakReference == null) {
            weakReference = new WeakReference(gw7Var);
        }
        LinkedList linkedList2 = this.a;
        if (linkedList2 != null) {
            linkedList2.add(weakReference);
        }
        WeakReference weakReference3 = this.b;
        gw7 gw7Var4 = weakReference3 != null ? (gw7) weakReference3.get() : null;
        if (gw7Var4 == null || gw7Var == gw7Var4) {
            gw7Var.a();
        } else {
            gw7Var4.a();
        }
    }
}
