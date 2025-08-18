package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ogg implements zjg, x3a, o3a, k3a {
    public final /* synthetic */ int a;
    public final Executor b;
    public final fu3 c;
    public final ukg o;

    public /* synthetic */ ogg(Executor executor, fu3 fu3Var, ukg ukgVar, int i) {
        this.a = i;
        this.b = executor;
        this.c = fu3Var;
        this.o = ukgVar;
    }

    @Override // defpackage.x3a
    public void a(Object obj) {
        this.o.n(obj);
    }

    @Override // defpackage.zjg
    public final void b(Task task) {
        switch (this.a) {
            case 0:
                this.b.execute(new u8g(this, 2, task));
                break;
            default:
                this.b.execute(new ihg(this, task, 0));
                break;
        }
    }

    @Override // defpackage.k3a
    public void d() {
        this.o.o();
    }

    @Override // defpackage.o3a
    public void onFailure(Exception exc) {
        this.o.m(exc);
    }
}
