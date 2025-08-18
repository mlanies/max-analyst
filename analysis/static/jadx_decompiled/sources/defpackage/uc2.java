package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class uc2 extends ol implements lme, hua {
    public final long X;
    public final long o;

    public uc2(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    @Override // defpackage.hua
    public final int c() {
        return m().C(this.o) != null ? 1 : 3;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        l().c(new vc2(this.a, this.o));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChannelLeave channelLeave = new Tasks.ChannelLeave();
        channelLeave.requestId = this.a;
        channelLeave.chatId = this.o;
        channelLeave.chatServerId = this.X;
        return qw8.toByteArray(channelLeave);
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
        return iua.A0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 23);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        return auVar;
    }
}
