package defpackage;

import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;

/* loaded from: classes.dex */
public abstract class joe {
    public static final String a = SystemPropsKt.systemProp("kotlinx.coroutines.scheduler.default.name", "DefaultDispatcher");
    public static final long b = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 0L, 0L, 12, (Object) null);
    public static final int c;
    public static final int d;
    public static final long e;
    public static final qx7 f;
    public static final fm5 g;
    public static final fm5 h;

    static {
        int available_processors = SystemPropsKt.getAVAILABLE_PROCESSORS();
        c = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.core.pool.size", available_processors < 2 ? 2 : available_processors, 1, 0, 8, (Object) null);
        d = SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4, (Object) null);
        e = TimeUnit.SECONDS.toNanos(SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 0L, 0L, 12, (Object) null));
        f = qx7.X;
        g = new fm5(0, 10);
        h = new fm5(1, 10);
    }
}
