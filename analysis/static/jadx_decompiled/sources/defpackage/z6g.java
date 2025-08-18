package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class z6g extends ft {
    public final WindowInsetsController i;
    public final o9g j;
    public Window k;

    public z6g(WindowInsetsController windowInsetsController, o9g o9gVar) {
        this.i = windowInsetsController;
        this.j = o9gVar;
    }

    @Override // defpackage.ft
    public final void k(int i) {
        this.i.hide(i & (-9));
    }

    @Override // defpackage.ft
    public final boolean m() {
        this.i.setSystemBarsAppearance(0, 0);
        return (this.i.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // defpackage.ft
    public final void u(boolean z) {
        Window window = this.k;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.i.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.i.setSystemBarsAppearance(0, 16);
    }

    @Override // defpackage.ft
    public final void v(boolean z) {
        Window window = this.k;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.i.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.i.setSystemBarsAppearance(0, 8);
    }

    @Override // defpackage.ft
    public final void w() {
        this.i.setSystemBarsBehavior(2);
    }

    @Override // defpackage.ft
    public final void x(int i) {
        if ((i & 8) != 0) {
            ((rxd) this.j.b).f0();
        }
        this.i.show(i & (-9));
    }
}
