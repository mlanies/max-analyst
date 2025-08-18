package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class pw6 {
    public boolean a;
    public int b;
    public Object[] c;

    public pw6(int i) {
        wmd.i(i, "initialCapacity");
        this.c = new Object[i];
        this.b = 0;
    }

    public static int h(int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("cannot store more than MAX_VALUE elements");
        }
        int iHighestOneBit = i + (i >> 1) + 1;
        if (iHighestOneBit < i2) {
            iHighestOneBit = Integer.highestOneBit(i2 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public void a(Object obj) {
        obj.getClass();
        i(this.b + 1);
        Object[] objArr = this.c;
        int i = this.b;
        this.b = i + 1;
        objArr[i] = obj;
    }

    public void b(Object... objArr) {
        int length = objArr.length;
        c54.n(length, objArr);
        i(this.b + length);
        System.arraycopy(objArr, 0, this.c, this.b, length);
        this.b += length;
    }

    public abstract pw6 c(Object obj);

    public void d(Object obj) {
        a(obj);
    }

    public void e(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            i(collection.size() + this.b);
            if (collection instanceof qw6) {
                this.b = ((qw6) collection).b(this.b, this.c);
                return;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public void f(Iterable iterable) {
        e(iterable);
    }

    public abstract void g(ok okVar, qne qneVar);

    public void i(int i) {
        Object[] objArr = this.c;
        if (objArr.length < i) {
            this.c = Arrays.copyOf(objArr, h(objArr.length, i));
            this.a = false;
        } else if (this.a) {
            this.c = (Object[]) objArr.clone();
            this.a = false;
        }
    }
}
