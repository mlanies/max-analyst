package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class nf0 implements Iterable, qb7 {
    public final ArrayDeque a = new ArrayDeque();
    public ync b;

    public final coc a() {
        return (coc) this.a.peek();
    }

    public final coc b() {
        coc cocVar = (coc) this.a.pop();
        ync yncVar = this.b;
        if (yncVar != null) {
            yncVar.d();
        }
        cocVar.a.destroy();
        return cocVar;
    }

    public final Iterator c() {
        return x53.v0(this.a).iterator();
    }

    public final int getSize() {
        return this.a.size();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new u1(2, this.a.toArray(new coc[0]));
    }
}
