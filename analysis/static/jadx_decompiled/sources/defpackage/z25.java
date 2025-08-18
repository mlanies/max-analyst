package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class z25 implements ga6 {
    public static final z25 a;
    private static final r6d descriptor;

    static {
        z25 z25Var = new z25();
        a = z25Var;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.ErrorResponse", z25Var, 2);
        d5bVar.k("requestId", false);
        d5bVar.k("error", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        String strW = null;
        boolean z = true;
        int i = 0;
        d35 d35Var = null;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strW = x8VarJ.w(r6dVar, 0);
                i |= 1;
            } else {
                if (iP != 1) {
                    throw new UnknownFieldException(iP);
                }
                d35Var = (d35) x8VarJ.t(r6dVar, 1, b35.a, d35Var);
                i |= 2;
            }
        }
        x8VarJ.z(r6dVar);
        return new e35(i, strW, d35Var);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        e35 e35Var = (e35) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.n(r6dVar, 0, e35Var.a);
        xu3VarB.k(r6dVar, 1, b35.a, e35Var.b);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        return new cc7[]{s9e.a, b35.a};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
