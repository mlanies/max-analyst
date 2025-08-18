package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class i8a implements ra2 {
    public final je7 a;
    public final kld b;

    public i8a(kke kkeVar, je7 je7Var, ox3 ox3Var) {
        this.a = je7Var;
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).a().limitedParallelism(1, "AnimojiVerifier").plus(ox3Var));
        kld kldVarB = lld.b(0, 10, 0, 5);
        this.b = kldVarB;
        int i = ft4.o;
        od2.L(new zn5(od2.x(nu0.Q(kldVarB, z7.R(1, kt4.SECONDS))), new v59(2, this, i8a.class, "internalVerify", "internalVerify(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 2), 5), contextScopeA);
    }
}
