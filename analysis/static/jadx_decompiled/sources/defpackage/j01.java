package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j01 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k01 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(k01 k01Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k01Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        j01 j01Var = (j01) n((aa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        j01Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        j01 j01Var = new j01(this.Y, continuation);
        j01Var.X = obj;
        return j01Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.r((aa) this.X);
        return e5f.a;
    }
}
