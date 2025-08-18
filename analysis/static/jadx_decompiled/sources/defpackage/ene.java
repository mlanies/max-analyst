package defpackage;

import bolts.Task;

/* loaded from: classes.dex */
public final class ene implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gu3 b;

    public /* synthetic */ ene(gu3 gu3Var, int i) {
        this.a = i;
        this.b = gu3Var;
    }

    @Override // defpackage.gu3
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWith(this.b);
            default:
                return task.isFaulted() ? Task.forError(task.getError()) : task.isCancelled() ? Task.cancelled() : task.continueWithTask(this.b);
        }
    }
}
