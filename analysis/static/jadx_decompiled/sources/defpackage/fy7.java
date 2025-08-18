package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fy7 extends ffe implements a66 {
    public final /* synthetic */ l84 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy7(l84 l84Var, Continuation continuation) {
        super(2, continuation);
        this.X = l84Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        fy7 fy7Var = (fy7) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        fy7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new fy7(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        q9b q9bVar = q9b.s0;
        q9b.s0.Y.a(new fdc(6, this.X));
        return e5f.a;
    }
}
