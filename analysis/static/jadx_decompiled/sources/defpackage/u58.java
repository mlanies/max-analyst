package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class u58 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ew1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u58(Continuation continuation, ew1 ew1Var) {
        super(2, continuation);
        this.Y = ew1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        u58 u58Var = (u58) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        u58Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        u58 u58Var = new u58(continuation, this.Y);
        u58Var.X = obj;
        return u58Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.setVisibility(((Boolean) this.X).booleanValue() ? 0 : 8);
        return e5f.a;
    }
}
