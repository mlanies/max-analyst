package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qg7 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rg7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg7(rg7 rg7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = rg7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        qg7 qg7Var = (qg7) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        qg7Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        qg7 qg7Var = new qg7(this.Y, continuation);
        qg7Var.X = obj;
        return qg7Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        sx3 sx3Var = (sx3) this.X;
        rg7 rg7Var = this.Y;
        if (rg7Var.a.d.compareTo(fg7.b) >= 0) {
            rg7Var.a.a(rg7Var);
        } else {
            pag.d(sx3Var.getCoroutineContext());
        }
        return e5f.a;
    }
}
