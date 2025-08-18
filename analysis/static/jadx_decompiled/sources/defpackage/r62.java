package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class r62 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k72 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r62(k72 k72Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k72Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        r62 r62Var = (r62) n((o22) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        r62Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        r62 r62Var = new r62(this.Y, continuation);
        r62Var.X = obj;
        return r62Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        o22 o22Var = (o22) this.X;
        k72 k72Var = this.Y;
        o22 o22Var2 = (o22) k72Var.i.getValue();
        if ((o22Var2 != null ? o22Var2.b : null) == n22.c) {
            k72Var.i.setValue(o22Var);
        }
        bc7[] bc7VarArr = k72.x;
        k72Var.d(k72Var.s());
        return e5f.a;
    }
}
