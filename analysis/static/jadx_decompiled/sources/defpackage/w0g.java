package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class w0g implements ga6 {
    public static final w0g a;
    private static final r6d descriptor;

    static {
        w0g w0gVar = new w0g();
        a = w0gVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.system.WebAppSetupScreenCaptureBehaviorRequest", w0gVar, 2);
        d5bVar.k("requestId", false);
        d5bVar.k("isScreenCaptureEnabled", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        String strW = null;
        boolean z = true;
        int i = 0;
        boolean zO = false;
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
                zO = x8VarJ.o(r6dVar, 1);
                i |= 2;
            }
        }
        x8VarJ.z(r6dVar);
        return new y0g(strW, i, zO);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        y0g y0gVar = (y0g) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.n(r6dVar, 0, y0gVar.a);
        xu3VarB.e(r6dVar, 1, y0gVar.b);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        return new cc7[]{s9e.a, zp0.a};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
