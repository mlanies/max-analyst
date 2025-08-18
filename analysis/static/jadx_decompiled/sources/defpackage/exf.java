package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class exf implements ga6 {
    public static final exf a;
    private static final r6d descriptor;

    static {
        exf exfVar = new exf();
        a = exfVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.download.WebAppDownloadFileRequest", exfVar, 3);
        d5bVar.k("requestId", false);
        d5bVar.k("url", false);
        d5bVar.k("file_name", false);
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
        String strW3 = null;
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
                strW3 = x8VarJ.w(r6dVar, 2);
                i |= 4;
            }
        }
        x8VarJ.z(r6dVar);
        return new gxf(strW, i, strW2, strW3);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        gxf gxfVar = (gxf) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.n(r6dVar, 0, gxfVar.a);
        xu3VarB.n(r6dVar, 1, gxfVar.b);
        xu3VarB.n(r6dVar, 2, gxfVar.c);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        s9e s9eVar = s9e.a;
        return new cc7[]{s9eVar, s9eVar, s9eVar};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
