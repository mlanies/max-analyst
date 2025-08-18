package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ys0 extends ffe implements a66 {
    public final /* synthetic */ ix X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys0(ix ixVar, Continuation continuation) {
        super(2, continuation);
        this.X = ixVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ys0 ys0Var = (ys0) n((on5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ys0Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ys0(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((AtomicBoolean) this.X.k).set(true);
        return e5f.a;
    }
}
