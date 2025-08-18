package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class ia6 implements Iterator, qb7 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public final /* synthetic */ c6d o;

    public ia6(rae raeVar) {
        this.a = 1;
        this.o = raeVar;
        this.c = raeVar.a.iterator();
    }

    public void a() {
        int i = this.b;
        km4 km4Var = (km4) this.o;
        Object objInvoke = i == -2 ? ((k56) km4Var.c).invoke() : ((m56) km4Var.b).invoke(this.c);
        this.c = objInvoke;
        this.b = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        rae raeVar;
        Iterator it;
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                return this.b == 1;
        }
        while (true) {
            int i = this.b;
            raeVar = (rae) this.o;
            int i2 = raeVar.b;
            it = (Iterator) this.c;
            if (i < i2 && it.hasNext()) {
                it.next();
                this.b++;
            }
        }
        return this.b < raeVar.c && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        rae raeVar;
        Iterator it;
        switch (this.a) {
            case 0:
                if (this.b < 0) {
                    a();
                }
                if (this.b == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.c;
                this.b = -1;
                return obj;
        }
        while (true) {
            int i = this.b;
            raeVar = (rae) this.o;
            int i2 = raeVar.b;
            it = (Iterator) this.c;
            if (i < i2 && it.hasNext()) {
                it.next();
                this.b++;
            }
        }
        int i3 = this.b;
        if (i3 >= raeVar.c) {
            throw new NoSuchElementException();
        }
        this.b = i3 + 1;
        return it.next();
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

    public ia6(km4 km4Var) {
        this.a = 0;
        this.o = km4Var;
        this.b = -2;
    }
}
