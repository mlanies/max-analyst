package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class nme implements lme {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final /* synthetic */ ry1 b;

    public nme(sy1 sy1Var) {
        this.b = sy1Var;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        ry1 ry1Var = this.b;
        if (ry1Var.isActive() && this.a.compareAndSet(false, true)) {
            ry1Var.resumeWith(gleVar);
        }
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        ry1 ry1Var = this.b;
        if (ry1Var.isActive() && this.a.compareAndSet(false, true)) {
            ry1Var.resumeWith(new njc(new TamErrorException(pkeVar)));
        }
    }
}
