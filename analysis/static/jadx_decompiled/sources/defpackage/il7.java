package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class il7 implements ListIterator, qb7 {
    public final r2 X;
    public int b;
    public int o;
    public final /* synthetic */ int a = 0;
    public int c = -1;

    public il7(kl7 kl7Var, int i) {
        this.X = kl7Var;
        this.b = i;
        this.o = ((AbstractList) kl7Var).modCount;
    }

    public void a() {
        if (((AbstractList) ((jl7) this.X).X).modCount != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                this.b = i + 1;
                jl7 jl7Var = (jl7) this.X;
                jl7Var.add(i, obj);
                this.c = -1;
                this.o = ((AbstractList) jl7Var).modCount;
                break;
            default:
                b();
                int i2 = this.b;
                this.b = i2 + 1;
                kl7 kl7Var = (kl7) this.X;
                kl7Var.add(i2, obj);
                this.c = -1;
                this.o = ((AbstractList) kl7Var).modCount;
                break;
        }
    }

    public void b() {
        if (((AbstractList) ((kl7) this.X)).modCount != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b < ((jl7) this.X).c) {
                }
                break;
            default:
                if (this.b < ((kl7) this.X).b) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.a) {
            case 0:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                jl7 jl7Var = (jl7) this.X;
                if (i >= jl7Var.c) {
                    throw new NoSuchElementException();
                }
                this.b = i + 1;
                this.c = i;
                return jl7Var.a[jl7Var.b + i];
            default:
                b();
                int i2 = this.b;
                kl7 kl7Var = (kl7) this.X;
                if (i2 >= kl7Var.b) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                this.c = i2;
                return kl7Var.a[i2];
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.a) {
            case 0:
                a();
                int i = this.b;
                if (i <= 0) {
                    throw new NoSuchElementException();
                }
                int i2 = i - 1;
                this.b = i2;
                this.c = i2;
                jl7 jl7Var = (jl7) this.X;
                return jl7Var.a[jl7Var.b + i2];
            default:
                b();
                int i3 = this.b;
                if (i3 <= 0) {
                    throw new NoSuchElementException();
                }
                int i4 = i3 - 1;
                this.b = i4;
                this.c = i4;
                return ((kl7) this.X).a[i4];
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.a) {
        }
        return this.b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                jl7 jl7Var = (jl7) this.X;
                jl7Var.a(i);
                this.b = this.c;
                this.c = -1;
                this.o = ((AbstractList) jl7Var).modCount;
                return;
            default:
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
                }
                kl7 kl7Var = (kl7) this.X;
                kl7Var.a(i2);
                this.b = this.c;
                this.c = -1;
                this.o = ((AbstractList) kl7Var).modCount;
                return;
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.a) {
            case 0:
                a();
                int i = this.c;
                if (i == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                ((jl7) this.X).set(i, obj);
                return;
            default:
                b();
                int i2 = this.c;
                if (i2 == -1) {
                    throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
                }
                ((kl7) this.X).set(i2, obj);
                return;
        }
    }

    public il7(jl7 jl7Var, int i) {
        this.X = jl7Var;
        this.b = i;
        this.o = ((AbstractList) jl7Var).modCount;
    }
}
