package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bg3 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cg3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg3(cg3 cg3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cg3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bg3 bg3Var = (bg3) n((wm9) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bg3Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bg3 bg3Var = new bg3(this.Y, continuation);
        bg3Var.X = obj;
        return bg3Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        pnf.o(this.Y.X, (wm9) this.X);
        return e5f.a;
    }
}
