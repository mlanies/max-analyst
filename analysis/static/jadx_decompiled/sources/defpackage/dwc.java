package defpackage;

import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final /* synthetic */ class dwc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fwc b;

    public /* synthetic */ dwc(fwc fwcVar, int i) {
        this.a = i;
        this.b = fwcVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        int i = this.a;
        fwc fwcVar = this.b;
        switch (i) {
            case 0:
                if (fwcVar.Z) {
                    h26 h26Var = fwcVar.o;
                    if (h26Var != null) {
                        h26Var.o.c(new g26(h26Var, 0));
                    }
                    l26 l26Var = fwcVar.X;
                    if (l26Var != null) {
                        l26Var.c.c(new k26(l26Var, 1));
                    }
                    if (fwcVar.Y != null) {
                        fwcVar.Y.c(false);
                    }
                }
                h26 h26Var2 = fwcVar.o;
                if (h26Var2 != null) {
                    h26Var2.Z = null;
                    h26Var2.o.a(new g26(h26Var2, 1));
                }
                l26 l26Var2 = fwcVar.X;
                if (l26Var2 != null) {
                    l26Var2.c.c(new k26(l26Var2, 1));
                    l26Var2.c.a(new k26(l26Var2, 2));
                }
                if (fwcVar.Y != null) {
                    fwcVar.Y.c(false);
                }
                h26 h26Var3 = fwcVar.o;
                if (h26Var3 != null) {
                    mu3 mu3Var = h26Var3.o;
                    mu3Var.getClass();
                    try {
                        ((CountDownLatch) mu3Var.d).await();
                    } catch (InterruptedException unused) {
                    }
                }
                fwcVar.o = null;
                fwcVar.X = null;
                fwcVar.Y = null;
                fwcVar.c = true;
                break;
            case 1:
                h26 h26Var4 = fwcVar.o;
                if (h26Var4 != null) {
                    h26Var4.o.c(new g26(h26Var4, 0));
                }
                l26 l26Var3 = fwcVar.X;
                if (l26Var3 != null) {
                    l26Var3.c.c(new k26(l26Var3, 1));
                }
                if (fwcVar.Y != null) {
                    fwcVar.Y.c(false);
                    break;
                }
                break;
            default:
                double dB = fwcVar.o.s0.b();
                double dB2 = fwcVar.X.u0.b();
                double dB3 = fwcVar.X.v0.b();
                double dB4 = fwcVar.Y.f.b();
                fwcVar.a.log("SSStat", "capturer: " + dB + " , encoder: " + dB2 + " | " + dB3 + " , sender: " + dB4);
                ((Handler) fwcVar.b.b).postDelayed(fwcVar.s0, 1000L);
                break;
        }
    }
}
