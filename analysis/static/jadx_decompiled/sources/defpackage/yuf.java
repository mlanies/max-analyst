package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class yuf implements ga6 {
    public static final yuf a;
    private static final r6d descriptor;

    static {
        yuf yufVar = new yuf();
        a = yufVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryGetInfoRequest", yufVar, 2);
        d5bVar.k("queryId", false);
        d5bVar.k("requestId", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        String str = null;
        boolean z = true;
        int i = 0;
        String strW = null;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                s9e s9eVar = s9e.a;
                str = (String) x8VarJ.s(r6dVar, 0, str);
                i |= 1;
            } else {
                if (iP != 1) {
                    throw new UnknownFieldException(iP);
                }
                strW = x8VarJ.w(r6dVar, 1);
                i |= 2;
            }
        }
        x8VarJ.z(r6dVar);
        return new avf(i, str, strW);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        avf avfVar = (avf) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        s9e s9eVar = s9e.a;
        xu3VarB.i(r6dVar, 0, avfVar.a);
        xu3VarB.n(r6dVar, 1, avfVar.b);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        return new cc7[]{br7.C(), s9e.a};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
