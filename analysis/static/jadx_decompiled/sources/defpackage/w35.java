package defpackage;

/* loaded from: classes.dex */
public final class w35 extends x35 {
    public final Runnable c;

    public w35(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.run();
    }

    @Override // defpackage.x35
    public final String toString() {
        return super.toString() + this.c;
    }
}
