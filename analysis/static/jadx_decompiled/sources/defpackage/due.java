package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class due {
    public final /* synthetic */ int a;
    public long[] b;
    public Object[] c;
    public int d;
    public int e;

    public due(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new long[10];
                this.c = new Object[10];
                break;
            default:
                this.b = new long[10];
                this.c = new Object[10];
                break;
        }
    }

    public final synchronized void a(long j, Object obj) {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    if (this.e > 0) {
                        if (j <= this.b[((this.d + r0) - 1) % this.c.length]) {
                            b();
                        }
                    }
                    c();
                    int i2 = this.d;
                    int i3 = this.e;
                    Object[] objArr = this.c;
                    int length = (i2 + i3) % objArr.length;
                    this.b[length] = j;
                    objArr[length] = obj;
                    this.e = i3 + 1;
                    return;
                default:
                    if (this.e > 0) {
                        if (j <= this.b[((this.d + r0) - 1) % this.c.length]) {
                            b();
                        }
                    }
                    c();
                    int i4 = this.d;
                    int i5 = this.e;
                    Object[] objArr2 = this.c;
                    int length2 = (i4 + i5) % objArr2.length;
                    this.b[length2] = j;
                    objArr2[length2] = obj;
                    this.e = i5 + 1;
                    return;
            }
        }
    }

    public final synchronized void b() {
        int i = this.a;
        synchronized (this) {
            switch (i) {
                case 0:
                    this.d = 0;
                    this.e = 0;
                    Arrays.fill(this.c, (Object) null);
                    return;
                default:
                    this.d = 0;
                    this.e = 0;
                    Arrays.fill(this.c, (Object) null);
                    return;
            }
        }
    }

    public final void c() {
        switch (this.a) {
            case 0:
                int length = this.c.length;
                if (this.e >= length) {
                    int i = length * 2;
                    long[] jArr = new long[i];
                    Object[] objArr = new Object[i];
                    int i2 = this.d;
                    int i3 = length - i2;
                    System.arraycopy(this.b, i2, jArr, 0, i3);
                    System.arraycopy(this.c, this.d, objArr, 0, i3);
                    int i4 = this.d;
                    if (i4 > 0) {
                        System.arraycopy(this.b, 0, jArr, i3, i4);
                        System.arraycopy(this.c, 0, objArr, i3, this.d);
                    }
                    this.b = jArr;
                    this.c = objArr;
                    this.d = 0;
                    break;
                }
                break;
            default:
                int length2 = this.c.length;
                if (this.e >= length2) {
                    int i5 = length2 * 2;
                    long[] jArr2 = new long[i5];
                    Object[] objArr2 = new Object[i5];
                    int i6 = this.d;
                    int i7 = length2 - i6;
                    System.arraycopy(this.b, i6, jArr2, 0, i7);
                    System.arraycopy(this.c, this.d, objArr2, 0, i7);
                    int i8 = this.d;
                    if (i8 > 0) {
                        System.arraycopy(this.b, 0, jArr2, i7, i8);
                        System.arraycopy(this.c, 0, objArr2, i7, this.d);
                    }
                    this.b = jArr2;
                    this.c = objArr2;
                    this.d = 0;
                    break;
                }
                break;
        }
    }

    public Object d(long j, boolean z) {
        Object objG = null;
        long j2 = Long.MAX_VALUE;
        while (this.e > 0) {
            long j3 = j - this.b[this.d];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objG = g();
            j2 = j3;
        }
        return objG;
    }

    public synchronized Object e() {
        return this.e == 0 ? null : g();
    }

    public synchronized Object f(long j) {
        Object objG;
        objG = null;
        while (this.e > 0 && j - this.b[this.d] >= 0) {
            objG = g();
        }
        return objG;
    }

    public final Object g() {
        switch (this.a) {
            case 0:
                np8.f(this.e > 0);
                Object[] objArr = this.c;
                int i = this.d;
                Object obj = objArr[i];
                objArr[i] = null;
                this.d = (i + 1) % objArr.length;
                this.e--;
                return obj;
            default:
                fm9.k(this.e > 0);
                Object[] objArr2 = this.c;
                int i2 = this.d;
                Object obj2 = objArr2[i2];
                objArr2[i2] = null;
                this.d = (i2 + 1) % objArr2.length;
                this.e--;
                return obj2;
        }
    }

    public synchronized int h() {
        return this.e;
    }
}
