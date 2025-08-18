package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class eqd {
    public static final eqd d;
    public final Comparable[] a;
    public final Object[] b;
    public final int c;

    static {
        Comparable[] comparableArr = new Comparable[0];
        d = new eqd(comparableArr, comparableArr);
    }

    public eqd(Comparable[] comparableArr, Object[] objArr) {
        if (comparableArr.length == objArr.length) {
            this.a = comparableArr;
            this.b = objArr;
            this.c = comparableArr.length;
        } else {
            StringBuilder sb = new StringBuilder("different array sizes: ");
            sb.append(comparableArr.length);
            sb.append(" keys and ");
            throw new IllegalArgumentException(zr6.j(sb, objArr.length, " values"));
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqd)) {
            return false;
        }
        eqd eqdVar = (eqd) obj;
        return eqdVar.c == this.c && Arrays.equals(eqdVar.a, this.a) && Arrays.equals(eqdVar.b, this.b);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.b) * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < this.c; i++) {
            if (i != 0) {
                sb.append(',');
            }
            sb.append("{");
            sb.append(this.a[i]);
            sb.append(" : ");
            sb.append(this.b[i]);
            sb.append('}');
        }
        sb.append(']');
        return sb.toString();
    }
}
