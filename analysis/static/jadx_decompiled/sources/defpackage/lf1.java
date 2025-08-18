package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class lf1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ of1 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf1(of1 of1Var, Continuation continuation) {
        super(2, continuation);
        this.Y = of1Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        lf1 lf1Var = (lf1) n((jb) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        lf1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        lf1 lf1Var = new lf1(this.Y, continuation);
        lf1Var.X = obj;
        return lf1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jb jbVar = (jb) this.X;
        boolean z = jbVar instanceof eb;
        of1 of1Var = this.Y;
        if (z) {
            pnf.o(of1Var.E0, wj1.k);
        } else if (jbVar instanceof fb) {
            pnf.o(of1Var.E0, wj1.l);
        } else if (jbVar instanceof ib) {
            pnf.o(of1Var.E0, wj1.m);
        } else if (jbVar instanceof bb) {
            pnf.o(of1Var.E0, wj1.n);
        } else if (jbVar instanceof gb) {
            pnf.o(of1Var.E0, wj1.o);
        }
        return e5f.a;
    }
}
