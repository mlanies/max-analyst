package defpackage;

import bolts.Task;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dne implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rne b;
    public final /* synthetic */ gu3 c;
    public final /* synthetic */ Executor d;

    public /* synthetic */ dne(rne rneVar, gu3 gu3Var, Executor executor, int i) {
        this.a = i;
        this.b = rneVar;
        this.c = gu3Var;
        this.d = executor;
    }

    @Override // defpackage.gu3
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                Task.completeImmediately(this.b, this.c, task, this.d, null);
                break;
            default:
                Task.completeAfterTask(this.b, this.c, task, this.d, null);
                break;
        }
        return null;
    }
}
