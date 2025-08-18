package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class jkc extends x1 implements RandomAccess {
    public final Object[] a;
    public final int b;
    public int c;
    public int o;

    public jkc(int i, Object[] objArr) {
        this.a = objArr;
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "ring buffer filled size should not be negative but it is ").toString());
        }
        if (i <= objArr.length) {
            this.b = objArr.length;
            this.o = i;
        } else {
            StringBuilder sbN = rh4.n(i, "ring buffer filled size: ", " cannot be larger than the buffer size: ");
            sbN.append(objArr.length);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
    }

    public final void a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "n shouldn't be negative but it is ").toString());
        }
        if (i > this.o) {
            StringBuilder sbN = rh4.n(i, "n shouldn't be greater than the buffer size: n = ", ", size = ");
            sbN.append(this.o);
            throw new IllegalArgumentException(sbN.toString().toString());
        }
        if (i > 0) {
            int i2 = this.c;
            int i3 = this.b;
            int i4 = (i2 + i) % i3;
            Object[] objArr = this.a;
            if (i2 > i4) {
                Arrays.fill(objArr, i2, i3, (Object) null);
                Arrays.fill(objArr, 0, i4, (Object) null);
            } else {
                Arrays.fill(objArr, i2, i4, (Object) null);
            }
            this.c = i4;
            this.o -= i;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        int size = getSize();
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException(rh4.h("index: ", i, size, ", size: "));
        }
        return this.a[(this.c + i) % this.b];
    }

    @Override // defpackage.x1
    public final int getSize() {
        return this.o;
    }

    @Override // defpackage.x1, java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new ikc(this);
    }

    @Override // defpackage.x1, java.util.List, java.util.Collection
    public final Object[] toArray() {
        return toArray(new Object[getSize()]);
    }

    @Override // defpackage.x1, java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] objArr2;
        int length = objArr.length;
        int i = this.o;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = this.o;
        int i3 = this.c;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            objArr2 = this.a;
            if (i5 >= i2 || i3 >= this.b) {
                break;
            }
            objArr[i5] = objArr2[i3];
            i5++;
            i3++;
        }
        while (i5 < i2) {
            objArr[i5] = objArr2[i4];
            i5++;
            i4++;
        }
        if (i2 < objArr.length) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
