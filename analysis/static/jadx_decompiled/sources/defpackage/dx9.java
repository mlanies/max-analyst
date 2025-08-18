package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class dx9 extends ffe implements g66 {
    public final /* synthetic */ gx9 X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx9(gx9 gx9Var, Continuation continuation) {
        super(5, continuation);
        this.X = gx9Var;
    }

    @Override // defpackage.g66
    public final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ((Boolean) obj3).getClass();
        ((Number) obj4).intValue();
        return new dx9(this.X, (Continuation) obj5).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        bc7[] bc7VarArr = gx9.C0;
        gx9 gx9Var = this.X;
        gx9Var.getClass();
        kl7 kl7VarL = j1e.l();
        boolean z = ((jp) gx9Var.q()).g.getLong("app.notification.dontDisturbUntil", 0L) == 0;
        eqe eqeVarR = gx9.r(((kxc) gx9Var.q()).p());
        eqe eqeVarR2 = gx9.r(((kxc) gx9Var.q()).o());
        boolean z2 = ((jp) gx9Var.q()).g.getBoolean("app.notification.show.text", true);
        kl7VarL.add(new vfd(dea.m, 0, new eqe(eea.j), null, null, null, new ffd(z, true), null, null, 0, null, 1976));
        if (z) {
            kl7VarL.add(new vfd(dea.k, 1, new eqe(eea.h), null, null, null, new dfd(eqeVarR, null), null, null, 0, null, 1976));
            kl7VarL.add(new vfd(dea.d, 1, new eqe(eea.c), null, null, null, new dfd(eqeVarR2, null), null, null, 0, null, 1976));
            long j = dea.s;
            eqe eqeVar = new eqe(eea.n);
            cfd cfdVar = cfd.a;
            kl7VarL.add(new vfd(j, 1, eqeVar, null, null, null, cfdVar, null, null, 0, null, 1976));
            kl7VarL.add(new vfd(dea.w, 0, new eqe(eea.q), null, null, null, new ffd(z2, true), null, null, 0, null, 1976));
            kl7VarL.add(new vfd(dea.o, 2, new eqe(eea.l), null, new eqe(eea.k), null, cfdVar, null, null, 0, null, 1832));
        }
        return j1e.d(kl7VarL);
    }
}
