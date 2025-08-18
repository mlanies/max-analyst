package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fp8 extends ffe implements a66 {
    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fp8 fp8Var = (fp8) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fp8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fp8(2, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        return e5f.a;
    }
}
