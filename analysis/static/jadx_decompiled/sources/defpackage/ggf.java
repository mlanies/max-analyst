package defpackage;

import android.hardware.display.DisplayManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class ggf implements DisplayManager.DisplayListener, fgf {
    public final /* synthetic */ int a = 1;
    public final DisplayManager b;
    public Object c;

    public ggf(kgf kgfVar, DisplayManager displayManager) {
        this.c = kgfVar;
        this.b = displayManager;
    }

    private final void a(int i) {
    }

    private final void d(int i) {
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    @Override // defpackage.fgf
    public void b(gte gteVar) {
        this.c = gteVar;
        Handler handlerM = maf.m(null);
        DisplayManager displayManager = this.b;
        displayManager.registerDisplayListener(this, handlerM);
        gteVar.c(displayManager.getDisplay(0));
    }

    @Override // defpackage.fgf
    public void c() {
        this.b.unregisterDisplayListener(this);
        this.c = null;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayAdded(int i) {
        int i2 = this.a;
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayChanged(int i) {
        switch (this.a) {
            case 0:
                if (i == 0) {
                    kgf.a((kgf) this.c, this.b.getDisplay(0));
                    break;
                }
                break;
            default:
                gte gteVar = (gte) this.c;
                if (gteVar != null && i == 0) {
                    gteVar.c(this.b.getDisplay(0));
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.display.DisplayManager.DisplayListener
    public final void onDisplayRemoved(int i) {
        int i2 = this.a;
    }

    public ggf(DisplayManager displayManager) {
        this.b = displayManager;
    }
}
