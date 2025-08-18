package defpackage;

import java.nio.channels.AsynchronousCloseException;
import java.nio.channels.CompletionHandler;

/* loaded from: classes2.dex */
public final class fv implements CompletionHandler {
    public static final fv b = new fv(0);
    public static final fv c = new fv(1);
    public final /* synthetic */ int a;

    public /* synthetic */ fv(int i) {
        this.a = i;
    }

    @Override // java.nio.channels.CompletionHandler
    public final void completed(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((ry1) obj2).resumeWith(obj);
                break;
            default:
                ((ry1) obj2).resumeWith(e5f.a);
                break;
        }
    }

    @Override // java.nio.channels.CompletionHandler
    public final void failed(Throwable th, Object obj) {
        switch (this.a) {
            case 0:
                ry1 ry1Var = (ry1) obj;
                if (!(th instanceof AsynchronousCloseException) || !ry1Var.isCancelled()) {
                    ry1Var.resumeWith(new njc(th));
                    break;
                }
                break;
            default:
                ry1 ry1Var2 = (ry1) obj;
                if (!(th instanceof AsynchronousCloseException) || !ry1Var2.isCancelled()) {
                    ry1Var2.resumeWith(new njc(th));
                    break;
                }
                break;
        }
    }
}
