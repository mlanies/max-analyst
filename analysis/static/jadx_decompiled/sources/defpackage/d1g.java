package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class d1g implements ga6 {
    public static final d1g a;
    private static final r6d descriptor;

    static {
        d1g d1gVar = new d1g();
        a = d1gVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.WebAppShareRequest", d1gVar, 3);
        d5bVar.k("url", true);
        d5bVar.k("title", true);
        d5bVar.k("text", true);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        String str = null;
        boolean z = true;
        int i = 0;
        String str2 = null;
        String str3 = null;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else if (iP == 0) {
                s9e s9eVar = s9e.a;
                str = (String) x8VarJ.s(r6dVar, 0, str);
                i |= 1;
            } else if (iP == 1) {
                s9e s9eVar2 = s9e.a;
                str2 = (String) x8VarJ.s(r6dVar, 1, str2);
                i |= 2;
            } else {
                if (iP != 2) {
                    throw new UnknownFieldException(iP);
                }
                s9e s9eVar3 = s9e.a;
                str3 = (String) x8VarJ.s(r6dVar, 2, str3);
                i |= 4;
            }
        }
        x8VarJ.z(r6dVar);
        return new f1g(str, i, str2, str3);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        f1g f1gVar = (f1g) obj;
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        boolean zW = xu3VarB.w();
        String str = f1gVar.a;
        if (zW || str != null) {
            s9e s9eVar = s9e.a;
            xu3VarB.i(r6dVar, 0, str);
        }
        boolean zW2 = xu3VarB.w();
        String str2 = f1gVar.b;
        if (zW2 || str2 != null) {
            s9e s9eVar2 = s9e.a;
            xu3VarB.i(r6dVar, 1, str2);
        }
        boolean zW3 = xu3VarB.w();
        String str3 = f1gVar.c;
        if (zW3 || str3 != null) {
            s9e s9eVar3 = s9e.a;
            xu3VarB.i(r6dVar, 2, str3);
        }
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        s9e s9eVar = s9e.a;
        return new cc7[]{br7.C(), br7.C(), br7.C()};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
