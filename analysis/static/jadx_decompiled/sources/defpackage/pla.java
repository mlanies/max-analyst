package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class pla implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View a;
    public ViewTreeObserver b;
    public final Runnable c;

    public pla(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static pla a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        pla plaVar = new pla(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(plaVar);
        view.addOnAttachStateChangeListener(plaVar);
        return plaVar;
    }

    public final void b() {
        boolean zIsAlive = this.b.isAlive();
        View view = this.a;
        if (zIsAlive) {
            this.b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
