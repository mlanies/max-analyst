package defpackage;

/* loaded from: classes.dex */
public abstract class pjg implements Runnable {
    public final qne a;

    public pjg() {
        this.a = null;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Exception e) {
            qne qneVar = this.a;
            if (qneVar != null) {
                qneVar.c(e);
            }
        }
    }

    public pjg(qne qneVar) {
        this.a = qneVar;
    }
}
