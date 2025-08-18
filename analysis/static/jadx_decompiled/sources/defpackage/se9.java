package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class se9 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final mg4 Z;
    public final long o;
    public long s0;

    public se9(long j, long j2, long j3, long j4, mg4 mg4Var) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = mg4Var;
    }

    @Override // defpackage.hua
    public final int c() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        e52 e52VarC = plVar.c().C(this.o);
        if (e52VarC == null) {
            return 3;
        }
        this.s0 = e52VarC.b.a;
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

    @Override // defpackage.lme
    public final void e(gle gleVar) throws Throwable {
        te9 te9Var = (te9) gleVar;
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.d().b(this.o, this.X, this.Y);
        pl plVar2 = this.c;
        (plVar2 != null ? plVar2 : null).c().c0(Collections.singletonList(te9Var.c));
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.MsgDeleteRange msgDeleteRange = new Tasks.MsgDeleteRange();
        msgDeleteRange.requestId = this.a;
        msgDeleteRange.chatId = this.o;
        msgDeleteRange.startTime = this.X;
        msgDeleteRange.endTime = this.Y;
        msgDeleteRange.itemTypeId = this.Z.a;
        return qw8.toByteArray(msgDeleteRange);
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
        return iua.J0;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        long j = this.s0;
        tq2 tq2Var = new tq2(sla.c1, 19);
        tq2Var.i(j, ApiProtocol.PARAM_CHAT_ID);
        tq2Var.i(this.X, "startTime");
        tq2Var.i(this.Y, "endTime");
        tq2Var.p("itemType", this.Z.name());
        return tq2Var;
    }
}
