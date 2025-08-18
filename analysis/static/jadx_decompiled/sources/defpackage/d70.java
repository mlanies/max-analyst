package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d70 implements py9 {
    public final /* synthetic */ z05 a;
    public final /* synthetic */ e70 b;

    public d70(e70 e70Var, z05 z05Var) {
        this.b = e70Var;
        this.a = z05Var;
    }

    @Override // defpackage.py9
    public final void a(Object obj) {
        lt0 lt0Var = (lt0) obj;
        Objects.requireNonNull(lt0Var);
        e70 e70Var = this.b;
        if (e70Var.l == this.a) {
            Objects.toString(e70Var.h);
            lt0Var.toString();
            if (e70Var.h != lt0Var) {
                e70Var.h = lt0Var;
                e70Var.d();
            }
        }
    }

    @Override // defpackage.py9
    public final void onError(Throwable th) {
        e70 e70Var = this.b;
        if (e70Var.l == this.a) {
            Executor executor = e70Var.j;
            l7b l7bVar = e70Var.k;
            if (executor == null || l7bVar == null) {
                return;
            }
            executor.execute(new c(l7bVar, 8, th));
        }
    }
}
