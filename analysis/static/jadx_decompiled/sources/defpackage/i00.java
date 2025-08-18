package defpackage;

import android.app.Application;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class i00 {
    public static final /* synthetic */ bc7[] f;
    public final d00 a;
    public final Application b;
    public final ContextScope c;
    public final w4d d = mqd.D();
    public final q0e e = r0e.a(null);

    static {
        oi9 oi9Var = new oi9(i00.class, "updateAttachJob", "getUpdateAttachJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        f = new bc7[]{oi9Var};
    }

    public i00(kke kkeVar, d00 d00Var, Application application) {
        this.a = d00Var;
        this.b = application;
        this.c = j1e.a(((w9a) kkeVar).a());
    }

    public final b00 a(r5c r5cVar) {
        Long l;
        boolean z = r5cVar instanceof n5c;
        Application application = this.b;
        if (z) {
            n5c n5cVar = (n5c) r5cVar;
            float f2 = n5cVar.c;
            Long l2 = n5cVar.e;
            long jLongValue = (l2 == null || (l = n5cVar.f) == null || l2.longValue() != 0) ? n5cVar.d : (long) ((f2 / 100) * l.longValue());
            long j = n5cVar.b;
            return new xz(n5cVar.a, f2, j > 0 ? new iqe(rh4.j(are.w(jLongValue, false, application), "/", are.v(j, are.m(j), true, application))) : new eqe(oda.t));
        }
        if (r5cVar instanceof q5c) {
            q5c q5cVar = (q5c) r5cVar;
            float f3 = q5cVar.b;
            float f4 = q5cVar.c;
            String strW = are.w((long) ((f4 / 100) * f3), false, application);
            long j2 = q5cVar.b;
            return new a00(q5cVar.a, f4, new iqe(rh4.j(strW, "/", are.v(j2, are.m(j2), true, application))));
        }
        if (r5cVar instanceof o5c) {
            o5c o5cVar = (o5c) r5cVar;
            return new yz(o5cVar.a, new iqe(are.w(o5cVar.b, true, application)));
        }
        if (!(r5cVar instanceof p5c)) {
            throw new NoWhenBranchMatchedException();
        }
        p5c p5cVar = (p5c) r5cVar;
        return new zz(p5cVar.a, new iqe(are.w(p5cVar.b, true, application)));
    }
}
