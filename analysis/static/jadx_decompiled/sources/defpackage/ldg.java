package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class ldg {
    public final zk a;
    public final pe5 b;

    public /* synthetic */ ldg(zk zkVar, pe5 pe5Var) {
        this.a = zkVar;
        this.b = pe5Var;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ldg)) {
            ldg ldgVar = (ldg) obj;
            if (s36.l(this.a, ldgVar.a) && s36.l(this.b, ldgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        qz7 qz7Var = new qz7(this);
        qz7Var.h(this.a, "key");
        qz7Var.h(this.b, "feature");
        return qz7Var.toString();
    }
}
