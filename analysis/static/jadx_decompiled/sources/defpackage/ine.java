package defpackage;

import bolts.Task;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ine implements gu3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicBoolean b;
    public final /* synthetic */ rne c;

    public /* synthetic */ ine(AtomicBoolean atomicBoolean, rne rneVar, int i) {
        this.a = i;
        this.b = atomicBoolean;
        this.c = rneVar;
    }

    @Override // defpackage.gu3
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                if (!this.b.compareAndSet(false, true)) {
                    task.getError();
                    break;
                } else {
                    this.c.c(task);
                    break;
                }
            default:
                if (!this.b.compareAndSet(false, true)) {
                    task.getError();
                    break;
                } else {
                    this.c.c(task);
                    break;
                }
        }
        return null;
    }
}
