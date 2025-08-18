package defpackage;

import android.content.res.Resources;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class ff9 extends ol implements lme, hua, u5c {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final bx8 s0;
    public final String t0;

    public ff9(long j, long j2, long j3, long j4, long j5, bx8 bx8Var) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = bx8Var;
        this.t0 = ff9.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        au8 au8VarP = p();
        long j = this.X;
        cu8 cu8VarQ = au8VarP.q(j);
        p82 p82VarM = m();
        long j2 = this.o;
        e52 e52VarC = p82VarM.C(j2);
        Iterator it = t().h(this.a, iua.Z0).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = this.t0;
            if (!zHasNext) {
                if (cu8VarQ != null) {
                    if (cu8VarQ.v0 != vx8.DELETED && e52VarC != null && (e52VarC.C() || e52VarC.R())) {
                        if (this.Z == 0) {
                            hm9.n(str, "onPreExecute: message serverId == 0, REMOVE");
                            return 3;
                        }
                        if (e52VarC.b.a != 0 || m().P(e52VarC)) {
                            hm9.n(str, "onPreExecute, READY");
                            return 1;
                        }
                        hm9.n(str, "onPreExecute: chat serverId == 0, SKIP");
                        return 2;
                    }
                }
                hm9.n(str, "onPreExecute: message or chat not found, REMOVE");
                return 3;
            }
            ff9 ff9Var = (ff9) ((une) it.next()).f;
            if (ff9Var.o == j2 && ff9Var.X == j) {
                hm9.n(str, "onPreExecute: later react task found, REMOVE");
                return 3;
            }
        }
    }

    @Override // defpackage.hua
    public final void d() throws Resources.NotFoundException {
        ix8 ix8Var;
        t().d(this.a);
        cu8 cu8VarQ = p().q(this.X);
        if (cu8VarQ == null || (ix8Var = cu8VarQ.S0) == null) {
            return;
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        v5c v5cVarB = ((jx8) plVar.U.getValue()).b(this.s0.b);
        List list = ix8Var.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (tpa.f(((hx8) it.next()).a.b, v5cVarB)) {
                hm9.n(this.t0, "reactions, onMaxFailCount, remove reaction from message");
                return;
            }
        }
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        gf9 gf9Var = (gf9) gleVar;
        fx8 fx8Var = gf9Var.c;
        String str = this.t0;
        if (fx8Var == null) {
            av0 av0VarL = l();
            String str2 = gf9Var.o;
            if (str2 == null) {
                str2 = "server bug";
            }
            av0VarL.c(new oi0(this.a, new pke(str2, "", null)));
            hm9.m0(str, "onSuccess: its server bug!, skip", new Object[0]);
            return;
        }
        hm9.n(str, "reactions, reactTamTask onSuccess, reactionInfoTotalCount = " + fx8Var.b + "}");
        pl plVar = this.c;
        ((lx8) (plVar != null ? plVar : null).I.getValue()).f(this.o, Collections.singletonMap(Long.valueOf(this.Z), fx8Var));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.MsgReact msgReact = new Tasks.MsgReact();
        msgReact.requestId = this.a;
        msgReact.chatId = this.o;
        msgReact.chatServerId = this.Y;
        msgReact.messageId = this.X;
        msgReact.messageServerId = this.Z;
        bx8 bx8Var = this.s0;
        msgReact.reaction = bx8Var.b;
        msgReact.reactionType = bx8Var.a.ordinal();
        return qw8.toByteArray(msgReact);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        hm9.r(this.t0, pkeVar.X, "reactions, reactTamTask onFail: %s", pkeVar);
        l().c(new oi0(this.a, pkeVar));
        u5c.a(this, pkeVar);
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.Z0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        tq2 tq2Var = new tq2((sla) null, 24);
        long j = this.Z;
        if (j == 0) {
            throw new IllegalArgumentException("param messageId can't be 0");
        }
        bx8 bx8Var = this.s0;
        String str = bx8Var.b;
        if (str.length() == 0) {
            throw new IllegalArgumentException("param reaction.id can't be empty");
        }
        tq2Var.i(this.Y, ApiProtocol.PARAM_CHAT_ID);
        tq2Var.i(j, "messageId");
        tq2Var.n("reaction", mz7.a0(new kpa("reactionType", bx8Var.a.name()), new kpa("id", str)));
        return tq2Var;
    }
}
