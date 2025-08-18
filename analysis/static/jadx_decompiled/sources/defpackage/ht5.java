package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ht5 {
    public final String a;
    public final yu2 b;
    public final ta2 c;
    public final q0e d;
    public final t03 e;
    public final AtomicInteger f;
    public final q0e g;
    public final String h;

    public ht5(String str, yu2 yu2Var, ta2 ta2Var, av0 av0Var, nx3 nx3Var) {
        this.a = str;
        this.b = yu2Var;
        this.c = ta2Var;
        q0e q0eVarA = r0e.a(null);
        this.d = q0eVarA;
        this.e = new t03(new w7c(q0eVarA), 11);
        ContextScope contextScopeA = j1e.a(nx3Var);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.f = atomicInteger;
        q0e q0eVarA2 = r0e.a(Integer.valueOf(atomicInteger.get()));
        this.g = q0eVarA2;
        this.h = wg0.i("FolderCountersDataSource-", str);
        av0Var.d(this);
        ki4 ki4Var = new ki4(new mn5[]{((zb2) ta2Var).g(), q0eVarA2}, 1);
        int i = ft4.o;
        od2.L(new zn5(nu0.Q(ki4Var, z7.R(1000, kt4.MILLISECONDS)), new ft5(this, null), 5), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.ht5 r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ht5.a(ht5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        this.g.m(null, Integer.valueOf(this.f.incrementAndGet()));
    }

    @uae
    public final void onEvent(vz2 vz2Var) {
        b();
    }

    @uae
    public final void onEvent(kz6 kz6Var) {
        b();
    }

    @uae
    public final void onEvent(ut7 ut7Var) {
        b();
    }
}
