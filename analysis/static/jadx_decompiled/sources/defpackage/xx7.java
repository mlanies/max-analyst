package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class xx7 extends z7b {
    public final wx7 a;
    public final List b;

    public xx7(wx7 wx7Var, List list) {
        this.a = wx7Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == null || xx7.class != obj.getClass()) {
            return false;
        }
        xx7 xx7Var = (xx7) obj;
        return Arrays.equals(new Object[]{this.a, this.b}, new Object[]{xx7Var.a, xx7Var.b});
    }

    public final int hashCode() {
        return xx7.class.hashCode() + (Arrays.hashCode(new Object[]{this.a, this.b}) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a, this.b};
        String[] strArrSplit = "a;b".length() == 0 ? new String[0] : "a;b".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(xx7.class.getSimpleName());
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
