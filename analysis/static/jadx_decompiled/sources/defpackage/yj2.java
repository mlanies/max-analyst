package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yj2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ck2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj2(ck2 ck2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ck2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        yj2 yj2Var = (yj2) n((zc8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        yj2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        yj2 yj2Var = new yj2(this.Y, continuation);
        yj2Var.X = obj;
        return yj2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.I0.updateAndGet(new iz0(5, (zc8) this.X));
        return e5f.a;
    }
}
