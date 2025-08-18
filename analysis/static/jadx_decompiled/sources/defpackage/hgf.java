package defpackage;

import android.view.WindowManager;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class hgf implements fgf, qj3, x3a, o3a, k3a {
    public final Object a;

    public /* synthetic */ hgf(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.x3a
    public void a(Object obj) {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        ((qoa) this.a).f.invoke("error occurred: " + ((Throwable) obj));
    }

    @Override // defpackage.fgf
    public void b(gte gteVar) {
        gteVar.c(((WindowManager) this.a).getDefaultDisplay());
    }

    @Override // defpackage.fgf
    public void c() {
    }

    @Override // defpackage.k3a
    public void d() {
        ((CountDownLatch) this.a).countDown();
    }

    @Override // defpackage.o3a
    public void onFailure(Exception exc) {
        ((CountDownLatch) this.a).countDown();
    }

    public /* synthetic */ hgf(y7f y7fVar) {
        zig zigVar = new zig(y7fVar);
        this.a = gfg.a(new nof(gfg.a(new jo7(gfg.a(new wva(zigVar, 19, gfg.a(new ece(zigVar)))), gfg.a(new mfe(zigVar)), zigVar))));
    }

    public /* synthetic */ hgf() {
        this.a = new CountDownLatch(1);
    }
}
