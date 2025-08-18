package defpackage;

import kotlinx.serialization.UnknownFieldException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final /* synthetic */ class ftf implements ga6 {
    public static final ftf a;
    private static final r6d descriptor;

    static {
        ftf ftfVar = new ftf();
        a = ftfVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryAuthResponse", ftfVar, 3);
        d5bVar.k("requestId", false);
        d5bVar.k(ApiProtocol.KEY_TOKEN, false);
        d5bVar.k("status", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        cc7[] cc7VarArr = htf.d;
        String strW = null;
        boolean z = true;
        int i = 0;
        String strW2 = null;
        wbe wbeVar = null;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                strW = x8VarJ.w(r6dVar, 0);
                i |= 1;
            } else if (iP == 1) {
                strW2 = x8VarJ.w(r6dVar, 1);
                i |= 2;
            } else {
                if (iP != 2) {
                    throw new UnknownFieldException(iP);
                }
                wbeVar = (wbe) x8VarJ.t(r6dVar, 2, cc7VarArr[2], wbeVar);
                i |= 4;
            }
        }
        x8VarJ.z(r6dVar);
        return new htf(i, strW, strW2, wbeVar);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        htf htfVar = (htf) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.n(r6dVar, 0, htfVar.a);
        xu3VarB.n(r6dVar, 1, htfVar.b);
        xu3VarB.k(r6dVar, 2, htf.d[2], htfVar.c);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        cc7 cc7Var = htf.d[2];
        s9e s9eVar = s9e.a;
        return new cc7[]{s9eVar, s9eVar, cc7Var};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
