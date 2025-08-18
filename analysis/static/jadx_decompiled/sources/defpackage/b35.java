package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class b35 implements ga6 {
    public static final b35 a;
    private static final r6d descriptor;

    static {
        b35 b35Var = new b35();
        a = b35Var;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.ErrorResponse.Error", b35Var, 1);
        d5bVar.k("code", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        String strW = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    throw new UnknownFieldException(iP);
                }
                strW = x8VarJ.w(r6dVar, 0);
                i = 1;
            }
        }
        x8VarJ.z(r6dVar);
        return new d35(i, strW);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.n(r6dVar, 0, ((d35) obj).a);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        return new cc7[]{s9e.a};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
