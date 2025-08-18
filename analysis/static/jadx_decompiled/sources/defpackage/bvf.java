package defpackage;

import java.util.List;
import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class bvf implements ga6 {
    public static final bvf a;
    private static final r6d descriptor;

    static {
        bvf bvfVar = new bvf();
        a = bvfVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.biometry.WebAppBiometryInfoResponse", bvfVar, 7);
        d5bVar.k("requestId", false);
        d5bVar.k("available", false);
        d5bVar.k("type", false);
        d5bVar.k("accessRequested", false);
        d5bVar.k("accessGranted", false);
        d5bVar.k("tokenSaved", false);
        d5bVar.k("deviceId", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        cc7[] cc7VarArr = dvf.h;
        int i = 0;
        boolean zO = false;
        boolean zO2 = false;
        boolean zO3 = false;
        boolean zO4 = false;
        String strW = null;
        List list = null;
        String strW2 = null;
        boolean z = true;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            switch (iP) {
                case -1:
                    z = false;
                    break;
                case 0:
                    strW = x8VarJ.w(r6dVar, 0);
                    i |= 1;
                    break;
                case 1:
                    zO = x8VarJ.o(r6dVar, 1);
                    i |= 2;
                    break;
                case 2:
                    list = (List) x8VarJ.t(r6dVar, 2, cc7VarArr[2], list);
                    i |= 4;
                    break;
                case 3:
                    zO2 = x8VarJ.o(r6dVar, 3);
                    i |= 8;
                    break;
                case 4:
                    zO3 = x8VarJ.o(r6dVar, 4);
                    i |= 16;
                    break;
                case 5:
                    zO4 = x8VarJ.o(r6dVar, 5);
                    i |= 32;
                    break;
                case 6:
                    strW2 = x8VarJ.w(r6dVar, 6);
                    i |= 64;
                    break;
                default:
                    throw new UnknownFieldException(iP);
            }
        }
        x8VarJ.z(r6dVar);
        return new dvf(i, strW, zO, list, zO2, zO3, zO4, strW2);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        dvf dvfVar = (dvf) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.n(r6dVar, 0, dvfVar.a);
        xu3VarB.e(r6dVar, 1, dvfVar.b);
        xu3VarB.k(r6dVar, 2, dvf.h[2], dvfVar.c);
        xu3VarB.e(r6dVar, 3, dvfVar.d);
        xu3VarB.e(r6dVar, 4, dvfVar.e);
        xu3VarB.e(r6dVar, 5, dvfVar.f);
        xu3VarB.n(r6dVar, 6, dvfVar.g);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        cc7 cc7Var = dvf.h[2];
        s9e s9eVar = s9e.a;
        zp0 zp0Var = zp0.a;
        return new cc7[]{s9eVar, zp0Var, cc7Var, zp0Var, zp0Var, zp0Var, s9eVar};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
