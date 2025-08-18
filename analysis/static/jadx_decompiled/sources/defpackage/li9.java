package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class li9 {
    public Object[] a;
    public int b;

    public li9(int i) {
        this.a = i == 0 ? ema.b : new Object[i];
    }

    public final void a(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.b)) {
            StringBuilder sbN = rh4.n(i, "Index ", " must be in 0..");
            sbN.append(this.b);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        int i3 = i2 + 1;
        Object[] objArr = this.a;
        if (objArr.length < i3) {
            this.a = Arrays.copyOf(objArr, Math.max(i3, (objArr.length * 3) / 2));
        }
        Object[] objArr2 = this.a;
        int i4 = this.b;
        if (i != i4) {
            ys.W(i + 1, i, i4, objArr2, objArr2);
        }
        objArr2[i] = obj;
        this.b++;
    }

    public final void b(Object obj) {
        int i = this.b + 1;
        Object[] objArr = this.a;
        if (objArr.length < i) {
            this.a = Arrays.copyOf(objArr, Math.max(i, (objArr.length * 3) / 2));
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        objArr2[i2] = obj;
        this.b = i2 + 1;
    }

    public final Object c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder sbN = rh4.n(i, "Index ", " must be in 0..");
        sbN.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public final void d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.b)) {
            StringBuilder sbN = rh4.n(i, "Index ", " must be in 0..");
            sbN.append(this.b - 1);
            throw new IndexOutOfBoundsException(sbN.toString());
        }
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i != i2 - 1) {
            ys.W(i, i + 1, i2, objArr, objArr);
        }
        int i3 = this.b - 1;
        this.b = i3;
        objArr[i3] = null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof li9) {
            li9 li9Var = (li9) obj;
            int i = li9Var.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = li9Var.a;
                j37 j37VarY = ote.Y(0, i2);
                int i3 = j37VarY.a;
                int i4 = j37VarY.b;
                if (i3 > i4) {
                    return true;
                }
                while (tpa.f(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        c0 c0Var = new c0(3, this);
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) c0Var.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ li9() {
        this(16);
    }
}
