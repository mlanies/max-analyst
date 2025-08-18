package defpackage;

import one.me.sdk.tasks.chat.InvalidChatMarkException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class pd2 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;
    public final boolean s0;
    public final boolean t0;
    public final String u0;

    public pd2(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
        this.s0 = z2;
        this.t0 = z3;
        this.u0 = pd2.class.getName();
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00aa, code lost:
    
        if (r10 < (r0.q(ru.ok.tamtam.android.prefs.PmsKey.f113setunreadtimeout, 31536000) * 1000)) goto L40;
     */
    @Override // defpackage.hua
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c() {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd2.c():int");
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        es8 es8Var;
        qd2 qd2Var = (qd2) gleVar;
        e52 e52VarZ = m().z(this.o);
        if (qd2Var.X != null) {
            String str = this.u0;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Y, str, "reaction read result " + qd2Var.X + "!", null);
            }
        }
        if (this.t0 && qd2Var.X == null) {
            hm9.m0(this.u0, "invalid response for isReadReaction=true: " + qd2Var, new Object[0]);
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            ((cba) ((o45) plVar.u.getValue())).c(new InvalidChatMarkException("READ_REACTION but success is missed"), true);
        }
        long j = qd2Var.c;
        if (j < 0) {
            hm9.m0(this.u0, "response.mark is negative " + qd2Var, new Object[0]);
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            o45 o45Var = (o45) plVar2.u.getValue();
            long j2 = this.o;
            long j3 = this.X;
            StringBuilder sbK = au1.k(j2, "mark is negative chat_id=", ",orig=");
            sbK.append(j3);
            sbK.append(",mark=");
            sbK.append(j);
            ((cba) o45Var).c(new InvalidChatMarkException(sbK.toString()), true);
            j = this.X;
        }
        if (j < this.X && !this.Z) {
            hm9.n(this.u0, "onSuccess, received read mark less than our read mark");
        } else if (e52VarZ != null) {
            m().p0(e52VarZ.a, ((p7b) r()).a.t(), j, qd2Var.o, true);
        }
        if (e52VarZ == null || qd2Var.o <= 0 || (es8Var = e52VarZ.c) == null || es8Var.a.o != j) {
            return;
        }
        pl plVar3 = this.c;
        hc2.a((hc2) (plVar3 != null ? plVar3 : null).K.getValue(), e52VarZ.a, e52VarZ.b.a, e52VarZ.c.a.o, 0L, mg4.REGULAR);
        ((k4a) j()).j(e52VarZ.b.a);
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatMark chatMark = new Tasks.ChatMark();
        chatMark.requestId = this.a;
        chatMark.chatId = 0L;
        chatMark.chatServerId = this.o;
        chatMark.mark = this.X;
        chatMark.messageId = this.Y;
        chatMark.setAsUnread = this.Z;
        chatMark.awaitChatInCache = this.s0;
        chatMark.isReadReaction = this.t0;
        return qw8.toByteArray(chatMark);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        l().c(new oi0(this.a, pkeVar));
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
        return iua.x0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au(sla.O0, 24);
        auVar.i(this.o, ApiProtocol.PARAM_CHAT_ID);
        auVar.i(this.X, "mark");
        long j = this.Y;
        if (j != -1) {
            auVar.i(j, "messageId");
        }
        auVar.p("type", this.Z ? "SET_AS_UNREAD" : this.t0 ? "READ_REACTION" : "READ_MESSAGE");
        return auVar;
    }
}
