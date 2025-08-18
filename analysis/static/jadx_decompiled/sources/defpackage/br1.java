package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class br1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ir1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br1(ir1 ir1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ir1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        br1 br1Var = (br1) n((gg1) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        br1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        br1 br1Var = new br1(this.Y, continuation);
        br1Var.X = obj;
        return br1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        gg1 gg1Var = (gg1) this.X;
        ir1 ir1Var = this.Y;
        if (ir1Var.c().h) {
            ir1Var.i(gg1Var, true);
        } else {
            ir1Var.j(ir1Var.d().a.getId());
        }
        return e5f.a;
    }
}
