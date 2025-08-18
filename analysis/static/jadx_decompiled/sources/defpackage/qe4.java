package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qe4 implements su0 {
    public final int a;
    public final int[] b;
    public final int c;

    public qe4(int i, int i2, int[] iArr) {
        this.a = i;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = iArrCopyOf;
        this.c = i2;
        Arrays.sort(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qe4.class != obj.getClass()) {
            return false;
        }
        qe4 qe4Var = (qe4) obj;
        return this.a == qe4Var.a && Arrays.equals(this.b, qe4Var.b) && this.c == qe4Var.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.a * 31)) * 31) + this.c;
    }
}
