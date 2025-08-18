package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n62 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k72 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n62(k72 k72Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = k72Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((n62) n((xeb) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n62 n62Var = new n62(this.Z, this.s0, continuation);
        n62Var.Y = obj;
        return n62Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        e52 e52VarO;
        tx3 tx3Var = tx3.a;
        int i = this.X;
        e5f e5fVar = e5f.a;
        if (i == 0) {
            od2.a0(obj);
            xeb xebVar = (xeb) this.Y;
            if (xebVar instanceof teb) {
                long j = ((teb) xebVar).a;
                k72 k72Var = this.Z;
                long j2 = k72Var.t.get();
                kld kldVar = k72Var.f;
                if (j == j2) {
                    k72Var.w.set(false);
                    e52 e52VarO2 = k72Var.o();
                    if (e52VarO2 == null) {
                        return e5fVar;
                    }
                    k72.m(k72Var, e52VarO2);
                    if (k72Var.j == qeb.c && e52VarO2.I()) {
                        qcb qcbVar = new qcb(this.s0);
                        this.X = 1;
                        if (kldVar.a(qcbVar, this) == tx3Var) {
                            return tx3Var;
                        }
                    }
                } else if (j == k72Var.v.get()) {
                    e52 e52VarO3 = k72Var.o();
                    if (e52VarO3 == null) {
                        return e5fVar;
                    }
                    k72.m(k72Var, e52VarO3);
                    ucb ucbVar = new ucb(new eqe(vea.w2), new Integer(woc.z), 6);
                    this.X = 2;
                    if (kldVar.a(ucbVar, this) == tx3Var) {
                        return tx3Var;
                    }
                } else {
                    if (j != k72Var.u.get() || (e52VarO = k72Var.o()) == null) {
                        return e5fVar;
                    }
                    k72.m(k72Var, e52VarO);
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5fVar;
    }
}
