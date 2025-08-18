package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class pk5 implements Iterator, qb7 {
    public final /* synthetic */ c6d X;
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object o;

    public pk5(qk5 qk5Var) {
        this.a = 0;
        this.X = qk5Var;
        this.b = qk5Var.a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        qk5 qk5Var;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            } else {
                next = it.next();
                qk5Var = (qk5) this.X;
            }
        } while (((Boolean) qk5Var.c.invoke(next)).booleanValue() != qk5Var.b);
        this.o = next;
        this.c = 1;
    }

    public boolean b() {
        Iterator it;
        Iterator it2 = (Iterator) this.o;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.o = null;
                return false;
            }
            Object next = it3.next();
            um5 um5Var = (um5) this.X;
            it = (Iterator) um5Var.c.invoke(um5Var.b.invoke(next));
        } while (!it.hasNext());
        this.o = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            default:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return b();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.o;
                this.o = null;
                this.c = -1;
                return obj;
            default:
                int i = this.c;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !b()) {
                    throw new NoSuchElementException();
                }
                this.c = 0;
                return ((Iterator) this.o).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public pk5(um5 um5Var) {
        this.a = 1;
        this.X = um5Var;
        this.b = um5Var.a.iterator();
    }
}
