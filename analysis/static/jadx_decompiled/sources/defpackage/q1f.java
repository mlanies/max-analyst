package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q1f implements Iterator, qb7 {
    public final /* synthetic */ int a;
    public Iterator b;
    public final Object c;

    public q1f(u1 u1Var) {
        this.a = 1;
        this.c = new ArrayList();
        this.b = u1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return ((r1f) this.c).b.invoke(this.b.next());
            default:
                Object next = this.b.next();
                View view = (View) next;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                u1 u1Var = viewGroup != null ? new u1(4, viewGroup) : null;
                ArrayList arrayList = (ArrayList) this.c;
                if (u1Var == null || !u1Var.hasNext()) {
                    while (!this.b.hasNext() && (!arrayList.isEmpty())) {
                        this.b = (Iterator) x53.p0(arrayList);
                        d63.Z(arrayList);
                    }
                } else {
                    arrayList.add(this.b);
                    this.b = u1Var;
                }
                return next;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public q1f(r1f r1fVar) {
        this.a = 0;
        this.c = r1fVar;
        this.b = r1fVar.a.iterator();
    }
}
