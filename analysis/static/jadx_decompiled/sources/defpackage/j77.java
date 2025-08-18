package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ru.ok.android.externcalls.sdk.u;

/* loaded from: classes2.dex */
public final class j77 implements Iterator {
    public final /* synthetic */ i77 X;
    public final Iterator a;
    public Object b;
    public boolean c = false;
    public boolean o = false;

    public j77(i77 i77Var, Iterator it) {
        this.X = i77Var;
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        if (this.o) {
            return true;
        }
        if (this.c) {
            return false;
        }
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                this.c = true;
                return false;
            }
            next = it.next();
            ((u) this.X.c).getClass();
        } while (!u.b(next));
        this.o = true;
        this.b = next;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object next;
        if (this.o) {
            this.o = false;
            return this.b;
        }
        do {
            Iterator it = this.a;
            if (!it.hasNext()) {
                throw new NoSuchElementException("This FilterIterator has nothing to output");
            }
            next = it.next();
            ((u) this.X.c).getClass();
        } while (!u.b(next));
        this.b = next;
        this.o = false;
        return next;
    }
}
