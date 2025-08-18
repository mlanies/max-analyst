package defpackage;

/* loaded from: classes.dex */
public abstract class sig implements Runnable {
    public final qne a;

    public sig() {
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

    public sig(qne qneVar) {
        this.a = qneVar;
    }
}
