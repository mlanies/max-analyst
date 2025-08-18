package defpackage;

/* loaded from: classes.dex */
public abstract class nne implements Runnable {
    public long submissionTime;
    public sne taskContext;

    public nne(long j, sne sneVar) {
        this.submissionTime = j;
        this.taskContext = sneVar;
    }

    public final int getMode$kotlinx_coroutines_core() {
        return ((fm5) this.taskContext).b;
    }
}
