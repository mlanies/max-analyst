package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class o72 extends ol implements lme, hua {
    public final da3 X;
    public final String Y;
    public final long o;

    public o72(long j, long j2, da3 da3Var) {
        super(j);
        this.o = j2;
        this.X = da3Var;
        this.Y = o72.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        i92 i92Var;
        e52 e52VarC = m().C(this.o);
        return (e52VarC == null || (i92Var = e52VarC.b.c) == i92.o || i92Var == i92.X) ? 3 : 1;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        l().c(new p72(this.a, this.o));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatComplain chatComplain = new Tasks.ChatComplain();
        chatComplain.requestId = this.a;
        chatComplain.chatId = this.o;
        da3 da3Var = this.X;
        chatComplain.complaint = da3Var == null ? "" : da3Var.a;
        return qw8.toByteArray(chatComplain);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (f46.U(pkeVar.b)) {
            return;
        }
        d();
        l().c(new oi0(pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.K0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        e52 e52VarC = m().C(this.o);
        if (e52VarC == null) {
            hm9.n(this.Y, "chat is null");
            return null;
        }
        long j = e52VarC.b.a;
        au auVar = new au((sla) null, 16);
        auVar.i(j, ApiProtocol.PARAM_CHAT_ID);
        da3 da3Var = this.X;
        if (da3Var != null) {
            auVar.p("complaint", da3Var.a);
        }
        return auVar;
    }
}
