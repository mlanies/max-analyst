package defpackage;

import kotlinx.serialization.UnknownFieldException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final /* synthetic */ class fwf implements ga6 {
    public static final fwf a;
    private static final r6d descriptor;

    static {
        fwf fwfVar = new fwf();
        a = fwfVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryUpdateTokenRequest", fwfVar, 4);
        d5bVar.k("queryId", false);
        d5bVar.k("requestId", false);
        d5bVar.k("reason", false);
        d5bVar.k(ApiProtocol.KEY_TOKEN, false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        int i = 0;
        String str = null;
        String strW = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                s9e s9eVar = s9e.a;
                str = (String) x8VarJ.s(r6dVar, 0, str);
                i |= 1;
            } else if (iP == 1) {
                strW = x8VarJ.w(r6dVar, 1);
                i |= 2;
            } else if (iP == 2) {
                s9e s9eVar2 = s9e.a;
                str2 = (String) x8VarJ.s(r6dVar, 2, str2);
                i |= 4;
            } else {
                if (iP != 3) {
                    throw new UnknownFieldException(iP);
                }
                s9e s9eVar3 = s9e.a;
                str3 = (String) x8VarJ.s(r6dVar, 3, str3);
                i |= 8;
            }
        }
        x8VarJ.z(r6dVar);
        return new hwf(i, str, strW, str2, str3);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        hwf hwfVar = (hwf) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        s9e s9eVar = s9e.a;
        xu3VarB.i(r6dVar, 0, hwfVar.a);
        xu3VarB.n(r6dVar, 1, hwfVar.b);
        xu3VarB.i(r6dVar, 2, hwfVar.c);
        xu3VarB.i(r6dVar, 3, hwfVar.d);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        return new cc7[]{br7.C(), s9e.a, br7.C(), br7.C()};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
