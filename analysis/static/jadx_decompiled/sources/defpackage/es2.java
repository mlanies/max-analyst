package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class es2 extends ffe implements a66 {
    public final /* synthetic */ ks2 X;
    public final /* synthetic */ zy3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public es2(ks2 ks2Var, zy3 zy3Var, Continuation continuation) {
        super(2, continuation);
        this.X = ks2Var;
        this.Y = zy3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        es2 es2Var = (es2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        es2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new es2(this.X, this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ks2.q(this.X, ((yy3) this.Y).b);
        return e5f.a;
    }
}
