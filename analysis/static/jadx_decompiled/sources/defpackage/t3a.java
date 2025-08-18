package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class t3a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public static final Handler Y = new Handler(Looper.getMainLooper());
    public boolean X;
    public final View a;
    public final boolean b;
    public final k56 c;
    public ViewTreeObserver o;

    public t3a(View view, boolean z, ga5 ga5Var) {
        this.a = view;
        this.b = z;
        this.c = ga5Var;
        this.o = view.getViewTreeObserver();
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean z = true;
        if (!this.X) {
            boolean zBooleanValue = ((Boolean) this.c.invoke()).booleanValue();
            if (zBooleanValue || this.b) {
                this.X = true;
                Y.post(new nn6(21, this));
            }
            z = zBooleanValue;
        }
        if (!z) {
            hm9.G("OneShotOnPreDrawListener", "skipping frame", null);
        }
        return z;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.o = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean zIsAlive = this.o.isAlive();
        View view2 = this.a;
        if (zIsAlive) {
            this.o.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
