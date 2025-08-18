package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class q92 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public q92(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
    }

    @Override // defpackage.hua
    public final int c() {
        p82 p82VarM = m();
        long j = this.o;
        e52 e52VarC = p82VarM.C(j);
        if (e52VarC == null || e52VarC.b.c != i92.o) {
            return 1;
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((u23) plVar.L.getValue()).a(j, this.Y);
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        p82 p82VarM = m();
        i92 i92Var = i92.o;
        long j = this.o;
        p82VarM.i(j, i92Var);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((u23) plVar.L.getValue()).a(j, this.Y);
        l().c(new xfc(j));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatDelete chatDelete = new Tasks.ChatDelete();
        chatDelete.requestId = this.a;
        chatDelete.chatId = this.o;
        chatDelete.chatServerId = this.X;
        chatDelete.lastEventTime = this.Y;
        chatDelete.forAll = this.Z;
        return qw8.toByteArray(chatDelete);
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
        return iua.s0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 18);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        auVar.i(this.Y, "lastEventTime");
        auVar.d("forAll", this.Z);
        return auVar;
    }
}
