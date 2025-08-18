package defpackage;

/* loaded from: classes.dex */
public final class zne extends nne {
    public final Runnable a;

    public zne(Runnable runnable, long j, sne sneVar) {
        super(j, sneVar);
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.run();
        } finally {
            this.taskContext.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Task[");
        Runnable runnable = this.a;
        sb.append(runnable.getClass().getSimpleName());
        sb.append('@');
        sb.append(c54.u(runnable));
        sb.append(", ");
        sb.append(this.submissionTime);
        sb.append(", ");
        sb.append(this.taskContext);
        sb.append(']');
        return sb.toString();
    }
}
