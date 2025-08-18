package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class pe9 extends ol implements lme, hua {
    public static final /* synthetic */ int w0 = 0;
    public final long X;
    public final List Y;
    public final List Z;
    public final long o;
    public final da3 s0;
    public final boolean t0;
    public final mg4 u0;
    public final boolean v0;

    public pe9(long j, long j2, long j3, List list, List list2, da3 da3Var, boolean z, mg4 mg4Var, boolean z2) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = list;
        this.Z = list2;
        this.s0 = da3Var;
        this.t0 = z;
        this.u0 = mg4Var;
        this.v0 = z2;
    }

    @Override // defpackage.hua
    public final int c() {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        return plVar.c().C(this.o) != null ? 1 : 3;
    }

    @Override // defpackage.hua
    public final void d() {
        hm9.n("pe9", "onMaxFailCount");
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.e().d(this.a);
        u(this.Y);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:137:0x04be  */
    @Override // defpackage.lme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.gle r104) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pe9.e(gle):void");
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.MsgDelete msgDelete = new Tasks.MsgDelete();
        msgDelete.requestId = this.a;
        msgDelete.chatId = this.o;
        msgDelete.chatServerId = this.X;
        msgDelete.messagesId = nd7.j(this.Y);
        msgDelete.messagesServerId = nd7.j(this.Z);
        msgDelete.forMe = this.t0;
        msgDelete.itemTypeId = this.u0.a;
        msgDelete.notDeleteMessageFromDb = this.v0;
        da3 da3Var = this.s0;
        if (da3Var != null) {
            msgDelete.complaint = da3Var.a;
        }
        return qw8.toByteArray(msgDelete);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (f46.U(pkeVar.b)) {
            return;
        }
        d();
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.b().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.c;
    }

    @Override // defpackage.hua
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.ol
    public final dle i() {
        pl plVar = this.c;
        tq2 tq2Var = null;
        if (plVar == null) {
            plVar = null;
        }
        e52 e52VarC = plVar.c().C(this.o);
        if (e52VarC != null) {
            boolean z = !e52VarC.I() && this.t0;
            tq2Var = new tq2(sla.a1, 18);
            tq2Var.i(this.X, ApiProtocol.PARAM_CHAT_ID);
            tq2Var.g("messageIds", x53.D0(this.Z));
            da3 da3Var = this.s0;
            if (da3Var != null) {
                tq2Var.p("complaint", da3Var.a);
            }
            tq2Var.d("forMe", z);
            tq2Var.p("itemType", this.u0.name());
        }
        return tq2Var;
    }

    public final void u(List list) {
        hm9.n("pe9", "returnToActiveMessages, messageIds = " + list.size());
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((k24) plVar.d().a).c.d().o(this.o, list, vx8.ACTIVE);
    }
}
