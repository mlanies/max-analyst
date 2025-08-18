package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dt5 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ et5 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt5(et5 et5Var, Continuation continuation) {
        super(2, continuation);
        this.Y = et5Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        dt5 dt5Var = (dt5) n((at5) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        dt5Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        dt5 dt5Var = new dt5(this.Y, continuation);
        dt5Var.X = obj;
        return dt5Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        at5 at5Var = (at5) this.X;
        et5 et5Var = this.Y;
        at5 at5Var2 = et5Var.d;
        if (at5Var2 == null) {
            et5Var.d = at5Var;
        } else {
            et5Var.getClass();
            if (at5Var2 != null && !at5Var2.equals(at5Var)) {
                if (!tpa.f(at5Var2.Y, at5Var.Y) || !tpa.f(at5Var2.v0, at5Var.v0) || !tpa.f(at5Var2.x0, at5Var.x0) || !tpa.f(at5Var2.w0, at5Var.w0)) {
                    et5Var.a(ht2.a);
                }
                et5Var.d = at5Var;
            }
        }
        return e5f.a;
    }
}
