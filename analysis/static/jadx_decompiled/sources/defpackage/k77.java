package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class k77 extends ns5 {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ a7b b;

    public k77(Iterable iterable, a7b a7bVar) {
        this.a = iterable;
        this.b = a7bVar;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.a.iterator();
        it.getClass();
        a7b a7bVar = this.b;
        a7bVar.getClass();
        return new l77(it, a7bVar);
    }
}
