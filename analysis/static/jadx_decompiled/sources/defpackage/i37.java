package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class i37 implements Iterator, qb7 {
    public final int a;
    public final int b;
    public boolean c;
    public int o;

    public i37(int i, int i2, int i3) {
        this.a = i3;
        this.b = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.c = z;
        this.o = z ? i : i2;
    }

    public final int a() {
        int i = this.o;
        if (i != this.b) {
            this.o = this.a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(a());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
