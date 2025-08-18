package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public abstract class ci0 {
    public final kld a = lld.b(0, 0, 0, 7);
    public final ContextScope b;

    public ci0(kke kkeVar) {
        this.b = j1e.a(((w9a) kkeVar).a());
    }

    public final void a(it2 it2Var) {
        j47.T(this.b, null, null, new bi0(this, it2Var, null), 3);
    }

    public final zn5 b() {
        kld kldVar = this.a;
        int i = ft4.o;
        return nu0.e(kldVar, z7.R(HttpStatus.SC_MULTIPLE_CHOICES, kt4.MILLISECONDS), new ai0(0));
    }
}
