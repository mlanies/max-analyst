package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class fy3 extends ffe implements a66 {
    public final /* synthetic */ Callable X;
    public final /* synthetic */ ry1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy3(Callable callable, sy1 sy1Var, Continuation continuation) {
        super(2, continuation);
        this.X = callable;
        this.Y = sy1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fy3 fy3Var = (fy3) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fy3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fy3(this.X, (sy1) this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        ry1 ry1Var = this.Y;
        od2.a0(obj);
        try {
            ry1Var.resumeWith(this.X.call());
        } catch (Throwable th) {
            ry1Var.resumeWith(new njc(th));
        }
        return e5f.a;
    }
}
