package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class qs implements Iterator, qb7 {
    public final /* synthetic */ Object X;
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int o;

    public qs(int i) {
        this.a = i;
    }

    public final Object a(int i) {
        switch (this.o) {
            case 0:
                return ((us) this.X).f(i);
            case 1:
                return ((us) this.X).i(i);
            default:
                return ((xs) this.X).b[i];
        }
    }

    public final void b(int i) {
        switch (this.o) {
            case 0:
                ((us) this.X).g(i);
                break;
            case 1:
                ((us) this.X).g(i);
                break;
            default:
                ((xs) this.X).d(i);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a(this.b);
        this.b++;
        this.c = true;
        return objA;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.".toString());
        }
        int i = this.b - 1;
        this.b = i;
        b(i);
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qs(xs xsVar) {
        this(xsVar.c);
        this.o = 2;
        this.X = xsVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qs(us usVar, int i) {
        this(usVar.c);
        this.o = i;
        switch (i) {
            case 1:
                this.X = usVar;
                this(usVar.c);
                break;
            default:
                this.X = usVar;
                break;
        }
    }
}
