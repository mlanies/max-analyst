package defpackage;

import java.util.HashMap;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class kf9 extends ol implements lme, hua {
    public final String X;
    public final long Y;
    public final long Z;
    public final String o;
    public final kv0 s0;
    public final nv0 t0;

    public kf9(long j, String str, String str2, long j2, long j3, kv0 kv0Var, nv0 nv0Var) {
        super(j);
        this.o = str;
        this.X = str2;
        this.Y = j2;
        this.Z = j3;
        this.s0 = kv0Var;
        this.t0 = nv0Var;
    }

    @Override // defpackage.hua
    public final int c() {
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    @Override // defpackage.lme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.gle r27) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kf9.e(gle):void");
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.MsgSendCallback msgSendCallback = new Tasks.MsgSendCallback();
        msgSendCallback.requestId = this.a;
        msgSendCallback.callbackId = this.o;
        msgSendCallback.payload = this.X;
        msgSendCallback.timestamp = this.Y;
        msgSendCallback.messageId = this.Z;
        msgSendCallback.buttonType = this.t0.a;
        Tasks.MsgSendCallback.ButtonPosition buttonPosition = new Tasks.MsgSendCallback.ButtonPosition();
        kv0 kv0Var = this.s0;
        buttonPosition.row = kv0Var.a;
        buttonPosition.column = kv0Var.b;
        msgSendCallback.buttonPosition = buttonPosition;
        return qw8.toByteArray(msgSendCallback);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (f46.U(pkeVar.b)) {
            u(true);
            return;
        }
        d();
        u(false);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        cu8 cu8VarQ = plVar.d().q(this.Z);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED) {
                pl plVar2 = this.c;
                (plVar2 != null ? plVar2 : null).b().c(new cd8(pkeVar));
                return;
            }
        }
        d();
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.L0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        Long lValueOf = Long.valueOf(this.Y);
        String str = this.t0.a;
        tq2 tq2Var = new tq2((sla) null, 27);
        tq2Var.p("callbackId", this.o);
        tq2Var.p(ApiProtocol.PARAM_PAYLOAD, this.X);
        ((HashMap) tq2Var.b).put("timestamp", lValueOf);
        if (str != null) {
            tq2Var.p("type", str);
        }
        return tq2Var;
    }

    public final void u(boolean z) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        au8 au8VarD = plVar.d();
        long j = this.Z;
        cu8 cu8VarQ = au8VarD.q(j);
        if (cu8VarQ != null) {
            if (cu8VarQ.v0 != vx8.DELETED) {
                pl plVar2 = this.c;
                if (plVar2 == null) {
                    plVar2 = null;
                }
                r79 r79Var = (r79) plVar2.x.getValue();
                xa1 xa1Var = new xa1(this, z, 3);
                r79Var.getClass();
                r79Var.a.n(j, new wp(xa1Var, r79Var));
                pl plVar3 = this.c;
                (plVar3 != null ? plVar3 : null).b().c(new l6f(cu8VarQ.t0, cu8VarQ.b, 0));
                return;
            }
        }
        d();
    }
}
