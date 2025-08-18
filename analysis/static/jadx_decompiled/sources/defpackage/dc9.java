package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/* loaded from: classes.dex */
public final class dc9 extends FutureTask {
    public final /* synthetic */ sx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc9(sx sxVar, uh uhVar) {
        super(uhVar);
        this.a = sxVar;
    }

    @Override // java.util.concurrent.FutureTask
    public final void done() {
        sx sxVar = this.a;
        try {
            Object obj = get();
            if (sxVar.X.get()) {
                return;
            }
            sxVar.b(obj);
        } catch (InterruptedException unused) {
        } catch (CancellationException unused2) {
            if (sxVar.X.get()) {
                return;
            }
            sxVar.b(null);
        } catch (ExecutionException e) {
            throw new RuntimeException("An error occurred while executing doInBackground()", e.getCause());
        } catch (Throwable th) {
            throw new RuntimeException("An error occurred while executing doInBackground()", th);
        }
    }
}
