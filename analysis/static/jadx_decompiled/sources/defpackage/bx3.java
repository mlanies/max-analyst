package defpackage;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class bx3 extends AbstractList implements RandomAccess {
    public final dx3 a;
    public final int b;
    public int c;
    public Object[] o;

    public bx3(dx3 dx3Var, int i, int i2) {
        this.a = dx3Var;
        this.o = dx3Var.b;
        this.b = i;
        this.c = i2 - i;
    }

    public final void a() {
        if (this.a.b != this.o) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            a();
            if (i < 0 || i > this.c) {
                throw new IndexOutOfBoundsException();
            }
            this.a.add(i + this.b, obj);
            this.o = this.a.b;
            this.c++;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(int i) {
        if (i < 0 || i >= this.c) {
            throw new IndexOutOfBoundsException(rh4.h("Index: ", i, this.c, ",Size: "));
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            a();
            dx3 dx3Var = this.a;
            int i = this.b;
            dx3.a(dx3Var, i, this.c + i);
            this.o = this.a.b;
            this.c = 0;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            b(i);
            a();
            dx3 dx3Var = this.a;
            return dx3Var.b[i + this.b];
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        dx3 dx3Var = this.a;
        ReentrantLock reentrantLock = dx3Var.a;
        reentrantLock.lock();
        try {
            a();
            return new cx3(dx3Var, 0, this.b, this.c);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        int i2;
        dx3 dx3Var = this.a;
        ReentrantLock reentrantLock = dx3Var.a;
        reentrantLock.lock();
        try {
            a();
            if (i >= 0 && i <= (i2 = this.c)) {
                return new cx3(dx3Var, i, this.b, i2);
            }
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + this.c);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            b(i);
            a();
            Object objRemove = this.a.remove(i + this.b);
            this.o = this.a.b;
            this.c--;
            return objRemove;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            b(i);
            a();
            Object obj2 = this.a.set(i + this.b, obj);
            this.o = this.a.b;
            return obj2;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        ReentrantLock reentrantLock = this.a.a;
        reentrantLock.lock();
        try {
            a();
            return this.c;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        dx3 dx3Var = this.a;
        ReentrantLock reentrantLock = dx3Var.a;
        reentrantLock.lock();
        try {
            a();
            if (i < 0 || i2 > this.c) {
                throw new IndexOutOfBoundsException();
            }
            int i3 = this.b;
            return new bx3(dx3Var, i + i3, i2 + i3);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }
}
