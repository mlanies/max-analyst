package defpackage;

import java.util.Collections;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class nm2 extends ol implements lme, hua {
    public final boolean X;
    public final long o;

    public nm2(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.X = z;
    }

    @Override // defpackage.hua
    public final int c() {
        eoe eoeVarT = t();
        iua iuaVar = iua.G0;
        long j = this.a;
        Iterator it = eoeVarT.h(j, iuaVar).iterator();
        while (it.hasNext()) {
            nm2 nm2Var = (nm2) ((une) it.next()).f;
            if (nm2Var.o == this.o && nm2Var.a > j) {
                return 3;
            }
        }
        return 1;
    }

    @Override // defpackage.hua
    public final void d() {
        m().W(this.o, v82.o);
        t().d(this.a);
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        om2 om2Var = (om2) gleVar;
        if (om2Var.c != null) {
            m().W(this.o, v82.o);
            m().c0(Collections.singletonList(om2Var.c));
        }
    }

    @Override // defpackage.hua
    public final byte[] f() {
        Tasks.ChatPinSetVisibility chatPinSetVisibility = new Tasks.ChatPinSetVisibility();
        chatPinSetVisibility.requestId = this.a;
        chatPinSetVisibility.chatServerId = this.o;
        chatPinSetVisibility.show = this.X;
        return qw8.toByteArray(chatPinSetVisibility);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        if (!f46.U(pkeVar.b)) {
            d();
        }
        l().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.hua
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.hua
    public final iua getType() {
        return iua.G0;
    }

    @Override // defpackage.ol
    public final dle i() {
        au auVar = new au((sla) null, 28);
        auVar.i(this.o, ApiProtocol.PARAM_CHAT_ID);
        auVar.d("show", this.X);
        return auVar;
    }
}
