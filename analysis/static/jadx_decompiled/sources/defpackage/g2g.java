package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class g2g implements ga6 {
    public static final g2g a;
    private static final r6d descriptor;

    static {
        g2g g2gVar = new g2g();
        a = g2gVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.storage.WebAppStorageSaveKeyRequest", g2gVar, 4);
        d5bVar.k("queryId", false);
        d5bVar.k("requestId", false);
        d5bVar.k("key", false);
        d5bVar.k("value", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        int i = 0;
        String str = null;
        String strW = null;
        String strW2 = null;
        String str2 = null;
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
                strW2 = x8VarJ.w(r6dVar, 2);
                i |= 4;
            } else {
                if (iP != 3) {
                    throw new UnknownFieldException(iP);
                }
                s9e s9eVar2 = s9e.a;
                str2 = (String) x8VarJ.s(r6dVar, 3, str2);
                i |= 8;
            }
        }
        x8VarJ.z(r6dVar);
        return new i2g(i, str, strW, strW2, str2);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        i2g i2gVar = (i2g) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        s9e s9eVar = s9e.a;
        xu3VarB.i(r6dVar, 0, i2gVar.a);
        xu3VarB.n(r6dVar, 1, i2gVar.b);
        xu3VarB.n(r6dVar, 2, i2gVar.c);
        xu3VarB.i(r6dVar, 3, i2gVar.d);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        cc7 cc7VarC = br7.C();
        cc7 cc7VarC2 = br7.C();
        s9e s9eVar = s9e.a;
        return new cc7[]{cc7VarC, s9eVar, s9eVar, cc7VarC2};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
