package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class am3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ jm3 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am3(jm3 jm3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = jm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((am3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new am3(this.Y, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        tx3 tx3Var = tx3.a;
        int i = this.X;
        if (i == 0) {
            od2.a0(obj);
            jm3 jm3Var = this.Y;
            kld kldVar = jm3Var.d;
            iv4 iv4VarC = jm3Var.c();
            meb mebVar = (meb) jm3Var.b.getValue();
            boolean z = (mebVar == null || mebVar.a == null) ? false : true;
            iv4VarC.getClass();
            eqe eqeVar = new eqe(vea.n);
            kl7 kl7VarL = j1e.l();
            kl7VarL.add(new mg3(sea.Y, new eqe(vea.o1), 3, false));
            kl7VarL.add(new mg3(sea.a0, new eqe(vea.s), 3, false));
            kl7VarL.add(new mg3(sea.Z, new eqe(vea.r), 3, false));
            if (z) {
                kl7VarL.add(new mg3(sea.X, new eqe(vea.o), 1, false));
            }
            kl7VarL.add(new mg3(sea.W, new eqe(vea.k), 2, false));
            rfb rfbVar = new rfb(eqeVar, null, j1e.d(kl7VarL));
            this.X = 1;
            if (kldVar.a(rfbVar, this) == tx3Var) {
                return tx3Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            od2.a0(obj);
        }
        return e5f.a;
    }
}
