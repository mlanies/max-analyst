package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class p1b extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p1b p1bVar = (p1b) n((Collection) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p1bVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p1b p1bVar = new p1b(2, continuation);
        p1bVar.X = obj;
        return p1bVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((si9) ((yl4) n31.a.getAccessor().c(yl4.class)).c.getValue()).g((Collection) this.X);
        return e5f.a;
    }
}
