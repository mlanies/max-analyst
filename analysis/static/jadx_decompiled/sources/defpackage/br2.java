package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class br2 extends ol implements lme, hua {
    public final boolean X;
    public final long o;

    public br2(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.X = z;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatSubscribe chatSubscribe = new Tasks.ChatSubscribe();
        chatSubscribe.requestId = this.a;
        chatSubscribe.chatServerId = this.o;
        chatSubscribe.subscribe = this.X;
        return qw8.toByteArray(chatSubscribe);
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
        return iua.F0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        tq2 tq2Var = new tq2((sla) null, 1);
        tq2Var.i(this.o, ApiProtocol.PARAM_CHAT_ID);
        tq2Var.d("subscribe", this.X);
        return tq2Var;
    }
}
