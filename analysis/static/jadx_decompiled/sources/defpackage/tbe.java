package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class tbe implements ga6 {
    public static final tbe a;
    private static final r6d descriptor;

    static {
        tbe tbeVar = new tbe();
        a = tbeVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.SuccessResponse", tbeVar, 2);
        d5bVar.k("status", false);
        d5bVar.k("requestId", true);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        cc7[] cc7VarArr = xbe.c;
        wbe wbeVar = null;
        boolean z = true;
        int i = 0;
        String str = null;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                wbeVar = (wbe) x8VarJ.t(r6dVar, 0, cc7VarArr[0], wbeVar);
                i |= 1;
            } else {
                if (iP != 1) {
                    throw new UnknownFieldException(iP);
                }
                s9e s9eVar = s9e.a;
                str = (String) x8VarJ.s(r6dVar, 1, str);
                i |= 2;
            }
        }
        x8VarJ.z(r6dVar);
        return new xbe(i, wbeVar, str);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        xbe xbeVar = (xbe) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.k(r6dVar, 0, xbe.c[0], xbeVar.a);
        boolean zW = xu3VarB.w();
        String str = xbeVar.b;
        if (zW || str != null) {
            s9e s9eVar = s9e.a;
            xu3VarB.i(r6dVar, 1, str);
        }
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        cc7 cc7Var = xbe.c[0];
        s9e s9eVar = s9e.a;
        return new cc7[]{cc7Var, br7.C()};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
