package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bi2 extends ffe implements a66 {
    public final /* synthetic */ gi2 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi2(gi2 gi2Var, Continuation continuation) {
        super(2, continuation);
        this.X = gi2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bi2 bi2Var = (bi2) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bi2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new bi2(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gi2.s(this.X);
        return e5f.a;
    }
}
