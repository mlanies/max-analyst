package defpackage;

import java.util.Arrays;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class dp4 extends ol implements hua, lme {
    public final long X;
    public final String Y;
    public final long o;

    public dp4(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = dp4.class.getName();
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        hm9.p(this.Y, "onMaxFailCount", null);
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        String str = this.Y;
        hm9.n(str, "onSuccess: " + gleVar);
        e52 e52VarC = m().C(this.o);
        if (e52VarC == null) {
            hm9.G(str, "no chat, ignore!", null);
            return;
        }
        k92 k92Var = e52VarC.b;
        if (k92Var.f0 == null) {
            hm9.G(str, "draft already is null, ignore!", null);
            m().k(this.o, this.X, null);
            return;
        }
        long j = k92Var.g0;
        if (j == 0) {
            hm9.G(str, "local draft not yet sync, ignore!", null);
            return;
        }
        long j2 = this.X;
        if (j < j2) {
            m().k(this.o, this.X, null);
            hm9.k0(str, null, "chat has server draft older than current DRAFT_DISCARD server time, diff = %d, clear it", Arrays.copyOf(new Object[]{Long.valueOf(j2 - j)}, 1));
        }
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.DraftDiscard draftDiscard = new Tasks.DraftDiscard();
        draftDiscard.requestId = this.a;
        draftDiscard.chatId = this.o;
        draftDiscard.serverTime = this.X;
        return qw8.toByteArray(draftDiscard);
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
        return iua.Y0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        long jLongValue;
        e52 e52VarC = m().C(this.o);
        sla slaVar = null;
        if (e52VarC == null) {
            hm9.n(this.Y, "createRequest: No chat. return null");
            return null;
        }
        if (e52VarC.M()) {
            uj3 uj3VarL = e52VarC.l();
            Long lValueOf = uj3VarL != null ? Long.valueOf(uj3VarL.n()) : null;
            if (lValueOf == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jLongValue == 0 ? e52VarC.b.a : 0L;
        tq2 tq2Var = new tq2(slaVar, 11);
        if (jLongValue != 0) {
            tq2Var.i(jLongValue, "userId");
        }
        if (j != 0) {
            tq2Var.i(j, ApiProtocol.PARAM_CHAT_ID);
        }
        long j2 = this.X;
        if (j2 != 0) {
            tq2Var.i(j2, "time");
        }
        return tq2Var;
    }
}
