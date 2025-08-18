package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ms4 implements Iterator, qb7 {
    public final /* synthetic */ int a = 1;
    public final Iterator b;
    public int c;

    public ms4(Iterator it) {
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            case 1:
                return this.b.hasNext();
            default:
                return this.c > 0 && this.b.hasNext();
        }
        while (true) {
            int i = this.c;
            it = this.b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            case 1:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new yz6(i, this.b.next());
                }
                y53.R();
                throw null;
            default:
                int i2 = this.c;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                this.c = i2 - 1;
                return this.b.next();
        }
        while (true) {
            int i3 = this.c;
            it = this.b;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ms4(ns4 ns4Var, byte b) {
        this.c = ns4Var.c;
        this.b = ns4Var.b.iterator();
    }

    public ms4(ns4 ns4Var) {
        this.b = ns4Var.b.iterator();
        this.c = ns4Var.c;
    }
}
