package defpackage;

import bolts.Task;

/* loaded from: classes.dex */
public final class hne implements gu3 {
    @Override // defpackage.gu3
    public final Object a(Task task) {
        return task.isCancelled() ? Task.cancelled() : task.isFaulted() ? Task.forError(task.getError()) : Task.forResult(null);
    }
}
