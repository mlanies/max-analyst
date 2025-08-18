package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class b6e {
    public final je7 a;
    public final je7 b;
    public final ContextScope c;
    public final q0e d;
    public final w7c e;
    public final AtomicReference f;
    public vxd g;

    public b6e(je7 je7Var, je7 je7Var2, o2e o2eVar, kke kkeVar) {
        this.a = je7Var;
        this.b = je7Var2;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).b());
        this.c = contextScopeA;
        q0e q0eVarA = r0e.a(nz4.a);
        this.d = q0eVarA;
        this.e = new w7c(q0eVarA);
        this.f = new AtomicReference(0L);
        od2.L(new zn5(new ap8(c37.c(o2eVar.l), this, 12), new x5e(this, null), 5), contextScopeA);
    }
}
