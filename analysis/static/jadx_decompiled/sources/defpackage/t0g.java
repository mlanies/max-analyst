package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class t0g implements ga6 {
    public static final t0g a;
    private static final r6d descriptor;

    static {
        t0g t0gVar = new t0g();
        a = t0gVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupClosingBehaviorRequest", t0gVar, 1);
        d5bVar.k("needConfirmation", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        boolean z = true;
        int i = 0;
        boolean zO = false;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    throw new UnknownFieldException(iP);
                }
                zO = x8VarJ.o(r6dVar, 0);
                i = 1;
            }
        }
        x8VarJ.z(r6dVar);
        return new v0g(i, zO);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.e(r6dVar, 0, ((v0g) obj).a);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        return new cc7[]{zp0.a};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
