package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class vl7 implements AbsListView.OnScrollListener {
    public final /* synthetic */ wl7 a;

    public vl7(wl7 wl7Var) {
        this.a = wl7Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1) {
            wl7 wl7Var = this.a;
            if (wl7Var.K0.getInputMethodMode() == 2 || wl7Var.K0.getContentView() == null) {
                return;
            }
            Handler handler = wl7Var.G0;
            ul7 ul7Var = wl7Var.C0;
            handler.removeCallbacks(ul7Var);
            ul7Var.run();
        }
    }
}
