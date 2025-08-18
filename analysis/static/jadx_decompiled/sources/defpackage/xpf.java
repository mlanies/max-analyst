package defpackage;

import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class xpf implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ Runnable b;

    public xpf(ViewTreeObserver viewTreeObserver, u5 u5Var) {
        this.a = viewTreeObserver;
        this.b = u5Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver = this.a;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.b.run();
        return true;
    }
}
