package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class c92 extends z7b {
    public final long[] a;

    public c92(long[] jArr) {
        this.a = jArr;
    }

    public final boolean equals(Object obj) {
        if (obj != null && c92.class == obj.getClass()) {
            return Arrays.equals(new Object[]{this.a}, new Object[]{((c92) obj).a});
        }
        return false;
    }

    public final int hashCode() {
        return c92.class.hashCode() + (Arrays.hashCode(new Object[]{this.a}) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(c92.class.getSimpleName());
        sb.append("[");
        for (int i = 0; i < strArrSplit.length; i++) {
            sb.append(strArrSplit[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != strArrSplit.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
