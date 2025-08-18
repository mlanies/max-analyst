package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class u6d implements Iterator, qb7 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ r6d c;

    public u6d(r6d r6dVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = r6dVar;
                this.b = r6dVar.f();
                break;
            default:
                this.c = r6dVar;
                this.b = r6dVar.f();
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.b > 0) {
                }
                break;
            default:
                if (this.b > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                r6d r6dVar = this.c;
                int iF = r6dVar.f();
                int i = this.b;
                this.b = i - 1;
                return r6dVar.i(iF - i);
            default:
                r6d r6dVar2 = this.c;
                int iF2 = r6dVar2.f();
                int i2 = this.b;
                this.b = i2 - 1;
                return r6dVar2.g(iF2 - i2);
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
}
