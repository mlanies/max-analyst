package defpackage;

import java.util.Collections;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class me9 extends ol implements lme, hua, u5c {
    public static final /* synthetic */ int s0 = 0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;

    public me9(long j, long j2, long j3, long j4, long j5) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
    }

    @Override // defpackage.hua
    public final int c() {
        au8 au8VarP = p();
        long j = this.X;
        cu8 cu8VarQ = au8VarP.q(j);
        p82 p82VarM = m();
        long j2 = this.o;
        e52 e52VarC = p82VarM.C(j2);
        Iterator it = t().h(this.a, iua.a1).iterator();
        while (it.hasNext()) {
            me9 me9Var = (me9) ((une) it.next()).f;
            if (me9Var.o == j2 && me9Var.X == j) {
                hm9.n("me9", "onPreExecute: later cancel_reaction task found, REMOVE");
                return 3;
            }
        }
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED && e52VarC != null && (e52VarC.C() || e52VarC.R())) {
                if (this.Z == 0) {
                    hm9.n("me9", "onPreExecute: message serverId == 0, REMOVE");
                    return 3;
                }
                if (e52VarC.b.a != 0 || m().P(e52VarC)) {
                    return 1;
                }
                hm9.n("me9", "onPreExecute: chat serverId == 0, SKIP");
                return 2;
            }
        }
        hm9.n("me9", "onPreExecute: message or chat not found, REMOVE");
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        fx8 fx8Var = ((ne9) gleVar).c;
        hm9.n("me9", "reactions, cancelTask onSuccess, reactionInfoTotalCount = " + (fx8Var != null ? Integer.valueOf(fx8Var.b) : null) + "}");
        pl plVar = this.c;
        ((lx8) (plVar != null ? plVar : null).I.getValue()).f(this.o, Collections.singletonMap(Long.valueOf(this.Z), fx8Var));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.MsgCancelReaction msgCancelReaction = new Tasks.MsgCancelReaction();
        msgCancelReaction.requestId = this.a;
        msgCancelReaction.chatId = this.o;
        msgCancelReaction.chatServerId = this.Y;
        msgCancelReaction.messageId = this.X;
        msgCancelReaction.messageServerId = this.Z;
        return qw8.toByteArray(msgCancelReaction);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        hm9.r("me9", pkeVar.X, "reactions, cancelTask onFail %s", pkeVar);
        l().c(new oi0(this.a, pkeVar));
        u5c.a(this, pkeVar);
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.a1;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        tq2 tq2Var = new tq2((sla) null, 17);
        long j = this.Z;
        if (j == 0) {
            throw new IllegalArgumentException("param messageId can't be 0".toString());
        }
        tq2Var.i(this.Y, ApiProtocol.PARAM_CHAT_ID);
        tq2Var.i(j, "messageId");
        return tq2Var;
    }
}
