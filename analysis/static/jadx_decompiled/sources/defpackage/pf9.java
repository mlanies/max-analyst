package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class pf9 extends ol implements lme, hua {
    public final long X;
    public final String o;

    public pf9(long j, String str, long j2) {
        super(j);
        this.o = str;
        this.X = j2;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        t().d(this.a);
        ((k24) p().a).c.d().m(new b6f(this.X, null, 0));
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        qf9 qf9Var = (qf9) gleVar;
        long j = this.X;
        if (j == -1) {
            if (qf9Var.c.isEmpty()) {
                return;
            }
            l().c(new rp3(this.a, qf9Var.c));
            return;
        }
        cu8 cu8VarQ = p().q(j);
        boolean zIsEmpty = qf9Var.c.isEmpty();
        vx8 vx8Var = vx8.ACTIVE;
        String str = this.o;
        if (zIsEmpty || cu8VarQ == null) {
            ((k24) p().a).c.d().m(new b6f(j, null, 0));
            if (cu8VarQ != null) {
                String str2 = cu8VarQ.s0;
                if (!tpa.f(str2, str) && str2 != null && str != null && !w9e.p0(str2, str, false)) {
                    p().z(this.X, rh4.j(str2, "\n", str), null, m(), vx8Var);
                }
            }
        } else {
            wz wzVar = qf9Var.c;
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            p().w(cu8VarQ, iz7.g(wzVar, (vxc) plVar.F.getValue()));
            if (tpa.f(cu8VarQ.s0, str)) {
                p().z(this.X, null, null, m(), vx8Var);
            }
        }
        pl plVar2 = this.c;
        r9d.y((s8g) (plVar2 != null ? plVar2 : null).g.getValue());
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.MsgSharePreview msgSharePreview = new Tasks.MsgSharePreview();
        msgSharePreview.requestId = this.a;
        msgSharePreview.text = this.o;
        msgSharePreview.messageId = this.X;
        return qw8.toByteArray(msgSharePreview);
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
        return iua.D0;
    }

    @Override // defpackage.ol
    public final dle i() {
        tq2 tq2Var = new tq2((sla) null, 29);
        tq2Var.p("text", this.o);
        return tq2Var;
    }
}
