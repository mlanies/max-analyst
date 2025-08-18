package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import one.me.android.di.ConcurrentComponent;

/* loaded from: classes.dex */
public final class ul9 implements z2a {
    public static final ul9 a = new ul9();
    public static final ContextScope b = j1e.a(((w9a) ConcurrentComponent.INSTANCE.getDispatchers()).a().limitedParallelism(1, "mytracker").plus(pag.a()));
    public static final kld c;
    public static final v7c d;

    static {
        kld kldVarB = lld.b(1, 0, 2, 2);
        c = kldVarB;
        d = new v7c(kldVarB);
    }
}
