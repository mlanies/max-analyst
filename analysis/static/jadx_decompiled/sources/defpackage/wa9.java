package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import ru.ok.tamtam.logout.a;

/* loaded from: classes2.dex */
public final class wa9 implements qu2 {
    public final eca a;
    public final int b = 10;
    public final je7 c;
    public final nx3 d;
    public final nx3 e;
    public final ContextScope f;
    public final khe g;
    public vxd h;

    public wa9(eca ecaVar, kke kkeVar, a aVar, je7 je7Var, je7 je7Var2) {
        this.a = ecaVar;
        this.c = je7Var;
        w9a w9aVar = (w9a) kkeVar;
        nx3 nx3VarLimitedParallelism = w9aVar.b().limitedParallelism(1, "mini-chats-io");
        this.d = nx3VarLimitedParallelism;
        this.e = w9aVar.a().limitedParallelism(1, "mini-chats-computation");
        ContextScope contextScopeA = j1e.a(nx3VarLimitedParallelism);
        this.f = contextScopeA;
        this.g = new khe(new yf3(this, 20, je7Var2));
        String name = wa9.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "instance created " + this, null);
        }
        j47.T(contextScopeA, null, null, new oa9(aVar, this, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:11|30|(1:32)(1:33)|48|34|38|(1:40)(1:41)|42|(1:44)|45|15|(2:17|(3:22|(2:24|(1:21))|(1:50)(12:29|30|(0)(0)|48|34|38|(0)(0)|42|(0)|45|15|(2:46|47)(0)))(3:19|(0)|(0)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f1, code lost:
    
        defpackage.hm9.p(r7.getClass().getName(), "fail to decode protospans", r0);
        r0 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:22:0x0097, B:19:0x008f], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095 A[PHI: r8
      0x0095: PHI (r8v5 java.lang.Object) = (r8v3 java.lang.Object), (r8v6 java.lang.Object) binds: [B:25:0x00b1, B:20:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00b8 -> B:30:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.wa9 r39, java.util.List r40, kotlin.coroutines.Continuation r41) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa9.a(wa9, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
