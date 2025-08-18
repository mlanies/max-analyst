package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* loaded from: classes.dex */
public abstract class jx6 extends qw6 implements Set {
    public static final /* synthetic */ int c = 0;
    public transient zw6 b;

    public static int h(int i) {
        int iMax = Math.max(i, 2);
        if (iMax >= 751619276) {
            if (iMax < 1073741824) {
                return 1073741824;
            }
            throw new IllegalArgumentException("collection too large");
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static jx6 i(int i, Object... objArr) {
        if (i == 0) {
            return lfc.u0;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new jsd(obj);
        }
        int iH = h(i);
        Object[] objArr2 = new Object[iH];
        int i2 = iH - 1;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            Object obj2 = objArr[i5];
            if (obj2 == null) {
                throw new NullPointerException(zr6.h(i5, "at index "));
            }
            int iHashCode = obj2.hashCode();
            int iZ = xfg.z(iHashCode);
            while (true) {
                int i6 = iZ & i2;
                Object obj3 = objArr2[i6];
                if (obj3 == null) {
                    objArr[i4] = obj2;
                    objArr2[i6] = obj2;
                    i3 += iHashCode;
                    i4++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZ++;
            }
        }
        Arrays.fill(objArr, i4, i, (Object) null);
        if (i4 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new jsd(obj4);
        }
        if (h(i4) < iH / 2) {
            return i(i4, objArr);
        }
        int length = objArr.length;
        if (i4 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i4);
        }
        return new lfc(i3, i2, i4, objArr, objArr2);
    }

    public static jx6 j(Collection collection) {
        if ((collection instanceof jx6) && !(collection instanceof SortedSet)) {
            jx6 jx6Var = (jx6) collection;
            if (!jx6Var.f()) {
                return jx6Var;
            }
        }
        Object[] array = collection.toArray();
        return i(array.length, array);
    }

    @Override // defpackage.qw6
    public zw6 a() {
        zw6 zw6Var = this.b;
        if (zw6Var != null) {
            return zw6Var;
        }
        zw6 zw6VarK = k();
        this.b = zw6VarK;
        return zw6VarK;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof jx6) && l() && ((jx6) obj).l() && hashCode() != obj.hashCode()) {
            return false;
        }
        return ngg.r(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return ngg.v(this);
    }

    public zw6 k() {
        Object[] array = toArray(qw6.a);
        ls5 ls5Var = zw6.b;
        return zw6.h(array.length, array);
    }

    public boolean l() {
        return this instanceof lfc;
    }
}
