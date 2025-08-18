package defpackage;

import java.util.Collections;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class ij6 implements pi4 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final ContextScope e;
    public vxd f;
    public final w7c g;

    public ij6(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = je7Var;
        this.b = je7Var3;
        this.c = je7Var2;
        this.d = je7Var4;
        long jIncrementAndGet = ei4.b.incrementAndGet();
        this.e = j1e.a(((w9a) ((kke) je7Var3.getValue())).a());
        this.g = new w7c(r0e.a(Collections.singletonList(new b54(jIncrementAndGet, new eqe(m0c.oneme_settings_dump_heap), woc.c, null, null, 24))));
    }

    @Override // defpackage.pi4
    public final j0e c() {
        return this.g;
    }

    @Override // defpackage.pi4
    public final void d(b54 b54Var) {
        vxd vxdVar = this.f;
        if (vxdVar == null || !vxdVar.isActive()) {
            this.f = j47.T(this.e, ((w9a) ((kke) this.b.getValue())).b(), null, new hj6(this, null), 2);
        } else {
            wha whaVar = (wha) this.d.getValue();
            whaVar.h("Дамп памяти уже происходит, нужно немного подождать");
            whaVar.i();
        }
    }
}
