package defpackage;

/* loaded from: classes.dex */
public final class m8g implements Runnable {
    public final n8g a;
    public final l7g b;

    public m8g(n8g n8gVar, l7g l7gVar) {
        this.a = n8gVar;
        this.b = l7gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.d) {
            try {
                if (((m8g) this.a.b.remove(this.b)) != null) {
                    l8g l8gVar = (l8g) this.a.c.remove(this.b);
                    if (l8gVar != null) {
                        l7g l7gVar = this.b;
                        kg4 kg4Var = (kg4) l8gVar;
                        a14.u().n(kg4.x0, "Exceeded time limits on execution for " + l7gVar);
                        kg4Var.s0.execute(new jg4(kg4Var, 0));
                    }
                } else {
                    a14.u().n("WrkTimerRunnable", "Timer with " + this.b + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
