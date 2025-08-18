package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class p77 extends m5f {
    public static final Object c = new Object();
    public Object b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b != c;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.b;
        Object obj2 = c;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.b = obj2;
        return obj;
    }
}
