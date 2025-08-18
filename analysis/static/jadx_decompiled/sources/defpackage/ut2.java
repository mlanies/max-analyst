package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ut2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wt2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut2(wt2 wt2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = wt2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ut2 ut2Var = (ut2) n((at5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ut2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ut2 ut2Var = new ut2(this.Y, continuation);
        ut2Var.X = obj;
        return ut2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.c.setValue((at5) this.X);
        return e5f.a;
    }
}
