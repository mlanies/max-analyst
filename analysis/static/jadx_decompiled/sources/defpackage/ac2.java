package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class ac2 extends ol implements lme, hua {
    public final long X;
    public final String Y;
    public final long o;

    public ac2(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = ac2.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        return m().C(this.o) != null ? 1 : 3;
    }

    @Override // defpackage.hua
    public final void d() {
        long j = this.a;
        hm9.q(this.Y, "onMaxFailCount: remove task, requestId = %d", Long.valueOf(j));
        t().d(j);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        l().c(new vz2(Collections.singletonList(Long.valueOf(this.o)), true, false, null, null, 124));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatHide chatHide = new Tasks.ChatHide();
        chatHide.requestId = this.a;
        chatHide.chatId = this.o;
        chatHide.chatServerId = this.X;
        return qw8.toByteArray(chatHide);
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
        return iua.W0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 19);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        return auVar;
    }
}
