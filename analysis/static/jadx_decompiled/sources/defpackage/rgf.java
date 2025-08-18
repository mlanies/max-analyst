package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rgf extends ffe implements a66 {
    public /* synthetic */ Object X;

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        rgf rgfVar = (rgf) n((Collection) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        rgfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rgf rgfVar = new rgf(2, continuation);
        rgfVar.X = obj;
        return rgfVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return e5f.a;
    }
}
