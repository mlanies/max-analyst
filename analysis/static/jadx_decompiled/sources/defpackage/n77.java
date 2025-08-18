package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class n77 implements Iterator {
    public Iterator a;
    public Iterator b;
    public Iterator c;
    public ArrayDeque o;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        while (true) {
            Iterator it2 = this.b;
            it2.getClass();
            if (it2.hasNext()) {
                return true;
            }
            while (true) {
                Iterator it3 = this.c;
                if (it3 != null && it3.hasNext()) {
                    it = this.c;
                    break;
                }
                ArrayDeque arrayDeque = this.o;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    break;
                }
                this.c = (Iterator) this.o.removeFirst();
            }
            it = null;
            this.c = it;
            if (it == null) {
                return false;
            }
            Iterator it4 = (Iterator) it.next();
            this.b = it4;
            if (it4 instanceof n77) {
                n77 n77Var = (n77) it4;
                this.b = n77Var.b;
                if (this.o == null) {
                    this.o = new ArrayDeque();
                }
                this.o.addFirst(this.c);
                if (n77Var.o != null) {
                    while (!n77Var.o.isEmpty()) {
                        this.o.addFirst((Iterator) n77Var.o.removeLast());
                    }
                }
                this.c = n77Var.c;
            }
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Iterator it = this.b;
        this.a = it;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        Iterator it = this.a;
        if (it == null) {
            throw new IllegalStateException("no calls to next() since the last call to remove()");
        }
        it.remove();
        this.a = null;
    }
}
