package defpackage;

import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class qkd implements pi4 {
    public static final je7 h = tu0.r(3, new xid(3));
    public final je7 a;
    public final je7 b;
    public final ContextScope c;
    public int d;
    public boolean e;
    public vxd f;
    public final w7c g;

    public qkd(je7 je7Var, je7 je7Var2) {
        this.a = je7Var2;
        this.b = je7Var;
        long jIncrementAndGet = ei4.b.incrementAndGet();
        this.c = j1e.a(((w9a) ((kke) je7Var2.getValue())).a());
        this.g = new w7c(r0e.a(Collections.singletonList(new b54(jIncrementAndGet, new eqe(m0c.oneme_settings_send_logs), woc.c, null, null, 24))));
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.g;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        vxd vxdVar = this.f;
        if (vxdVar == null || !vxdVar.isActive()) {
            this.f = j47.T(this.c, ((w9a) ((kke) this.a.getValue())).b(), null, new pkd(this, null), 2);
            return;
        }
        wha whaVar = (wha) fi4.a.getAccessor().c(wha.class);
        whaVar.h("Логи уже скачиваются");
        if (this.e) {
            List list = (List) h.getValue();
            int i = this.d;
            if (i > 3) {
                i = 3;
            }
            whaVar.b((CharSequence) list.get(i));
        }
        whaVar.i();
        this.d++;
    }
}
