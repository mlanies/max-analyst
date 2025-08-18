package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes.dex */
public final class ky7 implements Map, Serializable, ub7 {
    public static final ky7 y0;
    public int X;
    public int Y;
    public int Z;
    public Object[] a;
    public Object[] b;
    public int[] c;
    public int[] o;
    public int s0;
    public int t0;
    public ly7 u0;
    public my7 v0;
    public ly7 w0;
    public boolean x0;

    static {
        ky7 ky7Var = new ky7(0);
        ky7Var.x0 = true;
        y0 = ky7Var;
    }

    public ky7() {
        this(8);
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int iH = h(obj);
            int i = this.X * 2;
            int length = this.o.length / 2;
            if (i > length) {
                i = length;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = this.o;
                int i3 = iArr[iH];
                if (i3 <= 0) {
                    int i4 = this.Y;
                    Object[] objArr = this.a;
                    if (i4 < objArr.length) {
                        int i5 = i4 + 1;
                        this.Y = i5;
                        objArr[i4] = obj;
                        this.c[i4] = iH;
                        iArr[iH] = i5;
                        this.t0++;
                        this.s0++;
                        if (i2 > this.X) {
                            this.X = i2;
                        }
                        return i4;
                    }
                    f(1);
                } else {
                    if (tpa.f(this.a[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        i(this.o.length * 2);
                        break;
                    }
                    iH = iH == 0 ? this.o.length - 1 : iH - 1;
                }
            }
        }
    }

    public final ky7 b() {
        c();
        this.x0 = true;
        return this.t0 > 0 ? this : y0;
    }

    public final void c() {
        if (this.x0) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.Y - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.c;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.o[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        j47.b0(0, this.Y, this.a);
        Object[] objArr = this.b;
        if (objArr != null) {
            j47.b0(0, this.Y, objArr);
        }
        this.t0 = 0;
        this.Y = 0;
        this.s0++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        int i;
        int i2 = this.Y;
        while (true) {
            i = -1;
            i2--;
            if (i2 >= 0) {
                if (this.c[i2] >= 0 && tpa.f(this.b[i2], obj)) {
                    i = i2;
                    break;
                }
            } else {
                break;
            }
        }
        return i >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.b;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.Y;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.c;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.a;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.o[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        j47.b0(i3, i, this.a);
        if (objArr != null) {
            j47.b0(i3, this.Y, objArr);
        }
        this.Y = i3;
    }

    public final boolean e(Collection collection) {
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int iG = g(entry.getKey());
                    if (!(iG < 0 ? false : tpa.f(this.b[iG], entry.getValue()))) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        ly7 ly7Var = this.w0;
        if (ly7Var != null) {
            return ly7Var;
        }
        ly7 ly7Var2 = new ly7(0, this);
        this.w0 = ly7Var2;
        return ly7Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof Map) {
                Map map = (Map) obj;
                if (this.t0 != map.size() || !e(map.entrySet())) {
                }
            }
            return false;
        }
        return true;
    }

    public final void f(int i) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int i2 = this.Y;
        int i3 = length - i2;
        int i4 = i2 - this.t0;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.a = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.b;
            this.b = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.c = Arrays.copyOf(this.c, i6);
            int iHighestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (iHighestOneBit > this.o.length) {
                i(iHighestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int iH = h(obj);
        int i = this.X;
        while (true) {
            int i2 = this.o[iH];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (tpa.f(this.a[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iH = iH == 0 ? this.o.length - 1 : iH - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        return this.b[iG];
    }

    public final int h(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.Z;
    }

    @Override // java.util.Map
    public final int hashCode() {
        hy7 hy7Var = new hy7(0, this);
        int i = 0;
        while (hy7Var.hasNext()) {
            int i2 = hy7Var.a;
            ky7 ky7Var = (ky7) hy7Var.o;
            if (i2 >= ky7Var.Y) {
                throw new NoSuchElementException();
            }
            hy7Var.a = i2 + 1;
            hy7Var.b = i2;
            Object obj = ky7Var.a[i2];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = ky7Var.b[hy7Var.b];
            int iHashCode2 = obj2 != null ? obj2.hashCode() : 0;
            hy7Var.f();
            i += iHashCode ^ iHashCode2;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r3[r0] = r6;
        r5.c[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r6) {
        /*
            r5 = this;
            int r0 = r5.s0
            int r0 = r0 + 1
            r5.s0 = r0
            int r0 = r5.Y
            int r1 = r5.t0
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.o = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.Z = r6
        L1c:
            int r6 = r5.Y
            if (r2 >= r6) goto L50
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.a
            r0 = r0[r2]
            int r0 = r5.h(r0)
            int r1 = r5.X
        L2c:
            int[] r3 = r5.o
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.c
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r5.<init>(r6)
            throw r5
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky7.i(int):void");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.t0 == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:9:0x001f->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.a
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.b
            if (r0 == 0) goto Lb
            r0[r12] = r1
        Lb:
            int[] r0 = r11.c
            r0 = r0[r12]
            int r1 = r11.X
            int r1 = r1 * 2
            int[] r2 = r11.o
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1b
            r1 = r2
        L1b:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L1f:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L29
            int[] r0 = r11.o
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2a
        L29:
            r0 = r5
        L2a:
            int r4 = r4 + 1
            int r5 = r11.X
            r6 = -1
            if (r4 <= r5) goto L36
            int[] r0 = r11.o
            r0[r1] = r2
            goto L67
        L36:
            int[] r5 = r11.o
            r7 = r5[r0]
            if (r7 != 0) goto L3f
            r5[r1] = r2
            goto L67
        L3f:
            if (r7 >= 0) goto L46
            r5[r1] = r6
        L43:
            r1 = r0
            r4 = r2
            goto L60
        L46:
            java.lang.Object[] r5 = r11.a
            int r8 = r7 + (-1)
            r5 = r5[r8]
            int r5 = r11.h(r5)
            int r5 = r5 - r0
            int[] r9 = r11.o
            int r10 = r9.length
            int r10 = r10 + (-1)
            r5 = r5 & r10
            if (r5 < r4) goto L60
            r9[r1] = r7
            int[] r4 = r11.c
            r4[r8] = r1
            goto L43
        L60:
            int r3 = r3 + r6
            if (r3 >= 0) goto L1f
            int[] r0 = r11.o
            r0[r1] = r6
        L67:
            int[] r0 = r11.c
            r0[r12] = r6
            int r12 = r11.t0
            int r12 = r12 + r6
            r11.t0 = r12
            int r12 = r11.s0
            int r12 = r12 + 1
            r11.s0 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky7.j(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        ly7 ly7Var = this.u0;
        if (ly7Var != null) {
            return ly7Var;
        }
        ly7 ly7Var2 = new ly7(1, this);
        this.u0 = ly7Var2;
        return ly7Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int iA = a(obj);
        Object[] objArr = this.b;
        if (objArr == null) {
            int length = this.a.length;
            if (length < 0) {
                throw new IllegalArgumentException("capacity must be non-negative.".toString());
            }
            objArr = new Object[length];
            this.b = objArr;
        }
        if (iA >= 0) {
            objArr[iA] = obj2;
            return null;
        }
        int i = (-iA) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c();
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return;
        }
        f(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            int iA = a(entry.getKey());
            Object[] objArr = this.b;
            if (objArr == null) {
                int length = this.a.length;
                if (length < 0) {
                    throw new IllegalArgumentException("capacity must be non-negative.".toString());
                }
                objArr = new Object[length];
                this.b = objArr;
            }
            if (iA >= 0) {
                objArr[iA] = entry.getValue();
            } else {
                int i = (-iA) - 1;
                if (!tpa.f(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int iG = g(obj);
        if (iG < 0) {
            return null;
        }
        Object obj2 = this.b[iG];
        j(iG);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.t0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.t0 * 3) + 2);
        sb.append("{");
        hy7 hy7Var = new hy7(0, this);
        int i = 0;
        while (hy7Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = hy7Var.a;
            ky7 ky7Var = (ky7) hy7Var.o;
            if (i2 >= ky7Var.Y) {
                throw new NoSuchElementException();
            }
            hy7Var.a = i2 + 1;
            hy7Var.b = i2;
            Object obj = ky7Var.a[i2];
            if (obj == ky7Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object obj2 = ky7Var.b[hy7Var.b];
            if (obj2 == ky7Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            hy7Var.f();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        my7 my7Var = this.v0;
        if (my7Var != null) {
            return my7Var;
        }
        my7 my7Var2 = new my7(this);
        this.v0 = my7Var2;
        return my7Var2;
    }

    public ky7(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.".toString());
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int iHighestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.a = objArr;
        this.b = null;
        this.c = iArr;
        this.o = new int[iHighestOneBit];
        this.X = 2;
        this.Y = 0;
        this.Z = Integer.numberOfLeadingZeros(iHighestOneBit) + 1;
    }
}
