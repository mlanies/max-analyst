package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class g6e {
    public static final /* synthetic */ bc7[] j;
    public static final d6e k;
    public final je7 a;
    public final je7 b;
    public final ContextScope c;
    public final q0e d;
    public final w7c e;
    public final q0e f;
    public final AtomicReference g;
    public vxd h;
    public final w4d i;

    static {
        oi9 oi9Var = new oi9(g6e.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        j = new bc7[]{oi9Var};
        k = new d6e(3, false, null);
    }

    public g6e(je7 je7Var, je7 je7Var2, kke kkeVar) {
        this.a = je7Var;
        this.b = je7Var2;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).b());
        this.c = contextScopeA;
        q0e q0eVarA = r0e.a(k);
        this.d = q0eVarA;
        this.e = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(null);
        this.f = q0eVarA2;
        this.g = new AtomicReference(new c6e((String) null, 3));
        this.i = mqd.D();
        od2.L(new zn5(od2.u(new jp5(q0eVarA2, 0), 200L), new shb(2, this, g6e.class, "searchSetsByQuery", "searchSetsByQuery(Ljava/lang/String;)V", 4, 15), 5), contextScopeA);
    }

    public final boolean a() {
        String str = ((c6e) this.g.get()).b;
        return !(str == null || str.length() == 0);
    }
}
