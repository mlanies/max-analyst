package defpackage;

import android.view.View;
import android.view.Window;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public final class y6g extends ft {
    public final Window i;
    public final o9g j;

    public y6g(Window window, o9g o9gVar) {
        this.i = window;
        this.j = o9gVar;
    }

    public final void F(int i) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void G(int i) {
        View decorView = this.i.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // defpackage.ft
    public final void k(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    F(4);
                } else if (i2 == 2) {
                    F(2);
                } else if (i2 == 8) {
                    ((rxd) this.j.b).Z();
                }
            }
        }
    }

    @Override // defpackage.ft
    public final boolean m() {
        return (this.i.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.ft
    public final void u(boolean z) {
        if (!z) {
            G(16);
            return;
        }
        Window window = this.i;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        F(16);
    }

    @Override // defpackage.ft
    public final void v(boolean z) {
        if (!z) {
            G(8192);
            return;
        }
        Window window = this.i;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        F(8192);
    }

    @Override // defpackage.ft
    public final void w() {
        G(2048);
        F(4096);
    }

    @Override // defpackage.ft
    public final void x(int i) {
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    G(4);
                    this.i.clearFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
                } else if (i2 == 2) {
                    G(2);
                } else if (i2 == 8) {
                    ((rxd) this.j.b).f0();
                }
            }
        }
    }
}
