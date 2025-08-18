package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kh2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ gi2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh2(gi2 gi2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = gi2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        kh2 kh2Var = (kh2) n((zc8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        kh2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        kh2 kh2Var = new kh2(this.Y, continuation);
        kh2Var.X = obj;
        return kh2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.B0.updateAndGet(new iz0(5, (zc8) this.X));
        return e5f.a;
    }
}
