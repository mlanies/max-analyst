package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final /* synthetic */ class wt0 extends p66 implements c66 {
    public static final wt0 a = new wt0(3, zt0.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);

    @Override // defpackage.c66
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        zt0 zt0Var = (zt0) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = zt0.o;
        zt0Var.getClass();
        if (obj3 == bu0.l) {
            obj3 = new g42(zt0Var.s());
        }
        return new i42(obj3);
    }
}
