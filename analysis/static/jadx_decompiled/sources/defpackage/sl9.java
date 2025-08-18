package defpackage;

import com.my.tracker.MyTracker;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class sl9 extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        sl9 sl9Var = (sl9) n((Long) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        sl9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        sl9 sl9Var = new sl9(2, continuation);
        sl9Var.X = obj;
        return sl9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        MyTracker.getTrackerParams().setCustomUserId(String.valueOf(((Long) this.X).longValue()));
        return e5f.a;
    }
}
