package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class gw6 implements Iterator {
    public final /* synthetic */ int a;
    public final uaf[] b;
    public int c = 0;

    public /* synthetic */ gw6(uaf[] uafVarArr, int i) {
        this.a = i;
        this.b = uafVarArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c != this.b.length) {
                }
                break;
            default:
                if (this.c < this.b.length) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                int i = this.c;
                uaf[] uafVarArr = this.b;
                if (i >= uafVarArr.length) {
                    throw new NoSuchElementException();
                }
                this.c = i + 1;
                return uafVarArr[i];
            default:
                int i2 = this.c;
                uaf[] uafVarArr2 = this.b;
                if (i2 >= uafVarArr2.length) {
                    throw new NoSuchElementException();
                }
                AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(uafVarArr2[i2], uafVarArr2[i2 + 1]);
                this.c += 2;
                return simpleImmutableEntry;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
