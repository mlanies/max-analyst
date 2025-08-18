package defpackage;

import java.util.Arrays;
import java.util.Locale;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class tr7 extends ol implements hua, lme {
    public final long X;
    public final String Y;
    public final long o;

    public tr7(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = tr7.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        cu8 cu8VarJ;
        StringBuilder sb = new StringBuilder("onPreExecute: serverChatId = ");
        long j = this.o;
        sb.append(j);
        sb.append(", serverMessageId = ");
        long j2 = this.X;
        sb.append(j2);
        hm9.n(this.Y, sb.toString());
        e52 e52VarZ = m().z(j);
        if (e52VarZ != null && (cu8VarJ = p().j(e52VarZ.a, j2)) != null) {
            if (cu8VarJ.v0 != vx8.DELETED) {
                return 1;
            }
        }
        return 3;
    }

    @Override // defpackage.hua
    public final void d() {
        hm9.p(this.Y, "onMaxFailCount", null);
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        ur7 ur7Var = (ur7) gleVar;
        e52 e52VarZ = m().z(this.o);
        if (e52VarZ != null) {
            au8 au8VarP = p();
            fs8 fs8Var = ur7Var.c;
            long jF = au8VarP.f(e52VarZ.a, ((p7b) r()).a.t(), fs8Var);
            if (jF != 0) {
                l().c(new l6f(e52VarZ.a, jF, 0));
            } else {
                hm9.p(this.Y, String.format(Locale.ENGLISH, "Can't insert message: response = %s", Arrays.copyOf(new Object[]{ur7Var}, 1)), null);
            }
        }
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.LocationStop locationStop = new Tasks.LocationStop();
        locationStop.requestId = this.a;
        locationStop.chatId = this.o;
        locationStop.messageId = this.X;
        return qw8.toByteArray(locationStop);
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
        return iua.R0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        tq2 tq2Var = new tq2((sla) null, 16);
        tq2Var.i(this.o, ApiProtocol.PARAM_CHAT_ID);
        tq2Var.i(this.X, "messageId");
        return tq2Var;
    }
}
