package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class v93 extends AbstractMap implements Serializable {
    public static final Object u0 = new Object();
    public transient int X;
    public transient int Y;
    public transient s93 Z;
    public transient Object a;
    public transient int[] b;
    public transient Object[] c;
    public transient Object[] o;
    public transient s93 s0;
    public transient p2 t0;

    public static v93 a(int i) {
        v93 v93Var = new v93();
        if (!(i >= 0)) {
            throw new IllegalArgumentException("Expected size must be >= 0");
        }
        v93Var.X = Math.min(Math.max(i, 1), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        return v93Var;
    }

    public final Map b() {
        Object obj = this.a;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public final int c() {
        return (1 << (this.X & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (f()) {
            return;
        }
        this.X += 32;
        Map mapB = b();
        if (mapB != null) {
            this.X = Math.min(Math.max(size(), 3), LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
            mapB.clear();
            this.a = null;
            this.Y = 0;
            return;
        }
        Arrays.fill(i(), 0, this.Y, (Object) null);
        Arrays.fill(j(), 0, this.Y, (Object) null);
        Object obj = this.a;
        Objects.requireNonNull(obj);
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
        Arrays.fill(h(), 0, this.Y, 0);
        this.Y = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map mapB = b();
        return mapB != null ? mapB.containsKey(obj) : d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.containsValue(obj);
        }
        for (int i = 0; i < this.Y; i++) {
            if (f46.B(obj, j()[i])) {
                return true;
            }
        }
        return false;
    }

    public final int d(Object obj) {
        if (f()) {
            return -1;
        }
        int iA = xfg.A(obj);
        int iC = c();
        Object obj2 = this.a;
        Objects.requireNonNull(obj2);
        int iL = pag.L(iA & iC, obj2);
        if (iL == 0) {
            return -1;
        }
        int i = ~iC;
        int i2 = iA & i;
        do {
            int i3 = iL - 1;
            int i4 = h()[i3];
            if ((i4 & i) == i2 && f46.B(obj, i()[i3])) {
                return i3;
            }
            iL = i4 & iC;
        } while (iL != 0);
        return -1;
    }

    public final void e(int i, int i2) {
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        Object[] objArrI = i();
        Object[] objArrJ = j();
        int size = size();
        int i3 = size - 1;
        if (i >= i3) {
            objArrI[i] = null;
            objArrJ[i] = null;
            iArrH[i] = 0;
            return;
        }
        Object obj2 = objArrI[i3];
        objArrI[i] = obj2;
        objArrJ[i] = objArrJ[i3];
        objArrI[i3] = null;
        objArrJ[i3] = null;
        iArrH[i] = iArrH[i3];
        iArrH[i3] = 0;
        int iA = xfg.A(obj2) & i2;
        int iL = pag.L(iA, obj);
        if (iL == size) {
            pag.M(iA, i + 1, obj);
            return;
        }
        while (true) {
            int i4 = iL - 1;
            int i5 = iArrH[i4];
            int i6 = i5 & i2;
            if (i6 == size) {
                iArrH[i4] = pag.w(i5, i + 1, i2);
                return;
            }
            iL = i6;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        s93 s93Var = this.s0;
        if (s93Var != null) {
            return s93Var;
        }
        s93 s93Var2 = new s93(this, 0);
        this.s0 = s93Var2;
        return s93Var2;
    }

    public final boolean f() {
        return this.a == null;
    }

    public final Object g(Object obj) {
        boolean zF = f();
        Object obj2 = u0;
        if (zF) {
            return obj2;
        }
        int iC = c();
        Object obj3 = this.a;
        Objects.requireNonNull(obj3);
        int iH = pag.H(obj, null, iC, obj3, h(), i(), null);
        if (iH == -1) {
            return obj2;
        }
        Object obj4 = j()[iH];
        e(iH, iC);
        this.Y--;
        this.X += 32;
        return obj4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.get(obj);
        }
        int iD = d(obj);
        if (iD == -1) {
            return null;
        }
        return j()[iD];
    }

    public final int[] h() {
        int[] iArr = this.b;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    public final Object[] i() {
        Object[] objArr = this.c;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object[] j() {
        Object[] objArr = this.o;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    public final int k(int i, int i2, int i3, int i4) {
        Object objH = pag.h(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            pag.M(i3 & i5, i4 + 1, objH);
        }
        Object obj = this.a;
        Objects.requireNonNull(obj);
        int[] iArrH = h();
        for (int i6 = 0; i6 <= i; i6++) {
            int iL = pag.L(i6, obj);
            while (iL != 0) {
                int i7 = iL - 1;
                int i8 = iArrH[i7];
                int i9 = ((~i) & i8) | i6;
                int i10 = i9 & i5;
                int iL2 = pag.L(i10, objH);
                pag.M(i10, iL, objH);
                iArrH[i7] = pag.w(i9, iL2, i5);
                iL = i8 & i;
            }
        }
        this.a = objH;
        this.X = pag.w(this.X, 32 - Integer.numberOfLeadingZeros(i5), 31);
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        s93 s93Var = this.Z;
        if (s93Var != null) {
            return s93Var;
        }
        s93 s93Var2 = new s93(this, 1);
        this.Z = s93Var2;
        return s93Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0102 -> B:40:0x00e8). Please report as a decompilation issue!!! */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object put(java.lang.Object r21, java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v93.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map mapB = b();
        if (mapB != null) {
            return mapB.remove(obj);
        }
        Object objG = g(obj);
        if (objG == u0) {
            return null;
        }
        return objG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map mapB = b();
        return mapB != null ? mapB.size() : this.Y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        p2 p2Var = this.t0;
        if (p2Var != null) {
            return p2Var;
        }
        p2 p2Var2 = new p2(1, this);
        this.t0 = p2Var2;
        return p2Var2;
    }
}
