package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class b47 implements thc, hab {
    public final uhc a;
    public final hab b;
    public final uhc c;
    public final thc d;

    public b47(p06 p06Var, thc thcVar) {
        this.a = p06Var;
        this.b = thcVar;
        this.c = p06Var;
        this.d = thcVar;
    }

    @Override // defpackage.hab
    public final void a(eab eabVar, String str, Map map) {
        uhc uhcVar = this.a;
        if (uhcVar != null) {
            uhcVar.i(((oj0) eabVar).b, str, map);
        }
        hab habVar = this.b;
        if (habVar != null) {
            habVar.a(eabVar, str, map);
        }
    }

    @Override // defpackage.hab
    public final void b(eab eabVar) {
        uhc uhcVar = this.a;
        if (uhcVar != null) {
            uhcVar.g(((oj0) eabVar).b);
        }
        hab habVar = this.b;
        if (habVar != null) {
            habVar.b(eabVar);
        }
    }

    @Override // defpackage.thc
    public final void c(eab eabVar) {
        uhc uhcVar = this.c;
        if (uhcVar != null) {
            oj0 oj0Var = (oj0) eabVar;
            boolean zG = oj0Var.g();
            uhcVar.b(oj0Var.a, oj0Var.o, oj0Var.b, zG);
        }
        thc thcVar = this.d;
        if (thcVar != null) {
            thcVar.c(eabVar);
        }
    }

    @Override // defpackage.hab
    public final void d(eab eabVar, String str, Throwable th, Map map) {
        uhc uhcVar = this.a;
        if (uhcVar != null) {
            uhcVar.j(((oj0) eabVar).b, str, th, map);
        }
        hab habVar = this.b;
        if (habVar != null) {
            habVar.d(eabVar, str, th, map);
        }
    }

    @Override // defpackage.hab
    public final void e(eab eabVar, String str, boolean z) {
        uhc uhcVar = this.a;
        if (uhcVar != null) {
            uhcVar.f(((oj0) eabVar).b, str, z);
        }
        hab habVar = this.b;
        if (habVar != null) {
            habVar.e(eabVar, str, z);
        }
    }

    @Override // defpackage.thc
    public final void f(eab eabVar, Throwable th) {
        uhc uhcVar = this.c;
        if (uhcVar != null) {
            oj0 oj0Var = (oj0) eabVar;
            uhcVar.c(oj0Var.a, oj0Var.b, th, oj0Var.g());
        }
        thc thcVar = this.d;
        if (thcVar != null) {
            thcVar.f(eabVar, th);
        }
    }

    @Override // defpackage.thc
    public final void g(eab eabVar) {
        uhc uhcVar = this.c;
        if (uhcVar != null) {
            oj0 oj0Var = (oj0) eabVar;
            uhcVar.a(oj0Var.a, oj0Var.b, oj0Var.g());
        }
        thc thcVar = this.d;
        if (thcVar != null) {
            thcVar.g(eabVar);
        }
    }

    @Override // defpackage.thc
    public final void h(eab eabVar) {
        uhc uhcVar = this.c;
        if (uhcVar != null) {
            uhcVar.k(((oj0) eabVar).b);
        }
        thc thcVar = this.d;
        if (thcVar != null) {
            thcVar.h(eabVar);
        }
    }

    @Override // defpackage.hab
    public final boolean i(eab eabVar, String str) {
        uhc uhcVar = this.a;
        Boolean boolValueOf = uhcVar != null ? Boolean.valueOf(uhcVar.h(((oj0) eabVar).b)) : null;
        if (!tpa.f(boolValueOf, Boolean.TRUE)) {
            hab habVar = this.b;
            boolValueOf = habVar != null ? Boolean.valueOf(habVar.i(eabVar, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // defpackage.hab
    public final void j(eab eabVar, String str) {
        uhc uhcVar = this.a;
        if (uhcVar != null) {
            uhcVar.d(((oj0) eabVar).b, str);
        }
        hab habVar = this.b;
        if (habVar != null) {
            habVar.j(eabVar, str);
        }
    }

    @Override // defpackage.hab
    public final void k(eab eabVar, String str) {
        uhc uhcVar = this.a;
        if (uhcVar != null) {
            uhcVar.e(((oj0) eabVar).b, str);
        }
        hab habVar = this.b;
        if (habVar != null) {
            habVar.k(eabVar, str);
        }
    }
}
