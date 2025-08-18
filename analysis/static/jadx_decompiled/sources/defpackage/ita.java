package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class ita {
    public final ax7 a;
    public final je7 b;
    public final je7 c;
    public final yo d = yo.a;

    public ita(ax7 ax7Var, je7 je7Var, je7 je7Var2) {
        this.a = ax7Var;
        this.b = je7Var2;
        this.c = je7Var;
    }

    public final ms7 a(zsa zsaVar, ky7 ky7Var) {
        e47 e47Var = new e47();
        e47Var.c = "PERF";
        e47Var.o = zsaVar.a;
        e47Var.b = ((hyc) ((q33) this.b.getValue())).t();
        e47Var.a = System.currentTimeMillis();
        e47Var.b(ky7Var);
        return e47Var.c();
    }

    public final ky7 b(boolean z, boolean z2, int i, int i2, List list) {
        kl7 kl7VarL = j1e.l();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bta btaVar = (bta) it.next();
            ky7 ky7Var = new ky7();
            ky7Var.put("name", btaVar.a.a);
            long j = btaVar.e;
            Long lValueOf = Long.valueOf(j);
            if (j == -1) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                ky7Var.put("duration", Long.valueOf(btaVar.e));
            }
            long j2 = btaVar.f;
            Long lValueOf2 = Long.valueOf(j2);
            if (j2 == -1) {
                lValueOf2 = null;
            }
            if (lValueOf2 != null) {
                ky7Var.put("span_id", Long.valueOf(btaVar.f));
            }
            long j3 = btaVar.g;
            if ((j3 != -1 ? Long.valueOf(j3) : null) != null) {
                ky7Var.put("parent_span_id", Long.valueOf(btaVar.g));
            }
            List<dta> list2 = btaVar.h;
            if (list2 != null) {
                for (dta dtaVar : list2) {
                    dtaVar.getClass();
                    ky7Var.put("hasData", dtaVar.a);
                }
            }
            kl7VarL.add(ky7Var.b());
        }
        kl7 kl7VarD = j1e.d(kl7VarL);
        ky7 ky7Var2 = new ky7();
        ky7Var2.put("session_id", Long.valueOf(((t33) ((q33) this.b.getValue())).F()));
        ky7Var2.put("start_type", z ? "cold" : "warm");
        if (z2) {
            ky7Var2.put("source", "push");
        }
        ky7Var2.put("trace_id", UUID.randomUUID().toString());
        ky7Var2.put("spans", kl7VarD);
        int i3 = 1;
        if (i != 1) {
            if (i != 2) {
                throw null;
            }
            i3 = 0;
        }
        ky7Var2.put("status", Integer.valueOf(i3));
        if (i2 != 0) {
            ky7Var2.put("errorType", Integer.valueOf(au1.s(i2)));
        }
        return ky7Var2.b();
    }

    public final void c() {
        this.d.getClass();
        if (yo.c) {
            cta ctaVar = cta.APP_INIT;
            qi9 qi9Var = yo.b;
            bta btaVar = (bta) qi9Var.f(ctaVar);
            eta etaVar = btaVar != null ? new eta(btaVar.e, x53.D0(new ky5(qi9Var))) : null;
            if (etaVar == null) {
                return;
            }
            ((ad) this.c.getValue()).j(a(zsa.APP_INIT, b(true, this.a.i, 1, 0, etaVar.a)));
            Iterator it = etaVar.a.iterator();
            while (it.hasNext()) {
                yo.b.i(((bta) it.next()).a);
            }
            yo.c = false;
        }
    }

    public final void d(int i, int i2) {
        this.d.getClass();
        boolean z = yo.c;
        ax7 ax7Var = this.a;
        boolean z2 = ax7Var.i;
        c();
        zsa zsaVar = zsa.EVENT_OPEN_CHAT;
        eta etaVarC = ax7Var.c(zsaVar);
        if (etaVarC == null) {
            return;
        }
        bta btaVar = new bta(cta.OPEN_CHAT_ROOT_SPAN, -1L);
        btaVar.e = etaVarC.b;
        List listSingletonList = Collections.singletonList(btaVar);
        List list = etaVarC.a;
        ((ad) this.c.getValue()).j(a(zsaVar, b(z, z2, i, i2, x53.t0(listSingletonList, list))));
        ax7Var.e(zsaVar, list);
    }

    public final void e(int i, int i2) {
        this.d.getClass();
        boolean z = yo.c;
        ax7 ax7Var = this.a;
        boolean z2 = ax7Var.i;
        c();
        zsa zsaVar = zsa.EVENT_OPEN_CHATS;
        eta etaVarC = ax7Var.c(zsaVar);
        if (etaVarC == null) {
            return;
        }
        bta btaVar = new bta(cta.OPEN_CHATS_ROOT_SPAN, -1L);
        btaVar.e = etaVarC.b;
        List listSingletonList = Collections.singletonList(btaVar);
        List list = etaVarC.a;
        ((ad) this.c.getValue()).j(a(zsaVar, b(z, z2, i, i2, x53.t0(listSingletonList, list))));
        ax7Var.e(zsaVar, list);
    }
}
