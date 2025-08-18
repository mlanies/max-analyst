package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wv7 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int o;

    public wv7() {
        this((Object) null);
    }

    public final void a() {
        int i = this.o;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.o = 0;
        this.a = false;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final wv7 clone() {
        wv7 wv7Var = (wv7) super.clone();
        wv7Var.b = (long[]) this.b.clone();
        wv7Var.c = (Object[]) this.c.clone();
        return wv7Var;
    }

    public final Object c(long j) {
        Object obj;
        int iM = j47.m(this.o, j, this.b);
        if (iM < 0 || (obj = this.c[iM]) == c54.c) {
            return null;
        }
        return obj;
    }

    public final int d(long j) {
        if (this.a) {
            int i = this.o;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != c54.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.o = i2;
        }
        return j47.m(this.o, j, this.b);
    }

    public final long e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.o)) {
            throw new IllegalArgumentException(zr6.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != c54.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.o = i3;
        }
        return this.b[i];
    }

    public final void f(long j, Object obj) {
        int iM = j47.m(this.o, j, this.b);
        if (iM >= 0) {
            this.c[iM] = obj;
            return;
        }
        int i = ~iM;
        int i2 = this.o;
        Object obj2 = c54.c;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == obj2) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.o = i3;
                i = ~j47.m(i3, j, this.b);
            }
        }
        int i5 = this.o;
        if (i5 >= this.b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.b = Arrays.copyOf(this.b, i9);
            this.c = Arrays.copyOf(this.c, i9);
        }
        int i10 = this.o - i;
        if (i10 != 0) {
            long[] jArr2 = this.b;
            int i11 = i + 1;
            System.arraycopy(jArr2, i, jArr2, i11, i10);
            Object[] objArr3 = this.c;
            ys.W(i11, i, this.o, objArr3, objArr3);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.o++;
    }

    public final void g(long j) {
        int iM = j47.m(this.o, j, this.b);
        if (iM >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[iM];
            Object obj2 = c54.c;
            if (obj != obj2) {
                objArr[iM] = obj2;
                this.a = true;
            }
        }
    }

    public final int h() {
        if (this.a) {
            int i = this.o;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != c54.c) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.o = i2;
        }
        return this.o;
    }

    public final Object i(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.o)) {
            throw new IllegalArgumentException(zr6.h(i, "Expected index to be within 0..size()-1, but was ").toString());
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != c54.c) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.o = i3;
        }
        return this.c[i];
    }

    public final String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.o * 28);
        sb.append('{');
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(e(i2));
            sb.append('=');
            Object objI = i(i2);
            if (objI != sb) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public wv7(int i) {
        if (i == 0) {
            this.b = j47.c;
            this.c = j47.o;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.b = new long[i5];
        this.c = new Object[i5];
    }

    public /* synthetic */ wv7(Object obj) {
        this(10);
    }
}
