package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class e45 {
    public final Object a;
    public final Method b;
    public final int c;
    public boolean d = true;

    public e45(Object obj, Method method) throws SecurityException {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        }
        if (method == null) {
            throw new NullPointerException("EventProducer method cannot be null.");
        }
        this.a = obj;
        this.b = method;
        method.setAccessible(true);
        this.c = obj.hashCode() + ((method.hashCode() + 31) * 31);
    }

    public final Object a() throws InvocationTargetException {
        if (!this.d) {
            throw new IllegalStateException(toString() + " has been invalidated and can no longer produce events.");
        }
        try {
            return this.b.invoke(this.a, null);
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof Error) {
                throw ((Error) e2.getCause());
            }
            throw e2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e45.class != obj.getClass()) {
            return false;
        }
        e45 e45Var = (e45) obj;
        return this.b.equals(e45Var.b) && this.a == e45Var.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return "[EventProducer " + this.b + "]";
    }
}
