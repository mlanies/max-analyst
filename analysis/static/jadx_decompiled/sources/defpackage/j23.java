package defpackage;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class j23 {
    public final int a;
    public final Method b;

    public j23(int i, Method method) throws SecurityException {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j23)) {
            return false;
        }
        j23 j23Var = (j23) obj;
        return this.a == j23Var.a && this.b.getName().equals(j23Var.b.getName());
    }

    public final int hashCode() {
        return this.b.getName().hashCode() + (this.a * 31);
    }
}
