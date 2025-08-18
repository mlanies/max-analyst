package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class bf7 implements gh3 {
    public final gh3 a;
    public final /* synthetic */ v4 b;

    public bf7(v4 v4Var, Context context, ExecutorService executorService, wmc wmcVar, khe kheVar) {
        this.b = v4Var;
        this.a = new lh3(context, executorService, wmcVar, kheVar);
    }

    @Override // defpackage.gh3
    public final boolean a() {
        return this.a.a();
    }

    @Override // defpackage.gh3
    public final zh3 b() {
        return this.a.b();
    }

    @Override // defpackage.gh3
    public final void c(fh3 fh3Var) {
        this.a.c(fh3Var);
    }

    @Override // defpackage.gh3
    public final boolean d() {
        return this.a.d();
    }

    @Override // defpackage.gh3
    public final void e(fh3 fh3Var) {
        this.a.e(fh3Var);
    }

    @Override // defpackage.gh3
    public final boolean f() {
        return this.a.f();
    }

    @Override // defpackage.gh3
    public final boolean g() {
        if (this.a.g()) {
            return true;
        }
        ((ri4) this.b.c(ri4.class)).e();
        return false;
    }

    @Override // defpackage.gh3
    public final void invalidate() {
        this.a.invalidate();
    }
}
