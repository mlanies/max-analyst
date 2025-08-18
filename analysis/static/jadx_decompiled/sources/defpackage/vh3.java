package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class vh3 {
    public final q0e a;

    public vh3(kke kkeVar, hbd hbdVar) {
        ContextScope contextScopeA = j1e.a(((w9a) kkeVar).a().limitedParallelism(1, "conn-events"));
        jbd jbdVar = (jbd) hbdVar;
        q0e q0eVarA = r0e.a(Integer.valueOf(jbdVar.h));
        this.a = q0eVarA;
        od2.L(new zn5(c37.c(jbdVar.e), new vw(2, q0eVarA, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 5), contextScopeA);
    }
}
