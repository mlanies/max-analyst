package defpackage;

import kotlinx.serialization.UnknownFieldException;

/* loaded from: classes2.dex */
public final /* synthetic */ class ayf implements ga6 {
    public static final ayf a;
    private static final r6d descriptor;

    static {
        ayf ayfVar = new ayf();
        a = ayfVar;
        d5b d5bVar = new d5b("one.me.webapp.domain.jsbridge.delegates.link.WebAppOpenLinkRequest", ayfVar, 1);
        d5bVar.k("url", false);
        descriptor = d5bVar;
    }

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) throws Throwable {
        r6d r6dVar = descriptor;
        x8 x8VarJ = x8Var.j(r6dVar);
        String strW = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int iP = x8VarJ.p(r6dVar);
            if (iP == -1) {
                z = false;
            } else {
                if (iP != 0) {
                    throw new UnknownFieldException(iP);
                }
                strW = x8VarJ.w(r6dVar, 0);
                i = 1;
            }
        }
        x8VarJ.z(r6dVar);
        return new cyf(i, strW);
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        r6d r6dVar = descriptor;
        xu3 xu3VarB = xu3Var.b(r6dVar);
        xu3VarB.n(r6dVar, 0, ((cyf) obj).a);
        xu3VarB.o();
    }

    @Override // defpackage.ga6
    public final cc7[] c() {
        return new cc7[]{s9e.a};
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return descriptor;
    }
}
