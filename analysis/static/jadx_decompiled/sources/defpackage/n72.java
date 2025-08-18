package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class n72 extends ol implements lme, hua {
    public final long X;
    public final long o;

    public n72(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    @Override // defpackage.hua
    public final int c() {
        e52 e52VarC = m().C(this.o);
        if (e52VarC == null) {
            return 1;
        }
        i92 i92Var = e52VarC.b.c;
        return (i92Var == i92.o || i92Var == i92.X) ? 3 : 1;
    }

    @Override // defpackage.hua
    public final void d() {
        i92 i92Var;
        t().d(this.a);
        p82 p82VarM = m();
        long j = this.o;
        e52 e52VarC = p82VarM.C(j);
        if (e52VarC != null && ((i92Var = e52VarC.b.c) == i92.o || i92Var == i92.X)) {
            m().i(j, i92.a);
        }
        l().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        l().c(new vz2(Collections.singletonList(Long.valueOf(this.o)), true, false, null, null, 124));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatClose chatClose = new Tasks.ChatClose();
        chatClose.requestId = this.a;
        chatClose.chatId = this.o;
        chatClose.chatServerId = this.X;
        return qw8.toByteArray(chatClose);
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
        return iua.B0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 15);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        return auVar;
    }
}
