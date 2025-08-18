package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class ub0 {
    public static final ub0 d = new ub0(0, 2, null);
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(0, -1)));
    public static final ki3 f = new ki3(new ub0(0, 1, null));
    public final int a;
    public final int b;
    public final cc0 c;

    public ub0(int i, int i2, cc0 cc0Var) {
        this.a = i;
        if (i2 == 0) {
            throw new NullPointerException("Null streamState");
        }
        this.b = i2;
        this.c = cc0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ub0)) {
            return false;
        }
        ub0 ub0Var = (ub0) obj;
        if (this.a == ub0Var.a && au1.c(this.b, ub0Var.b)) {
            cc0 cc0Var = ub0Var.c;
            cc0 cc0Var2 = this.c;
            if (cc0Var2 == null) {
                if (cc0Var == null) {
                    return true;
                }
            } else if (cc0Var2.equals(cc0Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iS = (((this.a ^ 1000003) * 1000003) ^ au1.s(this.b)) * 1000003;
        cc0 cc0Var = this.c;
        return (cc0Var == null ? 0 : cc0Var.hashCode()) ^ iS;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamInfo{id=");
        sb.append(this.a);
        sb.append(", streamState=");
        int i = this.b;
        sb.append(i != 1 ? i != 2 ? "null" : "INACTIVE" : "ACTIVE");
        sb.append(", inProgressTransformationInfo=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
