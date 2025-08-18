package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class xt7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public xt7(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
    }

    public final void a(pke pkeVar) {
        ((p7b) ((m7b) this.a.getValue())).a.l("user.lastSentLogTime", 0L);
        ((p7b) ((m7b) this.a.getValue())).a.l("user.lastSentCriticalLogTime", 0L);
        hm9.q("xt7", "onLoginFail", pkeVar);
        if ("login.blocked".equals(pkeVar.b) || "login.flood".equals(pkeVar.b) || "login.token".equals(pkeVar.b)) {
            ((p7b) ((m7b) this.a.getValue())).a.m("server.loginError", pkeVar.b);
            ((f5a) this.b.getValue()).g(true);
            return;
        }
        if ("session.state".equals(pkeVar.b)) {
            hm9.n("xt7", "session state error: " + pkeVar.c + " do nothing");
            return;
        }
        if (pkeVar instanceof gke) {
            if (((f5a) this.b.getValue()).d() && ((jbd) ((hbd) this.d.getValue())).h == 2) {
                ((cu7) this.e.getValue()).q();
                return;
            }
            return;
        }
        if ("proto.state".equals(pkeVar.b)) {
            ((cba) ((o45) this.c.getValue())).c(new TamErrorException(pkeVar), true);
        }
        ((yle) this.f.getValue()).i();
    }
}
