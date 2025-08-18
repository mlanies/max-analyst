package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class q2e {
    public final pk a;
    public final o2e b;
    public final ztc c;
    public final fme d;

    public q2e(pk pkVar, o2e o2eVar, ztc ztcVar, fme fmeVar) {
        this.a = pkVar;
        this.b = o2eVar;
        this.c = ztcVar;
        this.d = fmeVar;
    }

    public final ds5 a(String str) {
        gs9 gs9Var = new gs9((sla) null, 10);
        if (oag.t(str)) {
            throw new IllegalStateException("token cannot be null");
        }
        gs9Var.p(ApiProtocol.KEY_TOKEN, str);
        rqd rqdVar = new rqd(new uqd(((k4a) this.a).K(gs9Var, this.c).h(new gd1(12, p2e.class)).h(new m2e(10)).h(new m2e(11)), new bqc(14, this), 0), new m2e(12), 1);
        fme fmeVar = this.d;
        fmeVar.getClass();
        return rqdVar.j(new dme(fmeVar, 3, 0));
    }
}
