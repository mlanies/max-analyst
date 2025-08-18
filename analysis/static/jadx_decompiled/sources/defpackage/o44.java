package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class o44 {
    public static final /* synthetic */ bc7[] j;
    public static final String k;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final ContextScope f;
    public long h;
    public final w4d e = mqd.D();
    public f44 g = f44.f;
    public final AtomicInteger i = new AtomicInteger(0);

    static {
        oi9 oi9Var = new oi9(o44.class, "notifyJob", "getNotifyJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        j = new bc7[]{oi9Var};
        k = o44.class.getName();
    }

    public o44(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.f = j1e.a(((w9a) ((kke) je7Var5.getValue())).a().limitedParallelism(1, "notifs"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.o44 r21, defpackage.f44 r22, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o44.a(o44, f44, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
    
        r11.getClass();
        r0 = "failure";
        defpackage.hm9.p("DebounceNotificationDispatcher", "failure", r13);
        r12 = null;
        r11 = (defpackage.cba) ((defpackage.o45) r11.b.getValue());
        r11.c(r13, false);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v2, types: [i44, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v3, types: [i44, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v5, types: [cba] */
    /* JADX WARN: Type inference failed for: r11v9, types: [cba] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d2 -> B:47:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.f44 r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o44.b(f44, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(m56 m56Var) {
        j47.T(this.f, null, null, new j44(this, m56Var, null), 3);
    }
}
