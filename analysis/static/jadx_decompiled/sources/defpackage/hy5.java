package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hy5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ m56 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy5(Continuation continuation, m56 m56Var) {
        super(2, continuation);
        this.Y = m56Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        hy5 hy5Var = (hy5) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        hy5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        hy5 hy5Var = new hy5(continuation, this.Y);
        hy5Var.X = obj;
        return hy5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.invoke((wm9) this.X);
        return e5f.a;
    }
}
