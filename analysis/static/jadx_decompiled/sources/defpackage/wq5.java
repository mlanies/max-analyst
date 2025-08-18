package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class wq5 implements ypb {
    public static final int a = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public static wq5 a(Object... objArr) {
        if (objArr.length == 0) {
            return fr5.b;
        }
        if (objArr.length != 1) {
            return new gr5(1, objArr);
        }
        Object obj = objArr[0];
        Objects.requireNonNull(obj, "item is null");
        return new sr5(obj);
    }

    public final void c(gs5 gs5Var) {
        Objects.requireNonNull(gs5Var, "subscriber is null");
        try {
            g(gs5Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            c37.B(th);
            j47.Z(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final void d(vae vaeVar) {
        if (vaeVar instanceof gs5) {
            c((gs5) vaeVar);
        } else {
            Objects.requireNonNull(vaeVar, "subscriber is null");
            c(new k9e(vaeVar));
        }
    }

    public abstract void g(vae vaeVar);
}
