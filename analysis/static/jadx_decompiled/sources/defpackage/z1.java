package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class z1 implements Iterator {
    public final /* synthetic */ y1 X;
    public final Iterator a;
    public Object b = null;
    public Collection c = null;
    public Iterator o = o77.a;

    public z1(y1 y1Var) {
        this.X = y1Var;
        this.a = y1Var.o.entrySet().iterator();
    }

    public final Object a(Object obj, Object obj2) {
        return obj2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext() || this.o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.o.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.o = collection.iterator();
        }
        return this.o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.o.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.a.remove();
        }
        y1 y1Var = this.X;
        y1Var.X--;
    }
}
