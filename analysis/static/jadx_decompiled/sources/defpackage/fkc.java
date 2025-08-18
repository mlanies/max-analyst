package defpackage;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class fkc implements ListIterator, qb7 {
    public final /* synthetic */ int a = 0;
    public final ListIterator b;
    public final /* synthetic */ Object c;

    public fkc(r08 r08Var, int i) {
        this.c = r08Var;
        this.b = ((List) r08Var.b).listIterator(x53.b0(i, r08Var));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                ListIterator listIterator = this.b;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasPrevious();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
        }
        return this.b.previous();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
            case 0:
                return y53.L((gkc) this.c) - this.b.previousIndex();
            default:
                return y53.L((r08) this.c) - this.b.previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
        }
        return this.b.next();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
            case 0:
                return y53.L((gkc) this.c) - this.b.nextIndex();
            default:
                return y53.L((r08) this.c) - this.b.nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                this.b.set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public fkc(gkc gkcVar, int i) {
        this.c = gkcVar;
        this.b = gkcVar.a.listIterator(x53.b0(i, gkcVar));
    }
}
