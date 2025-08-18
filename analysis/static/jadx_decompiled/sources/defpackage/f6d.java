package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class f6d implements Iterator, Continuation, qb7 {
    public int a;
    public Object b;
    public Iterator c;
    public Continuation o;

    public final RuntimeException a() {
        int i = this.a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.a);
    }

    public final void c(Object obj, Continuation continuation) {
        this.b = obj;
        this.a = 3;
        this.o = continuation;
    }

    @Override // kotlin.coroutines.Continuation
    public final lx3 getContext() {
        return hz4.a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw a();
                }
                if (this.c.hasNext()) {
                    this.a = 2;
                    return true;
                }
                this.c = null;
            }
            this.a = 5;
            Continuation continuation = this.o;
            this.o = null;
            continuation.resumeWith(e5f.a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.a = 1;
            return this.c.next();
        }
        if (i != 3) {
            throw a();
        }
        this.a = 0;
        Object obj = this.b;
        this.b = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) throws Throwable {
        od2.a0(obj);
        this.a = 4;
    }
}
