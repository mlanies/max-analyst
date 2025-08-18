package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class ds8 implements Iterator, qb7 {
    public final Iterator a;
    public final Iterator b;
    public final /* synthetic */ km4 c;

    public ds8(km4 km4Var) {
        this.c = km4Var;
        this.a = ((c6d) km4Var.c).iterator();
        this.b = ((c6d) km4Var.b).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() && this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.c.getClass();
        return new kpa(this.a.next(), this.b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
