package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class hp4 extends ol implements hua, lme {
    public final uaa X;
    public final String Y;
    public final long o;

    public hp4(long j, long j2, uaa uaaVar) {
        super(j);
        this.o = j2;
        this.X = uaaVar;
        this.Y = hp4.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        e52 e52VarC = m().C(this.o);
        String str = this.Y;
        if (e52VarC == null) {
            hm9.n(str, "onPreExecute: No chat. remove task");
            return 3;
        }
        uaa uaaVar = this.X;
        if (uaaVar == null) {
            hm9.n(str, "onPreExecute: could not deserialize draft, remove task");
            return 3;
        }
        if (t20.a(uaaVar.a())) {
            return 1;
        }
        hm9.n(str, "onPreExecute: Attaches not ready. skip task");
        return 2;
    }

    @Override // defpackage.hua
    public final void d() {
        hm9.p(this.Y, "onMaxFailCount", null);
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        ip4 ip4Var = (ip4) gleVar;
        String str = this.Y;
        hm9.n(str, "onSuccess: " + ip4Var);
        p82 p82VarM = m();
        long j = this.o;
        e52 e52VarC = p82VarM.C(j);
        if (e52VarC == null) {
            hm9.n(str, "onSuccess: No chat. return");
            return;
        }
        k92 k92Var = e52VarC.b;
        uaa uaaVar = k92Var.f0;
        long j2 = k92Var.g0;
        if (uaaVar == null && j2 > ip4Var.c) {
            hm9.m0(str, "onSuccess: draft was discarded", new Object[0]);
            return;
        }
        if (j2 > ip4Var.c) {
            hm9.m0(str, "local draft time more than response, ignore!", new Object[0]);
            return;
        }
        uaa uaaVar2 = this.X;
        if (uaaVar2 == null) {
            hm9.m0(str, "could not deserialize draft", new Object[0]);
            m().p(j);
            return;
        }
        p82 p82VarM2 = m();
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        p82VarM2.k(this.o, ip4Var.c, ((jp4) plVar.S.getValue()).a(uaaVar2, Long.valueOf(ip4Var.c)));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.DraftSave draftSave = new Tasks.DraftSave();
        draftSave.requestId = this.a;
        draftSave.chatId = this.o;
        draftSave.draft = gp4.b(this.X);
        return qw8.toByteArray(draftSave);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (f46.U(pkeVar.b)) {
            return;
        }
        d();
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.X0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        long jLongValue;
        e52 e52VarC = m().C(this.o);
        sla slaVar = null;
        String str = this.Y;
        if (e52VarC == null) {
            hm9.n(str, "createRequest: No chat. return null");
            return null;
        }
        uaa uaaVar = this.X;
        if (uaaVar == null) {
            hm9.m0(str, "could not deserialize draft", new Object[0]);
            return null;
        }
        if (e52VarC.M()) {
            uj3 uj3VarL = e52VarC.l();
            Long lValueOf = uj3VarL != null ? Long.valueOf(uj3VarL.n()) : null;
            if (lValueOf == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        n7d n7dVarF = ((jp4) plVar.S.getValue()).f(uaaVar);
        long j = jLongValue == 0 ? e52VarC.b.a : 0L;
        tq2 tq2Var = new tq2(slaVar, 12);
        if (jLongValue != 0) {
            tq2Var.i(jLongValue, "userId");
        }
        if (j != 0) {
            tq2Var.i(j, ApiProtocol.PARAM_CHAT_ID);
        }
        tq2Var.n("draft", n7dVarF.a());
        return tq2Var;
    }
}
