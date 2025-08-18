package defpackage;

import bolts.Task;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class fne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rne b;
    public final /* synthetic */ gu3 c;
    public final /* synthetic */ Task o;

    public /* synthetic */ fne(rne rneVar, gu3 gu3Var, Task task, int i) {
        this.a = i;
        this.b = rneVar;
        this.c = gu3Var;
        this.o = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rne rneVar = this.b;
                try {
                    rneVar.c(this.c.a(this.o));
                    break;
                } catch (CancellationException unused) {
                    rneVar.a();
                    return;
                } catch (Exception e) {
                    rneVar.b(e);
                    return;
                }
            default:
                rne rneVar2 = this.b;
                try {
                    Task task = (Task) this.c.a(this.o);
                    if (task == null) {
                        rneVar2.c(null);
                    } else {
                        task.continueWith(new gne(0, this));
                    }
                    break;
                } catch (CancellationException unused2) {
                    rneVar2.a();
                    return;
                } catch (Exception e2) {
                    rneVar2.b(e2);
                    return;
                }
        }
    }
}
