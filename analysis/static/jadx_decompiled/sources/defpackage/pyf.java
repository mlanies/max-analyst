package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class pyf implements ga6 {
    public static final pyf a;
    private static final r6d descriptor;

    static {
        pyf pyfVar = new pyf();
        a = pyfVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.phone.WebAppRequestPhoneResponse", pyfVar, 2);
        d5bVar.k("requestId", false);
        d5bVar.k("phone", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        String strW = null;
        boolean z = true;
        int i = 0;
        String strW2 = null;
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
                strW2 = x8VarJ.w(r6dVar, 1);
                i |= 2;
            }
        }
        x8VarJ.z(r6dVar);
        return new ryf(i, strW, strW2);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        ryf ryfVar = (ryf) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.n(r6dVar, 0, ryfVar.a);
        xu3VarB.n(r6dVar, 1, ryfVar.b);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        s9e s9eVar = s9e.a;
        return new cc7[]{s9eVar, s9eVar};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
