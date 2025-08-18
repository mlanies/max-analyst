package defpackage;

/* loaded from: classes.dex */
public abstract class vs {
    public static final int a;

    static {
        Object njcVar;
        try {
            njcVar = dae.e0(System.getProperty("kotlinx.serialization.json.pool.size"));
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        Integer num = (Integer) njcVar;
        a = num != null ? num.intValue() : 2097152;
    }
}
