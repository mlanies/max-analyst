package defpackage;

import com.my.tracker.MyTracker;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tl9 extends ffe implements a66 {
    public /* synthetic */ long X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tl9 tl9Var = (tl9) n(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tl9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tl9 tl9Var = new tl9(2, continuation);
        tl9Var.X = ((Number) obj).longValue();
        return tl9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        MyTracker.trackLoginEvent(String.valueOf(this.X), null);
        return e5f.a;
    }
}
