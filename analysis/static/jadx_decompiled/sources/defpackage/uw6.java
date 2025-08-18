package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class uw6 implements Serializable {
    public static final /* synthetic */ int c = 0;
    public final int[] a;
    public final int b;

    static {
        new uw6(new int[0]);
    }

    public uw6(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uw6)) {
            return false;
        }
        uw6 uw6Var = (uw6) obj;
        int i = uw6Var.b;
        int i2 = this.b;
        if (i2 != i) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            z04.k(i3, i2);
            int i4 = this.a[i3];
            z04.k(i3, uw6Var.b);
            if (i4 != uw6Var.a[i3]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.b; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
