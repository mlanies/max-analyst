package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class l72 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public l72(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
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
        t().d(this.a);
        p().y(this.o, this.Y, vx8.ACTIVE);
        p82 p82VarM = m();
        long j = this.o;
        p82VarM.w(j);
        l().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((u23) plVar.L.getValue()).a(this.o, this.Y);
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatClear chatClear = new Tasks.ChatClear();
        chatClear.requestId = this.a;
        chatClear.chatId = this.o;
        chatClear.chatServerId = this.X;
        chatClear.lastEventTime = this.Y;
        chatClear.forAll = this.Z;
        return qw8.toByteArray(chatClear);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (pkeVar instanceof gke) {
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
        return iua.v0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 14);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        auVar.i(this.Y, "lastEventTime");
        auVar.d("forAll", this.Z);
        return auVar;
    }
}
