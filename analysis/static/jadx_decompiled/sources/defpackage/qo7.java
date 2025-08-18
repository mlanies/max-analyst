package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class qo7 {
    public final long a;
    public final float b;
    public final long c;

    public qo7(po7 po7Var) {
        this.a = po7Var.a;
        this.b = po7Var.b;
        this.c = po7Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qo7)) {
            return false;
        }
        qo7 qo7Var = (qo7) obj;
        return this.a == qo7Var.a && this.b == qo7Var.b && this.c == qo7Var.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Float.valueOf(this.b), Long.valueOf(this.c)});
    }
}
