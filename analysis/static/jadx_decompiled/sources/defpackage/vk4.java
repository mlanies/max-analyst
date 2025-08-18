package defpackage;

import bolts.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vk4 implements gu3 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public vk4(xk4 xk4Var, b47 b47Var, eab eabVar, fi0 fi0Var) {
        this.e = xk4Var;
        this.b = b47Var;
        this.c = eabVar;
        this.d = fi0Var;
    }

    @Override // defpackage.gu3
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                boolean zIsCancelled = task.isCancelled();
                fi0 fi0Var = (fi0) this.d;
                hab habVar = (hab) this.b;
                eab eabVar = (eab) this.c;
                if (zIsCancelled || (task.isFaulted() && (task.getError() instanceof CancellationException))) {
                    habVar.k(eabVar, "DiskCacheProducer");
                    fi0Var.c();
                } else {
                    boolean zIsFaulted = task.isFaulted();
                    xk4 xk4Var = (xk4) this.e;
                    if (zIsFaulted) {
                        habVar.d(eabVar, "DiskCacheProducer", task.getError(), null);
                        xk4Var.d.a(fi0Var, eabVar);
                    } else {
                        g05 g05Var = (g05) task.getResult();
                        if (g05Var != null) {
                            habVar.a(eabVar, "DiskCacheProducer", xk4.c((b47) habVar, eabVar, true, g05Var.o()));
                            habVar.e(eabVar, "DiskCacheProducer", true);
                            ((oj0) eabVar).h("disk", "default");
                            fi0Var.i(1.0f);
                            fi0Var.g(1, g05Var);
                            g05Var.close();
                        } else {
                            habVar.a(eabVar, "DiskCacheProducer", xk4.c((b47) habVar, eabVar, false, 0));
                            xk4Var.d.a(fi0Var, eabVar);
                        }
                    }
                }
                return null;
            default:
                if (!((Boolean) ((Callable) this.b).call()).booleanValue()) {
                    return Task.forResult(null);
                }
                Task taskForResult = Task.forResult(null);
                gu3 gu3Var = (gu3) this.c;
                Executor executor = (Executor) this.d;
                return taskForResult.onSuccessTask(gu3Var, executor).onSuccessTask((gu3) ((hz1) this.e).b, executor);
        }
    }

    public vk4(Callable callable, gu3 gu3Var, Executor executor, hz1 hz1Var) {
        this.b = callable;
        this.c = gu3Var;
        this.d = executor;
        this.e = hz1Var;
    }
}
