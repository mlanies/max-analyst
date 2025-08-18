package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gk1 extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gk1 gk1Var = (gk1) n((Collection) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gk1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gk1 gk1Var = new gk1(2, continuation);
        gk1Var.X = obj;
        return gk1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((si9) ((yl4) n31.a.getAccessor().c(yl4.class)).c.getValue()).g((Collection) this.X);
        return e5f.a;
    }
}
