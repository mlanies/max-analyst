package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class p1 extends m5f {
    public int b;
    public Object c;

    public p1() {
        super(0);
        this.b = 2;
    }

    public abstract Object a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.b;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iS = au1.s(i);
        if (iS == 0) {
            return true;
        }
        if (iS == 2) {
            return false;
        }
        this.b = 4;
        this.c = a();
        if (this.b == 3) {
            return false;
        }
        this.b = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.b = 2;
        Object obj = this.c;
        this.c = null;
        return obj;
    }
}
