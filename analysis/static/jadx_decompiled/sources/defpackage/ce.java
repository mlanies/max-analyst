package defpackage;

/* loaded from: classes.dex */
public abstract class ce {
    public static final ztc a;

    static {
        try {
            ztc ztcVar = (ztc) new ae(0).call();
            if (ztcVar == null) {
                throw new NullPointerException("Scheduler Callable returned null");
            }
            a = ztcVar;
        } catch (Throwable th) {
            throw q45.f(th);
        }
    }

    public static ztc a() {
        ztc ztcVar = a;
        if (ztcVar != null) {
            return ztcVar;
        }
        throw new NullPointerException("scheduler == null");
    }
}
