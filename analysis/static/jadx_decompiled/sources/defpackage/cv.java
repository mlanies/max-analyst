package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class cv extends z7b implements bb3 {
    public final bb3 a;

    public cv(bb3 bb3Var) {
        this.a = bb3Var;
    }

    @Override // defpackage.bb3
    public final void b(ra3 ra3Var) {
        try {
            this.a.b(ra3Var);
        } catch (RuntimeException e) {
            if (!(e.getCause() instanceof InterruptedException)) {
                throw e;
            }
            if (ra3Var.h()) {
                Thread.currentThread().interrupt();
                return;
            }
            Throwable cause = e.getCause();
            if (ra3Var.a(cause)) {
                return;
            }
            j47.Z(cause);
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != null && cv.class == obj.getClass()) {
            return Arrays.equals(new Object[]{this.a}, new Object[]{((cv) obj).a});
        }
        return false;
    }

    public final int hashCode() {
        return cv.class.hashCode() + (Arrays.hashCode(new Object[]{this.a}) * 31);
    }

    public final String toString() {
        Object[] objArr = {this.a};
        String[] strArrSplit = "a".length() == 0 ? new String[0] : "a".split(";");
        StringBuilder sb = new StringBuilder();
        sb.append(cv.class.getSimpleName());
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
