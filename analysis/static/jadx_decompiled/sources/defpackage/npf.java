package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class npf implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = zmf.a;
        mmf.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
