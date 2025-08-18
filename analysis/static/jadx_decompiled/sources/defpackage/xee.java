package defpackage;

import java.util.Collections;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class xee extends ol implements lme, hua {
    public final long X;
    public final boolean Y;
    public final long o;

    public xee(long j, long j2, boolean z, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = z;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
        p82 p82VarM = m();
        p82VarM.getClass();
        l01 l01Var = new l01(false, 1);
        long j = this.o;
        p82VarM.h(j, false, l01Var);
        l().c(new vz2(Collections.singletonList(Long.valueOf(j)), false, false, null, null, 124));
        l().c(new ps3(Collections.singletonList(Long.valueOf(this.X))));
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.SuspendBot suspendBot = new Tasks.SuspendBot();
        suspendBot.requestId = this.a;
        suspendBot.chatId = this.o;
        suspendBot.botId = this.X;
        suspendBot.suspend = this.Y;
        return qw8.toByteArray(suspendBot);
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
        return iua.M0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        gs9 gs9Var = new gs9((sla) null, 12);
        gs9Var.i(this.X, "botId");
        gs9Var.d("value", this.Y);
        return gs9Var;
    }
}
