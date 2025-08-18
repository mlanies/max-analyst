package defpackage;

import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public abstract class lld {
    public static final Symbol a = new Symbol("NO_VALUE");

    public static final kld a(int i, int i2, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "replay cannot be negative, but was ").toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(zr6.h(i2, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        if (i <= 0 && i2 <= 0 && i3 != 1) {
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(wg0.p(i3)).toString());
        }
        int i4 = i2 + i;
        if (i4 < 0) {
            i4 = Integer.MAX_VALUE;
        }
        return new kld(i, i4, i3);
    }

    public static /* synthetic */ kld b(int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return a(i, i2, i3);
    }

    public static final Object c(Object[] objArr, long j) {
        return objArr[((int) j) & (objArr.length - 1)];
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final mn5 e(gld gldVar, lx3 lx3Var, int i, int i2) {
        return ((i == 0 || i == -3) && i2 == 1) ? gldVar : new t32(i, i2, lx3Var, gldVar);
    }
}
