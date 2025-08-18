package defpackage;

import android.view.View;

/* loaded from: classes2.dex */
public final class bh7 implements eh7, View.OnAttachStateChangeListener {
    public gh7 a;

    @Override // defpackage.eh7
    public final gh7 Q() {
        return this.a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (this.a.d == fg7.a) {
            this.a = new gh7(this);
        }
        this.a.d(eg7.ON_START);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.a.d.a(fg7.c)) {
            this.a.d(eg7.ON_DESTROY);
        }
    }
}
