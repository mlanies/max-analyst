package defpackage;

import one.me.sdk.transfer.exceptions.HttpErrorException;

/* loaded from: classes2.dex */
public final /* synthetic */ class aq6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq6 b;

    public /* synthetic */ aq6(cq6 cq6Var, int i) {
        this.a = i;
        this.b = cq6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cq6 cq6Var = this.b;
        switch (this.a) {
            case 0:
                if (!cq6Var.Y.get()) {
                    hm9.p("dq6", "onFileDownloadInterrupted", null);
                    cq6Var.X.onError(new HttpErrorException("url expired", null));
                    cq6Var.c(false);
                    break;
                }
                break;
            case 1:
                if (!cq6Var.Y.get()) {
                    hm9.p("dq6", "onFileDownloadFailed", null);
                    cq6Var.X.onError(new HttpErrorException("onFileDownloadFailed", null));
                    cq6Var.c(false);
                    break;
                }
                break;
            default:
                if (!cq6Var.Y.get()) {
                    hm9.p("dq6", "onFileDownloadInterrupted", null);
                    cq6Var.X.onError(new HttpErrorException("onFileDownloadInterrupted", null));
                    cq6Var.c(false);
                    break;
                }
                break;
        }
    }
}
